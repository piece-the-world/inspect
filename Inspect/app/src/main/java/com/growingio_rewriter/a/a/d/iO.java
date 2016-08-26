/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.iH;
import com.growingio.a.a.d.iP;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class iO<K, V>
extends iH<K, V>
implements SortedMap<K, V> {
    iO(SortedMap<K, V> sortedMap, aV<? super Map.Entry<K, V>> aV2) {
        super(sortedMap, aV2);
    }

    SortedMap<K, V> c() {
        return (SortedMap)this.a;
    }

    public SortedSet<K> d() {
        return (SortedSet)super.keySet();
    }

    SortedSet<K> e() {
        return new iP(this);
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.c().comparator();
    }

    @Override
    public K firstKey() {
        return this.d().iterator().next();
    }

    @Override
    public K lastKey() {
        SortedMap<K, V> sortedMap = this.c();
        K k2;
        while (!this.b(k2 = sortedMap.lastKey(), this.a.get(k2))) {
            sortedMap = this.c().headMap(k2);
        }
        return k2;
    }

    @Override
    public SortedMap<K, V> headMap(K k2) {
        return new iO<K, V>(this.c().headMap(k2), this.b);
    }

    @Override
    public SortedMap<K, V> subMap(K k2, K k3) {
        return new iO<K, V>(this.c().subMap(k2, k3), this.b);
    }

    @Override
    public SortedMap<K, V> tailMap(K k2) {
        return new iO<K, V>(this.c().tailMap(k2), this.b);
    }

    @Override
    /* synthetic */ Set h() {
        return this.e();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.d();
    }
}

