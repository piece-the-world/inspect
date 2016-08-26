/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class bq
implements Future<O> {
    final /* synthetic */ Future a;
    final /* synthetic */ aq b;

    bq(Future future, aq aq2) {
        this.a = future;
        this.b = aq2;
    }

    @Override
    public boolean cancel(boolean bl2) {
        return this.a.cancel(bl2);
    }

    @Override
    public boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.a.isDone();
    }

    @Override
    public O get() throws InterruptedException, ExecutionException {
        return this.a(this.a.get());
    }

    @Override
    public O get(long l2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a(this.a.get(l2, timeUnit));
    }

    private O a(I i2) throws ExecutionException {
        try {
            return (O)this.b.f(i2);
        }
        catch (Throwable var2_2) {
            throw new ExecutionException(var2_2);
        }
    }
}

