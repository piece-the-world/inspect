/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.dS;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.eO;
import com.growingio.a.a.d.fv;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.d.nX;
import java.util.Comparator;
import java.util.Iterator;

public class fw<E>
extends eO<E> {
    public fw(Comparator<? super E> comparator) {
        super(nX.a(aU.a(comparator)));
    }

    public fw<E> c(E e2) {
        super.a(e2);
        return this;
    }

    public fw<E> c(E e2, int n2) {
        super.a(e2, n2);
        return this;
    }

    public fw<E> d(E e2, int n2) {
        super.b(e2, n2);
        return this;
    }

    public /* varargs */ fw<E> c(E ... arrE) {
        super.b(arrE);
        return this;
    }

    public fw<E> c(Iterable<? extends E> iterable) {
        super.b(iterable);
        return this;
    }

    public fw<E> c(Iterator<? extends E> iterator) {
        super.b(iterator);
        return this;
    }

    public fv<E> c() {
        return fv.a((mu)this.a);
    }

    @Override
    public /* synthetic */ eM b() {
        return this.c();
    }

    @Override
    public /* synthetic */ eO b(Iterator iterator) {
        return this.c(iterator);
    }

    @Override
    public /* synthetic */ eO b(Iterable iterable) {
        return this.c(iterable);
    }

    @Override
    public /* synthetic */ eO b(Object[] arrobject) {
        return this.c((E[])arrobject);
    }

    @Override
    public /* synthetic */ eO b(Object object, int n2) {
        return this.d(object, n2);
    }

    @Override
    public /* synthetic */ eO a(Object object, int n2) {
        return this.c((E)object, n2);
    }

    @Override
    public /* synthetic */ eO a(Object object) {
        return this.c((E)object);
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
    public /* synthetic */ dS a(Iterable iterable) {
        return this.c(iterable);
    }

    @Override
    public /* synthetic */ dS a(Object[] arrobject) {
        return this.c((E[])arrobject);
    }

    @Override
    public /* synthetic */ dS b(Object object) {
        return this.c((E)object);
    }
}

