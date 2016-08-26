/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ae;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class ab<K, V>
extends ae<K, V> {
    ab(SortedMap<K, Collection<V>> sortedMap) {
        super(sortedMap);
    }

    public SortedMap<K, Collection<V>> v() {
        return (SortedMap)super.c();
    }

    SortedMap<K, Collection<V>> w() {
        return (SortedMap)super.f();
    }

    public SortedSet<K> x() {
        return (SortedSet)super.q();
    }

    @Override
    public /* synthetic */ Map c() {
        return this.v();
    }

    @Override
    public /* synthetic */ Set q() {
        return this.x();
    }

    @Override
    /* synthetic */ Map f() {
        return this.w();
    }
}

