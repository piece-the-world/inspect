/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.os.Handler
 *  android.os.Looper
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import com.tendcloud.tenddata.cp;
import com.tendcloud.tenddata.cq;

public class co {
    private Context a = null;
    private static volatile co b = null;
    private final int c = 250;
    private final int d = 18;
    private long e = 0;
    private final int f = 5;
    private static final long g = 10000;
    private static final int h = 10;
    private SensorManager i;
    private a j = null;
    private Handler k;
    private SensorEventListener l;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static co a(Context context) {
        if (b != null) return b;
        reference var1_1 = co.class;
        synchronized (co.class) {
            if (b != null) return b;
            {
                b = new co(context);
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return b;
        }
    }

    private co(Context context) {
        this.k = new cp(this, Looper.getMainLooper());
        this.l = new cq(this);
        try {
            this.a = context;
            this.i = (SensorManager)context.getSystemService("sensor");
            this.i.registerListener(this.l, this.i.getDefaultSensor(1), 1);
            this.k.sendEmptyMessageDelayed(10, 10000);
        }
        catch (Throwable var2_2) {
            // empty catch block
        }
    }

    public void registerTestDeviceListener(a a2) {
        this.j = a2;
    }

    static /* synthetic */ SensorManager a(co co2) {
        return co2.i;
    }

    static /* synthetic */ SensorEventListener b(co co2) {
        return co2.l;
    }

    static /* synthetic */ long c(co co2) {
        return co2.e;
    }

    static /* synthetic */ long a(co co2, long l2) {
        co2.e = l2;
        return co2.e;
    }

    static /* synthetic */ a d(co co2) {
        return co2.j;
    }

    static /* synthetic */ Context e(co co2) {
        return co2.a;
    }

    public static interface a {
        public void a();
    }

}

