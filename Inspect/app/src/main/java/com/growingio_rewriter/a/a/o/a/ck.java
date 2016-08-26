/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.cl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class ck {
    ck() {
    }

    final ExecutorService a(ThreadPoolExecutor threadPoolExecutor, long l2, TimeUnit timeUnit) {
        cd.b(threadPoolExecutor);
        ExecutorService executorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.a(executorService, l2, timeUnit);
        return executorService;
    }

    final ScheduledExecutorService a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long l2, TimeUnit timeUnit) {
        cd.b(scheduledThreadPoolExecutor);
        ScheduledExecutorService scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
        this.a(scheduledExecutorService, l2, timeUnit);
        return scheduledExecutorService;
    }

    final void a(ExecutorService executorService, long l2, TimeUnit timeUnit) {
        aU.a(executorService);
        aU.a(timeUnit);
        this.a(cd.a("DelayedShutdownHook-for-" + executorService, new cl(this, executorService, l2, timeUnit)));
    }

    final ExecutorService a(ThreadPoolExecutor threadPoolExecutor) {
        return this.a(threadPoolExecutor, 120, TimeUnit.SECONDS);
    }

    final ScheduledExecutorService a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return this.a(scheduledThreadPoolExecutor, 120, TimeUnit.SECONDS);
    }

    void a(Thread thread) {
        Runtime.getRuntime().addShutdownHook(thread);
    }
}

