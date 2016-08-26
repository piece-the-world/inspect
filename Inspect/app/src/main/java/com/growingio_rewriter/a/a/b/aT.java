/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.Z;
import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.m;
import java.lang.ref.WeakReference;
import java.util.Locale;

final class aT {
    private aT() {
    }

    static long a() {
        return System.nanoTime();
    }

    static m a(m m2) {
        return m2.q();
    }

    static <T extends Enum<T>> aP<T> a(Class<T> class_, String string) {
        WeakReference weakReference = Z.a(class_).get(string);
        return weakReference == null ? aP.f() : aP.b(class_.cast(weakReference.get()));
    }

    static String a(double d2) {
        return String.format(Locale.ROOT, "%.4g", d2);
    }
}

