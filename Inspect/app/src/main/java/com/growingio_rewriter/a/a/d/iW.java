/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.V;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.ii;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;

final class iW<K, V>
extends V<K, V> {
    private final NavigableSet<K> a;
    private final aq<? super K, V> b;

    iW(NavigableSet<K> navigableSet, aq<? super K, V> aq2) {
        this.a = aU.a(navigableSet);
        this.b = aU.a(aq2);
    }

    @Override
    public NavigableMap<K, V> subMap(K k2, boolean bl2, K k3, boolean bl3) {
        return ii.a(this.a.subSet(k2, bl2, k3, bl3), this.b);
    }

    @Override
    public NavigableMap<K, V> headMap(K k2, boolean bl2) {
        return ii.a(this.a.headSet(k2, bl2), this.b);
    }

    @Override
    public NavigableMap<K, V> tailMap(K k2, boolean bl2) {
        return ii.a(this.a.tailSet(k2, bl2), this.b);
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.a.comparator();
    }

    @Override
    public V get(Object object) {
        if (aL.a(this.a, object)) {
            Object object2 = object;
            return this.b.f((Object)object2);
        }
        return null;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    Iterator<Map.Entry<K, V>> b() {
        return ii.b(this.a, this.b);
    }

    @Override
    Iterator<Map.Entry<K, V>> a() {
        return this.descendingMap().entrySet().iterator();
    }

    @Override
    public NavigableSet<K> navigableKeySet() {
        return ii.a(this.a);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public NavigableMap<K, V> descendingMap() {
        return ii.a(this.a.descendingSet(), this.b);
    }
}

