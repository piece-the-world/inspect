/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.ci;

class cj
implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ci b;

    cj(ci ci2, Runnable runnable) {
        this.b = ci2;
        this.a = runnable;
    }

    @Override
    public void run() {
        this.b.a = false;
        this.a.run();
    }
}

