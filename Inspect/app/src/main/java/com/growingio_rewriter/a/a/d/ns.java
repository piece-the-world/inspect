/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.na;
import com.growingio.a.a.d.nz;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

class ns<E>
extends nz<E>
implements NavigableSet<E> {
    transient NavigableSet<E> a;
    private static final long b = 0;

    ns(NavigableSet<E> navigableSet, Object object) {
        super(navigableSet, object);
    }

    NavigableSet<E> a() {
        return (NavigableSet)super.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E ceiling(E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().ceiling(e2);
        }
    }

    @Override
    public Iterator<E> descendingIterator() {
        return this.a().descendingIterator();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableSet<E> descendingSet() {
        Object object = this.h;
        synchronized (object) {
            if (this.a == null) {
                NavigableSet<E> navigableSet;
                this.a = navigableSet = na.a(this.a().descendingSet(), this.h);
                return navigableSet;
            }
            return this.a;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E floor(E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().floor(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableSet<E> headSet(E e2, boolean bl2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().headSet(e2, bl2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E higher(E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().higher(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E lower(E e2) {
        Object object = this.h;
        synchronized (object) {
            return this.a().lower(e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E pollFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pollFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public E pollLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pollLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableSet<E> subSet(E e2, boolean bl2, E e3, boolean bl3) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().subSet(e2, bl2, e3, bl3), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public NavigableSet<E> tailSet(E e2, boolean bl2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().tailSet(e2, bl2), this.h);
        }
    }

    @Override
    public SortedSet<E> headSet(E e2) {
        return this.headSet(e2, false);
    }

    @Override
    public SortedSet<E> subSet(E e2, E e3) {
        return this.subSet(e2, true, e3, false);
    }

    @Override
    public SortedSet<E> tailSet(E e2) {
        return this.tailSet(e2, true);
    }

    @Override
    /* synthetic */ SortedSet c() {
        return this.a();
    }

    @Override
    /* synthetic */ Set d() {
        return this.a();
    }

    @Override
    /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

