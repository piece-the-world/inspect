/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;

class gR<E>
extends AbstractList<E> {
    final List<E> a;

    gR(List<E> list) {
        this.a = aU.a(list);
    }

    @Override
    public void add(int n2, E e2) {
        this.a.add(n2, e2);
    }

    @Override
    public boolean addAll(int n2, Collection<? extends E> collection) {
        return this.a.addAll(n2, collection);
    }

    @Override
    public E get(int n2) {
        return this.a.get(n2);
    }

    @Override
    public E remove(int n2) {
        return this.a.remove(n2);
    }

    @Override
    public E set(int n2, E e2) {
        return this.a.set(n2, e2);
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

