/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cD;
import com.growingio.a.a.o.a.cF;
import com.growingio.a.a.o.a.cG;
import com.growingio.a.a.o.a.f;
import com.growingio.a.a.o.a.i;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

public abstract class e
implements cD {
    private static final Logger a = Logger.getLogger(e.class.getName());
    private final cD b;

    protected e() {
        this.b = new f(this);
    }

    protected void a() throws Exception {
    }

    protected abstract void b() throws Exception;

    protected void c() throws Exception {
    }

    protected void d() {
    }

    protected Executor e() {
        return new i(this);
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

    protected String m() {
        return this.getClass().getSimpleName();
    }

    static /* synthetic */ Logger n() {
        return a;
    }
}

