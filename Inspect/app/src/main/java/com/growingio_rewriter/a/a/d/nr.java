/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.na;
import com.growingio.a.a.d.ny;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

class nr<K, V>
extends ny<K, V>
implements NavigableMap<K, V> {
    transient NavigableSet<K> a;
    transient NavigableMap<K, V> b;
    transient NavigableSet<K> f;
    private static final long i = 0;

    nr(NavigableMap<K, V> navigableMap, Object object) {
        super(navigableMap, object);
    }

    NavigableMap<K, V> a() {
        return (NavigableMap)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map.Entry<K, V> ceilingEntry(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().ceilingEntry(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public K ceilingKey(K k2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().ceilingKey(k2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableSet<K> descendingKeySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                this.a = na.a(this.a().descendingKeySet(), this.h);
                return this.a;
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableMap<K, V> descendingMap() {
        Object object = this.h;
        synchronized (object) {
            if (this.b == null) {
                this.b = na.a(this.a().descendingMap(), this.h);
                return this.b;
            }
            return this.b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map.Entry<K, V> firstEntry() {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().firstEntry(), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map.Entry<K, V> floorEntry(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().floorEntry(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public K floorKey(K k2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().floorKey(k2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableMap<K, V> headMap(K k2, boolean bl2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().headMap(k2, bl2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map.Entry<K, V> higherEntry(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().higherEntry(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public K higherKey(K k2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().higherKey(k2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map.Entry<K, V> lastEntry() {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().lastEntry(), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map.Entry<K, V> lowerEntry(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().lowerEntry(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public K lowerKey(K k2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().lowerKey(k2);
        }
    }

    @Override
    public Set<K> keySet() {
        return this.navigableKeySet();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableSet<K> navigableKeySet() {
        Object object = this.h;
        synchronized (object) {
            if (this.f == null) {
                this.f = na.a(this.a().navigableKeySet(), this.h);
                return this.f;
            }
            return this.f;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map.Entry<K, V> pollFirstEntry() {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().pollFirstEntry(), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Map.Entry<K, V> pollLastEntry() {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().pollLastEntry(), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableMap<K, V> subMap(K k2, boolean bl2, K k3, boolean bl3) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().subMap(k2, bl2, k3, bl3), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableMap<K, V> tailMap(K k2, boolean bl2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().tailMap(k2, bl2), this.h);
        }
    }

    @Override
    public SortedMap<K, V> headMap(K k2) {
        return this.headMap(k2, false);
    }

    @Override
    public SortedMap<K, V> subMap(K k2, K k3) {
        return this.subMap(k2, true, k3, false);
    }

    @Override
    public SortedMap<K, V> tailMap(K k2) {
        return this.tailMap(k2, true);
    }

    @Override
    /* synthetic */ SortedMap b() {
        return this.a();
    }

    @Override
    /* synthetic */ Map d() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

