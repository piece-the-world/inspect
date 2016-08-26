/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cS;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.ki;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.kn;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class kh<K, V>
extends cS<K, V>
implements Serializable {
    final jr<K, V> a;
    transient Collection<Map.Entry<K, V>> b;
    transient kl<K> c;
    transient Set<K> d;
    transient Collection<V> e;
    transient Map<K, Collection<V>> f;
    private static final long g = 0;

    kh(jr<K, V> jr2) {
        this.a = aU.a(jr2);
    }

    @Override
    protected jr<K, V> b() {
        return this.a;
    }

    @Override
    public void h() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<K, Collection<V>> c() {
        Map map = this.f;
        if (map == null) {
            map = this.f = Collections.unmodifiableMap(ii.a(this.a.c(), new ki(this)));
        }
        return map;
    }

    @Override
    public Collection<Map.Entry<K, V>> l() {
        Collection collection = this.b;
        if (collection == null) {
            this.b = collection = jN.b(this.a.l());
        }
        return collection;
    }

    @Override
    public Collection<V> c(K k2) {
        return jN.a(this.a.c(k2));
    }

    @Override
    public kl<K> r() {
        kl<K> kl2 = this.c;
        if (kl2 == null) {
            this.c = kl2 = kn.a(this.a.r());
        }
        return kl2;
    }

    @Override
    public Set<K> q() {
        Set<K> set = this.d;
        if (set == null) {
            this.d = set = Collections.unmodifiableSet(this.a.q());
        }
        return set;
    }

    @Override
    public boolean a(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(jr<? extends K, ? extends V> jr2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<V> d(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<V> b(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Collection<V> j() {
        Collection<V> collection = this.e;
        if (collection == null) {
            this.e = collection = Collections.unmodifiableCollection(this.a.j());
        }
        return collection;
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

