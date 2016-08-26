/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bG;
import com.growingio.a.a.o.a.aw;

final class aA
implements Runnable {
    final /* synthetic */ bG a;
    final /* synthetic */ Runnable b;

    aA(bG bG2, Runnable runnable) {
        this.a = bG2;
        this.b = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String string = thread.getName();
        boolean bl2 = aw.a((String)this.a.a(), thread);
        try {
            this.b.run();
        }
        finally {
            if (bl2) {
                boolean bl3 = aw.a(string, thread);
            }
        }
    }
}

