/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.A;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

class x
extends n<K, V>
implements NavigableSet<K> {
    final /* synthetic */ n b;

    x(NavigableMap<K, Collection<V>> var1_1) {
        this.b = var1_1;
        super((n)var1_1, navigableMap);
    }

    NavigableMap<K, Collection<V>> a() {
        return (NavigableMap)super.b();
    }

    @Override
    public K lower(K k2) {
        return this.a().lowerKey(k2);
    }

    @Override
    public K floor(K k2) {
        return this.a().floorKey(k2);
    }

    @Override
    public K ceiling(K k2) {
        return this.a().ceilingKey(k2);
    }

    @Override
    public K higher(K k2) {
        return this.a().higherKey(k2);
    }

    @Override
    public K pollFirst() {
        return (K)gb.h(this.iterator());
    }

    @Override
    public K pollLast() {
        return gb.h(this.descendingIterator());
    }

    @Override
    public NavigableSet<K> descendingSet() {
        return new x(this.b, this.a().descendingMap());
    }

    @Override
    public Iterator<K> descendingIterator() {
        return this.descendingSet().iterator();
    }

    public NavigableSet<K> a(K k2) {
        return this.headSet(k2, false);
    }

    @Override
    public NavigableSet<K> headSet(K k2, boolean bl2) {
        return new x(this.b, this.a().headMap(k2, bl2));
    }

    public NavigableSet<K> a(K k2, K k3) {
        return this.subSet(k2, true, k3, false);
    }

    @Override
    public NavigableSet<K> subSet(K k2, boolean bl2, K k3, boolean bl3) {
        return new x(this.b, this.a().subMap(k2, bl2, k3, bl3));
    }

    public NavigableSet<K> b(K k2) {
        return this.tailSet(k2, true);
    }

    @Override
    public NavigableSet<K> tailSet(K k2, boolean bl2) {
        return new x(this.b, this.a().tailMap(k2, bl2));
    }

    @Override
    public /* synthetic */ SortedSet tailSet(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ SortedSet subSet(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public /* synthetic */ SortedSet headSet(Object object) {
        return this.a(object);
    }

    /* synthetic */ SortedMap b() {
        return this.a();
    }
}

