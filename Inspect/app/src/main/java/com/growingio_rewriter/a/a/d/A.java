/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.n;
import com.growingio.a.a.d.u;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

class A
extends n<K, V>
implements SortedSet<K> {
    final /* synthetic */ n c;

    A(SortedMap<K, Collection<V>> var1_1) {
        this.c = var1_1;
        super((n)var1_1, sortedMap);
    }

    SortedMap<K, Collection<V>> b() {
        return (SortedMap)super.c();
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.b().comparator();
    }

    @Override
    public K first() {
        return this.b().firstKey();
    }

    @Override
    public SortedSet<K> headSet(K k2) {
        return new A(this.c, this.b().headMap(k2));
    }

    @Override
    public K last() {
        return this.b().lastKey();
    }

    @Override
    public SortedSet<K> subSet(K k2, K k3) {
        return new A(this.c, this.b().subMap(k2, k3));
    }

    @Override
    public SortedSet<K> tailSet(K k2) {
        return new A(this.c, this.b().tailMap(k2));
    }
}

