/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.bP;
import com.growingio.a.a.o.a.dG;
import java.util.concurrent.Callable;

class dH
implements Runnable {
    final /* synthetic */ Callable a;
    final /* synthetic */ dG b;

    dH(dG dG2, Callable callable) {
        this.b = dG2;
        this.a = callable;
    }

    @Override
    public void run() {
        try {
            this.a.call();
        }
        catch (Exception var1_1) {
            bP.a(var1_1);
            throw new RuntimeException(var1_1);
        }
    }
}

