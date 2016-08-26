/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import java.util.concurrent.Semaphore;

final class dl
implements bG<Semaphore> {
    final /* synthetic */ int a;

    dl(int n2) {
        this.a = n2;
    }

    public Semaphore b() {
        return new Semaphore(this.a, false);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

