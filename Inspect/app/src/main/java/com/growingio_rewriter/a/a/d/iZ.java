/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iU;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

class iZ<K, V>
extends iU<K, V>
implements SortedSet<K> {
    iZ(SortedMap<K, V> sortedMap) {
        super(sortedMap);
    }

    SortedMap<K, V> b() {
        return (SortedMap)super.c();
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.b().comparator();
    }

    @Override
    public SortedSet<K> subSet(K k2, K k3) {
        return new iZ<K, V>(this.b().subMap(k2, k3));
    }

    @Override
    public SortedSet<K> headSet(K k2) {
        return new iZ<K, V>(this.b().headMap(k2));
    }

    @Override
    public SortedSet<K> tailSet(K k2) {
        return new iZ<K, V>(this.b().tailMap(k2));
    }

    @Override
    public K first() {
        return this.b().firstKey();
    }

    @Override
    public K last() {
        return this.b().lastKey();
    }

    @Override
    /* synthetic */ Map c() {
        return this.b();
    }
}

