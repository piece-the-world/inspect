/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.gk;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class gj {
    private static final Map a = new HashMap();

    private static void a(Class class_) {
        HashMap hashMap = new HashMap();
        for (Method method : class_.getDeclaredMethods()) {
            if (!method.getName().startsWith("onTDEBEvent") || method.getParameterTypes().length != 1) continue;
            Class<?>[] arrclass = method.getParameterTypes();
            if (arrclass.length != 1) {
                throw new IllegalArgumentException("Method " + method + " must have one and only one argument.");
            }
            Class class_2 = arrclass[0];
            if (class_2.isInterface()) {
                throw new IllegalArgumentException("Method " + method + " must have a argument whose type is a class which can be instantialized.");
            }
            if ((method.getModifiers() & 1) == 0) {
                throw new IllegalArgumentException("Method " + method + " must be 'public'.");
            }
            HashSet<Method> hashSet = (HashSet<Method>)hashMap.get(class_2);
            if (hashSet == null) {
                hashSet = new HashSet<Method>();
                hashMap.put(class_2, hashSet);
            }
            hashSet.add(method);
        }
        a.put(class_, hashMap);
    }

    static Map a(Object object) {
        HashMap hashMap = new HashMap();
        try {
            Map map;
            Class class_ = object.getClass();
            if (!a.containsKey(class_)) {
                gj.a(class_);
            }
            if ((map = (Map)a.get(class_)) != null && !map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    HashSet<gk> hashSet = new HashSet<gk>();
                    for (Method method : (Set)entry.getValue()) {
                        hashSet.add(new gk(object, method));
                    }
                    hashMap.put(entry.getKey(), hashSet);
                }
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
        return hashMap;
    }

    private gj() {
    }
}

