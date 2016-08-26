/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

class hf<E>
extends AbstractList<E>
implements Serializable,
RandomAccess {
    final E a;
    final E b;
    final E[] c;
    private static final long d = 0;

    hf(E e2, E e3, E[] arrE) {
        this.a = e2;
        this.b = e3;
        this.c = aU.a(arrE);
    }

    @Override
    public int size() {
        return f.i(this.c.length, 2);
    }

    @Override
    public E get(int n2) {
        switch (n2) {
            case 0: {
                return this.a;
            }
            case 1: {
                return this.b;
            }
        }
        aU.a(n2, this.size());
        return this.c[n2 - 2];
    }
}

