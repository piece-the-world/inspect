/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aB;
import com.growingio.a.a.o.a.bG;
import java.util.concurrent.TimeUnit;

class bK<V, X extends Exception>
extends bG<V>
implements aB<V, X> {
    private final V a;

    bK(V v2) {
        this.a = v2;
    }

    @Override
    public V get() {
        return this.a;
    }

    @Override
    public V a() {
        return this.a;
    }

    @Override
    public V a(long l2, TimeUnit timeUnit) {
        aU.a(timeUnit);
        return this.a;
    }
}

