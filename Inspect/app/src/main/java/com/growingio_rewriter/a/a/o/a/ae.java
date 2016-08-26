/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.af;
import com.growingio.a.a.o.a.ag;
import com.growingio.a.a.o.a.aq;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bp;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.t;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

abstract class ae<I, O, F, T>
extends t<O>
implements Runnable {
    bU<? extends I> a;
    F b;

    static <I, O> bU<O> a(bU<I> bU2, aq<? super I, ? extends O> aq2) {
        af<? super I, ? extends O> af2 = new af<I, O>(bU2, aq2);
        bU2.a(af2, cd.c());
        return af2;
    }

    static <I, O> bU<O> a(bU<I> bU2, aq<? super I, ? extends O> aq2, Executor executor) {
        aU.a(executor);
        af<? super I, ? extends O> af2 = new af<I, O>(bU2, aq2);
        bU2.a(af2, cd.a(executor, af2));
        return af2;
    }

    static <I, O> bU<O> a(bU<I> bU2, com.growingio.a.a.b.aq<? super I, ? extends O> aq2) {
        aU.a(aq2);
        ag<? super I, ? extends O> ag2 = new ag<I, O>(bU2, aq2);
        bU2.a(ag2, cd.c());
        return ag2;
    }

    static <I, O> bU<O> a(bU<I> bU2, com.growingio.a.a.b.aq<? super I, ? extends O> aq2, Executor executor) {
        aU.a(aq2);
        ag<? super I, ? extends O> ag2 = new ag<I, O>(bU2, aq2);
        bU2.a(ag2, cd.a(executor, ag2));
        return ag2;
    }

    ae(bU<? extends I> bU2, F f2) {
        this.a = aU.a(bU2);
        this.b = aU.a(f2);
    }

    @Override
    public final void run() {
        T t2;
        I i2;
        bU<? extends I> bU2 = this.a;
        F f2 = this.b;
        if (this.isCancelled() | bU2 == null | f2 == null) {
            return;
        }
        this.a = null;
        this.b = null;
        try {
            i2 = bp.a(bU2);
        }
        catch (CancellationException var4_4) {
            this.cancel(false);
            return;
        }
        catch (ExecutionException var4_5) {
            this.a(var4_5.getCause());
            return;
        }
        catch (RuntimeException var4_6) {
            this.a(var4_6);
            return;
        }
        catch (Error var4_7) {
            this.a(var4_7);
            return;
        }
        try {
            t2 = this.a(f2, i2);
        }
        catch (UndeclaredThrowableException var5_9) {
            this.a(var5_9.getCause());
            return;
        }
        catch (Throwable var5_10) {
            this.a(var5_10);
            return;
        }
        this.a(t2);
    }

    abstract T a(F var1, I var2) throws Exception;

    abstract void a(T var1);

    @Override
    protected final void a() {
        this.a(this.a);
        this.a = null;
        this.b = null;
    }
}

