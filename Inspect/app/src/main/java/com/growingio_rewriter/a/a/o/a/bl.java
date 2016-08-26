/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bj;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public abstract class bl<V>
extends bj<V>
implements bU<V> {
    protected bl() {
    }

    protected abstract bU<V> d();

    @Override
    public void a(Runnable runnable, Executor executor) {
        this.d().a(runnable, executor);
    }

    @Override
    protected /* synthetic */ Future c() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.d();
    }
}

