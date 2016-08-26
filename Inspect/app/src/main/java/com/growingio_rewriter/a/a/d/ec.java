/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.dR;
import com.growingio.a.a.d.dS;
import com.growingio.a.a.d.ea;
import java.util.Iterator;

public final class ec<E>
extends dR<E> {
    public ec() {
        this(4);
    }

    ec(int n2) {
        super(n2);
    }

    public ec<E> c(E e2) {
        super.a(e2);
        return this;
    }

    @Override
    public ec<E> b(Iterable<? extends E> iterable) {
        super.a(iterable);
        return this;
    }

    @Override
    public /* varargs */ ec<E> b(E ... arrE) {
        super.a(arrE);
        return this;
    }

    @Override
    public ec<E> b(Iterator<? extends E> iterator) {
        super.a(iterator);
        return this;
    }

    public ea<E> b() {
        return ea.b(this.a, this.b);
    }

    @Override
    public /* synthetic */ dS a(Iterable iterable) {
        return this.b(iterable);
    }

    @Override
    public /* synthetic */ dS a(Object[] arrobject) {
        return this.b((E[])arrobject);
    }

    @Override
    public /* synthetic */ dR a(Object object) {
        return this.c(object);
    }

    @Override
    public /* synthetic */ dQ a() {
        return this.b();
    }

    @Override
    public /* synthetic */ dS a(Iterator iterator) {
        return this.b(iterator);
    }

    @Override
    public /* synthetic */ dS b(Object object) {
        return this.c(object);
    }
}

