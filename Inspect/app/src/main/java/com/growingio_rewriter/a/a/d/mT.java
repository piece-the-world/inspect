/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iS;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mU;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class mT
extends iS<C, V> {
    final R a;
    Map<C, V> b;
    final /* synthetic */ mE c;

    mT(R var1_1) {
        this.c = var1_1;
        this.a = aU.a(r2);
    }

    Map<C, V> a() {
        Map<C, V> map = this.b == null || this.b.isEmpty() && this.c.a.containsKey(this.a) ? (this.b = this.c()) : this.b;
        return map;
    }

    Map<C, V> c() {
        return this.c.a.get(this.a);
    }

    void d() {
        if (this.a() != null && this.b.isEmpty()) {
            this.c.a.remove(this.a);
            this.b = null;
        }
    }

    @Override
    public boolean containsKey(Object object) {
        Map<C, V> map = this.a();
        return object != null && map != null && ii.b(map, object);
    }

    @Override
    public V get(Object object) {
        Map<C, V> map = this.a();
        return object != null && map != null ? (V)ii.a(map, object) : null;
    }

    @Override
    public V put(C c2, V v2) {
        aU.a(c2);
        aU.a(v2);
        if (this.b != null && !this.b.isEmpty()) {
            return this.b.put(c2, v2);
        }
        return this.c.a(this.a, c2, v2);
    }

    @Override
    public V remove(Object object) {
        Map<C, V> map = this.a();
        if (map == null) {
            return null;
        }
        V v2 = ii.c(map, object);
        this.d();
        return v2;
    }

    @Override
    public void clear() {
        Map<C, V> map = this.a();
        if (map != null) {
            map.clear();
        }
        this.d();
    }

    @Override
    public int size() {
        Map<C, V> map = this.a();
        return map == null ? 0 : map.size();
    }

    @Override
    Iterator<Map.Entry<C, V>> b() {
        Map<C, V> map = this.a();
        if (map == null) {
            return gb.c();
        }
        Iterator<Map.Entry<C, V>> iterator = map.entrySet().iterator();
        return new mU(this, iterator);
    }
}

