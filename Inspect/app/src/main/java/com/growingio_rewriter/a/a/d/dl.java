/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.de;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

public abstract class dl<K, V>
extends de<K, V>
implements mz<K, V> {
    protected dl() {
    }

    protected abstract mz<K, V> d();

    @Override
    public SortedSet<V> h(K k2) {
        return this.d().h(k2);
    }

    @Override
    public SortedSet<V> i(Object object) {
        return this.d().i(object);
    }

    @Override
    public SortedSet<V> d(K k2, Iterable<? extends V> iterable) {
        return this.d().d(k2, iterable);
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
    protected /* synthetic */ lH a() {
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
    protected /* synthetic */ jr b() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.d();
    }
}

