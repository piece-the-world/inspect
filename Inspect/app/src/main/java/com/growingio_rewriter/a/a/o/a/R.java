/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.E;
import com.growingio.a.a.o.a.N;
import java.util.logging.Level;

class R
implements Runnable {
    final /* synthetic */ N a;

    R(N n2) {
        this.a = n2;
    }

    @Override
    public void run() {
        N.a(this.a).lock();
        try {
            if (N.b(this.a).isCancelled()) {
                return;
            }
            this.a.a.a();
        }
        catch (Throwable var1_1) {
            try {
                this.a.a.c();
            }
            catch (Exception var2_2) {
                E.n().log(Level.WARNING, "Error while attempting to shut down the service after failure.", var2_2);
            }
            this.a.a(var1_1);
            N.b(this.a).cancel(false);
        }
        finally {
            N.a(this.a).unlock();
        }
    }
}

