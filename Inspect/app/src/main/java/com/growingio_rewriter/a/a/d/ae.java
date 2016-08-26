/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aa;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.mz;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

abstract class ae<K, V>
extends aa<K, V>
implements mz<K, V> {
    private static final long a = 430848587173315748L;

    protected ae(Map<K, Collection<V>> map) {
        super(map);
    }

    abstract SortedSet<V> y();

    SortedSet<V> z() {
        Comparator<V> comparator = this.d_();
        if (comparator == null) {
            return Collections.unmodifiableSortedSet(this.y());
        }
        return fz.a(this.d_());
    }

    @Override
    public SortedSet<V> h(K k2) {
        return (SortedSet)super.a(k2);
    }

    @Override
    public SortedSet<V> i(Object object) {
        return (SortedSet)super.b(object);
    }

    @Override
    public SortedSet<V> d(K k2, Iterable<? extends V> iterable) {
        return (SortedSet)super.a(k2, iterable);
    }

    @Override
    public Map<K, Collection<V>> c() {
        return super.c();
    }

    @Override
    public Collection<V> j() {
        return super.j();
    }

    @Override
    public /* synthetic */ Set a(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    public /* synthetic */ Set b(Object object) {
        return this.i(object);
    }

    @Override
    public /* synthetic */ Set a(Object object) {
        return this.h(object);
    }

    @Override
    /* synthetic */ Set b() {
        return this.z();
    }

    @Override
    /* synthetic */ Set a() {
        return this.y();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.h(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.i(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.d(object, iterable);
    }

    @Override
    /* synthetic */ Collection d() {
        return this.y();
    }

    @Override
    /* synthetic */ Collection e() {
        return this.z();
    }
}

