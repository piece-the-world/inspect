/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.df;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

class jh<K, V>
extends df<K, V>
implements Serializable,
NavigableMap<K, V> {
    private final NavigableMap<K, V> a;
    private transient jh<K, V> b;

    jh(NavigableMap<K, V> navigableMap) {
        this.a = navigableMap;
    }

    jh(NavigableMap<K, V> navigableMap, jh<K, V> jh2) {
        this.a = navigableMap;
        this.b = jh2;
    }

    @Override
    protected SortedMap<K, V> o() {
        return Collections.unmodifiableSortedMap(this.a);
    }

    @Override
    public Map.Entry<K, V> lowerEntry(K k2) {
        return ii.d(this.a.lowerEntry(k2));
    }

    @Override
    public K lowerKey(K k2) {
        return this.a.lowerKey(k2);
    }

    @Override
    public Map.Entry<K, V> floorEntry(K k2) {
        return ii.d(this.a.floorEntry(k2));
    }

    @Override
    public K floorKey(K k2) {
        return this.a.floorKey(k2);
    }

    @Override
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return ii.d(this.a.ceilingEntry(k2));
    }

    @Override
    public K ceilingKey(K k2) {
        return this.a.ceilingKey(k2);
    }

    @Override
    public Map.Entry<K, V> higherEntry(K k2) {
        return ii.d(this.a.higherEntry(k2));
    }

    @Override
    public K higherKey(K k2) {
        return this.a.higherKey(k2);
    }

    @Override
    public Map.Entry<K, V> firstEntry() {
        return ii.d(this.a.firstEntry());
    }

    @Override
    public Map.Entry<K, V> lastEntry() {
        return ii.d(this.a.lastEntry());
    }

    @Override
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public NavigableMap<K, V> descendingMap() {
        jh<K, V> jh2 = this.b;
        jh<K, V> jh3 = jh2 == null ? (this.b = new jh<K, V>(this.a.descendingMap(), this)) : jh2;
        return jh3;
    }

    @Override
    public Set<K> keySet() {
        return this.navigableKeySet();
    }

    @Override
    public NavigableSet<K> navigableKeySet() {
        return lI.a(this.a.navigableKeySet());
    }

    @Override
    public NavigableSet<K> descendingKeySet() {
        return lI.a(this.a.descendingKeySet());
    }

    @Override
    public SortedMap<K, V> subMap(K k2, K k3) {
        return this.subMap(k2, true, k3, false);
    }

    @Override
    public SortedMap<K, V> headMap(K k2) {
        return this.headMap(k2, false);
    }

    @Override
    public SortedMap<K, V> tailMap(K k2) {
        return this.tailMap(k2, true);
    }

    @Override
    public NavigableMap<K, V> subMap(K k2, boolean bl2, K k3, boolean bl3) {
        return ii.a(this.a.subMap(k2, bl2, k3, bl3));
    }

    @Override
    public NavigableMap<K, V> headMap(K k2, boolean bl2) {
        return ii.a(this.a.headMap(k2, bl2));
    }

    @Override
    public NavigableMap<K, V> tailMap(K k2, boolean bl2) {
        return ii.a(this.a.tailMap(k2, bl2));
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.o();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.o();
    }
}

