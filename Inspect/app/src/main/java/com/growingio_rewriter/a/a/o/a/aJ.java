/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.aG;
import com.growingio.a.a.o.a.bM;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class aJ
extends bM {
    private final Executor a;
    volatile boolean b;
    final /* synthetic */ aG c;

    public aJ(aG aG2, Executor executor) {
        this.c = aG2;
        this.b = true;
        this.a = aU.a(executor);
    }

    @Override
    final void b() {
        this.b = false;
        if (!this.c.isDone()) {
            try {
                this.a();
            }
            catch (ExecutionException var1_1) {
                this.c.a(var1_1.getCause());
            }
            catch (CancellationException var1_2) {
                this.c.cancel(false);
            }
            catch (Throwable var1_3) {
                this.c.a(var1_3);
            }
        }
    }

    @Override
    final boolean c() {
        return this.c.c();
    }

    final void d() {
        block2 : {
            try {
                this.a.execute(this);
            }
            catch (RejectedExecutionException var1_1) {
                if (!this.b) break block2;
                this.c.a(var1_1);
            }
        }
    }

    abstract void a() throws Exception;
}

