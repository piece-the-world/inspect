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
import com.tendcloud.tenddata.ea;

final class dz {
    static final int a = 9999;
    static final int b = 101;
    static final int c = 102;
    static final int d = 103;
    private static Handler e = null;
    private static final HandlerThread f = new HandlerThread("ProcessingThread");

    dz() {
    }

    static final Handler a() {
        return e;
    }

    static {
        f.start();
        e = new ea(f.getLooper());
    }
}

