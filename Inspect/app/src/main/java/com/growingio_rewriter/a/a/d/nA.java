/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nx;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

class nA<K, V>
extends nx<K, V>
implements mz<K, V> {
    private static final long i = 0;

    nA(mz<K, V> mz2, Object object) {
        super(mz2, object);
    }

    mz<K, V> d() {
        return (mz)super.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet<V> h(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.d().h(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet<V> i(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.d().i(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet<V> d(K k2, Iterable<? extends V> iterable) {
        Object object = this.h;
        synchronized (object) {
            return this.d().d(k2, iterable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Comparator<? super V> d_() {
        Object object = this.h;
        synchronized (object) {
            return this.d().d_();
        }
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
    /* synthetic */ lH a() {
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
    /* synthetic */ jr b() {
        return this.d();
    }

    @Override
    /* synthetic */ Object e() {
        return this.d();
    }
}

