/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bc;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class bV<V>
extends FutureTask<V>
implements bU<V> {
    private final bc a = new bc();

    public static <V> bV<V> a(Callable<V> callable) {
        return new bV<V>(callable);
    }

    public static <V> bV<V> a(Runnable runnable, V v2) {
        return new bV<V>(runnable, v2);
    }

    bV(Callable<V> callable) {
        super(callable);
    }

    bV(Runnable runnable, V v2) {
        super(runnable, v2);
    }

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    @Override
    protected void done() {
        this.a.a();
    }
}

