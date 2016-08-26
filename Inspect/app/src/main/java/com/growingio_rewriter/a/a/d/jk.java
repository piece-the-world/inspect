/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.iU;
import com.growingio.a.a.d.jj;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class jk<K, V>
extends AbstractMap<K, V> {
    private transient Set<Map.Entry<K, V>> a;
    private transient Set<K> b;
    private transient Collection<V> c;

    jk() {
    }

    abstract Set<Map.Entry<K, V>> a();

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.a;
        Set<Map.Entry<K, V>> set2 = set == null ? (this.a = this.a()) : set;
        return set2;
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = this.b;
        Set<K> set2 = set == null ? (this.b = this.h()) : set;
        return set2;
    }

    Set<K> h() {
        return new iU<K, V>(this);
    }

    @Override
    public Collection<V> values() {
        Collection<V> collection = this.c;
        Collection<V> collection2 = collection == null ? (this.c = this.b()) : collection;
        return collection2;
    }

    Collection<V> b() {
        return new jj<K, V>(this);
    }
}

