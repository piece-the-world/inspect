/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iH;
import com.growingio.a.a.d.iL;
import com.growingio.a.a.d.iO;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class iP
extends iH<K, V>
implements SortedSet<K> {
    final /* synthetic */ iO b;

    iP(iO iO2) {
        this.b = iO2;
        super(iO2);
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.b.c().comparator();
    }

    @Override
    public SortedSet<K> subSet(K k2, K k3) {
        return (SortedSet)this.b.subMap(k2, k3).keySet();
    }

    @Override
    public SortedSet<K> headSet(K k2) {
        return (SortedSet)this.b.headMap(k2).keySet();
    }

    @Override
    public SortedSet<K> tailSet(K k2) {
        return (SortedSet)this.b.tailMap(k2).keySet();
    }

    @Override
    public K first() {
        return this.b.firstKey();
    }

    @Override
    public K last() {
        return this.b.lastKey();
    }
}

