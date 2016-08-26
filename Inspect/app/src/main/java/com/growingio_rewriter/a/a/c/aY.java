/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.aU;
import com.growingio.a.a.c.aW;
import java.util.concurrent.atomic.AtomicLong;

final class aY
extends AtomicLong
implements aU {
    private aY() {
    }

    @Override
    public void a() {
        this.getAndIncrement();
    }

    @Override
    public void a(long l2) {
        this.getAndAdd(l2);
    }

    @Override
    public long b() {
        return this.get();
    }

    /* synthetic */ aY(aW aW2) {
        this();
    }
}

