/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.o.a.aG;
import com.growingio.a.a.o.a.ap;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bq;
import com.growingio.a.a.o.a.cd;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class bu<V> {
    private final boolean a;
    private final ea<bU<? extends V>> b;

    private bu(boolean bl2, ea<bU<? extends V>> ea2) {
        this.a = bl2;
        this.b = ea2;
    }

    public <C> bU<C> a(ap<C> ap2, Executor executor) {
        return new aG<C>(this.b, this.a, executor, ap2);
    }

    public <C> bU<C> a(ap<C> ap2) {
        return this.a(ap2, cd.c());
    }

    public <C> bU<C> a(Callable<C> callable, Executor executor) {
        return new aG<C>(this.b, this.a, executor, callable);
    }

    public <C> bU<C> a(Callable<C> callable) {
        return this.a(callable, cd.c());
    }

    /* synthetic */ bu(boolean bl2, ea ea2, bq bq2) {
        this(bl2, ea2);
    }
}

