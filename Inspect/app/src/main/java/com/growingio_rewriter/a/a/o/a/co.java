/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.D;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class co
extends D {
    private final ExecutorService a;

    co(ExecutorService executorService) {
        this.a = aU.a(executorService);
    }

    @Override
    public final boolean awaitTermination(long l2, TimeUnit timeUnit) throws InterruptedException {
        return this.a.awaitTermination(l2, timeUnit);
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
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override
    public final List<Runnable> shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}

