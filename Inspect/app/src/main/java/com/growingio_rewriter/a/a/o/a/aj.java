/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.ai;
import com.growingio.a.a.o.a.bU;

class aj
implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bU b;
    final /* synthetic */ ai c;

    aj(ai ai2, int n2, bU bU2) {
        this.c = ai2;
        this.a = n2;
        this.b = bU2;
    }

    @Override
    public void run() {
        try {
            ai.a(this.c, this.a, this.b);
        }
        finally {
            ai.c(this.c);
        }
    }
}

