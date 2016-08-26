/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class z {
    private static final Map<Class<?>, Class<?>> a;
    private static final Map<Class<?>, Class<?>> b;

    private z() {
    }

    private static void a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> class_, Class<?> class_2) {
        map.put(class_, class_2);
        map2.put(class_2, class_);
    }

    public static Set<Class<?>> a() {
        return a.keySet();
    }

    public static Set<Class<?>> b() {
        return b.keySet();
    }

    public static boolean a(Class<?> class_) {
        return b.containsKey(aU.a(class_));
    }

    public static <T> Class<T> b(Class<T> class_) {
        aU.a(class_);
        Class class_2 = a.get(class_);
        return class_2 == null ? class_ : class_2;
    }

    public static <T> Class<T> c(Class<T> class_) {
        aU.a(class_);
        Class class_2 = b.get(class_);
        return class_2 == null ? class_ : class_2;
    }

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        z.a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        z.a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        z.a(hashMap, hashMap2, Character.TYPE, Character.class);
        z.a(hashMap, hashMap2, Double.TYPE, Double.class);
        z.a(hashMap, hashMap2, Float.TYPE, Float.class);
        z.a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        z.a(hashMap, hashMap2, Long.TYPE, Long.class);
        z.a(hashMap, hashMap2, Short.TYPE, Short.class);
        z.a(hashMap, hashMap2, Void.TYPE, Void.class);
        a = Collections.unmodifiableMap(hashMap);
        b = Collections.unmodifiableMap(hashMap2);
    }
}

