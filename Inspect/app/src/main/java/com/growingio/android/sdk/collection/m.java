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
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.l;
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

public class m {
    private static m a = null;
    private static SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    private Context c;
    private HashMap d;
    private boolean e = false;

    private m(Context context) {
        this.c = context.getApplicationContext();
        this.b();
    }

    static void a(Context context) {
        if (null == a) {
            a = new m(context);
        }
    }

    public static void a(String string) {
        if (GConfig.o().g() && a != null) {
            a.b(string);
        }
    }

    public static void a(String string, int n2) {
        if (GConfig.o().g() && a != null) {
            a.b(string, n2);
        }
    }

    private SharedPreferences a() {
        return this.c.getSharedPreferences("growingio_diagnose", 0);
    }

    private void b() {
        this.d = new HashMap();
        Map map = this.a().getAll();
        for (Map.Entry entry : map.entrySet()) {
            try {
                String string = (String)entry.getKey();
                this.d.put(string, new l(string, new JSONObject(entry.getValue().toString())));
            }
            catch (JSONException var4_5) {
                var4_5.printStackTrace();
            }
        }
    }

    @TargetApi(value=9)
    private void a(String string, l l2) {
        this.a().edit().putString(string, l2.a()).commit();
        if (GConfig.a) {
            Log.i((String)"DiagnoseLog", (String)("saveLogToSP: " + l2.a()));
        }
    }

    private synchronized void b(String string, int n2) {
        if (n2 == 0) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new AssertionError();
        }
        String string2 = b.format(new Date());
        l l2 = null;
        if (this.d.containsKey(string2)) {
            l2 = (l)this.d.get(string2);
        } else {
            l2 = new l(string2);
            this.d.put(string2, l2);
        }
        Integer n3 = (Integer)l2.b.get(string);
        Integer n4 = n3 != null ? n3 + n2 : n2;
        l2.b.put(string, n4);
        this.a(string2, l2);
        this.c(string2);
    }

    private void b(String string) {
        this.b(string, 1);
    }

    private void c(String string) {
        if (this.e) {
            return;
        }
        this.e = true;
        for (Map.Entry entry : this.d.entrySet()) {
            if (((String)entry.getKey()).equals(string)) continue;
            this.a((l)entry.getValue());
            return;
        }
    }

    private void a(l l2) {
        if (l2 == null) {
            return;
        }
        c c2 = c.h();
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Accept", "application/json");
        hashMap.put("X-GrowingIO-UID", c2.i());
        String string = j.e().a() ? c.h().e() : c.h().d();
        StringBuilder stringBuilder = new StringBuilder(390);
        try {
            stringBuilder.append("https://crashapi.growingio.com/v2/").append(string).append("/android/faults?").append("stm=").append(System.currentTimeMillis()).append('&').append("av=").append(URLEncoder.encode(GConfig.e, "UTF-8")).append('&').append("cv=").append("0.9.90_6a708c0").append('&').append("uid=").append(c2.i()).append('&').append("appid=").append(this.c.getPackageName()).append('&').append("os=").append("Android").append('&').append("osv=").append(Build.VERSION.SDK_INT).append('&').append("db=").append(URLEncoder.encode(Build.BRAND, "UTF-8")).append('&').append("dm=").append(URLEncoder.encode(Build.MODEL, "UTF-8")).append('&').append("date=").append(l2.a);
        }
        catch (UnsupportedEncodingException var6_6) {
            var6_6.printStackTrace();
        }
        if (l2.b != null && !l2.b.isEmpty()) {
            for (String string2 : l2.b.keySet()) {
                stringBuilder.append("&").append(string2).append("=").append(l2.b.get(string2));
            }
        }
        try {
            if ((Integer)new e().a((String)stringBuilder.toString()).a(hashMap).a().b().first == 200) {
                this.d.remove(l2.a);
                this.a().edit().remove(l2.a).commit();
            }
        }
        catch (Exception var6_8) {
            var6_8.printStackTrace();
        }
    }
}

