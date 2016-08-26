/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bm;
import com.growingio.a.a.d.cS;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hh;
import com.growingio.a.a.d.hw;
import com.growingio.a.a.d.hx;
import com.growingio.a.a.d.jr;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

class hv<K, V>
extends cS<K, V>
implements Serializable {
    final hg<? super K, ? super V> a;
    final jr<K, V> b;
    transient Collection<Map.Entry<K, V>> c;
    transient Map<K, Collection<V>> d;

    public hv(jr<K, V> jr2, hg<? super K, ? super V> hg2) {
        this.b = aU.a(jr2);
        this.a = aU.a(hg2);
    }

    @Override
    protected jr<K, V> b() {
        return this.b;
    }

    @Override
    public Map<K, Collection<V>> c() {
        hx hx2 = this.d;
        if (hx2 == null) {
            Map<K, Collection<V>> map = this.b.c();
            this.d = hx2 = new hx(this, map);
        }
        return hx2;
    }

    @Override
    public Collection<Map.Entry<K, V>> l() {
        Collection collection = this.c;
        if (collection == null) {
            this.c = collection = hh.a(this.b.l(), this.a);
        }
        return collection;
    }

    @Override
    public Collection<V> c(K k2) {
        return bm.b(this.b.c(k2), new hw(this, k2));
    }

    @Override
    public boolean a(K k2, V v2) {
        this.a.a(k2, v2);
        return this.b.a(k2, v2);
    }

    @Override
    public boolean c(K k2, Iterable<? extends V> iterable) {
        return this.b.c(k2, hh.a(k2, iterable, this.a));
    }

    @Override
    public boolean a(jr<? extends K, ? extends V> jr2) {
        boolean bl2 = false;
        for (Map.Entry<K, V> entry : jr2.l()) {
            bl2 |= this.a(entry.getKey(), entry.getValue());
        }
        return bl2;
    }

    @Override
    public Collection<V> b(K k2, Iterable<? extends V> iterable) {
        return this.b.b(k2, hh.a(k2, iterable, this.a));
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

