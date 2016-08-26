/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.aB;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bm;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class d<V, X extends Exception>
extends bm<V>
implements aB<V, X> {
    protected d(bU<V> bU2) {
        super(bU2);
    }

    protected abstract X a(Exception var1);

    @Override
    public V a() throws Exception {
        try {
            return this.get();
        }
        catch (InterruptedException var1_1) {
            Thread.currentThread().interrupt();
            throw this.a(var1_1);
        }
        catch (CancellationException var1_2) {
            throw this.a(var1_2);
        }
        catch (ExecutionException var1_3) {
            throw this.a(var1_3);
        }
    }

    @Override
    public V a(long l2, TimeUnit timeUnit) throws TimeoutException, Exception {
        try {
            return this.get(l2, timeUnit);
        }
        catch (InterruptedException var4_3) {
            Thread.currentThread().interrupt();
            throw this.a(var4_3);
        }
        catch (CancellationException var4_4) {
            throw this.a(var4_4);
        }
        catch (ExecutionException var4_5) {
            throw this.a(var4_5);
        }
    }
}

