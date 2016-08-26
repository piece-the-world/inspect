/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kN;
import com.growingio.a.a.d.oQ;
import java.util.ListIterator;

class lo<E>
extends ea<E> {
    static final ea<Object> a = new lo<Object>(kN.a);
    private final transient int b;
    private final transient int c;
    private final transient Object[] d;

    lo(Object[] arrobject, int n2, int n3) {
        this.b = n2;
        this.c = n3;
        this.d = arrobject;
    }

    lo(Object[] arrobject) {
        this(arrobject, 0, arrobject.length);
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    boolean i_() {
        return this.c != this.d.length;
    }

    @Override
    int a(Object[] arrobject, int n2) {
        System.arraycopy(this.d, this.b, arrobject, n2, this.c);
        return n2 + this.c;
    }

    @Override
    public E get(int n2) {
        aU.a(n2, this.c);
        return (E)this.d[n2 + this.b];
    }

    @Override
    ea<E> b(int n2, int n3) {
        return new lo<E>(this.d, this.b + n2, n3 - n2);
    }

    @Override
    public oQ<E> a(int n2) {
        return gb.a(this.d, this.b, this.c, n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return this.a(n2);
    }
}

