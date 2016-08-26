/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.n;
import com.growingio.a.a.d.x;
import com.growingio.a.a.d.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class w
extends n<K, V>
implements NavigableMap<K, Collection<V>> {
    final /* synthetic */ n c;

    w(NavigableMap<K, Collection<V>> var1_1) {
        this.c = var1_1;
        super((n)var1_1, navigableMap);
    }

    NavigableMap<K, Collection<V>> c_() {
        return (NavigableMap)super.g();
    }

    @Override
    public Map.Entry<K, Collection<V>> lowerEntry(K k2) {
        Map.Entry<K, Collection<V>> entry = this.c_().lowerEntry(k2);
        return entry == null ? null : this.a(entry);
    }

    @Override
    public K lowerKey(K k2) {
        return this.c_().lowerKey(k2);
    }

    @Override
    public Map.Entry<K, Collection<V>> floorEntry(K k2) {
        Map.Entry<K, Collection<V>> entry = this.c_().floorEntry(k2);
        return entry == null ? null : this.a(entry);
    }

    @Override
    public K floorKey(K k2) {
        return this.c_().floorKey(k2);
    }

    @Override
    public Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
        Map.Entry<K, Collection<V>> entry = this.c_().ceilingEntry(k2);
        return entry == null ? null : this.a(entry);
    }

    @Override
    public K ceilingKey(K k2) {
        return this.c_().ceilingKey(k2);
    }

    @Override
    public Map.Entry<K, Collection<V>> higherEntry(K k2) {
        Map.Entry<K, Collection<V>> entry = this.c_().higherEntry(k2);
        return entry == null ? null : this.a(entry);
    }

    @Override
    public K higherKey(K k2) {
        return this.c_().higherKey(k2);
    }

    @Override
    public Map.Entry<K, Collection<V>> firstEntry() {
        Map.Entry<K, Collection<V>> entry = this.c_().firstEntry();
        return entry == null ? null : this.a(entry);
    }

    @Override
    public Map.Entry<K, Collection<V>> lastEntry() {
        Map.Entry<K, Collection<V>> entry = this.c_().lastEntry();
        return entry == null ? null : this.a(entry);
    }

    @Override
    public Map.Entry<K, Collection<V>> pollFirstEntry() {
        return this.a(this.entrySet().iterator());
    }

    @Override
    public Map.Entry<K, Collection<V>> pollLastEntry() {
        return this.a(this.descendingMap().entrySet().iterator());
    }

    Map.Entry<K, Collection<V>> a(Iterator<Map.Entry<K, Collection<V>>> iterator) {
        if (!iterator.hasNext()) {
            return null;
        }
        Map.Entry<K, Collection<V>> entry = iterator.next();
        Collection collection = this.c.d();
        collection.addAll(entry.getValue());
        iterator.remove();
        return ii.a(entry.getKey(), this.c.a(collection));
    }

    @Override
    public NavigableMap<K, Collection<V>> descendingMap() {
        return new w(this.c, this.c_().descendingMap());
    }

    public NavigableSet<K> c() {
        return (NavigableSet)super.f();
    }

    @Override
    NavigableSet<K> d() {
        return new x(this.c, this.c_());
    }

    @Override
    public NavigableSet<K> navigableKeySet() {
        return this.c();
    }

    @Override
    public NavigableSet<K> descendingKeySet() {
        return this.descendingMap().navigableKeySet();
    }

    public NavigableMap<K, Collection<V>> a(K k2, K k3) {
        return this.subMap(k2, true, k3, false);
    }

    @Override
    public NavigableMap<K, Collection<V>> subMap(K k2, boolean bl2, K k3, boolean bl3) {
        return new w(this.c, this.c_().subMap(k2, bl2, k3, bl3));
    }

    public NavigableMap<K, Collection<V>> c(K k2) {
        return this.headMap(k2, false);
    }

    @Override
    public NavigableMap<K, Collection<V>> headMap(K k2, boolean bl2) {
        return new w(this.c, this.c_().headMap(k2, bl2));
    }

    public NavigableMap<K, Collection<V>> d(K k2) {
        return this.tailMap(k2, true);
    }

    @Override
    public NavigableMap<K, Collection<V>> tailMap(K k2, boolean bl2) {
        return new w(this.c, this.c_().tailMap(k2, bl2));
    }

    /* synthetic */ SortedSet e() {
        return this.d();
    }

    public /* synthetic */ SortedSet f() {
        return this.c();
    }

    @Override
    public /* synthetic */ SortedMap tailMap(Object object) {
        return this.d(object);
    }

    @Override
    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public /* synthetic */ SortedMap headMap(Object object) {
        return this.c(object);
    }

    /* synthetic */ SortedMap g() {
        return this.c_();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.c();
    }

    /* synthetic */ Set h() {
        return this.d();
    }
}

