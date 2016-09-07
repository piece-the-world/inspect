/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.SharedPreferences;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cb;
import com.tendcloud.tenddata.cm;

class ee {
    static final String a = "TDpref.profile.key";
    static final String b = "TDpref.session.key";
    static final String c = "TDpref.lastactivity.key";
    static final String d = "TDpref.start.key";
    static final String e = "TDpref.init.key";
    static final String f = "TDpref.actstart.key";
    static final String g = "TDpref.end.key";
    static final String h = "TDpref.ip";
    static final String i = "TD_CHANNEL_ID";
    static final String j = "TDpref_longtime";
    static final String k = "TDpref_shorttime";
    static final String l = "TDaes_key";
    static final String m = "TDisAppQuiting";
    static final String n = "TDpref.last.sdk.check";
    static final String o = "TDadditionalVersionName";
    static final String p = "TDadditionalVersionCode";
    static final String q = "TDcs";
    static final String r = "TDpref.apps_send_time.key";
    static final String s = "TDtime_gap";

    ee() {
    }

    static String a() {
        if (ab.mContext == null) {
            return null;
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDaes_key", null);
    }

    static void a(String string) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDaes_key", string);
    }

    static String b() {
        if (ab.mContext == null) {
            return null;
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDpref.session.key", null);
    }

    static void b(String string) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDpref.session.key", string);
    }

    static void c() {
        if (ab.mContext == null) {
            return;
        }
        SharedPreferences sharedPreferences = ab.mContext.getSharedPreferences("TD_CHANNEL_ID", 0);
        sharedPreferences.edit().putBoolean("location_called", true).commit();
    }

    static boolean d() {
        if (ab.mContext == null) {
            return false;
        }
        SharedPreferences sharedPreferences = ab.mContext.getSharedPreferences("TD_CHANNEL_ID", 0);
        return sharedPreferences.getBoolean("location_called", false);
    }

    static void c(String string) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_shorttime", "TDpref.lastactivity.key", string);
    }

    static String e() {
        if (ab.mContext == null) {
            return "";
        }
        return cm.b(ab.mContext, "TDpref_shorttime", "TDpref.lastactivity.key", "");
    }

    static long f() {
        if (ab.mContext == null) {
            return 0;
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDpref.start.key", 0);
    }

    static void a(long l2) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDpref.start.key", l2);
    }

    static void b(long l2) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDpref.init.key", l2);
    }

    static long g() {
        if (ab.mContext == null) {
            return 0;
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDpref.init.key", 0);
    }

    static void c(long l2) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_shorttime", "TDpref.actstart.key", l2);
    }

    static long h() {
        if (ab.mContext == null) {
            return 0;
        }
        return cm.b(ab.mContext, "TDpref_shorttime", "TDpref.end.key", 0);
    }

    static void d(long l2) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_shorttime", "TDpref.end.key", l2);
    }

    static void a(boolean bl2) {
        cm.a(ab.mContext, "TDpref_longtime", "TDpref.profile.key", bl2 ? 1 : 0);
    }

    static void d(String string) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDisAppQuiting", string);
    }

    static String i() {
        if (ab.mContext == null) {
            return "-1";
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDisAppQuiting", "-1");
    }

    static void e(String string) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDadditionalVersionName", string);
    }

    static String j() {
        if (ab.mContext == null) {
            return null;
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDadditionalVersionName", null);
    }

    static void e(long l2) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDadditionalVersionCode", l2);
    }

    static long k() {
        if (ab.mContext == null) {
            return -1;
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDadditionalVersionCode", -1);
    }

    static void f(String string) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDcs", string);
    }

    static String l() {
        if (ab.mContext == null) {
            return null;
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDcs", null);
    }

    static void f(long l2) {
        if (ab.mContext == null) {
            return;
        }
        cm.a(ab.mContext, "TDpref_longtime", "TDtime_gap", l2);
    }

    static long m() {
        if (ab.mContext == null) {
            return 0;
        }
        return cm.b(ab.mContext, "TDpref_longtime", "TDtime_gap", 0);
    }

    static int n() {
        try {
            if (ee.k() != -1) {
                return Integer.parseInt(String.valueOf(ee.k()));
            }
            return cb.a().b(ab.mContext);
        }
        catch (Throwable var0) {
            return -1;
        }
    }

    static String o() {
        try {
            if (ee.j() != null) {
                return ee.j();
            }
            return cb.a().c(ab.mContext);
        }
        catch (Throwable var0) {
            return "unknown";
        }
    }
}

