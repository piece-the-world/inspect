/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aG;
import com.growingio.a.a.o.a.aJ;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class aI
extends aG<V> {
    private final Callable<V> d;
    final /* synthetic */ aG a;

    public aI(Callable<V> var1_1, Executor callable) {
        this.a = var1_1;
        super(var1_1, executor);
        this.d = aU.a(callable);
    }

    @Override
    void a() throws Exception {
        this.a.b(this.d.call());
    }
}

