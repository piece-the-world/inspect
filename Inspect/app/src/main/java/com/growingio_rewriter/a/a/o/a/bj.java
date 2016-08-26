/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.db;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class bj<V>
extends db
implements Future<V> {
    protected bj() {
    }

    protected abstract Future<V> c();

    @Override
    public boolean cancel(boolean bl2) {
        return this.c().cancel(bl2);
    }

    @Override
    public boolean isCancelled() {
        return this.c().isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.c().isDone();
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        return this.c().get();
    }

    @Override
    public V get(long l2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.c().get(l2, timeUnit);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }
}

