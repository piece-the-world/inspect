/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.bh;

static final class bc
implements Runnable {
    final /* synthetic */ Runnable a;

    bc(Runnable runnable) {
        this.a = runnable;
    }

    @Override
    public void run() {
        try {
            this.a.run();
        }
        catch (Throwable var1_1) {
            bh.a("Executor submitExecutor", var1_1.getMessage(), var1_1);
        }
    }
}

