/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.fF;
import com.growingio.a.a.d.fH;
import com.growingio.a.a.d.fI;
import com.growingio.a.a.d.fJ;
import com.growingio.a.a.d.hE;
import java.util.concurrent.ConcurrentMap;

public final class fG {
    private fG() {
    }

    public static <E> fF<E> a() {
        ConcurrentMap concurrentMap = new hE().h();
        return new fH(concurrentMap);
    }

    public static <E> fF<E> b() {
        return new fJ(null);
    }

    public static <E> aq<E, E> a(fF<E> fF2) {
        return new fI<E>(aU.a(fF2));
    }
}

