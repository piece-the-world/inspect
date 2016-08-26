/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cN;
import com.growingio.a.a.d.iX;
import com.growingio.a.a.d.iz;
import com.growingio.a.a.d.jj;
import com.growingio.a.a.d.kO;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

abstract class iy<K, V>
extends cN<K, V>
implements NavigableMap<K, V> {
    private transient Comparator<? super K> a;
    private transient Set<Map.Entry<K, V>> b;
    private transient NavigableSet<K> c;

    iy() {
    }

    abstract NavigableMap<K, V> b();

    @Override
    protected final Map<K, V> a() {
        return this.b();
    }

    @Override
    public Comparator<? super K> comparator() {
        Comparator<K> comparator = this.a;
        if (comparator == null) {
            Comparator<K> comparator2 = this.b().comparator();
            if (comparator2 == null) {
                comparator2 = kO.d();
            }
            comparator = this.a = iy.a(comparator2);
        }
        return comparator;
    }

    private static <T> kO<T> a(Comparator<T> comparator) {
        return kO.a(comparator).a();
    }

    @Override
    public K firstKey() {
        return this.b().lastKey();
    }

    @Override
    public K lastKey() {
        return this.b().firstKey();
    }

    @Override
    public Map.Entry<K, V> lowerEntry(K k2) {
        return this.b().higherEntry(k2);
    }

    @Override
    public K lowerKey(K k2) {
        return this.b().higherKey(k2);
    }

    @Override
    public Map.Entry<K, V> floorEntry(K k2) {
        return this.b().ceilingEntry(k2);
    }

    @Override
    public K floorKey(K k2) {
        return this.b().ceilingKey(k2);
    }

    @Override
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return this.b().floorEntry(k2);
    }

    @Override
    public K ceilingKey(K k2) {
        return this.b().floorKey(k2);
    }

    @Override
    public Map.Entry<K, V> higherEntry(K k2) {
        return this.b().lowerEntry(k2);
    }

    @Override
    public K higherKey(K k2) {
        return this.b().lowerKey(k2);
    }

    @Override
    public Map.Entry<K, V> firstEntry() {
        return this.b().lastEntry();
    }

    @Override
    public Map.Entry<K, V> lastEntry() {
        return this.b().firstEntry();
    }

    @Override
    public Map.Entry<K, V> pollFirstEntry() {
        return this.b().pollLastEntry();
    }

    @Override
    public Map.Entry<K, V> pollLastEntry() {
        return this.b().pollFirstEntry();
    }

    @Override
    public NavigableMap<K, V> descendingMap() {
        return this.b();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.b;
        Set<Map.Entry<K, V>> set2 = set == null ? (this.b = this.d()) : set;
        return set2;
    }

    abstract Iterator<Map.Entry<K, V>> c();

    Set<Map.Entry<K, V>> d() {
        return new iz(this);
    }

    @Override
    public Set<K> keySet() {
        return this.navigableKeySet();
    }

    @Override
    public NavigableSet<K> navigableKeySet() {
        NavigableSet<K> navigableSet = this.c;
        NavigableSet<K> navigableSet2 = navigableSet == null ? (this.c = new iX<K, V>(this)) : navigableSet;
        return navigableSet2;
    }

    @Override
    public NavigableSet<K> descendingKeySet() {
        return this.b().navigableKeySet();
    }

    @Override
    public NavigableMap<K, V> subMap(K k2, boolean bl2, K k3, boolean bl3) {
        return this.b().subMap(k3, bl3, k2, bl2).descendingMap();
    }

    @Override
    public NavigableMap<K, V> headMap(K k2, boolean bl2) {
        return this.b().tailMap(k2, bl2).descendingMap();
    }

    @Override
    public NavigableMap<K, V> tailMap(K k2, boolean bl2) {
        return this.b().headMap(k2, bl2).descendingMap();
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
    public Collection<V> values() {
        return new jj<K, V>(this);
    }

    @Override
    public String toString() {
        return this.j();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

