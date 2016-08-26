/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.F;
import com.growingio.a.a.o.a.L;
import com.growingio.a.a.o.a.M;
import com.growingio.a.a.o.a.S;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class K {
    public static K a(long l2, long l3, TimeUnit timeUnit) {
        aU.a(timeUnit);
        aU.a(l3 > 0, "delay must be > 0, found %s", l3);
        return new L(l2, l3, timeUnit);
    }

    public static K b(long l2, long l3, TimeUnit timeUnit) {
        aU.a(timeUnit);
        aU.a(l3 > 0, "period must be > 0, found %s", l3);
        return new M(l2, l3, timeUnit);
    }

    abstract Future<?> a(S var1, ScheduledExecutorService var2, Runnable var3);

    private K() {
    }

    /* synthetic */ K(F f2) {
        this();
    }
}

