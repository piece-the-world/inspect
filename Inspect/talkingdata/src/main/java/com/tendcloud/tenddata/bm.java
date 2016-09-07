/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.bd;

static final class bm
implements Runnable {
    final /* synthetic */ Context a;

    bm(Context context) {
        this.a = context;
    }

    @Override
    public void run() {
        bd.a(this.a);
    }
}

