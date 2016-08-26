/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.m;
import com.growingio.a.a.h.o;
import com.growingio.a.a.h.p;

abstract class n
extends Enum<n>
implements m {
    public static final /* enum */ n a = new o("MURMUR128_MITZ_32", 0);
    public static final /* enum */ n b = new p("MURMUR128_MITZ_64", 1);
    private static final /* synthetic */ n[] c;

    public static n[] a() {
        return (n[])c.clone();
    }

    public static n a(String string) {
        return (n)Enum.valueOf(n.class, string);
    }

    private n() {
        super(string, n2);
    }

    /* synthetic */ n(String string, int n2, o o2) {
        this();
    }

    static {
        c = new n[]{a, b};
    }
}

