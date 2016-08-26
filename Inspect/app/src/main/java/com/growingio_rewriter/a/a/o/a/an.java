/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.ak;
import com.growingio.a.a.o.a.al;
import com.growingio.a.a.o.a.am;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class an
extends am {
    final AtomicReferenceFieldUpdater<ak, Set<Throwable>> a;
    final AtomicIntegerFieldUpdater<ak> b;

    an(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override
    void a(ak ak2, Set<Throwable> set, Set<Throwable> set2) {
        this.a.compareAndSet(ak2, set, set2);
    }

    @Override
    int a(ak ak2) {
        return this.b.decrementAndGet(ak2);
    }
}

