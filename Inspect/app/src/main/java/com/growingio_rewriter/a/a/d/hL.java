/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hH;
import com.growingio.a.a.d.hI;
import com.growingio.a.a.d.hM;
import com.growingio.a.a.d.hN;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.hV;
import com.growingio.a.a.d.hX;

abstract class hL
extends Enum<hL> {
    public static final /* enum */ hL a = new hM("STRONG", 0);
    public static final /* enum */ hL b = new hN("WEAK", 1);
    private static final /* synthetic */ hL[] c;

    public static hL[] a() {
        return (hL[])c.clone();
    }

    public static hL a(String string) {
        return (hL)((Object)Enum.valueOf(hL.class, string));
    }

    private hL() {
        super(string, n2);
    }

    static hL a(hX hX2) {
        switch (hI.a[hX2.ordinal()]) {
            case 1: {
                return a;
            }
            case 2: {
                return b;
            }
        }
        throw new AssertionError();
    }

    abstract <K, V> hT<K, V> a(hV<K, V> var1, K var2, int var3, hT<K, V> var4);

    <K, V> hT<K, V> a(hV<K, V> hV2, hT<K, V> hT2, hT<K, V> hT3) {
        return this.a(hV2, hT2.d(), hT2.c(), hT3);
    }

    /* synthetic */ hL(String string, int n2, hH hH2) {
        this();
    }

    static {
        c = new hL[]{a, b};
    }
}

