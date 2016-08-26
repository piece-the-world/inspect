/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cZ;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class io
extends cZ<E> {
    final /* synthetic */ NavigableSet a;

    io(NavigableSet navigableSet) {
        this.a = navigableSet;
    }

    @Override
    protected NavigableSet<E> d() {
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
    public NavigableSet<E> headSet(E e2, boolean bl2) {
        return ii.a(super.headSet(e2, bl2));
    }

    @Override
    public NavigableSet<E> tailSet(E e2, boolean bl2) {
        return ii.a(super.tailSet(e2, bl2));
    }

    @Override
    public NavigableSet<E> subSet(E e2, boolean bl2, E e3, boolean bl3) {
        return ii.a(super.subSet(e2, bl2, e3, bl3));
    }

    @Override
    public NavigableSet<E> descendingSet() {
        return ii.a(super.descendingSet());
    }

    @Override
    protected /* synthetic */ SortedSet c() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Set a() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.d();
    }
}

