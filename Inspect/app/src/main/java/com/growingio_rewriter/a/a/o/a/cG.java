/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cE;
import com.growingio.a.a.o.a.cH;
import com.growingio.a.a.o.a.cI;
import com.growingio.a.a.o.a.cJ;
import com.growingio.a.a.o.a.cK;
import com.growingio.a.a.o.a.cL;
import com.growingio.a.a.o.a.cM;

public abstract class cG
extends Enum<cG> {
    public static final /* enum */ cG a = new cH("NEW", 0);
    public static final /* enum */ cG b = new cI("STARTING", 1);
    public static final /* enum */ cG c = new cJ("RUNNING", 2);
    public static final /* enum */ cG d = new cK("STOPPING", 3);
    public static final /* enum */ cG e = new cL("TERMINATED", 4);
    public static final /* enum */ cG f = new cM("FAILED", 5);
    private static final /* synthetic */ cG[] g;

    public static cG[] a() {
        return (cG[])g.clone();
    }

    public static cG a(String string) {
        return (cG)((Object)Enum.valueOf(cG.class, string));
    }

    private cG() {
        super(string, n2);
    }

    abstract boolean b();

    /* synthetic */ cG(String string, int n2, cE cE2) {
        this();
    }

    static {
        g = new cG[]{a, b, c, d, e, f};
    }
}

