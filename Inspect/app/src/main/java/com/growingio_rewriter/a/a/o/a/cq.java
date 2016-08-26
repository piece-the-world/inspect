/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bW;
import com.growingio.a.a.o.a.bm;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class cq<V>
extends bm<V>
implements bW<V> {
    private final ScheduledFuture<?> a;

    public cq(bU<V> bU2, ScheduledFuture<?> scheduledFuture) {
        super(bU2);
        this.a = scheduledFuture;
    }

    @Override
    public boolean cancel(boolean bl2) {
        boolean bl3 = super.cancel(bl2);
        if (bl3) {
            this.a.cancel(bl2);
        }
        return bl3;
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }

    public int a(Delayed delayed) {
        return this.a.compareTo((Delayed)delayed);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((Delayed)object);
    }
}

