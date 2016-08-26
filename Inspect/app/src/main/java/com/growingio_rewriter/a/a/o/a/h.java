/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.e;
import com.growingio.a.a.o.a.f;
import java.util.logging.Level;

class h
implements Runnable {
    final /* synthetic */ f a;

    h(f f2) {
        this.a = f2;
    }

    @Override
    public void run() {
        try {
            this.a.a.a();
            this.a.c();
            if (this.a.f()) {
                try {
                    this.a.a.b();
                }
                catch (Throwable var1_1) {
                    try {
                        this.a.a.c();
                    }
                    catch (Exception var2_3) {
                        e.n().log(Level.WARNING, "Error while attempting to shut down the service after failure.", var2_3);
                    }
                    this.a.a(var1_1);
                    return;
                }
            }
            this.a.a.c();
            this.a.d();
        }
        catch (Throwable var1_2) {
            this.a.a(var1_2);
        }
    }
}

