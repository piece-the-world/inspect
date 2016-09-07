/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.Intent;
import com.tendcloud.tenddata.br;
import com.tendcloud.tenddata.bw;
import com.tendcloud.tenddata.bz;

class bs
implements bz.a {
    final /* synthetic */ Context a;
    final /* synthetic */ br b;

    bs(br br2, Context context) {
        this.b = br2;
        this.a = context;
    }

    @Override
    public void onMsg(Intent intent) {
        bw.b(this.a, intent.getPackage());
        this.a.sendBroadcast(intent);
    }
}

