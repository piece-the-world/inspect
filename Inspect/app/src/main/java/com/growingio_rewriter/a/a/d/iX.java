/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iZ;
import com.growingio.a.a.d.ii;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

class iX<K, V>
extends iZ<K, V>
implements NavigableSet<K> {
    iX(NavigableMap<K, V> navigableMap) {
        super(navigableMap);
    }

    NavigableMap<K, V> a() {
        return (NavigableMap)this.d;
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
        return ii.b(this.a().pollFirstEntry());
    }

    @Override
    public K pollLast() {
        return ii.b(this.a().pollLastEntry());
    }

    @Override
    public NavigableSet<K> descendingSet() {
        return this.a().descendingKeySet();
    }

    @Override
    public Iterator<K> descendingIterator() {
        return this.descendingSet().iterator();
    }

    @Override
    public NavigableSet<K> subSet(K k2, boolean bl2, K k3, boolean bl3) {
        return this.a().subMap(k2, bl2, k3, bl3).navigableKeySet();
    }

    @Override
    public NavigableSet<K> headSet(K k2, boolean bl2) {
        return this.a().headMap(k2, bl2).navigableKeySet();
    }

    @Override
    public NavigableSet<K> tailSet(K k2, boolean bl2) {
        return this.a().tailMap(k2, bl2).navigableKeySet();
    }

    @Override
    public SortedSet<K> subSet(K k2, K k3) {
        return this.subSet(k2, true, k3, false);
    }

    @Override
    public SortedSet<K> headSet(K k2) {
        return this.headSet(k2, false);
    }

    @Override
    public SortedSet<K> tailSet(K k2) {
        return this.tailSet(k2, true);
    }

    @Override
    /* synthetic */ SortedMap b() {
        return this.a();
    }

    @Override
    /* synthetic */ Map c() {
        return this.a();
    }
}

