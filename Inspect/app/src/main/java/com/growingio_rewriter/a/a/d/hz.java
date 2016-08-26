/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hy;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.mz;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

class hz<K, V>
extends hy<K, V>
implements mz<K, V> {
    hz(mz<K, V> mz2, hg<? super K, ? super V> hg2) {
        super(mz2, hg2);
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
    public Comparator<? super V> d_() {
        return ((mz)this.b()).d_();
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
}

