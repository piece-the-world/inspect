/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.F;
import com.growingio.a.a.o.a.G;
import com.growingio.a.a.o.a.K;
import com.growingio.a.a.o.a.N;
import com.growingio.a.a.o.a.S;
import com.growingio.a.a.o.a.cD;
import com.growingio.a.a.o.a.cF;
import com.growingio.a.a.o.a.cG;
import com.growingio.a.a.o.a.cd;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

public abstract class E
implements cD {
    private static final Logger a = Logger.getLogger(E.class.getName());
    private final S b;

    protected E() {
        this.b = new N(this, null);
    }

    protected abstract void a() throws Exception;

    protected void b() throws Exception {
    }

    protected void c() throws Exception {
    }

    protected abstract K d();

    protected ScheduledExecutorService e() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new G(this));
        this.a(new F(this, scheduledExecutorService), cd.c());
        return scheduledExecutorService;
    }

    protected String m() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return this.m() + " [" + (Object)((Object)this.g()) + "]";
    }

    @Override
    public final boolean f() {
        return this.b.f();
    }

    @Override
    public final cG g() {
        return this.b.g();
    }

    @Override
    public final void a(cF cF2, Executor executor) {
        this.b.a(cF2, executor);
    }

    @Override
    public final Throwable h() {
        return this.b.h();
    }

    @Override
    public final cD i() {
        this.b.i();
        return this;
    }

    @Override
    public final cD j() {
        this.b.j();
        return this;
    }

    @Override
    public final void k() {
        this.b.k();
    }

    @Override
    public final void a(long l2, TimeUnit timeUnit) throws TimeoutException {
        this.b.a(l2, timeUnit);
    }

    @Override
    public final void l() {
        this.b.l();
    }

    @Override
    public final void b(long l2, TimeUnit timeUnit) throws TimeoutException {
        this.b.b(l2, timeUnit);
    }

    static /* synthetic */ Logger n() {
        return a;
    }

    static /* synthetic */ S a(E e2) {
        return e2.b;
    }
}

