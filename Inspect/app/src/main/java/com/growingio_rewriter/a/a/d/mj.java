/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.mi;
import com.growingio.a.a.d.mk;
import com.growingio.a.a.d.ml;
import com.growingio.a.a.d.mm;

public abstract class mj
extends Enum<mj> {
    public static final /* enum */ mj a = new mk("NEXT_LOWER", 0);
    public static final /* enum */ mj b = new ml("NEXT_HIGHER", 1);
    public static final /* enum */ mj c = new mm("INVERTED_INSERTION_INDEX", 2);
    private static final /* synthetic */ mj[] d;

    public static mj[] a() {
        return (mj[])d.clone();
    }

    public static mj a(String string) {
        return (mj)((Object)Enum.valueOf(mj.class, string));
    }

    private mj() {
        super(string, n2);
    }

    abstract int a(int var1);

    /* synthetic */ mj(String string, int n2, mi mi2) {
        this();
    }

    static {
        d = new mj[]{a, b, c};
    }
}

