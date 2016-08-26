package com.netease.caipiao.dcsdk.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Utils {
    static final Class<?>[] EMPTY_CLASS_ARRAY;
    static final Object[] EMPTY_OBJECT_ARRAY;

    static {
        EMPTY_OBJECT_ARRAY = new Object[0];
        EMPTY_CLASS_ARRAY = new Class[0];
    }

    static boolean isSameLength(Object[] array1, Object[] array2) {
        if ((array1 != null || array2 == null || array2.length <= 0) && ((array2 != null || array1 == null || array1.length <= 0) && (array1 == null || array2 == null || array1.length == array2.length))) {
            return true;
        }
        return false;
    }

    static Class<?>[] toClass(Object... array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return EMPTY_CLASS_ARRAY;
        }
        Class<?>[] classes = new Class[array.length];
        for (int i = 0; i < array.length; i++) {
            classes[i] = array[i] == null ? null : array[i].getClass();
        }
        return classes;
    }

    static Class<?>[] nullToEmpty(Class<?>[] array) {
        if (array == null || array.length == 0) {
            return EMPTY_CLASS_ARRAY;
        }
        return array;
    }

    static Object[] nullToEmpty(Object[] array) {
        if (array == null || array.length == 0) {
            return EMPTY_OBJECT_ARRAY;
        }
        return array;
    }

    public static List<Class<?>> getAllInterfaces(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        LinkedHashSet<Class<?>> interfacesFound = new LinkedHashSet();
        getAllInterfaces(cls, interfacesFound);
        return new ArrayList(interfacesFound);
    }

    private static void getAllInterfaces(Class<?> cls, HashSet<Class<?>> interfacesFound) {
        while (cls != null) {
            for (Class<?> i : cls.getInterfaces()) {
                if (interfacesFound.add(i)) {
                    getAllInterfaces(i, interfacesFound);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
