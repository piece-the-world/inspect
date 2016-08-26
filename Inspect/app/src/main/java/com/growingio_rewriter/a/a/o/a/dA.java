/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bM;
import com.growingio.a.a.o.a.dz;
import java.util.concurrent.Callable;

final class dA
extends bM {
    private final Callable<V> b;
    final /* synthetic */ dz a;

    dA(Callable<V> var1_1) {
        this.a = var1_1;
        this.b = aU.a(callable);
    }

    @Override
    void b() {
        if (!this.a.isDone()) {
            try {
                this.a.b(this.b.call());
            }
            catch (Throwable var1_1) {
                this.a.a(var1_1);
            }
        }
    }

    @Override
    boolean c() {
        return this.a.c();
    }
}

