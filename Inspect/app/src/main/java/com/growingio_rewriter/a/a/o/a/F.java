/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.E;
import com.growingio.a.a.o.a.cF;
import com.growingio.a.a.o.a.cG;
import java.util.concurrent.ScheduledExecutorService;

class F
extends cF {
    final /* synthetic */ ScheduledExecutorService a;
    final /* synthetic */ E b;

    F(E e2, ScheduledExecutorService scheduledExecutorService) {
        this.b = e2;
        this.a = scheduledExecutorService;
    }

    @Override
    public void a(cG cG2) {
        this.a.shutdown();
    }

    @Override
    public void a(cG cG2, Throwable throwable) {
        this.a.shutdown();
    }
}

