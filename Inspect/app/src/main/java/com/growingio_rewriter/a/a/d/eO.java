/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.dS;
import com.growingio.a.a.d.eM;
import com.growingio.a.a.d.gB;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import java.util.Iterator;
import java.util.Set;

public class eO<E>
extends dS<E> {
    final kl<E> a;

    public eO() {
        this(gB.g());
    }

    eO(kl<E> kl2) {
        this.a = kl2;
    }

    public eO<E> a(E e2) {
        this.a.add(aU.a(e2));
        return this;
    }

    public eO<E> a(E e2, int n2) {
        this.a.a(aU.a(e2), n2);
        return this;
    }

    public eO<E> b(E e2, int n2) {
        this.a.c(aU.a(e2), n2);
        return this;
    }

    @Override
    public /* varargs */ eO<E> b(E ... arrE) {
        super.a(arrE);
        return this;
    }

    @Override
    public eO<E> b(Iterable<? extends E> iterable) {
        if (iterable instanceof kl) {
            kl<E> kl2 = kn.b(iterable);
            for (km<E> km2 : kl2.a()) {
                this.a(km2.a(), km2.b());
            }
        } else {
            super.a(iterable);
        }
        return this;
    }

    @Override
    public eO<E> b(Iterator<? extends E> iterator) {
        super.a(iterator);
        return this;
    }

    public eM<E> b() {
        return eM.a(this.a);
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
    public /* synthetic */ dS a(Iterable iterable) {
        return this.b(iterable);
    }

    @Override
    public /* synthetic */ dS a(Object[] arrobject) {
        return this.b((E[])arrobject);
    }

    @Override
    public /* synthetic */ dS b(Object object) {
        return this.a(object);
    }
}

