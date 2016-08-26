/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bZ;
import com.growingio.a.a.o.a.bi;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public abstract class bn
extends bi
implements bZ {
    protected bn() {
    }

    protected abstract bZ b();

    @Override
    public <T> bU<T> a(Callable<T> callable) {
        return this.b().a(callable);
    }

    @Override
    public bU<?> a(Runnable runnable) {
        return this.b().a(runnable);
    }

    @Override
    public <T> bU<T> a(Runnable runnable, T t2) {
        return this.b().a(runnable, t2);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object object) {
        return this.a(runnable, object);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return this.a(runnable);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return this.a(callable);
    }

    @Override
    protected /* synthetic */ ExecutorService a() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

