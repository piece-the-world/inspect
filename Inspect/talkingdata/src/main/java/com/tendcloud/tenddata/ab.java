/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.gf;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.TreeMap;

public class ab {
    static final Map a = new TreeMap();
    static boolean b = false;
    public static Context mContext = null;
    static Handler c = null;
    static final int d = 1;
    static final String e = "Android+";
    static FileChannel f;
    static long g;
    static boolean h;
    static boolean i;
    static boolean j;
    static final String k = "+V2.2.37 gp";
    static final String l = "TD";
    static final String m = "TDLog";
    static String n;
    static final String o = "TD_app_pefercen_profile";
    static final String p = "TD_appId";
    static final String q = "TD_analytics_appId";
    static final String r = "TD_game_appId";
    static final String s = "TD_tracking_appId";
    static final String t = "TD_channelId";
    static final String u = "isDeveloper";
    static final String v = "TDOVC+fcb19f63dae5c9829c34b04d144bdd99+TalkingData";
    static String w;
    static final String x = "Android+TD+V2.2.37 gp";
    static long y;
    static final int z = 120000;
    static long A;
    static final int B = 100;
    static final String C = "TD_APP_ID";
    static final String D = "TD_CHANNEL_ID";

    static String a(Context context) {
        if (cs.b(n) && context != null) {
            n = cm.b(context, "TD_app_pefercen_profile", "TD_appId", "");
        }
        return n;
    }

    public static String getPartnerId(Context context) {
        if (cs.b(w) || w.equals("Default")) {
            w = cm.b(context, "TD_app_pefercen_profile", "TD_channelId", "");
        }
        return w;
    }

    static void a(String string, String string2) {
        if (mContext != null) {
            c = new Handler(mContext.getMainLooper());
        }
        if (string != null && !string.trim().isEmpty() && string.contains("-")) {
            String string3 = null;
            try {
                string3 = string.split("-")[1];
            }
            catch (Throwable var3_3) {
                // empty catch block
            }
            n = string3;
        } else {
            n = string;
        }
        if (string2 != null && !string2.trim().isEmpty()) {
            w = string2;
        }
        cs.execute(new gf());
    }

    public static void setChannelId(String string) {
        cm.a(mContext, "TD_app_pefercen_profile", "TD_channelId", string);
    }

    public static void setAppAnalyticsAppId(String string) {
        cm.a(mContext, "TD_app_pefercen_profile", "TD_analytics_appId", string);
    }

    public static String getAppAnalyticsAppId() {
        return cm.b(mContext, "TD_app_pefercen_profile", "TD_analytics_appId", null);
    }

    public static void setGameAnalyticsAppId(String string) {
        cm.a(mContext, "TD_app_pefercen_profile", "TD_game_appId", string);
    }

    public static String getGameAnalyticsAppId() {
        return cm.b(mContext, "TD_app_pefercen_profile", "TD_game_appId", null);
    }

    public static void setAdTrackingAppId(String string) {
        cm.a(mContext, "TD_app_pefercen_profile", "TD_tracking_appId", string);
    }

    public static String getAdTrackingAppId() {
        return cm.b(mContext, "TD_app_pefercen_profile", "TD_tracking_appId", null);
    }

    public static String getChannelId() {
        return cm.b(mContext, "TD_app_pefercen_profile", "TD_channelId", null);
    }

    static void a(boolean bl2) {
        try {
            cm.a(mContext, "TD_app_pefercen_profile", "isDeveloper", bl2 ? 1 : 0);
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
    }

    static boolean a() {
        try {
            long l2 = cm.b(mContext, "TD_app_pefercen_profile", "isDeveloper", 0);
            return l2 != 0;
        }
        catch (Throwable var0_1) {
            return false;
        }
    }

    static {
        g = 0;
        h = false;
        i = true;
        j = true;
        n = "";
        w = "Default";
        A = 30000;
    }

    static class b {
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        static final int d = 4;
        static final int e = 5;
        static final int f = 6;
        static final int g = 7;

        b() {
        }
    }

    class c {
        static final int a = 1;
        static final int b = 2;
        static final int c = 3;
        static final int d = -1;

        c() {
        }
    }

    class a {
        static final int a = 1;
        static final int b = 2;

        a() {
        }
    }

}

