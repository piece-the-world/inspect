/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.eu;

class ev
implements Runnable {
    final /* synthetic */ eu a;

    ev(eu eu2) {
        this.a = eu2;
    }

    @Override
    public void run() {
        if (eu.a(this.a)) {
            eu.b(this.a);
        }
    }
}

