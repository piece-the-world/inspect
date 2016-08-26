/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.o.a.aw;
import java.util.concurrent.Executor;

final class cf
implements Executor {
    final /* synthetic */ Executor a;
    final /* synthetic */ bG b;

    cf(Executor executor, bG bG2) {
        this.a = executor;
        this.b = bG2;
    }

    @Override
    public void execute(Runnable runnable) {
        this.a.execute(aw.a(runnable, this.b));
    }
}

