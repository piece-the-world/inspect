/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.o.a.aw;
import com.growingio.a.a.o.a.dG;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

final class cg
extends dG {
    final /* synthetic */ bG a;

    cg(ExecutorService executorService, bG bG2) {
        this.a = bG2;
        super(executorService);
    }

    @Override
    protected <T> Callable<T> a(Callable<T> callable) {
        return aw.a(callable, this.a);
    }

    @Override
    protected Runnable a(Runnable runnable) {
        return aw.a(runnable, this.a);
    }
}

