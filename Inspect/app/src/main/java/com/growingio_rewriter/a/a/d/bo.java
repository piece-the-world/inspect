/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.bl;
import com.growingio.a.a.d.bm;
import com.growingio.a.a.d.cK;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class bo<E>
extends cK<E> {
    final List<E> a;
    final bl<? super E> b;

    bo(List<E> list, bl<? super E> bl2) {
        this.a = aU.a(list);
        this.b = aU.a(bl2);
    }

    @Override
    protected List<E> a() {
        return this.a;
    }

    @Override
    public boolean add(E e2) {
        this.b.a(e2);
        return this.a.add(e2);
    }

    @Override
    public void add(int n2, E e2) {
        this.b.a(e2);
        this.a.add(n2, e2);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return this.a.addAll(bm.c(collection, this.b));
    }

    @Override
    public boolean addAll(int n2, Collection<? extends E> collection) {
        return this.a.addAll(n2, bm.c(collection, this.b));
    }

    @Override
    public ListIterator<E> listIterator() {
        return bm.a(this.a.listIterator(), this.b);
    }

    @Override
    public ListIterator<E> listIterator(int n2) {
        return bm.a(this.a.listIterator(n2), this.b);
    }

    @Override
    public E set(int n2, E e2) {
        this.b.a(e2);
        return this.a.set(n2, e2);
    }

    @Override
    public List<E> subList(int n2, int n3) {
        return bm.a(this.a.subList(n2, n3), this.b);
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

