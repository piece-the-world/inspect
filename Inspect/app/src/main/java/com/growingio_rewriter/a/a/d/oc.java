/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.nY;
import com.growingio.a.a.d.od;
import com.growingio.a.a.d.oe;
import com.growingio.a.a.d.of;

abstract class oc
extends Enum<oc> {
    public static final /* enum */ oc a = new od("SIZE", 0);
    public static final /* enum */ oc b = new oe("DISTINCT", 1);
    private static final /* synthetic */ oc[] c;

    public static oc[] a() {
        return (oc[])c.clone();
    }

    public static oc a(String string) {
        return (oc)((Object)Enum.valueOf(oc.class, string));
    }

    private oc() {
        super(string, n2);
    }

    abstract int a(of<?> var1);

    abstract long b(of<?> var1);

    /* synthetic */ oc(String string, int n2, nY nY2) {
        this();
    }

    static {
        c = new oc[]{a, b};
    }
}

