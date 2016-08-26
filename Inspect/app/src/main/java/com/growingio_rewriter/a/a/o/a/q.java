/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.j;
import com.growingio.a.a.o.a.k;
import com.growingio.a.a.o.a.l;
import com.growingio.a.a.o.a.p;
import com.growingio.a.a.o.a.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class q
extends l {
    final AtomicReferenceFieldUpdater<w, Thread> a;
    final AtomicReferenceFieldUpdater<w, w> b;
    final AtomicReferenceFieldUpdater<j, w> c;
    final AtomicReferenceFieldUpdater<j, p> d;
    final AtomicReferenceFieldUpdater<j, Object> e;

    q(AtomicReferenceFieldUpdater<w, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<w, w> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<j, w> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<j, p> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<j, Object> atomicReferenceFieldUpdater5) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override
    void a(w w2, Thread thread) {
        this.a.lazySet(w2, thread);
    }

    @Override
    void a(w w2, w w3) {
        this.b.lazySet(w2, w3);
    }

    @Override
    boolean a(j<?> j2, w w2, w w3) {
        return this.c.compareAndSet(j2, w2, w3);
    }

    @Override
    boolean a(j<?> j2, p p2, p p3) {
        return this.d.compareAndSet(j2, p2, p3);
    }

    @Override
    boolean a(j<?> j2, Object object, Object object2) {
        return this.e.compareAndSet(j2, object, object2);
    }
}

