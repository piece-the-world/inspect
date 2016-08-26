/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aI;
import com.growingio.a.a.b.aJ;
import com.growingio.a.a.b.aU;

public final class aH {
    public static <T> T a(T t2, T t3) {
        return t2 != null ? t2 : aU.a(t3);
    }

    public static aJ a(Object object) {
        return new aJ(object.getClass().getSimpleName(), null);
    }

    public static aJ a(Class<?> class_) {
        return new aJ(class_.getSimpleName(), null);
    }

    public static aJ a(String string) {
        return new aJ(string, null);
    }

    private aH() {
    }
}

