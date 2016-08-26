/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bT;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bc;
import com.growingio.a.a.o.a.bj;
import com.growingio.a.a.o.a.du;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

class bS<V>
extends bj<V>
implements bU<V> {
    private static final ThreadFactory a = new du().a(true).a("ListenableFutureAdapter-thread-%d").a();
    private static final Executor b = Executors.newCachedThreadPool(a);
    private final Executor c;
    private final bc d = new bc();
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final Future<V> f;

    bS(Future<V> future) {
        this(future, b);
    }

    bS(Future<V> future, Executor executor) {
        this.f = aU.a(future);
        this.c = aU.a(executor);
    }

    @Override
    protected Future<V> c() {
        return this.f;
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.d.a(runnable, executor);
        if (this.e.compareAndSet(false, true)) {
            if (this.f.isDone()) {
                this.d.a();
                return;
            }
            this.c.execute(new bT(this));
        }
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }

    static /* synthetic */ Future a(bS bS2) {
        return bS2.f;
    }

    static /* synthetic */ bc b(bS bS2) {
        return bS2.d;
    }
}

