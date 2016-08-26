/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dI;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.oQ;
import java.util.ListIterator;

class lh<E>
extends dI<E> {
    private final dQ<E> a;
    private final ea<? extends E> b;

    lh(dQ<E> dQ2, ea<? extends E> ea2) {
        this.a = dQ2;
        this.b = ea2;
    }

    lh(dQ<E> dQ2, Object[] arrobject) {
        this(dQ2, ea.b(arrobject));
    }

    @Override
    dQ<E> c() {
        return this.a;
    }

    ea<? extends E> k() {
        return this.b;
    }

    @Override
    public oQ<E> a(int n2) {
        return this.b.a(n2);
    }

    @Override
    int a(Object[] arrobject, int n2) {
        return this.b.a(arrobject, n2);
    }

    @Override
    public E get(int n2) {
        return this.b.get(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.a(n2);
    }
}

