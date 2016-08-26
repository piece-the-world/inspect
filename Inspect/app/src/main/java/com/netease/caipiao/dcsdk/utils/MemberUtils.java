package com.netease.caipiao.dcsdk.utils;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

class MemberUtils {
    private static final int ACCESS_TEST = 7;
    private static final Class<?>[] ORDERED_PRIMITIVE_TYPES;
    private static final Map<Class<?>, Class<?>> primitiveWrapperMap;
    private static final Map<Class<?>, Class<?>> wrapperPrimitiveMap;

    MemberUtils() {
    }

    static {
        Class[] clsArr = new Class[ACCESS_TEST];
        clsArr[0] = Byte.TYPE;
        clsArr[1] = Short.TYPE;
        clsArr[2] = Character.TYPE;
        clsArr[3] = Integer.TYPE;
        clsArr[4] = Long.TYPE;
        clsArr[5] = Float.TYPE;
        clsArr[6] = Double.TYPE;
        ORDERED_PRIMITIVE_TYPES = clsArr;
        primitiveWrapperMap = new HashMap();
        primitiveWrapperMap.put(Boolean.TYPE, Boolean.class);
        primitiveWrapperMap.put(Byte.TYPE, Byte.class);
        primitiveWrapperMap.put(Character.TYPE, Character.class);
        primitiveWrapperMap.put(Short.TYPE, Short.class);
        primitiveWrapperMap.put(Integer.TYPE, Integer.class);
        primitiveWrapperMap.put(Long.TYPE, Long.class);
        primitiveWrapperMap.put(Double.TYPE, Double.class);
        primitiveWrapperMap.put(Float.TYPE, Float.class);
        primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
        wrapperPrimitiveMap = new HashMap();
        for (Class<?> primitiveClass : primitiveWrapperMap.keySet()) {
            Class<?> wrapperClass = (Class) primitiveWrapperMap.get(primitiveClass);
            if (!primitiveClass.equals(wrapperClass)) {
                wrapperPrimitiveMap.put(wrapperClass, primitiveClass);
            }
        }
    }

    private static boolean isPackageAccess(int modifiers) {
        return (modifiers & ACCESS_TEST) == 0;
    }

    static boolean isAccessible(Member m) {
        return (m == null || !Modifier.isPublic(m.getModifiers()) || m.isSynthetic()) ? false : true;
    }

    static boolean setAccessibleWorkaround(AccessibleObject o) {
        if (o == null || o.isAccessible()) {
            return false;
        }
        Member m = (Member) o;
        if (!o.isAccessible() && Modifier.isPublic(m.getModifiers()) && isPackageAccess(m.getDeclaringClass().getModifiers())) {
            try {
                o.setAccessible(true);
                return true;
            } catch (SecurityException e) {
            }
        }
        return false;
    }

    static boolean isAssignable(Class<?> cls, Class<?> toClass) {
        return isAssignable((Class) cls, (Class) toClass, true);
    }

    static boolean isAssignable(Class<?>[] classArray, Class<?>[] toClassArray, boolean autoboxing) {
        if (!Utils.isSameLength(classArray, toClassArray)) {
            return false;
        }
        if (classArray == null) {
            classArray = Utils.EMPTY_CLASS_ARRAY;
        }
        if (toClassArray == null) {
            toClassArray = Utils.EMPTY_CLASS_ARRAY;
        }
        for (int i = 0; i < classArray.length; i++) {
            if (!isAssignable(classArray[i], toClassArray[i], autoboxing)) {
                return false;
            }
        }
        return true;
    }

    static boolean isAssignable(Class<?> cls, Class<?> toClass, boolean autoboxing) {
        boolean z = true;
        if (toClass == null) {
            return false;
        }
        if (cls == null) {
            if (toClass.isPrimitive()) {
                z = false;
            }
            return z;
        }
        if (autoboxing) {
            if (cls.isPrimitive() && !toClass.isPrimitive()) {
                cls = primitiveToWrapper(cls);
                if (cls == null) {
                    return false;
                }
            }
            if (toClass.isPrimitive() && !cls.isPrimitive()) {
                cls = wrapperToPrimitive(cls);
                if (cls == null) {
                    return false;
                }
            }
        }
        if (cls.equals(toClass)) {
            return true;
        }
        if (!cls.isPrimitive()) {
            return toClass.isAssignableFrom(cls);
        }
        if (!toClass.isPrimitive()) {
            return false;
        }
        if (Integer.TYPE.equals(cls)) {
            if (Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                return true;
            }
            return false;
        } else if (Long.TYPE.equals(cls)) {
            if (Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                return true;
            }
            return false;
        } else if (Boolean.TYPE.equals(cls) || Double.TYPE.equals(cls)) {
            return false;
        } else {
            if (Float.TYPE.equals(cls)) {
                return Double.TYPE.equals(toClass);
            }
            if (Character.TYPE.equals(cls)) {
                if (Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                    return true;
                }
                return false;
            } else if (Short.TYPE.equals(cls)) {
                if (Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                    return true;
                }
                return false;
            } else if (!Byte.TYPE.equals(cls)) {
                return false;
            } else {
                if (Short.TYPE.equals(toClass) || Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass)) {
                    return true;
                }
                return false;
            }
        }
    }

    static Class<?> primitiveToWrapper(Class<?> cls) {
        Class<?> convertedClass = cls;
        if (cls == null || !cls.isPrimitive()) {
            return convertedClass;
        }
        return (Class) primitiveWrapperMap.get(cls);
    }

    static Class<?> wrapperToPrimitive(Class<?> cls) {
        return (Class) wrapperPrimitiveMap.get(cls);
    }

    static int compareParameterTypes(Class<?>[] left, Class<?>[] right, Class<?>[] actual) {
        float leftCost = getTotalTransformationCost(actual, left);
        float rightCost = getTotalTransformationCost(actual, right);
        if (leftCost < rightCost) {
            return -1;
        }
        return rightCost < leftCost ? 1 : 0;
    }

    private static float getTotalTransformationCost(Class<?>[] srcArgs, Class<?>[] destArgs) {
        float totalCost = 0.0f;
        for (int i = 0; i < srcArgs.length; i++) {
            totalCost += getObjectTransformationCost(srcArgs[i], destArgs[i]);
        }
        return totalCost;
    }

    private static float getObjectTransformationCost(Class<?> srcClass, Class<?> destClass) {
        if (destClass.isPrimitive()) {
            return getPrimitivePromotionCost(srcClass, destClass);
        }
        float cost = 0.0f;
        while (srcClass != null && !destClass.equals(srcClass)) {
            if (destClass.isInterface() && isAssignable(srcClass, destClass)) {
                cost += 0.25f;
                break;
            }
            cost += 1.0f;
            srcClass = srcClass.getSuperclass();
        }
        if (srcClass == null) {
            return cost + 1.5f;
        }
        return cost;
    }

    private static float getPrimitivePromotionCost(Class<?> srcClass, Class<?> destClass) {
        float cost = 0.0f;
        Class<?> cls = srcClass;
        if (!cls.isPrimitive()) {
            cost = 0.0f + 0.1f;
            cls = wrapperToPrimitive(cls);
        }
        int i = 0;
        while (cls != destClass && i < ORDERED_PRIMITIVE_TYPES.length) {
            if (cls == ORDERED_PRIMITIVE_TYPES[i]) {
                cost += 0.1f;
                if (i < ORDERED_PRIMITIVE_TYPES.length - 1) {
                    cls = ORDERED_PRIMITIVE_TYPES[i + 1];
                }
            }
            i++;
        }
        return cost;
    }
}
