/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.oP;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

class bL<E>
extends fz<E> {
    private final fz<E> a;

    bL(fz<E> fz2) {
        super(kO.a(fz2.comparator()).a());
        this.a = fz2;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public oP<E> k_() {
        return this.a.d();
    }

    @Override
    fz<E> b(E e2, boolean bl2) {
        return this.a.c(e2, bl2).g_();
    }

    @Override
    fz<E> a(E e2, boolean bl2, E e3, boolean bl3) {
        return this.a.b(e3, bl3, e2, bl2).g_();
    }

    @Override
    fz<E> a(E e2, boolean bl2) {
        return this.a.d(e2, bl2).g_();
    }

    @Override
    public fz<E> g_() {
        return this.a;
    }

    @Override
    public oP<E> d() {
        return this.a.k_();
    }

    @Override
    fz<E> e() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    public E lower(E e2) {
        return this.a.higher(e2);
    }

    @Override
    public E floor(E e2) {
        return this.a.ceiling(e2);
    }

    @Override
    public E ceiling(E e2) {
        return this.a.floor(e2);
    }

    @Override
    public E higher(E e2) {
        return this.a.lower(e2);
    }

    @Override
    int c(Object object) {
        int n2 = this.a.c(object);
        if (n2 == -1) {
            return n2;
        }
        return this.size() - 1 - n2;
    }

    @Override
    boolean i_() {
        return this.a.i_();
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ NavigableSet descendingSet() {
        return this.g_();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

