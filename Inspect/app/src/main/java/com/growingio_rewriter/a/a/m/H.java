/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.G;
import java.util.Comparator;

class H {
    static final String a = H.class.getName() + "$UnsafeComparator";
    static final Comparator<byte[]> b = H.a();

    H() {
    }

    static Comparator<byte[]> a() {
        try {
            Class class_ = Class.forName(a);
            Comparator comparator = (Comparator)class_.getEnumConstants()[0];
            return comparator;
        }
        catch (Throwable var0_1) {
            return G.b();
        }
    }
}

