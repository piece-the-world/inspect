package com.netease.caipiao.dcsdk.utils;

import com.netease.caipiao.dcsdk.BuildConfig;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectHelper {
    private static Class<?> mType;
    private static Object mValue;

    public static Object invoke(Object owner, String targetClass, String methodName, Class<?>[] parameterTypes, Object[] parameters) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        Method method = getTargetclass(owner, targetClass).getDeclaredMethod(methodName, parameterTypes);
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return method.invoke(owner, parameters);
    }

    public static void listObject(Object owner, String targetClass) {
        int i = 0;
        Class<?> ownerclass = getTargetclass(owner, targetClass);
        System.err.println(ownerclass + " field:");
        for (Field field : ownerclass.getDeclaredFields()) {
            System.err.println(field.getName());
        }
        System.err.println(ownerclass + " method:");
        Method[] declaredMethods = ownerclass.getDeclaredMethods();
        int length = declaredMethods.length;
        while (i < length) {
            System.err.println(declaredMethods[i].getName());
            i++;
        }
    }

    public static Object invoke(Object object, String function, String parameter) throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String str;
        Class<?>[] types;
        Object[] values;
        PrintStream printStream = System.out;
        StringBuilder append = new StringBuilder().append(function).append("(");
        if (parameter == null) {
            str = BuildConfig.FLAVOR;
        } else {
            str = parameter;
        }
        printStream.println(append.append(str).append(")").toString());
        if (parameter == null) {
            types = new Class[0];
            values = new Object[0];
        } else {
            String[] parameters = parameter.split(",");
            types = new Class[parameters.length];
            values = new Object[parameters.length];
            for (int i = 0; i < parameters.length; i++) {
                mType = null;
                mValue = null;
                getParameters(parameters[i]);
                types[i] = mType;
                values[i] = mValue;
            }
        }
        return invoke(object, null, function, types, values);
    }

    private static void getParameters(String parameterString) {
        String type = parameterString.substring(0, parameterString.indexOf(":"));
        String value = parameterString.substring(parameterString.indexOf(":") + 1, parameterString.length());
        if ("String".equalsIgnoreCase(type)) {
            mType = String.class;
            mValue = String.valueOf(value);
        } else if ("int".equalsIgnoreCase(type)) {
            mType = Integer.TYPE;
            mValue = Integer.valueOf(Integer.valueOf(value).intValue());
        } else if ("boolean".equalsIgnoreCase(type)) {
            mType = Boolean.TYPE;
            mValue = Boolean.valueOf(Boolean.valueOf(value).booleanValue());
        } else if ("float".equalsIgnoreCase(type)) {
            mType = Float.TYPE;
            mValue = Float.valueOf(Float.valueOf(value).floatValue());
        } else if ("double".equalsIgnoreCase(type)) {
            mType = Double.TYPE;
            mValue = Double.valueOf(Double.valueOf(value).doubleValue());
        } else if ("long".equalsIgnoreCase(type)) {
            mType = Long.TYPE;
            mValue = Long.valueOf(Long.valueOf(value).longValue());
        }
    }

    public static void setField(Object owner, String targetClass, String fieldName, Object value) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field field = getTargetclass(owner, targetClass).getDeclaredField(fieldName);
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        field.set(owner, value);
    }

    public static Object getField(Object owner, String targetClass, String fieldName) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field field = getTargetclass(owner, targetClass).getDeclaredField(fieldName);
        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        return field.get(owner);
    }

    private static Class<?> getTargetclass(Object owner, String targetClass) {
        if (targetClass != null) {
            return Class.forName(targetClass);
        }
        try {
            return owner.getClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static ArrayList<String> getFieldNameByType(Object owner, String targetClass, Class<?> type) {
        ArrayList<String> names = new ArrayList();
        for (Field field : getTargetclass(owner, targetClass).getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            if (getClassName(field.getType()).equals(getClassName(type))) {
                names.add(field.getName());
            }
        }
        return names;
    }

    private static String getClassName(Class<?> type) {
        String fieldString = type.toString();
        if (fieldString.startsWith("class ")) {
            return fieldString.substring("class ".length());
        }
        return fieldString;
    }

    public static ArrayList<String> getFieldNameByValue(Object owner, String targetClass, Class<?> valueType, Object value) throws IllegalArgumentException, IllegalAccessException {
        ArrayList<String> names = new ArrayList();
        for (Field field : getTargetclass(owner, targetClass).getDeclaredFields()) {
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            if (getClassName(field.getType()).equals(getClassName(valueType)) && field.get(owner).equals(value)) {
                names.add(field.getName());
            }
        }
        return names;
    }

    public static ArrayList<Class<?>> getInterfaces(Object owner, String[] interfaceStrings) {
        ArrayList<Class<?>> targetInterfaces = new ArrayList();
        for (Class<?> interfaceClass : owner.getClass().getInterfaces()) {
            for (String interfaceName : interfaceStrings) {
                if (interfaceClass.getName().contains(interfaceName)) {
                    targetInterfaces.add(interfaceClass);
                }
            }
        }
        return targetInterfaces;
    }
}
