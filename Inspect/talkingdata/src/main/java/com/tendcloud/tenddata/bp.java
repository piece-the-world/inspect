/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.apptalkingdata.push.service.PushService;
import com.tendcloud.tenddata.bw;
import com.tendcloud.tenddata.dg;

public class bp
extends Thread {
    final /* synthetic */ Context a;
    final /* synthetic */ PushService b;

    public bp(PushService pushService, Context context) {
        this.b = pushService;
        this.a = context;
    }

    @Override
    public void run() {
        try {
            bp.sleep(5000);
            dg.a(this.a, bw.c(this.a), bw.g(this.a));
        }
        catch (Exception var1_1) {
            var1_1.printStackTrace();
        }
    }
}

