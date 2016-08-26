/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.iv;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class iY<K, V>
extends iv<K, V>
implements SortedMap<K, V> {
    iY(SortedSet<K> sortedSet, aq<? super K, V> aq2) {
        super(sortedSet, aq2);
    }

    SortedSet<K> d() {
        return (SortedSet)super.c();
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.d().comparator();
    }

    @Override
    public Set<K> keySet() {
        return ii.a(this.d());
    }

    @Override
    public SortedMap<K, V> subMap(K k2, K k3) {
        return ii.a(this.d().subSet(k2, k3), this.a);
    }

    @Override
    public SortedMap<K, V> headMap(K k2) {
        return ii.a(this.d().headSet(k2), this.a);
    }

    @Override
    public SortedMap<K, V> tailMap(K k2) {
        return ii.a(this.d().tailSet(k2), this.a);
    }

    @Override
    public K firstKey() {
        return this.d().first();
    }

    @Override
    public K lastKey() {
        return this.d().last();
    }

    @Override
    /* synthetic */ Set c() {
        return this.d();
    }
}

