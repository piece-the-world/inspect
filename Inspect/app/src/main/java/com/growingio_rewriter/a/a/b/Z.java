/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aT;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aa;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class Z {
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> a = new WeakHashMap();

    private Z() {
    }

    public static Field a(Enum<?> enum_) {
        Class class_ = enum_.getDeclaringClass();
        try {
            return class_.getDeclaredField(enum_.name());
        }
        catch (NoSuchFieldException var2_2) {
            throw new AssertionError(var2_2);
        }
    }

    public static <T extends Enum<T>> aP<T> a(Class<T> class_, String string) {
        aU.a(class_);
        aU.a(string);
        return aT.a(class_, string);
    }

    private static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> c(Class<T> class_) {
        HashMap hashMap = new HashMap();
        for (Enum enum_ : EnumSet.allOf(class_)) {
            hashMap.put(enum_.name(), new WeakReference<Enum>(enum_));
        }
        a.put(class_, hashMap);
        return hashMap;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static <T extends Enum<T>> Map<String, WeakReference<? extends Enum<?>>> a(Class<T> class_) {
        Map map = a;
        synchronized (map) {
            Map map2 = a.get(class_);
            if (map2 == null) {
                map2 = Z.c(class_);
            }
            return map2;
        }
    }

    public static <T extends Enum<T>> R<String, T> b(Class<T> class_) {
        return new aa<T>(class_);
    }
}

