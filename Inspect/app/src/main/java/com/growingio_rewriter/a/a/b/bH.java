/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.b.bI;
import com.growingio.a.a.b.bJ;
import com.growingio.a.a.b.bK;
import com.growingio.a.a.b.bM;
import com.growingio.a.a.b.bN;
import com.growingio.a.a.b.bO;
import java.util.concurrent.TimeUnit;

public final class bH {
    private bH() {
    }

    public static <F, T> bG<T> a(aq<? super F, T> aq2, bG<F> bG2) {
        aU.a(aq2);
        aU.a(bG2);
        return new bK<F, T>(aq2, bG2);
    }

    public static <T> bG<T> a(bG<T> bJ2) {
        return bJ2 instanceof bJ ? bJ2 : new bJ(aU.a(bJ2));
    }

    public static <T> bG<T> a(bG<T> bG2, long l2, TimeUnit timeUnit) {
        return new bI<T>(bG2, l2, timeUnit);
    }

    public static <T> bG<T> a(T t2) {
        return new bN<T>(t2);
    }

    public static <T> bG<T> b(bG<T> bG2) {
        return new bO<T>(aU.a(bG2));
    }

    public static <T> aq<bG<T>, T> a() {
        bM bM2 = bM.a;
        return bM2;
    }
}

