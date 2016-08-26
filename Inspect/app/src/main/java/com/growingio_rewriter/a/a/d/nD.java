/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.lD;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nE;
import com.growingio.a.a.d.nG;
import com.growingio.a.a.d.nH;
import com.growingio.a.a.d.nL;
import com.growingio.a.a.d.nN;
import com.growingio.a.a.d.nO;
import java.util.Map;
import java.util.Set;

public final class nD {
    private static final aq<? extends Map<?, ?>, ? extends Map<?, ?>> a = new nE();

    private nD() {
    }

    public static <R, C, V> nC<R, C, V> a(R r2, C c2, V v2) {
        return new nG<R, C, V>(r2, c2, v2);
    }

    public static <R, C, V> nB<C, R, V> a(nB<R, C, V> nB2) {
        return nB2 instanceof nL ? ((nL)nB2).a : new nL<C, R, V>(nB2);
    }

    public static <R, C, V> nB<R, C, V> a(Map<R, Map<C, V>> map, bG<? extends Map<C, V>> bG2) {
        aU.a(map.isEmpty());
        aU.a(bG2);
        return new mE<R, C, V>(map, bG2);
    }

    public static <R, C, V1, V2> nB<R, C, V2> a(nB<R, C, V1> nB2, aq<? super V1, V2> aq2) {
        return new nH<R, C, V1, V2>(nB2, aq2);
    }

    public static <R, C, V> nB<R, C, V> b(nB<? extends R, ? extends C, ? extends V> nB2) {
        return new nO<R, C, V>(nB2);
    }

    public static <R, C, V> lD<R, C, V> a(lD<R, ? extends C, ? extends V> lD2) {
        return new nN<R, C, V>(lD2);
    }

    private static <K, V> aq<Map<K, V>, Map<K, V>> b() {
        return a;
    }

    static boolean a(nB<?, ?, ?> nB2, Object object) {
        if (object == nB2) {
            return true;
        }
        if (object instanceof nB) {
            nB nB3 = (nB)object;
            return nB2.e().equals(nB3.e());
        }
        return false;
    }

    static /* synthetic */ aq a() {
        return nD.b();
    }
}

