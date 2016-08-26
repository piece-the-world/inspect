/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.A;
import com.growingio.a.a.d.n;
import com.growingio.a.a.d.q;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class z
extends n<K, V>
implements SortedMap<K, Collection<V>> {
    SortedSet<K> d;
    final /* synthetic */ n e;

    z(SortedMap<K, Collection<V>> var1_1) {
        this.e = var1_1;
        super((n)var1_1, sortedMap);
    }

    SortedMap<K, Collection<V>> g() {
        return (SortedMap)this.a;
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.g().comparator();
    }

    @Override
    public K firstKey() {
        return this.g().firstKey();
    }

    @Override
    public K lastKey() {
        return this.g().lastKey();
    }

    @Override
    public SortedMap<K, Collection<V>> headMap(K k2) {
        return new z(this.e, this.g().headMap(k2));
    }

    @Override
    public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
        return new z(this.e, this.g().subMap(k2, k3));
    }

    @Override
    public SortedMap<K, Collection<V>> tailMap(K k2) {
        return new z(this.e, this.g().tailMap(k2));
    }

    public SortedSet<K> f() {
        SortedSet<K> sortedSet = this.d;
        SortedSet<K> sortedSet2 = sortedSet == null ? (this.d = this.e()) : sortedSet;
        return sortedSet2;
    }

    @Override
    SortedSet<K> e() {
        return new A(this.e, this.g());
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.f();
    }

    /* synthetic */ Set h() {
        return this.e();
    }
}

