/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.n.G;
import com.growingio.a.a.n.P;

class U<K>
extends P<K> {
    private final P<K> c;

    U(P<K> p2) {
        super(null);
        this.c = p2;
    }

    @Override
    Class<?> b(K k2) {
        return this.c.b(k2);
    }

    @Override
    Iterable<? extends K> c(K k2) {
        return this.c.c(k2);
    }

    @Override
    K d(K k2) {
        return this.c.d(k2);
    }
}

