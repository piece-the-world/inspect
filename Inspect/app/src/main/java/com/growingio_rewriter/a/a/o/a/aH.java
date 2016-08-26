/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aG;
import com.growingio.a.a.o.a.aJ;
import com.growingio.a.a.o.a.ap;
import com.growingio.a.a.o.a.bU;
import java.util.concurrent.Executor;

final class aH
extends aG<V> {
    private final ap<V> d;
    final /* synthetic */ aG a;

    public aH(ap<V> var1_1, Executor ap2) {
        this.a = var1_1;
        super(var1_1, executor);
        this.d = aU.a(ap2);
    }

    @Override
    void a() throws Exception {
        this.a.b(this.d.a());
    }
}

