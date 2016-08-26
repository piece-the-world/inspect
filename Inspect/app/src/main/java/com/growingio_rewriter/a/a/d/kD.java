/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aK;
import com.growingio.a.a.d.kx;
import java.io.Serializable;

class kD<E>
extends kx<E>
implements Serializable {
    private final E a;
    private final int b;
    private static final long c = 0;

    kD(E e2, int n2) {
        this.a = e2;
        this.b = n2;
        aK.a(n2, "count");
    }

    @Override
    public final E a() {
        return this.a;
    }

    @Override
    public final int b() {
        return this.b;
    }

    public kD<E> c() {
        return null;
    }
}

