/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.E;
import com.growingio.a.a.o.a.F;
import com.growingio.a.a.o.a.O;
import com.growingio.a.a.o.a.P;
import com.growingio.a.a.o.a.Q;
import com.growingio.a.a.o.a.R;
import com.growingio.a.a.o.a.S;
import com.growingio.a.a.o.a.cd;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

final class N
extends S {
    private volatile Future<?> b;
    private volatile ScheduledExecutorService c;
    private final ReentrantLock d;
    private final Runnable e;
    final /* synthetic */ E a;

    private N(E e2) {
        this.a = e2;
        this.d = new ReentrantLock();
        this.e = new R(this);
    }

    @Override
    protected final void a() {
        this.c = cd.a(this.a.e(), new O(this));
        this.c.execute(new P(this));
    }

    @Override
    protected final void b() {
        this.b.cancel(false);
        this.c.execute(new Q(this));
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    /* synthetic */ N(E e2, F f2) {
        this(e2);
    }

    static /* synthetic */ ReentrantLock a(N n2) {
        return n2.d;
    }

    static /* synthetic */ Future b(N n2) {
        return n2.b;
    }

    static /* synthetic */ Future a(N n2, Future future) {
        n2.b = future;
        return n2.b;
    }

    static /* synthetic */ ScheduledExecutorService c(N n2) {
        return n2.c;
    }

    static /* synthetic */ Runnable d(N n2) {
        return n2.e;
    }
}

