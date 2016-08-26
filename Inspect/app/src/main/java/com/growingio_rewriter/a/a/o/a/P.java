/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.E;
import com.growingio.a.a.o.a.K;
import com.growingio.a.a.o.a.N;
import com.growingio.a.a.o.a.S;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

class P
implements Runnable {
    final /* synthetic */ N a;

    P(N n2) {
        this.a = n2;
    }

    @Override
    public void run() {
        N.a(this.a).lock();
        try {
            this.a.a.b();
            N.a(this.a, this.a.a.d().a(E.a(this.a.a), N.c(this.a), N.d(this.a)));
            this.a.c();
        }
        catch (Throwable var1_1) {
            this.a.a(var1_1);
            if (N.b(this.a) != null) {
                N.b(this.a).cancel(false);
            }
        }
        finally {
            N.a(this.a).unlock();
        }
    }
}

