/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.fA;
import com.growingio.a.a.d.fz;
import java.io.Serializable;
import java.util.Comparator;

class fB<E>
implements Serializable {
    final Comparator<? super E> a;
    final Object[] b;
    private static final long c = 0;

    public fB(Comparator<? super E> comparator, Object[] arrobject) {
        this.a = comparator;
        this.b = arrobject;
    }

    Object a() {
        return new fA<Object>(this.a).c((E[])this.b).c();
    }
}

