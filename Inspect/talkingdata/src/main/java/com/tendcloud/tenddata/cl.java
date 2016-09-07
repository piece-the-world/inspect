/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.ag;
import com.tendcloud.tenddata.u;

class cl
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ag b;

    cl(ag ag2, String string) {
        this.b = ag2;
        this.a = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        try {
            u u2 = ag.a(this.b, this.a);
            if (!this.b.l) {
                this.b.a = u2;
                ag ag2 = this.b;
                synchronized (ag2) {
                    this.b.notifyAll();
                }
            }
            Thread.sleep(3000);
            if (this.b.a.b()) {
                ag.a(this.b, this.b.a);
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }
}

