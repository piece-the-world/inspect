/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.lT;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

class lR<E>
extends lT<E>
implements NavigableSet<E> {
    lR(NavigableSet<E> navigableSet, aV<? super E> aV2) {
        super(navigableSet, aV2);
    }

    NavigableSet<E> a() {
        return (NavigableSet)this.a;
    }

    @Override
    public E lower(E e2) {
        return gb.d(this.headSet(e2, false).descendingIterator(), null);
    }

    @Override
    public E floor(E e2) {
        return gb.d(this.headSet(e2, true).descendingIterator(), null);
    }

    @Override
    public E ceiling(E e2) {
        return fL.d(this.tailSet(e2, true), null);
    }

    @Override
    public E higher(E e2) {
        return fL.d(this.tailSet(e2, false), null);
    }

    @Override
    public E pollFirst() {
        return (E)fL.b(this.a(), this.b);
    }

    @Override
    public E pollLast() {
        return (E)fL.b(this.a().descendingSet(), this.b);
    }

    @Override
    public NavigableSet<E> descendingSet() {
        return lI.a(this.a().descendingSet(), this.b);
    }

    @Override
    public Iterator<E> descendingIterator() {
        return gb.b(this.a().descendingIterator(), this.b);
    }

    @Override
    public E last() {
        return this.descendingIterator().next();
    }

    @Override
    public NavigableSet<E> subSet(E e2, boolean bl2, E e3, boolean bl3) {
        return lI.a(this.a().subSet(e2, bl2, e3, bl3), this.b);
    }

    @Override
    public NavigableSet<E> headSet(E e2, boolean bl2) {
        return lI.a(this.a().headSet(e2, bl2), this.b);
    }

    @Override
    public NavigableSet<E> tailSet(E e2, boolean bl2) {
        return lI.a(this.a().tailSet(e2, bl2), this.b);
    }
}

