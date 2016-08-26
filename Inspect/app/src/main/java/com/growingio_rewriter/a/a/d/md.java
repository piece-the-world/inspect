/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.oP;
import java.util.Iterator;

final class md<E>
extends fg<E> {
    final transient E a;
    private transient int c;

    md(E e2) {
        this.a = aU.a(e2);
    }

    md(E e2, int n2) {
        this.a = e2;
        this.c = n2;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean contains(Object object) {
        return this.a.equals(object);
    }

    @Override
    public oP<E> k_() {
        return gb.a(this.a);
    }

    @Override
    boolean i_() {
        return false;
    }

    @Override
    int a(Object[] arrobject, int n2) {
        arrobject[n2] = this.a;
        return n2 + 1;
    }

    @Override
    public final int hashCode() {
        int n2 = this.c;
        if (n2 == 0) {
            this.c = n2 = this.a.hashCode();
        }
        return n2;
    }

    @Override
    boolean i() {
        return this.c != 0;
    }

    @Override
    public String toString() {
        String string = this.a.toString();
        return new StringBuilder(string.length() + 2).append('[').append(string).append(']').toString();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

