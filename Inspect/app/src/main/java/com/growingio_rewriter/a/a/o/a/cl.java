/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.ck;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class cl
implements Runnable {
    final /* synthetic */ ExecutorService a;
    final /* synthetic */ long b;
    final /* synthetic */ TimeUnit c;
    final /* synthetic */ ck d;

    cl(ck ck2, ExecutorService executorService, long l2, TimeUnit timeUnit) {
        this.d = ck2;
        this.a = executorService;
        this.b = l2;
        this.c = timeUnit;
    }

    @Override
    public void run() {
        try {
            this.a.shutdown();
            this.a.awaitTermination(this.b, this.c);
        }
        catch (InterruptedException var1_1) {
            // empty catch block
        }
    }
}

