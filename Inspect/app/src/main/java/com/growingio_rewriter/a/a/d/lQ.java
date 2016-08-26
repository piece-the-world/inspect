/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cZ;
import com.growingio.a.a.d.kO;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

class lQ<E>
extends cZ<E> {
    private final NavigableSet<E> a;

    lQ(NavigableSet<E> navigableSet) {
        this.a = navigableSet;
    }

    @Override
    protected NavigableSet<E> d() {
        return this.a;
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
    public E pollFirst() {
        return this.a.pollLast();
    }

    @Override
    public E pollLast() {
        return this.a.pollFirst();
    }

    @Override
    public NavigableSet<E> descendingSet() {
        return this.a;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return this.a.iterator();
    }

    @Override
    public NavigableSet<E> subSet(E e2, boolean bl2, E e3, boolean bl3) {
        return this.a.subSet(e3, bl3, e2, bl2).descendingSet();
    }

    @Override
    public NavigableSet<E> headSet(E e2, boolean bl2) {
        return this.a.tailSet(e2, bl2).descendingSet();
    }

    @Override
    public NavigableSet<E> tailSet(E e2, boolean bl2) {
        return this.a.headSet(e2, bl2).descendingSet();
    }

    @Override
    public Comparator<? super E> comparator() {
        Comparator<E> comparator = this.a.comparator();
        if (comparator == null) {
            return kO.d().a();
        }
        return lQ.a(comparator);
    }

    private static <T> kO<T> a(Comparator<T> comparator) {
        return kO.a(comparator).a();
    }

    @Override
    public E first() {
        return this.a.last();
    }

    @Override
    public SortedSet<E> headSet(E e2) {
        return this.g(e2);
    }

    @Override
    public E last() {
        return this.a.first();
    }

    @Override
    public SortedSet<E> subSet(E e2, E e3) {
        return this.a(e2, e3);
    }

    @Override
    public SortedSet<E> tailSet(E e2) {
        return this.h(e2);
    }

    @Override
    public Iterator<E> iterator() {
        return this.a.descendingIterator();
    }

    @Override
    public Object[] toArray() {
        return this.r();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return this.a(arrT);
    }

    @Override
    public String toString() {
        return this.p();
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

