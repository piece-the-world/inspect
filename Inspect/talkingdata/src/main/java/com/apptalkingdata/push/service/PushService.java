/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.Handler
 *  android.os.IBinder
 */
package com.apptalkingdata.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.tendcloud.tenddata.ba;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bp;
import com.tendcloud.tenddata.bq;
import com.tendcloud.tenddata.br;

public final class PushService
extends Service {
    private static String a = PushService.class.getName();
    private Handler b = new Handler();
    private final IBinder c;

    public PushService() {
        this.c = new a();
    }

    public IBinder onBind(Intent intent) {
        return this.c;
    }

    public void onCreate() {
        super.onCreate();
        Context context = this.getApplicationContext();
        new bp(this, context).start();
        try {
            ba.commonInit(context);
            br.a(context).initPushSDK(null);
        }
        catch (Throwable var2_2) {
            bh.b(a, "create service err" + var2_2.toString());
        }
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        bh.a(a, "-- onStartCommand -- " + (Object)intent);
        Context context = this.getApplicationContext();
        bq bq2 = new bq(this, context, intent);
        try {
            if (br.a(context).a()) {
                this.b.postDelayed((Runnable)bq2, 1500);
            } else {
                bq2.run();
            }
        }
        catch (Throwable var6_6) {
            bh.b(a, "start command err " + var6_6.toString());
        }
        try {
            br.a(context).b();
        }
        catch (Throwable var6_7) {
            bh.b(a, "start td push err " + var6_7.toString());
        }
        return 1;
    }

    public void onDestroy() {
        bh.a(a, "onDestroy");
        br.a(this.getApplicationContext()).c();
        Intent intent = new Intent("android.intent.action.CMD");
        intent.putExtra("service-cmd", "service-relive");
        this.sendBroadcast(intent);
        super.onDestroy();
    }

    public static /* synthetic */ String a() {
        return a;
    }

    public class a
    extends Binder {
        PushService a() {
            return PushService.this;
        }
    }

}

