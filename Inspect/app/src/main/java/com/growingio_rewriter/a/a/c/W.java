/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.P;
import com.growingio.a.a.c.X;
import com.growingio.a.a.c.Y;
import com.growingio.a.a.c.Z;
import com.growingio.a.a.c.aa;
import com.growingio.a.a.c.ab;
import com.growingio.a.a.c.ac;
import com.growingio.a.a.c.ad;
import com.growingio.a.a.c.ae;
import com.growingio.a.a.c.as;
import com.growingio.a.a.c.at;
import com.growingio.a.a.c.aw;

abstract class W
extends Enum<W> {
    public static final /* enum */ W a = new X("STRONG", 0);
    public static final /* enum */ W b = new Y("STRONG_ACCESS", 1);
    public static final /* enum */ W c = new Z("STRONG_WRITE", 2);
    public static final /* enum */ W d = new aa("STRONG_ACCESS_WRITE", 3);
    public static final /* enum */ W e = new ab("WEAK", 4);
    public static final /* enum */ W f = new ac("WEAK_ACCESS", 5);
    public static final /* enum */ W g = new ad("WEAK_WRITE", 6);
    public static final /* enum */ W h = new ae("WEAK_ACCESS_WRITE", 7);
    static final int i = 1;
    static final int j = 2;
    static final int k = 4;
    static final W[] l;
    private static final /* synthetic */ W[] m;

    public static W[] a() {
        return (W[])m.clone();
    }

    public static W a(String string) {
        return (W)((Object)Enum.valueOf(W.class, string));
    }

    private W() {
        super(string, n2);
    }

    static W a(aw aw2, boolean bl2, boolean bl3) {
        int n2 = (aw2 == aw.c ? 4 : 0) | (bl2 ? 1 : 0) | (bl3 ? 2 : 0);
        return l[n2];
    }

    abstract <K, V> as<K, V> a(at<K, V> var1, K var2, int var3, as<K, V> var4);

    <K, V> as<K, V> a(at<K, V> at2, as<K, V> as2, as<K, V> as3) {
        return this.a(at2, as2.d(), as2.c(), as3);
    }

    <K, V> void a(as<K, V> as2, as<K, V> as3) {
        as3.a(as2.e());
        O.b(as2.g(), as3);
        O.b(as3, as2.f());
        O.b(as2);
    }

    <K, V> void b(as<K, V> as2, as<K, V> as3) {
        as3.b(as2.h());
        O.c(as2.j(), as3);
        O.c(as3, as2.i());
        O.c(as2);
    }

    /* synthetic */ W(String string, int n2, P p2) {
        this();
    }

    static {
        m = new W[]{a, b, c, d, e, f, g, h};
        l = new W[]{a, b, c, d, e, f, g, h};
    }
}

