/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gN;
import com.growingio.a.a.d.n;
import java.util.Collection;
import java.util.List;
import java.util.Map;

abstract class m<K, V>
extends n<K, V>
implements gN<K, V> {
    private static final long a = 6588350623831699109L;

    protected m(Map<K, Collection<V>> map) {
        super(map);
    }

    abstract List<V> a();

    List<V> b() {
        return ea.d();
    }

    @Override
    public List<V> a(K k2) {
        return (List)super.c(k2);
    }

    @Override
    public List<V> b(Object object) {
        return (List)super.d(object);
    }

    @Override
    public List<V> a(K k2, Iterable<? extends V> iterable) {
        return (List)super.b(k2, iterable);
    }

    @Override
    public boolean a(K k2, V v2) {
        return super.a(k2, v2);
    }

    @Override
    public Map<K, Collection<V>> c() {
        return super.c();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
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

