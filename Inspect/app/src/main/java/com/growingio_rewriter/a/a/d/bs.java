/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bl;
import com.growingio.a.a.d.bm;
import com.growingio.a.a.d.dk;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

class bs<E>
extends dk<E> {
    final SortedSet<E> a;
    final bl<? super E> b;

    bs(SortedSet<E> sortedSet, bl<? super E> bl2) {
        this.a = aU.a(sortedSet);
        this.b = aU.a(bl2);
    }

    @Override
    protected SortedSet<E> c() {
        return this.a;
    }

    @Override
    public SortedSet<E> headSet(E e2) {
        return bm.a(this.a.headSet(e2), this.b);
    }

    @Override
    public SortedSet<E> subSet(E e2, E e3) {
        return bm.a(this.a.subSet(e2, e3), this.b);
    }

    @Override
    public SortedSet<E> tailSet(E e2) {
        return bm.a(this.a.tailSet(e2), this.b);
    }

    @Override
    public boolean add(E e2) {
        this.b.a(e2);
        return this.a.add(e2);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(bm.c(collection, this.b));
    }

    @Override
    protected /* synthetic */ Set a() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }
}

