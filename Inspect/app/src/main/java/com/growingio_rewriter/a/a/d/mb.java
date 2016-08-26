/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dK;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import java.util.Map;

final class mb<K, V>
extends dK<K, V> {
    final transient K a;
    final transient V c;
    transient dK<V, K> d;

    mb(K k2, V v2) {
        aK.a(k2, v2);
        this.a = k2;
        this.c = v2;
    }

    private mb(K k2, V v2, dK<V, K> dK2) {
        this.a = k2;
        this.c = v2;
        this.d = dK2;
    }

    @Override
    public V get(Object object) {
        return this.a.equals(object) ? (V)this.c : null;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.equals(object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.c.equals(object);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    fg<Map.Entry<K, V>> l() {
        return fg.d(ii.a(this.a, this.c));
    }

    @Override
    fg<K> c() {
        return fg.d(this.a);
    }

    @Override
    public dK<V, K> e() {
        dK<K, V> dK2 = this.d;
        if (dK2 == null) {
            this.d = new mb<K, V>(this.c, this.a, this);
            return this.d;
        }
        return dK2;
    }

    @Override
    public /* synthetic */ av m_() {
        return this.e();
    }
}

