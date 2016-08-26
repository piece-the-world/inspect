/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bZ;
import com.growingio.a.a.o.a.dz;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class D
extends AbstractExecutorService
implements bZ {
    @Override
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t2) {
        return dz.a(runnable, t2);
    }

    @Override
    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return dz.a(callable);
    }

    @Override
    public bU<?> a(Runnable runnable) {
        return (bU)super.submit(runnable);
    }

    @Override
    public <T> bU<T> a(Runnable runnable, T t2) {
        return (bU)super.submit(runnable, t2);
    }

    @Override
    public <T> bU<T> a(Callable<T> callable) {
        return (bU)super.submit(callable);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return this.a(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object object) {
        return this.a(runnable, object);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return this.a(runnable);
    }
}

