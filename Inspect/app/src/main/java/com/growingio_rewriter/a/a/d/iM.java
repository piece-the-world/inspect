/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.V;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iH;
import com.growingio.a.a.d.iN;
import com.growingio.a.a.d.iR;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;

class iM<K, V>
extends V<K, V> {
    private final NavigableMap<K, V> a;
    private final aV<? super Map.Entry<K, V>> b;
    private final Map<K, V> c;

    iM(NavigableMap<K, V> navigableMap, aV<? super Map.Entry<K, V>> aV2) {
        this.a = aU.a(navigableMap);
        this.b = aV2;
        this.c = new iH<K, V>(navigableMap, aV2);
    }

    @Override
    public Comparator<? super K> comparator() {
        return this.a.comparator();
    }

    @Override
    public NavigableSet<K> navigableKeySet() {
        return new iN(this, this);
    }

    @Override
    public Collection<V> values() {
        return new iR<K, V>(this, this.a, this.b);
    }

    @Override
    Iterator<Map.Entry<K, V>> b() {
        return gb.b(this.a.entrySet().iterator(), this.b);
    }

    @Override
    Iterator<Map.Entry<K, V>> a() {
        return gb.b(this.a.descendingMap().entrySet().iterator(), this.b);
    }

    @Override
    public int size() {
        return this.c.size();
    }

    @Override
    public boolean isEmpty() {
        return fL.d(this.a.entrySet(), this.b) == false;
    }

    @Override
    public V get(Object object) {
        return this.c.get(object);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.c.containsKey(object);
    }

    @Override
    public V put(K k2, V v2) {
        return this.c.put(k2, v2);
    }

    @Override
    public V remove(Object object) {
        return this.c.remove(object);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        this.c.putAll(map);
    }

    @Override
    public void clear() {
        this.c.clear();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return this.c.entrySet();
    }

    @Override
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry)((Object)fL.b(this.a.entrySet(), this.b));
    }

    @Override
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry)((Object)fL.b(this.a.descendingMap().entrySet(), this.b));
    }

    @Override
    public NavigableMap<K, V> descendingMap() {
        return ii.c(this.a.descendingMap(), this.b);
    }

    @Override
    public NavigableMap<K, V> subMap(K k2, boolean bl2, K k3, boolean bl3) {
        return ii.c(this.a.subMap(k2, bl2, k3, bl3), this.b);
    }

    @Override
    public NavigableMap<K, V> headMap(K k2, boolean bl2) {
        return ii.c(this.a.headMap(k2, bl2), this.b);
    }

    @Override
    public NavigableMap<K, V> tailMap(K k2, boolean bl2) {
        return ii.c(this.a.tailMap(k2, bl2), this.b);
    }

    static /* synthetic */ aV a(iM iM2) {
        return iM2.b;
    }

    static /* synthetic */ NavigableMap b(iM iM2) {
        return iM2.a;
    }
}

