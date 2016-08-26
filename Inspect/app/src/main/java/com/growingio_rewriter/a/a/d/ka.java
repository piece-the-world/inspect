/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.N;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jO;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kb;
import com.growingio.a.a.d.lH;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ka<K, V>
extends N<K, V>
implements lH<K, V>,
Serializable {
    final Map<K, V> a;
    private static final long b = 7845222491160860175L;

    ka(Map<K, V> map) {
        this.a = aU.a(map);
    }

    @Override
    public int l_() {
        return this.a.size();
    }

    @Override
    public boolean f(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean g(Object object) {
        return this.a.containsValue(object);
    }

    @Override
    public boolean b(Object object, Object object2) {
        return this.a.entrySet().contains(ii.a(object, object2));
    }

    @Override
    public Set<V> a(K k2) {
        return new kb(this, k2);
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
    public Set<V> a(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Object object2) {
        return this.a.entrySet().remove(ii.a(object, object2));
    }

    @Override
    public Set<V> b(Object object) {
        HashSet<V> hashSet = new HashSet<V>(2);
        if (!this.a.containsKey(object)) {
            return hashSet;
        }
        hashSet.add(this.a.remove(object));
        return hashSet;
    }

    @Override
    public void h() {
        this.a.clear();
    }

    @Override
    public Set<K> q() {
        return this.a.keySet();
    }

    @Override
    public Collection<V> j() {
        return this.a.values();
    }

    @Override
    public Set<Map.Entry<K, V>> u() {
        return this.a.entrySet();
    }

    @Override
    Iterator<Map.Entry<K, V>> m() {
        return this.a.entrySet().iterator();
    }

    @Override
    Map<K, Collection<V>> n() {
        return new jO(this);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a((K)object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }
}

