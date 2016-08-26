/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.ec;
import com.growingio.a.a.o.a.dH;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

abstract class dG
implements ExecutorService {
    private final ExecutorService a;

    protected dG(ExecutorService executorService) {
        this.a = aU.a(executorService);
    }

    protected abstract <T> Callable<T> a(Callable<T> var1);

    protected Runnable a(Runnable runnable) {
        Callable<Object> callable = this.a(Executors.callable(runnable, null));
        return new dH(this, callable);
    }

    private final <T> ea<Callable<T>> a(Collection<? extends Callable<T>> collection) {
        ec<Callable<T>> ec2 = ea.g();
        for (Callable<T> callable : collection) {
            ec2.c(this.a(callable));
        }
        return ec2.b();
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(this.a(runnable));
    }

    @Override
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.a.submit(this.a(aU.a(callable)));
    }

    @Override
    public final Future<?> submit(Runnable runnable) {
        return this.a.submit(this.a(runnable));
    }

    @Override
    public final <T> Future<T> submit(Runnable runnable, T t2) {
        return this.a.submit(this.a(runnable), t2);
    }

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.a.invokeAll(this.a(collection));
    }

    @Override
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a.invokeAll(this.a(collection), l2, timeUnit);
    }

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.a.invokeAny(this.a(collection));
    }

    @Override
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long l2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a.invokeAny(this.a(collection), l2, timeUnit);
    }

    @Override
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override
    public final List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a.awaitTermination(l2, timeUnit);
    }
}

