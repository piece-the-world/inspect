/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.iR;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jk;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class iu<K, V>
extends jk<K, V> {
    final Map<K, V> a;
    final aV<? super Map.Entry<K, V>> b;

    iu(Map<K, V> map, aV<? super Map.Entry<K, V>> aV2) {
        this.a = map;
        this.b = aV2;
    }

    boolean b(Object object, V v2) {
        Object object2 = object;
        return this.b.a(ii.a(object2, v2));
    }

    @Override
    public V put(K k2, V v2) {
        aU.a(this.b(k2, v2));
        return this.a.put(k2, v2);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            aU.a(this.b(entry.getKey(), entry.getValue()));
        }
        this.a.putAll(map);
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object) && this.b(object, this.a.get(object));
    }

    @Override
    public V get(Object object) {
        V v2 = this.a.get(object);
        return v2 != null && this.b(object, v2) ? (V)v2 : null;
    }

    @Override
    public boolean isEmpty() {
        return this.entrySet().isEmpty();
    }

    @Override
    public V remove(Object object) {
        return this.containsKey(object) ? (V)this.a.remove(object) : null;
    }

    @Override
    Collection<V> b() {
        return new iR<K, V>(this, this.a, this.b);
    }
}

