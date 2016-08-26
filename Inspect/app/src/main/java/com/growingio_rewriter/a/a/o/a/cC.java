/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cA;
import com.growingio.a.a.o.a.cB;
import java.util.logging.Level;

final class cC
implements Runnable {
    final /* synthetic */ cA a;

    private cC(cA cA2) {
        this.a = cA2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            this.a();
        }
        catch (Error var1_1) {
            Object object = cA.a(this.a);
            synchronized (object) {
                cA.a(this.a, false);
            }
            throw var1_1;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a() {
        do {
            Runnable runnable = null;
            Object object = cA.a(this.a);
            synchronized (object) {
                if (cA.b(this.a) == 0) {
                    runnable = (Runnable)cA.c(this.a).poll();
                }
                if (runnable == null) {
                    cA.a(this.a, false);
                    return;
                }
            }
            try {
                runnable.run();
                continue;
            }
            catch (RuntimeException var2_3) {
                cA.c().log(Level.SEVERE, "Exception while executing runnable " + runnable, var2_3);
                continue;
            }
            break;
        } while (true);
    }

    /* synthetic */ cC(cA cA2, cB cB2) {
        this(cA2);
    }
}

