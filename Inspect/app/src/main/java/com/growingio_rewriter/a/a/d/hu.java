/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cN;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hh;
import java.util.Map;
import java.util.Set;

class hu<K, V>
extends cN<K, V> {
    private final Map<K, V> a;
    final hg<? super K, ? super V> b;
    private transient Set<Map.Entry<K, V>> c;

    hu(Map<K, V> map, hg<? super K, ? super V> hg2) {
        this.a = aU.a(map);
        this.b = aU.a(hg2);
    }

    @Override
    protected Map<K, V> a() {
        return this.a;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set set = this.c;
        if (set == null) {
            this.c = set = hh.a(this.a.entrySet(), this.b);
        }
        return set;
    }

    @Override
    public V put(K k2, V v2) {
        this.b.a(k2, v2);
        return this.a.put(k2, v2);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        this.a.putAll(hh.b(map, this.b));
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

