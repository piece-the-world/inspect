/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.growingio.android.sdk.utils;

import android.os.Handler;
import android.os.Looper;

public class h {
    private static final Object b = new Object();
    private static boolean c = false;
    private static Handler d = null;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static Handler a() {
        Object object = b;
        synchronized (object) {
            if (d == null) {
                if (c) {
                    throw new RuntimeException("Did not yet override the UI thread");
                }
                d = new Handler(Looper.getMainLooper());
            }
            return d;
        }
    }

    public static void a(Runnable runnable) {
        h.a().post(runnable);
    }

    public static void a(Runnable runnable, long l2) {
        h.a().postDelayed(runnable, l2);
    }

    public static void b(Runnable runnable) {
        h.a().removeCallbacks(runnable);
    }
}

