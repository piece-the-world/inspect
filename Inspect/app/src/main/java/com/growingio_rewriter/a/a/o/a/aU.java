/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.aM;
import com.growingio.a.a.o.a.aV;
import com.growingio.a.a.o.a.aW;
import com.growingio.a.a.o.a.aX;
import com.growingio.a.a.o.a.aY;

public abstract class aU
extends Enum<aU>
implements aY {
    public static final /* enum */ aU a = new aV("THROW", 0);
    public static final /* enum */ aU b = new aW("WARN", 1);
    public static final /* enum */ aU c = new aX("DISABLED", 2);
    private static final /* synthetic */ aU[] d;

    public static aU[] a() {
        return (aU[])d.clone();
    }

    public static aU a(String string) {
        return (aU)Enum.valueOf(aU.class, string);
    }

    private aU() {
        super(string, n2);
    }

    /* synthetic */ aU(String string, int n2, aM aM2) {
        this();
    }

    static {
        d = new aU[]{a, b, c};
    }
}

