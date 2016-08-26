/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

abstract class t<V>
extends j<V> {
    t() {
    }

    @Override
    public final V get() throws InterruptedException, ExecutionException {
        return super.get();
    }

    @Override
    public final V get(long l2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return super.get(l2, timeUnit);
    }

    @Override
    public final boolean isDone() {
        return super.isDone();
    }

    @Override
    public final boolean isCancelled() {
        return super.isCancelled();
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        super.a(runnable, executor);
    }
}

