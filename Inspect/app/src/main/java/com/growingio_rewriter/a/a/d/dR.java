/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.dS;
import com.growingio.a.a.d.kN;
import java.util.Collection;

abstract class dR<E>
extends dS<E> {
    Object[] a;
    int b;

    dR(int n2) {
        aK.a(n2, "initialCapacity");
        this.a = new Object[n2];
        this.b = 0;
    }

    private void a(int n2) {
        if (this.a.length < n2) {
            this.a = kN.b(this.a, dR.a(this.a.length, n2));
        }
    }

    public dR<E> a(E e2) {
        aU.a(e2);
        this.a(this.b + 1);
        this.a[this.b++] = e2;
        return this;
    }

    @Override
    public /* varargs */ dS<E> a(E ... arrE) {
        kN.a((Object[])arrE);
        this.a(this.b + arrE.length);
        System.arraycopy(arrE, 0, this.a, this.b, arrE.length);
        this.b += arrE.length;
        return this;
    }

    @Override
    public dS<E> a(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            this.a(this.b + collection.size());
        }
        super.a(iterable);
        return this;
    }

    @Override
    public /* synthetic */ dS b(Object object) {
        return this.a((E)object);
    }
}

