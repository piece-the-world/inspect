/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.HandlerThread
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.HandlerThread;
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.ce;
import com.tendcloud.tenddata.cs;

public class dg {
    public static Context a;
    public static String b;
    public static String c;
    public static final String d = "app";
    static HandlerThread e;

    public static void init(Context context) {
        try {
            String string = "";
            string = ab.getAppAnalyticsAppId();
            if (!cs.b(string)) {
                TCAgent.init(context, string, ab.getChannelId());
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    public static void a(Context context, String string) {
        b = string;
        dg.init(context);
    }

    public static void a(Context context, String string, String string2) {
        c = string2;
        dg.a(context, string);
    }

    public static String a(Context context) {
        return ce.a(context);
    }

    public static String b(Context context) {
        return ab.getPartnerId(context);
    }

    static {
        b = null;
        c = null;
        e = new HandlerThread("TalkingDataMain");
        e.start();
    }
}

