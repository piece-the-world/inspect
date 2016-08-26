/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.hc;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

class hb<F, T>
extends AbstractList<T>
implements Serializable,
RandomAccess {
    final List<F> a;
    final aq<? super F, ? extends T> b;
    private static final long c = 0;

    hb(List<F> list, aq<? super F, ? extends T> aq2) {
        this.a = aU.a(list);
        this.b = aU.a(aq2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public T get(int n2) {
        return this.b.f(this.a.get(n2));
    }

    @Override
    public Iterator<T> iterator() {
        return this.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int n2) {
        return new hc(this, this.a.listIterator(n2));
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public T remove(int n2) {
        return this.b.f(this.a.remove(n2));
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

