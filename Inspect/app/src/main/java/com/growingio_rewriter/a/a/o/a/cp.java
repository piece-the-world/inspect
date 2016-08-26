/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bW;
import com.growingio.a.a.o.a.ca;
import com.growingio.a.a.o.a.co;
import com.growingio.a.a.o.a.cq;
import com.growingio.a.a.o.a.cr;
import com.growingio.a.a.o.a.dz;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class cp
extends co
implements ca {
    final ScheduledExecutorService a;

    cp(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.a = aU.a(scheduledExecutorService);
    }

    @Override
    public bW<?> a(Runnable runnable, long l2, TimeUnit timeUnit) {
        dz<Object> dz2 = dz.a(runnable, null);
        ScheduledFuture scheduledFuture = this.a.schedule(dz2, l2, timeUnit);
        return new cq<Object>(dz2, scheduledFuture);
    }

    @Override
    public <V> bW<V> a(Callable<V> callable, long l2, TimeUnit timeUnit) {
        dz<V> dz2 = dz.a(callable);
        ScheduledFuture scheduledFuture = this.a.schedule(dz2, l2, timeUnit);
        return new cq<V>(dz2, scheduledFuture);
    }

    @Override
    public bW<?> a(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        cr cr2 = new cr(runnable);
        ScheduledFuture scheduledFuture = this.a.scheduleAtFixedRate(cr2, l2, l3, timeUnit);
        return new cq(cr2, scheduledFuture);
    }

    @Override
    public bW<?> b(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        cr cr2 = new cr(runnable);
        ScheduledFuture scheduledFuture = this.a.scheduleWithFixedDelay(cr2, l2, l3, timeUnit);
        return new cq(cr2, scheduledFuture);
    }

    public /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.b(runnable, l2, l3, timeUnit);
    }

    public /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long l2, long l3, TimeUnit timeUnit) {
        return this.a(runnable, l2, l3, timeUnit);
    }

    public /* synthetic */ ScheduledFuture schedule(Callable callable, long l2, TimeUnit timeUnit) {
        return this.a(callable, l2, timeUnit);
    }

    public /* synthetic */ ScheduledFuture schedule(Runnable runnable, long l2, TimeUnit timeUnit) {
        return this.a(runnable, l2, timeUnit);
    }
}

