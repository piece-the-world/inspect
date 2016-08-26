/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.bb;
import com.growingio.a.a.c.bc;
import com.growingio.a.a.c.bd;
import com.growingio.a.a.c.be;
import com.growingio.a.a.c.bf;

public abstract class ba
extends Enum<ba> {
    public static final /* enum */ ba a = new bb("EXPLICIT", 0);
    public static final /* enum */ ba b = new bc("REPLACED", 1);
    public static final /* enum */ ba c = new bd("COLLECTED", 2);
    public static final /* enum */ ba d = new be("EXPIRED", 3);
    public static final /* enum */ ba e = new bf("SIZE", 4);
    private static final /* synthetic */ ba[] f;

    public static ba[] a() {
        return (ba[])f.clone();
    }

    public static ba a(String string) {
        return (ba)((Object)Enum.valueOf(ba.class, string));
    }

    private ba() {
        super(string, n2);
    }

    abstract boolean b();

    /* synthetic */ ba(String string, int n2, bb bb2) {
        this();
    }

    static {
        f = new ba[]{a, b, c, d, e};
    }
}

