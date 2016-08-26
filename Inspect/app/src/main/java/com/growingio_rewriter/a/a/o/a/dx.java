/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.dy;
import com.growingio.a.a.o.a.t;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class dx<V>
extends t<V> {
    private bU<V> a;
    private Future<?> b;

    static <V> bU<V> a(bU<V> bU2, long l2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        dx<V> dx2 = new dx<V>(bU2);
        dy<V> dy2 = new dy<V>(dx2);
        dx2.b = scheduledExecutorService.schedule(dy2, l2, timeUnit);
        bU2.a(dy2, cd.c());
        return dx2;
    }

    private dx(bU<V> bU2) {
        this.a = aU.a(bU2);
    }

    @Override
    protected void a() {
        this.a(this.a);
        Future future = this.b;
        if (future != null) {
            future.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    static /* synthetic */ bU a(dx dx2) {
        return dx2.a;
    }
}

