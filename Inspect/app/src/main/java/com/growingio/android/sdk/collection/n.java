/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Looper
 *  android.util.Log
 *  android.util.Pair
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.m;
import com.growingio.android.sdk.collection.o;
import com.growingio.android.sdk.collection.p;
import com.growingio.android.sdk.utils.e;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class n {
    private static n b = null;
    private static SimpleDateFormat c = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    static SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd%20HH:mm:ss", Locale.US);
    private Context d;
    private HashMap e;
    private boolean f = false;
    private p g;

    private n(Context context) {
        this.g = new p(this, null);
        this.d = context.getApplicationContext();
        this.d();
    }

    static void a(Context context) {
        if (null == b) {
            b = new n(context);
        }
    }

    public static n a() {
        return b;
    }

    public static void a(String string) {
        if (GConfig.q().i() && b != null) {
            b.b(string);
        }
    }

    public static void a(String string, int n2) {
        if (GConfig.q().i() && b != null) {
            b.b(string, n2);
        }
    }

    private SharedPreferences c() {
        return this.d.getSharedPreferences("growingio_diagnose", 0);
    }

    private void d() {
        this.e = new HashMap();
        Map map = this.c().getAll();
        for (Map.Entry entry : map.entrySet()) {
            try {
                String string = (String)entry.getKey();
                this.e.put(string, new m(string, new JSONObject(entry.getValue().toString())));
            }
            catch (JSONException var4_5) {
                var4_5.printStackTrace();
            }
        }
    }

    @TargetApi(value=9)
    private void a(String string, m m2) {
        this.c().edit().putString(string, m2.a()).commit();
        if (GConfig.DEBUG) {
            Log.i((String)"DiagnoseLog", (String)("saveLogToSP: " + m2.a()));
        }
    }

    private synchronized void b(String string, int n2) {
        if (n2 == 0) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new AssertionError();
        }
        Date date = new Date();
        String string2 = c.format(date);
        String string3 = a.format(date);
        m m2 = null;
        if (this.e.containsKey(string2)) {
            m2 = (m)this.e.get(string2);
        } else {
            m2 = new m(string2, string3);
            this.e.put(string2, m2);
        }
        Integer n3 = (Integer)m2.c.get(string);
        Integer n4 = n3 != null ? n3 + n2 : n2;
        m2.c.put(string, n4);
        this.a(string2, m2);
        this.c(string2);
        if (this.e.size() > 0) {
            p.a(this.g);
        }
    }

    private void b(String string) {
        this.b(string, 1);
    }

    private void c(String string) {
        if (this.f) {
            return;
        }
        this.f = true;
        for (Map.Entry entry : this.e.entrySet()) {
            if (((String)entry.getKey()).equals(string)) continue;
            this.a((m)entry.getValue());
            return;
        }
    }

    private void a(m m2) {
        if (m2 == null) {
            return;
        }
        c c2 = c.k();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Accept", "application/json");
        hashMap.put("X-GrowingIO-UID", c2.l());
        String string = k.e().a() ? c.k().d() : c.k().c();
        StringBuilder stringBuilder = new StringBuilder(390);
        try {
            stringBuilder.append("https://crashapi.growingio.com/v2").append("/").append(string).append("/android/faults?").append("stm=").append(System.currentTimeMillis()).append('&').append("av=").append(URLEncoder.encode(GConfig.sAppVersion, "UTF-8")).append('&').append("cv=").append("0.9.98_355b84e").append('&').append("uid=").append(c2.l()).append('&').append("appid=").append(c2.b()).append('&').append("os=").append("Android").append('&').append("osv=").append(Build.VERSION.SDK_INT).append('&').append("db=").append(URLEncoder.encode(Build.BRAND, "UTF-8")).append('&').append("dm=").append(URLEncoder.encode(Build.MODEL, "UTF-8")).append('&').append("date=").append(m2.b);
        }
        catch (UnsupportedEncodingException var6_6) {
            var6_6.printStackTrace();
        }
        if (m2.c != null && !m2.c.isEmpty()) {
            for (String string2 : m2.c.keySet()) {
                stringBuilder.append("&").append(string2).append("=").append(m2.c.get(string2));
            }
        }
        try {
            if ((Integer)new e().a((String)stringBuilder.toString()).a(hashMap).a().b().first == 200) {
                this.e.remove(m2.a);
                this.c().edit().remove(m2.a).commit();
            }
        }
        catch (Exception var6_8) {
            var6_8.printStackTrace();
        }
    }

    public void b() {
        p.b(this.g);
    }

    static /* synthetic */ HashMap a(n n2) {
        return n2.e;
    }

    static /* synthetic */ void a(n n2, m m2) {
        n2.a(m2);
    }
}

