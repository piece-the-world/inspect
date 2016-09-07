/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tendcloud.tenddata.fq;

final class fp {
    static final int a = 9999;
    static final int b = 101;
    static final int c = 102;
    private static Handler d = null;
    private static final HandlerThread e = new HandlerThread("ProcessingThread");

    fp() {
    }

    static final Handler a() {
        return d;
    }

    static {
        e.start();
        d = new fq(e.getLooper());
    }
}

