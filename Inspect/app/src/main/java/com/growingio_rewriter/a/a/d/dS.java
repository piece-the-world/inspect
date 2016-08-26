/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dQ;
import java.util.Iterator;

public abstract class dS<E> {
    static final int c = 4;

    static int a(int n2, int n3) {
        if (n3 < 0) {
            throw new AssertionError((Object)"cannot store more than MAX_VALUE elements");
        }
        int n4 = n2 + (n2 >> 1) + 1;
        if (n4 < n3) {
            n4 = Integer.highestOneBit(n3 - 1) << 1;
        }
        if (n4 < 0) {
            n4 = Integer.MAX_VALUE;
        }
        return n4;
    }

    dS() {
    }

    public abstract dS<E> b(E var1);

    public /* varargs */ dS<E> a(E ... arrE) {
        for (E e2 : arrE) {
            this.b(e2);
        }
        return this;
    }

    public dS<E> a(Iterable<? extends E> iterable) {
        for (E e2 : iterable) {
            this.b(e2);
        }
        return this;
    }

    public dS<E> a(Iterator<? extends E> iterator) {
        while (iterator.hasNext()) {
            this.b(iterator.next());
        }
        return this;
    }

    public abstract dQ<E> a();
}

