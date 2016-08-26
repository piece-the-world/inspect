/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.o.a.at;
import java.util.concurrent.atomic.AtomicLong;

class au
implements aq<AtomicLong, Long> {
    final /* synthetic */ at a;

    au(at at2) {
        this.a = at2;
    }

    public Long a(AtomicLong atomicLong) {
        return atomicLong.get();
    }

    @Override
    public /* synthetic */ Object f(Object object) {
        return this.a((AtomicLong)object);
    }
}

