/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Y {
    private static final Map<Class<?>, Object> a;

    private Y() {
    }

    private static <T> void a(Map<Class<?>, Object> map, Class<T> class_, T t2) {
        map.put(class_, t2);
    }

    public static <T> T a(Class<T> class_) {
        Object object = a.get(aU.a(class_));
        return (T)object;
    }

    static {
        HashMap hashMap = new HashMap();
        Y.a(hashMap, Boolean.TYPE, false);
        Y.a(hashMap, Character.TYPE, Character.valueOf('\u0000'));
        Y.a(hashMap, Byte.TYPE, Byte.valueOf(0));
        Y.a(hashMap, Short.TYPE, 0);
        Y.a(hashMap, Integer.TYPE, 0);
        Y.a(hashMap, Long.TYPE, 0);
        Y.a(hashMap, Float.TYPE, Float.valueOf(0.0f));
        Y.a(hashMap, Double.TYPE, 0.0);
        a = Collections.unmodifiableMap(hashMap);
    }
}

