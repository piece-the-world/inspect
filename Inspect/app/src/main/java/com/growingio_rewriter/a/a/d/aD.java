/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aE;
import com.growingio.a.a.d.aF;

public abstract class aD
extends Enum<aD> {
    public static final /* enum */ aD a = new aE("OPEN", 0);
    public static final /* enum */ aD b = new aF("CLOSED", 1);
    private static final /* synthetic */ aD[] c;

    public static aD[] a() {
        return (aD[])c.clone();
    }

    public static aD a(String string) {
        return (aD)((Object)Enum.valueOf(aD.class, string));
    }

    private aD() {
        super(string, n2);
    }

    static aD a(boolean bl2) {
        return bl2 ? b : a;
    }

    abstract aD b();

    /* synthetic */ aD(String string, int n2, aE aE2) {
        this();
    }

    static {
        c = new aD[]{a, b};
    }
}

