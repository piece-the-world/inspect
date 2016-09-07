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
import com.tendcloud.tenddata.fh;

final class fg {
    static final int a = 9999;
    static final int b = 101;
    static final int c = 102;
    static final int d = 103;
    static final int e = 104;
    static final int f = 105;
    private static Handler g = null;
    private static final HandlerThread h = new HandlerThread("PushThreadProcess");

    fg() {
    }

    static final Handler a() {
        return g;
    }

    static {
        h.start();
        g = new fh(h.getLooper());
    }
}

