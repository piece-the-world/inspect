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
    public static void d(String string, String string2) {
        if (GConfig.a) {
            Log.d((String)string, (String)string2);
        }
    }

    public static void d(String string, String string2, Throwable throwable) {
        if (GConfig.a) {
            Log.d((String)string, (String)string2, (Throwable)throwable);
        }
    }

    public static void v(String string, String string2) {
        if (GConfig.a) {
            Log.v((String)string, (String)string2);
        }
    }

    public static void i(String string, String string2) {
        if (GConfig.a) {
            Log.i((String)string, (String)string2);
        }
    }

    public static void e(String string, String string2) {
        if (GConfig.a) {
            Log.e((String)string, (String)string2);
        }
    }

    public static void d(Exception exception) {
        if (GConfig.a) {
            exception.printStackTrace();
        }
    }
}

