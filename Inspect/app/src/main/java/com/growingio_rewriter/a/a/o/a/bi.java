/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.db;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class bi
extends db
implements ExecutorService {
    protected bi() {
    }

    protected abstract ExecutorService a();

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().awaitTermination(l2, timeUnit);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.a().invokeAll(collection);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a().invokeAll(collection, l2, timeUnit);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.a().invokeAny(collection);
    }

    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long l2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a().invokeAny(collection, l2, timeUnit);
    }

    @Override
    public boolean isShutdown() {
        return this.a().isShutdown();
    }

    @Override
    public boolean isTerminated() {
        return this.a().isTerminated();
    }

    @Override
    public void shutdown() {
        this.a().shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return this.a().shutdownNow();
    }

    @Override
    public void execute(Runnable runnable) {
        this.a().execute(runnable);
    }

    @Override
    public <T> Future<T> submit(Callable<T> callable) {
        return this.a().submit(callable);
    }

    @Override
    public Future<?> submit(Runnable runnable) {
        return this.a().submit(runnable);
    }

    @Override
    public <T> Future<T> submit(Runnable runnable, T t2) {
        return this.a().submit(runnable, t2);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

