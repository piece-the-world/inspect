/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.kP;
import java.util.concurrent.atomic.AtomicInteger;

class kQ
implements aq<Object, Integer> {
    final AtomicInteger a;
    final /* synthetic */ kP b;

    kQ(kP kP2) {
        this.b = kP2;
        this.a = new AtomicInteger(0);
    }

    public Integer a(Object object) {
        return this.a.getAndIncrement();
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a(object);
    }
}

