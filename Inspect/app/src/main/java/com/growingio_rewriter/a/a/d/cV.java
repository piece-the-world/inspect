/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.df;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

public abstract class cV<K, V>
extends df<K, V>
implements NavigableMap<K, V> {
    protected cV() {
    }

    protected abstract NavigableMap<K, V> b();

    @Override
    public Map.Entry<K, V> lowerEntry(K k2) {
        return this.b().lowerEntry(k2);
    }

    protected Map.Entry<K, V> a(K k2) {
        return this.headMap(k2, false).lastEntry();
    }

    @Override
    public K lowerKey(K k2) {
        return this.b().lowerKey(k2);
    }

    protected K b(K k2) {
        return ii.b(this.lowerEntry(k2));
    }

    @Override
    public Map.Entry<K, V> floorEntry(K k2) {
        return this.b().floorEntry(k2);
    }

    protected Map.Entry<K, V> g(K k2) {
        return this.headMap(k2, true).lastEntry();
    }

    @Override
    public K floorKey(K k2) {
        return this.b().floorKey(k2);
    }

    protected K h(K k2) {
        return ii.b(this.floorEntry(k2));
    }

    @Override
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return this.b().ceilingEntry(k2);
    }

    protected Map.Entry<K, V> i(K k2) {
        return this.tailMap(k2, true).firstEntry();
    }

    @Override
    public K ceilingKey(K k2) {
        return this.b().ceilingKey(k2);
    }

    protected K j(K k2) {
        return ii.b(this.ceilingEntry(k2));
    }

    @Override
    public Map.Entry<K, V> higherEntry(K k2) {
        return this.b().higherEntry(k2);
    }

    protected Map.Entry<K, V> k(K k2) {
        return this.tailMap(k2, false).firstEntry();
    }

    @Override
    public K higherKey(K k2) {
        return this.b().higherKey(k2);
    }

    protected K l(K k2) {
        return ii.b(this.higherEntry(k2));
    }

    @Override
    public Map.Entry<K, V> firstEntry() {
        return this.b().firstEntry();
    }

    protected Map.Entry<K, V> c() {
        return fL.d(this.entrySet(), null);
    }

    protected K d() {
        Map.Entry<K, V> entry = this.firstEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getKey();
    }

    @Override
    public Map.Entry<K, V> lastEntry() {
        return this.b().lastEntry();
    }

    protected Map.Entry<K, V> e() {
        return fL.d(this.descendingMap().entrySet(), null);
    }

    protected K k() {
        Map.Entry<K, V> entry = this.lastEntry();
        if (entry == null) {
            throw new NoSuchElementException();
        }
        return entry.getKey();
    }

    @Override
    public Map.Entry<K, V> pollFirstEntry() {
        return this.b().pollFirstEntry();
    }

    protected Map.Entry<K, V> l() {
        return gb.h(this.entrySet().iterator());
    }

    @Override
    public Map.Entry<K, V> pollLastEntry() {
        return this.b().pollLastEntry();
    }

    protected Map.Entry<K, V> m() {
        return gb.h(this.descendingMap().entrySet().iterator());
    }

    @Override
    public NavigableMap<K, V> descendingMap() {
        return this.b().descendingMap();
    }

    @Override
    public NavigableSet<K> navigableKeySet() {
        return this.b().navigableKeySet();
    }

    @Override
    public NavigableSet<K> descendingKeySet() {
        return this.b().descendingKeySet();
    }

    protected NavigableSet<K> n() {
        return this.descendingMap().navigableKeySet();
    }

    @Override
    protected SortedMap<K, V> a(K k2, K k3) {
        return this.subMap(k2, true, k3, false);
    }

    @Override
    public NavigableMap<K, V> subMap(K k2, boolean bl2, K k3, boolean bl3) {
        return this.b().subMap(k2, bl2, k3, bl3);
    }

    @Override
    public NavigableMap<K, V> headMap(K k2, boolean bl2) {
        return this.b().headMap(k2, bl2);
    }

    @Override
    public NavigableMap<K, V> tailMap(K k2, boolean bl2) {
        return this.b().tailMap(k2, bl2);
    }

    protected SortedMap<K, V> m(K k2) {
        return this.headMap(k2, false);
    }

    protected SortedMap<K, V> n(K k2) {
        return this.tailMap(k2, true);
    }

    @Override
    protected /* synthetic */ SortedMap o() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Map a() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

