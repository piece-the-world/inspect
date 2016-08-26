/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iE;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jd;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

class jc<K, V1, V2>
extends jd<K, V1, V2>
implements NavigableMap<K, V2> {
    jc(NavigableMap<K, V1> navigableMap, iE<? super K, ? super V1, V2> iE2) {
        super(navigableMap, iE2);
    }

    @Override
    public Map.Entry<K, V2> ceilingEntry(K k2) {
        return this.a(this.a().ceilingEntry(k2));
    }

    @Override
    public K ceilingKey(K k2) {
        return this.a().ceilingKey(k2);
    }

    @Override
    public NavigableSet<K> descendingKeySet() {
        return this.a().descendingKeySet();
    }

    @Override
    public NavigableMap<K, V2> descendingMap() {
        return ii.a(this.a().descendingMap(), this.b);
    }

    @Override
    public Map.Entry<K, V2> firstEntry() {
        return this.a(this.a().firstEntry());
    }

    @Override
    public Map.Entry<K, V2> floorEntry(K k2) {
        return this.a(this.a().floorEntry(k2));
    }

    @Override
    public K floorKey(K k2) {
        return this.a().floorKey(k2);
    }

    public NavigableMap<K, V2> a(K k2) {
        return this.headMap(k2, false);
    }

    @Override
    public NavigableMap<K, V2> headMap(K k2, boolean bl2) {
        return ii.a(this.a().headMap(k2, bl2), this.b);
    }

    @Override
    public Map.Entry<K, V2> higherEntry(K k2) {
        return this.a(this.a().higherEntry(k2));
    }

    @Override
    public K higherKey(K k2) {
        return this.a().higherKey(k2);
    }

    @Override
    public Map.Entry<K, V2> lastEntry() {
        return this.a(this.a().lastEntry());
    }

    @Override
    public Map.Entry<K, V2> lowerEntry(K k2) {
        return this.a(this.a().lowerEntry(k2));
    }

    @Override
    public K lowerKey(K k2) {
        return this.a().lowerKey(k2);
    }

    @Override
    public NavigableSet<K> navigableKeySet() {
        return this.a().navigableKeySet();
    }

    @Override
    public Map.Entry<K, V2> pollFirstEntry() {
        return this.a(this.a().pollFirstEntry());
    }

    @Override
    public Map.Entry<K, V2> pollLastEntry() {
        return this.a(this.a().pollLastEntry());
    }

    @Override
    public NavigableMap<K, V2> subMap(K k2, boolean bl2, K k3, boolean bl3) {
        return ii.a(this.a().subMap(k2, bl2, k3, bl3), this.b);
    }

    public NavigableMap<K, V2> a(K k2, K k3) {
        return this.subMap(k2, true, k3, false);
    }

    public NavigableMap<K, V2> b(K k2) {
        return this.tailMap(k2, true);
    }

    @Override
    public NavigableMap<K, V2> tailMap(K k2, boolean bl2) {
        return ii.a(this.a().tailMap(k2, bl2), this.b);
    }

    private Map.Entry<K, V2> a(Map.Entry<K, V1> entry) {
        return entry == null ? null : ii.a(this.b, entry);
    }

    protected NavigableMap<K, V1> a() {
        return (NavigableMap)super.c();
    }

    @Override
    public /* synthetic */ SortedMap tailMap(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ SortedMap subMap(Object object, Object object2) {
        return this.a(object, object2);
    }

    @Override
    public /* synthetic */ SortedMap headMap(Object object) {
        return this.a(object);
    }

    @Override
    protected /* synthetic */ SortedMap c() {
        return this.a();
    }
}

