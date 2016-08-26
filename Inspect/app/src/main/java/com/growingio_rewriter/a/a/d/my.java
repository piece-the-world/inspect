/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.d.mw;
import com.growingio.a.a.d.mx;
import java.util.Iterator;
import java.util.NavigableSet;

class my<E>
extends mx<E>
implements NavigableSet<E> {
    my(mu<E> mu2) {
        super(mu2);
    }

    @Override
    public E lower(E e2) {
        return (E)mw.b(this.b().d(e2, aD.a).j());
    }

    @Override
    public E floor(E e2) {
        return (E)mw.b(this.b().d(e2, aD.b).j());
    }

    @Override
    public E ceiling(E e2) {
        return (E)mw.b(this.b().c(e2, aD.b).i());
    }

    @Override
    public E higher(E e2) {
        return (E)mw.b(this.b().c(e2, aD.a).i());
    }

    @Override
    public NavigableSet<E> descendingSet() {
        return new my(this.b().o());
    }

    @Override
    public Iterator<E> descendingIterator() {
        return this.descendingSet().iterator();
    }

    @Override
    public E pollFirst() {
        return (E)mw.b(this.b().k());
    }

    @Override
    public E pollLast() {
        return (E)mw.b(this.b().l());
    }

    @Override
    public NavigableSet<E> subSet(E e2, boolean bl2, E e3, boolean bl3) {
        return new my(this.b().a(e2, aD.a(bl2), e3, aD.a(bl3)));
    }

    @Override
    public NavigableSet<E> headSet(E e2, boolean bl2) {
        return new my(this.b().d(e2, aD.a(bl2)));
    }

    @Override
    public NavigableSet<E> tailSet(E e2, boolean bl2) {
        return new my(this.b().c(e2, aD.a(bl2)));
    }
}

