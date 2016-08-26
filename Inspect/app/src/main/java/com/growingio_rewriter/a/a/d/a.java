/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.av;
import com.growingio.a.a.d.b;
import com.growingio.a.a.d.c;
import com.growingio.a.a.d.cN;
import com.growingio.a.a.d.f;
import com.growingio.a.a.d.g;
import com.growingio.a.a.d.h;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class a<K, V>
extends cN<K, V>
implements av<K, V>,
Serializable {
    private transient Map<K, V> b;
    transient a<V, K> a;
    private transient Set<K> c;
    private transient Set<V> d;
    private transient Set<Map.Entry<K, V>> e;
    private static final long f = 0;

    a(Map<K, V> map, Map<V, K> map2) {
        this.a((K)map, (V)map2);
    }

    private a(Map<K, V> map, a<V, K> a2) {
        this.b = map;
        this.a = a2;
    }

    @Override
    protected Map<K, V> a() {
        return this.b;
    }

    K a(K k2) {
        return k2;
    }

    V b(V v2) {
        return v2;
    }

    @Override
    void a(Map<K, V> map, Map<V, K> map2) {
        aU.b(this.b == null);
        aU.b(this.a == null);
        aU.a(map.isEmpty());
        aU.a(map2.isEmpty());
        aU.a(map != map2);
        this.b = map;
        this.a = new f<V, K>(map2, this, null);
    }

    void a(a<V, K> a2) {
        this.a = a2;
    }

    @Override
    public boolean containsValue(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public V put(K k2, V v2) {
        return this.a(k2, v2, false);
    }

    @Override
    public V a(K k2, V v2) {
        return this.a(k2, v2, true);
    }

    private V a(K k2, V v2, boolean bl2) {
        this.a(k2);
        this.b(v2);
        boolean bl3 = this.containsKey(k2);
        if (bl3 && aL.a(v2, this.get(k2))) {
            return v2;
        }
        if (bl2) {
            this.m_().remove(v2);
        } else {
            aU.a(!this.containsValue(v2), "value already present: %s", v2);
        }
        V v3 = this.b.put(k2, v2);
        this.a(k2, bl3, v3, v2);
        return v3;
    }

    private void a(K k2, boolean bl2, V v2, V v3) {
        if (bl2) {
            this.h(v2);
        }
        this.a.b.put(v3, k2);
    }

    @Override
    public V remove(Object object) {
        return this.containsKey(object) ? (V)this.g(object) : null;
    }

    private V g(Object object) {
        V v2 = this.b.remove(object);
        this.h(v2);
        return v2;
    }

    private void h(V v2) {
        this.a.b.remove(v2);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void clear() {
        this.b.clear();
        this.a.b.clear();
    }

    @Override
    public av<V, K> m_() {
        return this.a;
    }

    @Override
    public Set<K> keySet() {
        g g2 = this.c;
        g g3 = g2 == null ? (this.c = new g(this, null)) : g2;
        return g3;
    }

    @Override
    public Set<V> o_() {
        h h2 = this.d;
        h h3 = h2 == null ? (this.d = new h(this, null)) : h2;
        return h3;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        c c2 = this.e;
        c c3 = c2 == null ? (this.e = new c(this, null)) : c2;
        return c3;
    }

    @Override
    public /* synthetic */ Collection values() {
        return this.o_();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }

    static /* synthetic */ Map b(a a2) {
        return a2.b;
    }

    static /* synthetic */ Object a(a a2, Object object) {
        return a2.g(object);
    }

    static /* synthetic */ void a(a a2, Object object, boolean bl2, Object object2, Object object3) {
        a2.a(object, bl2, object2, object3);
    }

    static /* synthetic */ void b(a a2, Object object) {
        a2.h(object);
    }

    /* synthetic */ a(Map map, a a2, b b2) {
        this((Map<K, V>)map, a2);
    }
}

