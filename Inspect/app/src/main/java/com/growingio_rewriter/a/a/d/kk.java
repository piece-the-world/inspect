/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kj;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

class kk<K, V>
extends kj<K, V>
implements mz<K, V> {
    private static final long g = 0;

    kk(mz<K, V> mz2) {
        super(mz2);
    }

    public mz<K, V> d() {
        return (mz)super.a();
    }

    @Override
    public SortedSet<V> h(K k2) {
        return Collections.unmodifiableSortedSet(this.d().h(k2));
    }

    @Override
    public SortedSet<V> i(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SortedSet<V> d(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Comparator<? super V> d_() {
        return this.d().d_();
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
    public /* synthetic */ lH a() {
        return this.d();
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
    public /* synthetic */ jr b() {
        return this.d();
    }

    @Override
    public /* synthetic */ Object g() {
        return this.d();
    }
}

