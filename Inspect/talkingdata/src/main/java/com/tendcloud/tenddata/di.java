/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.dh;

class di
implements Runnable {
    final /* synthetic */ dh a;

    di(dh dh2) {
        this.a = dh2;
    }

    @Override
    public void run() {
        dh.a(this.a);
    }
}

