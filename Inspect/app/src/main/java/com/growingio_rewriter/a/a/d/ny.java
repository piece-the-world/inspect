/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.na;
import com.growingio.a.a.d.no;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

class ny<K, V>
extends no<K, V>
implements SortedMap<K, V> {
    private static final long a = 0;

    ny(SortedMap<K, V> sortedMap, Object object) {
        super(sortedMap, object);
    }

    SortedMap<K, V> b() {
        return (SortedMap)super.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Comparator<? super K> comparator() {
        Object object = this.h;
        synchronized (object) {
            return this.b().comparator();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public K firstKey() {
        Object object = this.h;
        synchronized (object) {
            return this.b().firstKey();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedMap<K, V> headMap(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.b().headMap(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public K lastKey() {
        Object object = this.h;
        synchronized (object) {
            return this.b().lastKey();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedMap<K, V> subMap(K k2, K k3) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.b().subMap(k2, k3), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedMap<K, V> tailMap(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.b().tailMap(k2), this.h);
        }
    }

    @Override
    /* synthetic */ Map d() {
        return this.b();
    }

    @Override
    /* synthetic */ Object e() {
        return this.b();
    }
}

