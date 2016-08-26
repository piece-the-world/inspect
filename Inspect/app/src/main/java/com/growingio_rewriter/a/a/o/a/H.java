/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.F;
import com.growingio.a.a.o.a.I;
import com.growingio.a.a.o.a.J;
import com.growingio.a.a.o.a.K;
import com.growingio.a.a.o.a.S;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public abstract class H
extends K {
    public H() {
        super(null);
    }

    @Override
    final Future<?> a(S s2, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        I i2 = new I(this, s2, scheduledExecutorService, runnable);
        i2.b();
        return i2;
    }

    protected abstract J a() throws Exception;
}

