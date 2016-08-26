/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dk;
import com.growingio.a.a.d.gb;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public abstract class cZ<E>
extends dk<E>
implements NavigableSet<E> {
    protected cZ() {
    }

    protected abstract NavigableSet<E> d();

    @Override
    public E lower(E e2) {
        return this.d().lower(e2);
    }

    protected E a(E e2) {
        return gb.d(this.headSet(e2, false).descendingIterator(), null);
    }

    @Override
    public E floor(E e2) {
        return this.d().floor(e2);
    }

    protected E d(E e2) {
        return gb.d(this.headSet(e2, true).descendingIterator(), null);
    }

    @Override
    public E ceiling(E e2) {
        return this.d().ceiling(e2);
    }

    protected E e(E e2) {
        return gb.d(this.tailSet(e2, true).iterator(), null);
    }

    @Override
    public E higher(E e2) {
        return this.d().higher(e2);
    }

    protected E f(E e2) {
        return gb.d(this.tailSet(e2, false).iterator(), null);
    }

    @Override
    public E pollFirst() {
        return this.d().pollFirst();
    }

    protected E e() {
        return gb.h(this.iterator());
    }

    @Override
    public E pollLast() {
        return this.d().pollLast();
    }

    protected E f() {
        return gb.h(this.descendingIterator());
    }

    protected E h() {
        return this.iterator().next();
    }

    protected E i() {
        return this.descendingIterator().next();
    }

    @Override
    public NavigableSet<E> descendingSet() {
        return this.d().descendingSet();
    }

    @Override
    public Iterator<E> descendingIterator() {
        return this.d().descendingIterator();
    }

    @Override
    public NavigableSet<E> subSet(E e2, boolean bl2, E e3, boolean bl3) {
        return this.d().subSet(e2, bl2, e3, bl3);
    }

    protected NavigableSet<E> a(E e2, boolean bl2, E e3, boolean bl3) {
        return this.tailSet(e2, bl2).headSet(e3, bl3);
    }

    @Override
    protected SortedSet<E> a(E e2, E e3) {
        return this.subSet(e2, true, e3, false);
    }

    @Override
    public NavigableSet<E> headSet(E e2, boolean bl2) {
        return this.d().headSet(e2, bl2);
    }

    protected SortedSet<E> g(E e2) {
        return this.headSet(e2, false);
    }

    @Override
    public NavigableSet<E> tailSet(E e2, boolean bl2) {
        return this.d().tailSet(e2, bl2);
    }

    protected SortedSet<E> h(E e2) {
        return this.tailSet(e2, true);
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

