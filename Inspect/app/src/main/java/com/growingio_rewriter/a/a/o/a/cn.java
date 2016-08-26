/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.D;
import com.growingio.a.a.o.a.ce;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

final class cn
extends D {
    private final Object a = new Object();
    private int b = 0;
    private boolean c = false;

    private cn() {
    }

    @Override
    public void execute(Runnable runnable) {
        this.a();
        try {
            runnable.run();
        }
        finally {
            this.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isShutdown() {
        Object object = this.a;
        synchronized (object) {
            return this.c;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void shutdown() {
        Object object = this.a;
        synchronized (object) {
            this.c = true;
            if (this.b == 0) {
                this.a.notifyAll();
            }
        }
    }

    @Override
    public List<Runnable> shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean isTerminated() {
        Object object = this.a;
        synchronized (object) {
            return this.c && this.b == 0;
        }
    }

    @Override
    public boolean awaitTermination(long l2, TimeUnit timeUnit) throws InterruptedException {
        long l3 = timeUnit.toNanos(l2);
        Object object = this.a;
        synchronized (object) {
            do {
                if (this.c && this.b == 0) {
                    return true;
                }
                if (l3 <= 0) {
                    return false;
                }
                long l4 = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(this.a, l3);
                l3 -= System.nanoTime() - l4;
            } while (true);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        Object object = this.a;
        synchronized (object) {
            if (this.c) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            ++this.b;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b() {
        Object object = this.a;
        synchronized (object) {
            int n2 = --this.b;
            if (n2 == 0) {
                this.a.notifyAll();
            }
        }
    }

    /* synthetic */ cn(ce ce2) {
        this();
    }
}

