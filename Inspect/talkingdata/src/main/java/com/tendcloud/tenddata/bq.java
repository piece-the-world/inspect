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
import com.apptalkingdata.push.service.PushService;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.br;

public class bq
implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ Intent b;
    final /* synthetic */ PushService c;

    public bq(PushService pushService, Context context, Intent intent) {
        this.c = pushService;
        this.a = context;
        this.b = intent;
    }

    @Override
    public void run() {
        try {
            br.a(this.a).initPushSDK(this.b);
        }
        catch (Throwable var1_1) {
            bh.b(PushService.a(), "start ping err " + var1_1.toString());
        }
    }
}

