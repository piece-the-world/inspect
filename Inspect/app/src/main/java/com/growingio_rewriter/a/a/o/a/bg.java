/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.aB;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bl;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class bg<V, X extends Exception>
extends bl<V>
implements aB<V, X> {
    @Override
    public V a() throws Exception {
        return this.b().a();
    }

    @Override
    public V a(long l2, TimeUnit timeUnit) throws TimeoutException, Exception {
        return this.b().a(l2, timeUnit);
    }

    protected abstract aB<V, X> b();

    @Override
    protected /* synthetic */ bU d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Future c() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

