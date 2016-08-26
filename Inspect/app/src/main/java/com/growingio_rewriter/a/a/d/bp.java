/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bl;
import com.growingio.a.a.d.cL;
import java.util.Iterator;
import java.util.ListIterator;

class bp<E>
extends cL<E> {
    private final ListIterator<E> a;
    private final bl<? super E> b;

    public bp(ListIterator<E> listIterator, bl<? super E> bl2) {
        this.a = listIterator;
        this.b = bl2;
    }

    @Override
    protected ListIterator<E> b() {
        return this.a;
    }

    @Override
    public void add(E e2) {
        this.b.a(e2);
        this.a.add(e2);
    }

    @Override
    public void set(E e2) {
        this.b.a(e2);
        this.a.set(e2);
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

