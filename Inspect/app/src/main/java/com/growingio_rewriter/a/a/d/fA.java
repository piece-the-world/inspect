/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.dR;
import com.growingio.a.a.d.dS;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.fz;
import java.util.Comparator;
import java.util.Iterator;

public final class fA<E>
extends fh<E> {
    private final Comparator<? super E> d;

    public fA(Comparator<? super E> comparator) {
        this.d = aU.a(comparator);
    }

    public fA<E> d(E e2) {
        super.c(e2);
        return this;
    }

    @Override
    public /* varargs */ fA<E> c(E ... arrE) {
        super.b(arrE);
        return this;
    }

    @Override
    public fA<E> c(Iterable<? extends E> iterable) {
        super.b(iterable);
        return this;
    }

    @Override
    public fA<E> c(Iterator<? extends E> iterator) {
        super.b(iterator);
        return this;
    }

    public fz<E> c() {
        Object[] arrobject = this.a;
        fz<Object> fz2 = fz.a(this.d, this.b, arrobject);
        this.b = fz2.size();
        return fz2;
    }

    @Override
    public /* synthetic */ fg b() {
        return this.c();
    }

    @Override
    public /* synthetic */ fh b(Iterator iterator) {
        return this.c(iterator);
    }

    @Override
    public /* synthetic */ fh b(Iterable iterable) {
        return this.c(iterable);
    }

    @Override
    public /* synthetic */ fh b(Object[] arrobject) {
        return this.c((E[])arrobject);
    }

    @Override
    public /* synthetic */ fh c(Object object) {
        return this.d(object);
    }

    @Override
    public /* synthetic */ dS a(Iterable iterable) {
        return this.c(iterable);
    }

    @Override
    public /* synthetic */ dS a(Object[] arrobject) {
        return this.c((E[])arrobject);
    }

    @Override
    public /* synthetic */ dR a(Object object) {
        return this.d(object);
    }

    @Override
    public /* synthetic */ dQ a() {
        return this.c();
    }

    @Override
    public /* synthetic */ dS a(Iterator iterator) {
        return this.c(iterator);
    }

    @Override
    public /* synthetic */ dS b(Object object) {
        return this.d(object);
    }
}

