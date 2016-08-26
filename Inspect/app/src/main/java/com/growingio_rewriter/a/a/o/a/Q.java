/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.E;
import com.growingio.a.a.o.a.N;
import com.growingio.a.a.o.a.cG;

class Q
implements Runnable {
    final /* synthetic */ N a;

    Q(N n2) {
        this.a = n2;
    }

    @Override
    public void run() {
        try {
            N.a(this.a).lock();
            try {
                if (this.a.g() != cG.d) {
                    return;
                }
                this.a.a.c();
            }
            finally {
                N.a(this.a).unlock();
            }
            this.a.d();
        }
        catch (Throwable var1_2) {
            this.a.a(var1_2);
        }
    }
}

