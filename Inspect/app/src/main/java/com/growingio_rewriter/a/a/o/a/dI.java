/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.dG;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

abstract class dI
extends dG
implements ScheduledExecutorService {
    final ScheduledExecutorService b;

    protected dI(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    @Override
    public final ScheduledFuture<?> schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.b.schedule(this.a(runnable), l2, timeUnit);
    }

    @Override
    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long l2, TimeUnit timeUnit) {
        return this.b.schedule(this.a(callable), l2, timeUnit);
    }

    @Override
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.b.scheduleAtFixedRate(this.a(runnable), l2, l3, timeUnit);
    }

    @Override
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.b.scheduleWithFixedDelay(this.a(runnable), l2, l3, timeUnit);
    }
}

