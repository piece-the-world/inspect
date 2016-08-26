/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.dA;
import com.growingio.a.a.o.a.t;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

class dz<V>
extends t<V>
implements RunnableFuture<V> {
    private dz<V> a;

    static <V> dz<V> a(Callable<V> callable) {
        return new dz<V>(callable);
    }

    static <V> dz<V> a(Runnable runnable, V v2) {
        return new dz<V>(Executors.callable(runnable, v2));
    }

    dz(Callable<V> callable) {
        this.a = new dA(this, callable);
    }

    @Override
    public void run() {
        dz<V> dz2 = this.a;
        if (dz2 != null) {
            dz2.run();
        }
    }

    @Override
    protected final void a() {
        super.a();
        this.a = null;
    }

    @Override
    protected final void b() {
        dz<V> dz2 = this.a;
        if (dz2 != null) {
            dz2.e();
        }
    }
}

