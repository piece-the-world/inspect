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

class ef
extends ea<E> {
    final transient int a;
    final transient int b;
    final /* synthetic */ ea c;

    ef(ea ea2, int n2, int n3) {
        this.c = ea2;
        this.a = n2;
        this.b = n3;
    }

    @Override
    public int size() {
        return this.b;
    }

    @Override
    public E get(int n2) {
        aU.a(n2, this.b);
        return this.c.get(n2 + this.a);
    }

    @Override
    public ea<E> a(int n2, int n3) {
        aU.a(n2, n3, this.b);
        return this.c.a(n2 + this.a, n3 + this.a);
    }

    @Override
    boolean i_() {
        return true;
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

