/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.os.Vibrator
 */
package com.tendcloud.tenddata;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Vibrator;
import com.tendcloud.tenddata.co;
import com.tendcloud.tenddata.cs;

class cq
implements SensorEventListener {
    private int b;
    final /* synthetic */ co a;

    cq(co co2) {
        this.a = co2;
        this.b = 0;
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        try {
            long l2 = System.currentTimeMillis();
            int n2 = sensorEvent.sensor.getType();
            if (l2 - co.c(this.a) <= 250 || n2 != 1) {
                return;
            }
            co.a(this.a, l2);
            float[] arrf = sensorEvent.values;
            if (Math.abs(arrf[0]) > 18.0f || Math.abs(arrf[1]) > 18.0f || Math.abs(arrf[2]) > 18.0f) {
                ++this.b;
            }
            if (this.b >= 5) {
                if (co.d(this.a) != null) {
                    if (cs.b(co.e(this.a), "android.permission.VIBRATE")) {
                        Vibrator vibrator = (Vibrator)co.e(this.a).getSystemService("vibrator");
                        vibrator.vibrate(100);
                    }
                    co.d(this.a).a();
                    if (co.a(this.a) != null) {
                        co.a(this.a).unregisterListener(co.b(this.a));
                    }
                }
                this.b = 0;
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    public void onAccuracyChanged(Sensor sensor, int n2) {
    }
}

