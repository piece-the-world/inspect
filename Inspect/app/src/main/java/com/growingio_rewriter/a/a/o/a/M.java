/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.F;
import com.growingio.a.a.o.a.K;
import com.growingio.a.a.o.a.S;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class M
extends K {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;

    M(long l2, long l3, TimeUnit timeUnit) {
        this.a = l2;
        this.b = l3;
        this.c = timeUnit;
        super(null);
    }

    @Override
    public Future<?> a(S s2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        return scheduledExecutorService.scheduleAtFixedRate(runnable, this.a, this.b, this.c);
    }
}

