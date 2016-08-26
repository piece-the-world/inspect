/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.nP;
import java.util.Iterator;
import java.util.ListIterator;

abstract class nQ<F, T>
extends nP<F, T>
implements ListIterator<T> {
    nQ(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> a() {
        return gb.l(this.c);
    }

    @Override
    public final boolean hasPrevious() {
        return this.a().hasPrevious();
    }

    @Override
    public final T previous() {
        return this.a(this.a().previous());
    }

    @Override
    public final int nextIndex() {
        return this.a().nextIndex();
    }

    @Override
    public final int previousIndex() {
        return this.a().previousIndex();
    }

    @Override
    public void set(T t2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(T t2) {
        throw new UnsupportedOperationException();
    }
}

