/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

class gT<E>
extends AbstractList<E>
implements Serializable,
RandomAccess {
    final E a;
    final E[] b;
    private static final long c = 0;

    gT(E e2, E[] arrE) {
        this.a = e2;
        this.b = aU.a(arrE);
    }

    @Override
    public int size() {
        return f.i(this.b.length, 1);
    }

    @Override
    public E get(int n2) {
        aU.a(n2, this.size());
        return n2 == 0 ? this.a : this.b[n2 - 1];
    }
}

