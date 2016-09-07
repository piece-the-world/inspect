/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.hardware.SensorEventListener
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.tendcloud.tenddata;

import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tendcloud.tenddata.co;

class cp
extends Handler {
    final /* synthetic */ co a;

    cp(co co2, Looper looper) {
        this.a = co2;
        super(looper);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        switch (message.what) {
            case 10: {
                if (co.a(this.a) == null) break;
                co.a(this.a).unregisterListener(co.b(this.a));
            }
        }
    }
}

