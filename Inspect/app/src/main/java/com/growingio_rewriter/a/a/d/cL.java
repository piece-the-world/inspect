/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cJ;
import java.util.Iterator;
import java.util.ListIterator;

public abstract class cL<E>
extends cJ<E>
implements ListIterator<E> {
    protected cL() {
    }

    protected abstract ListIterator<E> b();

    @Override
    public void add(E e2) {
        this.b().add(e2);
    }

    @Override
    public boolean hasPrevious() {
        return this.b().hasPrevious();
    }

    @Override
    public int nextIndex() {
        return this.b().nextIndex();
    }

    @Override
    public E previous() {
        return this.b().previous();
    }

    @Override
    public int previousIndex() {
        return this.b().previousIndex();
    }

    @Override
    public void set(E e2) {
        this.b().set(e2);
    }

    @Override
    protected /* synthetic */ Iterator a() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

