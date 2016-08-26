/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.n;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class aa<K, V>
extends n<K, V>
implements lH<K, V> {
    private static final long a = 7431625294878419160L;

    protected aa(Map<K, Collection<V>> map) {
        super(map);
    }

    abstract Set<V> a();

    Set<V> b() {
        return fg.k();
    }

    @Override
    public Set<V> a(K k2) {
        return (Set)super.c(k2);
    }

    @Override
    public Set<Map.Entry<K, V>> u() {
        return (Set)super.l();
    }

    @Override
    public Set<V> b(Object object) {
        return (Set)super.d(object);
    }

    @Override
    public Set<V> a(K k2, Iterable<? extends V> iterable) {
        return (Set)super.b(k2, iterable);
    }

    @Override
    public Map<K, Collection<V>> c() {
        return super.c();
    }

    @Override
    public boolean a(K k2, V v2) {
        return super.a(k2, v2);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a((K)object, iterable);
    }

    @Override
    /* synthetic */ Collection d() {
        return this.a();
    }

    @Override
    /* synthetic */ Collection e() {
        return this.b();
    }
}

