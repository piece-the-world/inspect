/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.H;
import com.growingio.a.a.o.a.J;
import com.growingio.a.a.o.a.S;
import com.growingio.a.a.o.a.bj;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class I
extends bj<Void>
implements Callable<Void> {
    private final Runnable b;
    private final ScheduledExecutorService c;
    private final S d;
    private final ReentrantLock e;
    private Future<Void> f;
    final /* synthetic */ H a;

    I(H h2, S s2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        this.a = h2;
        this.e = new ReentrantLock();
        this.b = runnable;
        this.c = scheduledExecutorService;
        this.d = s2;
    }

    public Void a() throws Exception {
        this.b.run();
        this.b();
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        Throwable throwable;
        J j2;
        try {
            j2 = this.a.a();
        }
        catch (Throwable var2_2) {
            this.d.a(var2_2);
            return;
        }
        throwable = null;
        this.e.lock();
        try {
            if (this.f == null || !this.f.isCancelled()) {
                this.f = this.c.schedule(this, J.a(j2), J.b(j2));
            }
        }
        catch (Throwable var3_4) {
            throwable = var3_4;
        }
        finally {
            this.e.unlock();
        }
        if (throwable != null) {
            this.d.a(throwable);
        }
    }

    @Override
    public boolean cancel(boolean bl2) {
        this.e.lock();
        try {
            boolean bl3 = this.f.cancel(bl2);
            return bl3;
        }
        finally {
            this.e.unlock();
        }
    }

    @Override
    public boolean isCancelled() {
        this.e.lock();
        try {
            boolean bl2 = this.f.isCancelled();
            return bl2;
        }
        finally {
            this.e.unlock();
        }
    }

    @Override
    protected Future<Void> c() {
        throw new UnsupportedOperationException("Only cancel and isCancelled is supported by this future");
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }

    @Override
    public /* synthetic */ Object call() throws Exception {
        return this.a();
    }
}

