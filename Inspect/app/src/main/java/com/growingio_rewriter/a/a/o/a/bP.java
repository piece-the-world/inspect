/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bM;
import com.growingio.a.a.o.a.bN;
import com.growingio.a.a.o.a.bO;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class bP
extends bO {
    final AtomicReferenceFieldUpdater<bM, Thread> a;

    bP(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
    }

    @Override
    boolean a(bM bM2, Thread thread, Thread thread2) {
        return this.a.compareAndSet(bM2, thread, thread2);
    }
}

