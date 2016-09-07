/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.IBinder
 */
package com.apptalkingdata.push.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class LocalService
extends Service {
    private final IBinder a;

    public LocalService() {
        this.a = new a();
    }

    public IBinder onBind(Intent intent) {
        return this.a;
    }

    public int onStartCommand(Intent intent, int n2, int n3) {
        return 1;
    }

    public class a
    extends Binder {
        LocalService a() {
            return LocalService.this;
        }
    }

}

