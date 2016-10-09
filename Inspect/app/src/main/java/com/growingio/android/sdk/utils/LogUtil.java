/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.growingio.android.sdk.utils;

import android.util.Log;
import com.growingio.android.sdk.collection.GConfig;

public class LogUtil {
    public static /* varargs */ void d(String tag, Object ... messages) {
        if (GConfig.DEBUG) {
            String string = "";
            for (Object object : messages) {
                string = string + object;
            }
            Log.d((String)tag, (String)string);
        }
    }

    public static void d(String tag, String message, Throwable e2) {
        if (GConfig.DEBUG) {
            Log.d((String)tag, (String)message, (Throwable)e2);
        }
    }

    public static void v(String tag, String message) {
        if (GConfig.DEBUG) {
            Log.v((String)tag, (String)message);
        }
    }

    public static void i(String tag, String message) {
        if (GConfig.DEBUG) {
            Log.i((String)tag, (String)message);
        }
    }

    public static void e(String tag, String message) {
        if (GConfig.DEBUG) {
            Log.e((String)tag, (String)message);
        }
    }

    public static void d(Throwable e2) {
        if (GConfig.DEBUG) {
            e2.printStackTrace();
        }
    }
}

