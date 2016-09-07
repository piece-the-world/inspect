/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.bz;

class ca
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bz b;

    ca(bz bz2, String string) {
        this.b = bz2;
        this.a = string;
    }

    @Override
    public void run() {
        bz.a(this.b, this.a);
    }
}

