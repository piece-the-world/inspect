/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aB;
import com.growingio.a.a.o.a.bG;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

class bI<V, X extends Exception>
extends bG<V>
implements aB<V, X> {
    private final X a;

    bI(X x2) {
        this.a = x2;
    }

    @Override
    public V get() throws ExecutionException {
        throw new ExecutionException((Throwable)this.a);
    }

    @Override
    public V a() throws Exception {
        throw this.a;
    }

    @Override
    public V a(long l2, TimeUnit timeUnit) throws Exception {
        aU.a(timeUnit);
        throw this.a;
    }
}

