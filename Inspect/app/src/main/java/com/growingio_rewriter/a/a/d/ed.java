/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.oP;
import com.growingio.a.a.d.oQ;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ed<E>
extends ea<E> {
    private final transient ea<E> a;

    ed(ea<E> ea2) {
        this.a = ea2;
    }

    private int b(int n2) {
        return this.size() - 1 - n2;
    }

    private int c(int n2) {
        return this.size() - n2;
    }

    @Override
    public ea<E> f() {
        return this.a;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.contains(object);
    }

    @Override
    public int indexOf(Object object) {
        int n2 = this.a.lastIndexOf(object);
        return n2 >= 0 ? this.b(n2) : -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n2 = this.a.indexOf(object);
        return n2 >= 0 ? this.b(n2) : -1;
    }

    @Override
    public ea<E> a(int n2, int n3) {
        aU.a(n2, n3, this.size());
        return this.a.a(this.c(n3), this.c(n2)).f();
    }

    @Override
    public E get(int n2) {
        aU.a(n2, this.size());
        return this.a.get(this.b(n2));
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    boolean i_() {
        return this.a.i_();
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n2) {
        return super.a(n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator() {
        return super.e();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return super.k_();
    }
}

