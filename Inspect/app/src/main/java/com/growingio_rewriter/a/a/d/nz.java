/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nw;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

class nz<E>
extends nw<E>
implements SortedSet<E> {
    private static final long a = 0;

    nz(SortedSet<E> sortedSet, Object object) {
        super(sortedSet, object);
    }

    SortedSet<E> c() {
        return (SortedSet)super.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Comparator<? super E> comparator() {
        Object object = this.h;
        synchronized (object) {
            return this.c().comparator();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet<E> subSet(E e2, E e3) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.c().subSet(e2, e3), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet<E> headSet(E e2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.c().headSet(e2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SortedSet<E> tailSet(E e2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.c().tailSet(e2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E first() {
        Object object = this.h;
        synchronized (object) {
            return this.c().first();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E last() {
        Object object = this.h;
        synchronized (object) {
            return this.c().last();
        }
    }

    @Override
    /* synthetic */ Set d() {
        return this.c();
    }

    @Override
    /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    /* synthetic */ Object e() {
        return this.c();
    }
}

