/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.G;
import com.growingio.a.a.n.Q;
import com.growingio.a.a.n.R;
import com.growingio.a.a.n.S;
import com.growingio.a.a.n.T;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class P<K> {
    static final P<F<?>> a = new Q();
    static final P<Class<?>> b = new R();

    private P() {
    }

    final P<K> a() {
        return new S(this, this);
    }

    final ea<K> a(K k2) {
        return this.a((Iterable<? extends K>)ea.a(k2));
    }

    ea<K> a(Iterable<? extends K> iterable) {
        HashMap hashMap = ii.c();
        for (K k2 : iterable) {
            this.a(k2, hashMap);
        }
        return P.a(hashMap, kO.d().a());
    }

    private int a(K k2, Map<? super K, Integer> map) {
        Integer n2 = map.get(k2);
        if (n2 != null) {
            return n2;
        }
        int n3 = this.b(k2).isInterface() ? 1 : 0;
        for (K k3 : this.c(k2)) {
            n3 = Math.max(n3, this.a(k3, map));
        }
        Iterator iterator = this.d(k2);
        if (iterator != null) {
            n3 = Math.max(n3, this.a(iterator, map));
        }
        map.put(k2, n3 + 1);
        return n3 + 1;
    }

    private static <K, V> ea<K> a(Map<K, V> map, Comparator<? super V> comparator) {
        T t2 = new T(comparator, map);
        return t2.b(map.keySet());
    }

    abstract Class<?> b(K var1);

    abstract Iterable<? extends K> c(K var1);

    abstract K d(K var1);

    /* synthetic */ P(G g2) {
        this();
    }
}

