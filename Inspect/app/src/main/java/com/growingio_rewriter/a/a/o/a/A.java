/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.x;
import com.growingio.a.a.o.a.z;

class A
implements Runnable {
    final /* synthetic */ z a;

    A(z z2) {
        this.a = z2;
    }

    @Override
    public void run() {
        try {
            this.a.a.a();
            this.a.c();
        }
        catch (Throwable var1_1) {
            this.a.a(var1_1);
        }
    }
}

