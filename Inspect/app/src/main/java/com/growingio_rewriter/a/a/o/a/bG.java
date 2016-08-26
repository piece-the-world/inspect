/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bU;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class bG<V>
implements bU<V> {
    private static final Logger a = Logger.getLogger(bG.class.getName());

    bG() {
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        aU.a(runnable, (Object)"Runnable was null.");
        aU.a(executor, (Object)"Executor was null.");
        try {
            executor.execute(runnable);
        }
        catch (RuntimeException var3_3) {
            a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, var3_3);
        }
    }

    @Override
    public boolean cancel(boolean bl2) {
        return false;
    }

    @Override
    public abstract V get() throws ExecutionException;

    @Override
    public V get(long l2, TimeUnit timeUnit) throws ExecutionException {
        aU.a(timeUnit);
        return this.get();
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }
}

