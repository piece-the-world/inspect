/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.tendcloud.tenddata;

import android.content.Context;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bl;
import com.tendcloud.tenddata.bw;

public class bn {
    private static String a = bn.class.getName();
    private static Context b;

    public static void startPushService(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("[mpush] start service error, context is required");
        }
        b = context.getApplicationContext();
        bl.start(b);
    }

    public static void setDebugMode(boolean bl2) {
        bl.a(b, bl2);
    }

    public static String a(Context context) {
        try {
            return bw.c(context);
        }
        catch (Throwable var1_1) {
            bh.a(a, "get app id err ", var1_1);
            return null;
        }
    }

    public static String b(Context context) {
        try {
            return bw.b(context);
        }
        catch (Throwable var1_1) {
            bh.a(a, "get gateway err ", var1_1);
            return null;
        }
    }
}

