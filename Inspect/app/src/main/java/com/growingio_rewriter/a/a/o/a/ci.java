/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cj;
import com.growingio.a.a.o.a.j;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class ci
implements Executor {
    volatile boolean a;
    final /* synthetic */ Executor b;
    final /* synthetic */ j c;

    ci(Executor executor, j j2) {
        this.b = executor;
        this.c = j2;
        this.a = true;
    }

    @Override
    public void execute(Runnable runnable) {
        block2 : {
            try {
                this.b.execute(new cj(this, runnable));
            }
            catch (RejectedExecutionException var2_2) {
                if (!this.a) break block2;
                this.c.a(var2_2);
            }
        }
    }
}

