/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.List;

final class mc<E>
extends ea<E> {
    final transient E a;

    mc(E e2) {
        this.a = aU.a(e2);
    }

    @Override
    public E get(int n2) {
        aU.a(n2, 1);
        return this.a;
    }

    @Override
    public oP<E> k_() {
        return gb.a(this.a);
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public ea<E> a(int n2, int n3) {
        aU.a(n2, n3, 1);
        return n2 == n3 ? ea.d() : this;
    }

    @Override
    public String toString() {
        String string = this.a.toString();
        return new StringBuilder(string.length() + 2).append('[').append(string).append(']').toString();
    }

    @Override
    boolean i_() {
        return false;
    }

    @Override
    public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

