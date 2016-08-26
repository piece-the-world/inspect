/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bP;
import com.growingio.a.a.o.a.j;

final class cr
extends j<Void>
implements Runnable {
    private final Runnable a;

    public cr(Runnable runnable) {
        this.a = aU.a(runnable);
    }

    @Override
    public void run() {
        try {
            this.a.run();
        }
        catch (Throwable var1_1) {
            this.a(var1_1);
            throw bP.c(var1_1);
        }
    }
}

