/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.W;
import com.growingio.a.a.d.X;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iS;
import com.growingio.a.a.d.iX;
import com.growingio.a.a.d.ii;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

abstract class V<K, V>
extends iS<K, V>
implements NavigableMap<K, V> {
    V() {
    }

    @Override
    public abstract V get(Object var1);

    @Override
    public Map.Entry<K, V> firstEntry() {
        return gb.d(this.b(), null);
    }

    @Override
    public Map.Entry<K, V> lastEntry() {
        return gb.d(this.a(), null);
    }

    @Override
    public Map.Entry<K, V> pollFirstEntry() {
        return gb.h(this.b());
    }

    @Override
    public Map.Entry<K, V> pollLastEntry() {
        return gb.h(this.a());
    }

    @Override
    public K firstKey() {
        Map.Entry<K, V> entry = this.firstEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getKey();
    }

    @Override
    public K lastKey() {
        Map.Entry<K, V> entry = this.lastEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getKey();
    }

    @Override
    public Map.Entry<K, V> lowerEntry(K k2) {
        return this.headMap(k2, false).lastEntry();
    }

    @Override
    public Map.Entry<K, V> floorEntry(K k2) {
        return this.headMap(k2, true).lastEntry();
    }

    @Override
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return this.tailMap(k2, true).firstEntry();
    }

    @Override
    public Map.Entry<K, V> higherEntry(K k2) {
        return this.tailMap(k2, false).firstEntry();
    }

    @Override
    public K lowerKey(K k2) {
        return ii.b(this.lowerEntry(k2));
    }

    @Override
    public K floorKey(K k2) {
        return ii.b(this.floorEntry(k2));
    }

    @Override
    public K ceilingKey(K k2) {
        return ii.b(this.ceilingEntry(k2));
    }

    @Override
    public K higherKey(K k2) {
        return ii.b(this.higherEntry(k2));
    }

    abstract Iterator<Map.Entry<K, V>> a();

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
    public NavigableSet<K> navigableKeySet() {
        return new iX<K, V>(this);
    }

    @Override
    public Set<K> keySet() {
        return this.navigableKeySet();
    }

    @Override
    public NavigableSet<K> descendingKeySet() {
        return this.descendingMap().navigableKeySet();
    }

    @Override
    public NavigableMap<K, V> descendingMap() {
        return new X(this, null);
    }
}

