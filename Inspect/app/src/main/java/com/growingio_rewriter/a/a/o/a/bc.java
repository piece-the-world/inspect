/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.bd;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class bc {
    private static final Logger a = Logger.getLogger(bc.class.getName());
    private bd b;
    private boolean c;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(Runnable runnable, Executor executor) {
        aU.a(runnable, (Object)"Runnable was null.");
        aU.a(executor, (Object)"Executor was null.");
        bc bc2 = this;
        synchronized (bc2) {
            if (!this.c) {
                this.b = new bd(runnable, executor, this.b);
                return;
            }
        }
        bc.b(runnable, executor);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        bd bd2;
        Object object = this;
        synchronized (object) {
            if (this.c) {
                return;
            }
            this.c = true;
            bd2 = this.b;
            this.b = null;
        }
        object = null;
        while (bd2 != null) {
            bd bd3 = bd2;
            bd2 = bd2.c;
            bd3.c = object;
            object = bd3;
        }
        while (object != null) {
            bc.b(object.a, object.b);
            object = object.c;
        }
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        }
        catch (RuntimeException var2_2) {
            a.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, var2_2);
        }
    }
}

