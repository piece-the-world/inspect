/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.bw;

class bx
implements Runnable {
    final /* synthetic */ bU a;
    final /* synthetic */ bw b;

    bx(bw bw2, bU bU2) {
        this.b = bw2;
        this.a = bU2;
    }

    @Override
    public void run() {
        this.b.b(this.a);
    }
}

