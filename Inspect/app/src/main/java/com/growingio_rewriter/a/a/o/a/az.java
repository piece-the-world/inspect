/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.o.a.aw;
import java.util.concurrent.Callable;

final class az
implements Callable<T> {
    final /* synthetic */ bG a;
    final /* synthetic */ Callable b;

    az(bG bG2, Callable callable) {
        this.a = bG2;
        this.b = callable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public T call() throws Exception {
        Thread thread = Thread.currentThread();
        String string = thread.getName();
        boolean bl2 = aw.a((String)this.a.a(), thread);
        try {
            Object v2 = this.b.call();
            return (T)v2;
        }
        finally {
            if (bl2) {
                boolean bl3 = aw.a(string, thread);
            }
        }
    }
}

