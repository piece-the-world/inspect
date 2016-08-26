/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dL;
import com.growingio.a.a.d.dM;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.li;
import com.growingio.a.a.d.mb;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class dK<K, V>
extends ei<K, V>
implements av<K, V> {
    public static <K, V> dK<K, V> n_() {
        return li.a;
    }

    public static <K, V> dK<K, V> b(K k2, V v2) {
        return new mb<K, V>(k2, v2);
    }

    public static <K, V> dK<K, V> a(K k2, V v2, K k3, V v3) {
        return li.a(dK.d(k2, v2), dK.d(k3, v3));
    }

    public static <K, V> dK<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4) {
        return li.a(dK.d(k2, v2), dK.d(k3, v3), dK.d(k4, v4));
    }

    public static <K, V> dK<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return li.a(dK.d(k2, v2), dK.d(k3, v3), dK.d(k4, v4), dK.d(k5, v5));
    }

    public static <K, V> dK<K, V> a(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        return li.a(dK.d(k2, v2), dK.d(k3, v3), dK.d(k4, v4), dK.d(k5, v5), dK.d(k6, v6));
    }

    public static <K, V> dL<K, V> d() {
        return new dL();
    }

    public static <K, V> dK<K, V> a(Map<? extends K, ? extends V> map) {
        dK dK2;
        if (map instanceof dK && !(dK2 = (dK)map).b()) {
            return dK2;
        }
        return dK.a(map.entrySet());
    }

    public static <K, V> dK<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] arrentry = fL.a(iterable, b);
        switch (arrentry.length) {
            case 0: {
                return dK.n_();
            }
            case 1: {
                Map.Entry entry = arrentry[0];
                return dK.b(entry.getKey(), entry.getValue());
            }
        }
        return li.a(arrentry);
    }

    dK() {
    }

    public abstract dK<V, K> e();

    public fg<V> f() {
        return this.e().m();
    }

    @Override
    public V a(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    Object g() {
        return new dM(this);
    }

    @Override
    public /* synthetic */ dQ h() {
        return this.f();
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.f();
    }

    @Override
    public /* synthetic */ av m_() {
        return this.e();
    }

    @Override
    public /* synthetic */ Set o_() {
        return this.f();
    }
}

