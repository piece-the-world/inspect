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
import com.tendcloud.tenddata.ci;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.fc;
import java.util.ArrayList;
import java.util.List;

final class fi {
    private static final String h = "LAST_SENT_PUSH_TIME";
    private static final String i = "appcontext_push";
    static ci a;
    static String b;
    static String c;
    static byte[] d;
    static final String e = "TD_app_pref_file";
    static final String f = "pref.accountid.key";
    static SharedPreferences g;

    fi() {
    }

    static synchronized boolean a(String string) {
        if (string == null || string.length() <= 0) {
            return false;
        }
        try {
            byte[] arrby = cs.b(string.getBytes(), d);
            a.write(arrby);
            a.b();
            return true;
        }
        catch (Throwable var1_2) {
            return false;
        }
    }

    static synchronized List a() {
        ArrayList<String> arrayList = null;
        try {
            List list = a.a(100);
            if (list.size() > 0) {
                arrayList = new ArrayList<String>();
                for (byte[] arrby : list) {
                    byte[] arrby2 = cs.c(arrby, d);
                    String string = new String(arrby2);
                    arrayList.add(string);
                }
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return arrayList;
    }

    static void b() {
        try {
            a.a();
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }

    static void c() {
    }

    static void a(long l2) {
        SharedPreferences.Editor editor = g.edit();
        editor.putLong("LAST_SENT_PUSH_TIME", l2);
        editor.commit();
    }

    static Long d() {
        return g.getLong("LAST_SENT_PUSH_TIME", System.currentTimeMillis());
    }

    static String e() {
        return g.getString("appcontext_push", "");
    }

    static void b(String string) {
        SharedPreferences.Editor editor = g.edit();
        editor.putString("appcontext_push", string);
        editor.commit();
    }

    protected static String a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("TD_app_pref_file", 0);
        String string = sharedPreferences.getString("pref.accountid.key", "-1");
        return string;
    }

    static {
        b = "TD_database_app_push";
        c = "utf-8";
        try {
            a = new ci(ab.mContext, b);
            g = ab.mContext.getSharedPreferences("TD_app_pefercen_profile", 0);
            String string = cs.c(ab.mContext.getPackageName());
            d = ab.mContext != null && string != null ? string.getBytes() : fc.class.getSimpleName().getBytes();
        }
        catch (Throwable var0_1) {
            // empty catch block
        }
    }
}

