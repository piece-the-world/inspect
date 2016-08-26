/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.o.a.dq;
import java.util.concurrent.Semaphore;

final class dk
implements bG<Semaphore> {
    final /* synthetic */ int a;

    dk(int n2) {
        this.a = n2;
    }

    public Semaphore b() {
        return new dq(this.a);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

