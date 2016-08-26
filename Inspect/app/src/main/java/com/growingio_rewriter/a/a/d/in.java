/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dk;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

final class in
extends dk<E> {
    final /* synthetic */ SortedSet a;

    in(SortedSet sortedSet) {
        this.a = sortedSet;
    }

    @Override
    protected SortedSet<E> c() {
        return this.a;
    }

    @Override
    public boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SortedSet<E> headSet(E e2) {
        return ii.a(super.headSet(e2));
    }

    @Override
    public SortedSet<E> subSet(E e2, E e3) {
        return ii.a(super.subSet(e2, e3));
    }

    @Override
    public SortedSet<E> tailSet(E e2) {
        return ii.a(super.tailSet(e2));
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

