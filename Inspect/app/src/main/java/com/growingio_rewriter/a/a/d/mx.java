/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.ky;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.d.mw;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

class mx<E>
extends ky<E>
implements SortedSet<E> {
    private final mu<E> a;

    mx(mu<E> mu2) {
        this.a = mu2;
    }

    final mu<E> b() {
        return this.a;
    }

    @Override
    public Comparator<? super E> comparator() {
        return this.b().comparator();
    }

    @Override
    public SortedSet<E> subSet(E e2, E e3) {
        return this.b().a(e2, aD.b, e3, aD.a).e_();
    }

    @Override
    public SortedSet<E> headSet(E e2) {
        return this.b().d(e2, aD.a).e_();
    }

    @Override
    public SortedSet<E> tailSet(E e2) {
        return this.b().c(e2, aD.b).e_();
    }

    @Override
    public E first() {
        return (E)mw.a(this.b().i());
    }

    @Override
    public E last() {
        return (E)mw.a(this.b().j());
    }

    @Override
    /* synthetic */ kl a() {
        return this.b();
    }
}

