/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.o.a.dr;
import com.growingio.a.a.o.a.dt;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReferenceArray;

class ds<L>
extends dr<L> {
    final AtomicReferenceArray<dt<? extends L>> a;
    final bG<L> b;
    final int c;
    final ReferenceQueue<L> e = new ReferenceQueue();

    ds(int n2, bG<L> bG2) {
        super(n2);
        this.c = this.d == -1 ? Integer.MAX_VALUE : this.d + 1;
        this.a = new AtomicReferenceArray(this.c);
        this.b = bG2;
    }

    @Override
    public L a(int n2) {
        dt<? extends L> dt2;
        L l2;
        if (this.c != Integer.MAX_VALUE) {
            aU.a(n2, this.a());
        }
        L l3 = l2 = (dt2 = this.a.get(n2)) == null ? null : (L)dt2.get();
        if (l2 != null) {
            return l2;
        }
        L l4 = this.b.a();
        dt<L> dt3 = new dt<L>(l4, n2, this.e);
        while (!this.a.compareAndSet(n2, dt2, dt3)) {
            dt2 = this.a.get(n2);
            l2 = dt2 == null ? null : (L)dt2.get();
            if (l2 == null) continue;
            return l2;
        }
        this.b();
        return l4;
    }

    private void b() {
        Reference<L> reference;
        while ((reference = this.e.poll()) != null) {
            dt dt2 = (dt)reference;
            this.a.compareAndSet(dt2.a, dt2, null);
        }
    }

    @Override
    public int a() {
        return this.c;
    }
}

