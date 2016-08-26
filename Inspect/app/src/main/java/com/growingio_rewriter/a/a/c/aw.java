/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.b.ab;
import com.growingio.a.a.c.P;
import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.at;
import com.growingio.a.a.c.ax;
import com.growingio.a.a.c.ay;
import com.growingio.a.a.c.az;

abstract class aw
extends Enum<aw> {
    public static final /* enum */ aw a = new ax("STRONG", 0);
    public static final /* enum */ aw b = new ay("SOFT", 1);
    public static final /* enum */ aw c = new az("WEAK", 2);
    private static final /* synthetic */ aw[] d;

    public static aw[] a() {
        return (aw[])d.clone();
    }

    public static aw a(String string) {
        return (aw)((Object)Enum.valueOf(aw.class, string));
    }

    private aw() {
        super(string, n2);
    }

    abstract <K, V> aG<K, V> a(at<K, V> var1, as<K, V> var2, V var3, int var4);

    abstract ab<Object> b();

    /* synthetic */ aw(String string, int n2, P p2) {
        this();
    }

    static {
        d = new aw[]{a, b, c};
    }
}

