/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.bw;

static final class bx
implements Runnable {
    final /* synthetic */ Context a;

    bx(Context context) {
        this.a = context;
    }

    @Override
    public void run() {
        bw.h(this.a);
        bw.i(this.a);
        bw.j(this.a);
    }
}

