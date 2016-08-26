/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dk;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.lI;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class ma<E>
extends dk<E>
implements Serializable,
NavigableSet<E> {
    private final NavigableSet<E> a;
    private transient ma<E> b;
    private static final long c = 0;

    ma(NavigableSet<E> navigableSet) {
        this.a = aU.a(navigableSet);
    }

    @Override
    protected SortedSet<E> c() {
        return Collections.unmodifiableSortedSet(this.a);
    }

    @Override
    public E lower(E e2) {
        return this.a.lower(e2);
    }

    @Override
    public E floor(E e2) {
        return this.a.floor(e2);
    }

    @Override
    public E ceiling(E e2) {
        return this.a.ceiling(e2);
    }

    @Override
    public E higher(E e2) {
        return this.a.higher(e2);
    }

    @Override
    public E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public NavigableSet<E> descendingSet() {
        ma<E> ma2 = this.b;
        if (ma2 == null) {
            ma2 = this.b = new ma<E>(this.a.descendingSet());
            ma2.b = this;
        }
        return ma2;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return gb.a(this.a.descendingIterator());
    }

    @Override
    public NavigableSet<E> subSet(E e2, boolean bl2, E e3, boolean bl3) {
        return lI.a(this.a.subSet(e2, bl2, e3, bl3));
    }

    @Override
    public NavigableSet<E> headSet(E e2, boolean bl2) {
        return lI.a(this.a.headSet(e2, bl2));
    }

    @Override
    public NavigableSet<E> tailSet(E e2, boolean bl2) {
        return lI.a(this.a.tailSet(e2, bl2));
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

