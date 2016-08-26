/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.bS;
import com.growingio.a.a.o.a.dF;

class bT
implements Runnable {
    final /* synthetic */ bS a;

    bT(bS bS2) {
        this.a = bS2;
    }

    @Override
    public void run() {
        try {
            dF.a(bS.a(this.a));
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        bS.b(this.a).a();
    }
}

