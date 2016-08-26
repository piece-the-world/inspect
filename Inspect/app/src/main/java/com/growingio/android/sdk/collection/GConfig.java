/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Application
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.graphics.Point
 *  android.os.Bundle
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.m;
import com.growingio.android.sdk.utils.i;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GConfig {
    public static boolean a = false;
    public static boolean b;
    public static boolean c;
    private SimpleDateFormat f = new SimpleDateFormat("yyyy_MM_dd", Locale.US);
    private static GConfig g;
    private static final Object h;
    private Context i;
    private int j;
    private long k;
    private boolean l;
    private boolean m;
    private long n;
    private String o;
    private boolean p;
    private boolean q = a;
    public static String d;
    public static String e;
    private boolean r = false;
    private boolean s;
    private int t;
    private boolean u = true;
    private double v = -1.0;
    private boolean w = true;
    private boolean x = false;
    private final boolean y;
    private long z = 0;
    private boolean A = false;
    private HashMap B;

    public static boolean isInstrumented() {
        return false;
    }

    public boolean a() {
        return this.u;
    }

    public double b() {
        return this.v;
    }

    public boolean c() {
        return this.w;
    }

    public boolean d() {
        return this.s;
    }

    public void e() {
        if (this.C().contains("pref_enable_imp")) {
            return;
        }
        this.w = false;
    }

    public HashMap f() {
        return this.B;
    }

    public void a(String string) {
        this.o = string;
    }

    public boolean g() {
        return this.q;
    }

    boolean h() {
        return this.l || j.e().a();
    }

    public boolean i() {
        return this.m;
    }

    int j() {
        return this.j;
    }

    long k() {
        return this.k;
    }

    public String l() {
        return this.o;
    }

    public boolean m() {
        return this.y;
    }

    long n() {
        return this.n;
    }

    private GConfig(Configuration configuration) {
        this.i = configuration.a.getApplicationContext();
        a = configuration.k;
        this.k = configuration.r;
        this.j = configuration.p;
        this.n = configuration.q;
        this.l = configuration.l;
        this.q = configuration.m;
        this.o = configuration.e;
        this.s = configuration.o;
        this.y = configuration.j;
        c = GConfig.b = configuration.n;
        d = configuration.c;
        if (this.q) {
            m.a(this.i);
        }
        this.B();
        this.G();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(Configuration configuration) {
        Object object = h;
        synchronized (object) {
            if (null == g) {
                g = new GConfig(configuration);
            }
        }
    }

    public static GConfig o() {
        return g;
    }

    @TargetApi(value=15)
    private void B() {
        Bundle bundle = i.a(this.i);
        this.m = bundle.getBoolean("com.growingio.android.GConfig.LocalMode", false);
        this.p = bundle.getBoolean("com.growingio.android.GConfig.EnableCellularTransmission", true);
        if (TextUtils.isEmpty((CharSequence)this.o)) {
            this.o = this.a(bundle, "com.growingio.android.GConfig.Channel");
            if (TextUtils.isEmpty((CharSequence)this.o)) {
                this.o = this.a(bundle);
            }
            if (this.o.length() > 32) {
                this.o = this.o.substring(0, 32);
            }
        }
        try {
            e = this.i.getPackageManager().getPackageInfo((String)this.i.getPackageName(), (int)0).versionName;
        }
        catch (PackageManager.NameNotFoundException var2_2) {
            // empty catch block
        }
    }

    @TargetApi(value=12)
    private String a(Bundle bundle) {
        String string = this.a(bundle, "UMENG_CHANNEL");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        string = this.a(bundle, "BaiduMobAd_CHANNEL");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        string = this.a(bundle, "TD_CHANNEL_ID");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        return "UNKNOWN";
    }

    private String a(Bundle bundle, String string) {
        Object object = bundle.get(string);
        return object != null ? String.valueOf(object) : null;
    }

    private SharedPreferences C() {
        return this.i.getSharedPreferences("growing_profile", 0);
    }

    private SharedPreferences D() {
        return this.i.getSharedPreferences("growing_server_pref", 0);
    }

    public boolean p() {
        return this.C().getBoolean("pref_show_circle_tip", true);
    }

    @TargetApi(value=9)
    public void a(boolean bl2) {
        this.C().edit().putBoolean("pref_show_circle_tip", bl2).apply();
    }

    public boolean q() {
        return this.C().getBoolean("pref_show_tag_success", true);
    }

    @TargetApi(value=9)
    public void b(boolean bl2) {
        this.C().edit().putBoolean("pref_show_tag_success", bl2).apply();
    }

    public boolean r() {
        return this.r;
    }

    public void c(boolean bl2) {
        this.r = bl2;
    }

    public Point s() {
        SharedPreferences sharedPreferences = this.C();
        int n2 = sharedPreferences.getInt("pref_float_x", -1);
        int n3 = sharedPreferences.getInt("pref_float_y", -1);
        return new Point(n2, n3);
    }

    @TargetApi(value=9)
    public void a(int n2, int n3) {
        SharedPreferences sharedPreferences = this.C();
        sharedPreferences.edit().putInt("pref_float_x", n2).putInt("pref_float_y", n3).apply();
    }

    public void b(String string) {
        this.C().edit().putString("pref_settings_etag", string).commit();
    }

    public String t() {
        return this.C().getString("pref_settings_etag", "");
    }

    @TargetApi(value=9)
    public void c(String string) {
        this.D().edit().putString("pref_server_settings", string).apply();
        this.d(string);
    }

    public boolean u() {
        if (!this.A) {
            this.A = true;
            String string = this.D().getString("pref_server_settings", null);
            if (string != null) {
                try {
                    this.a(new JSONObject(string).getJSONArray("tags"));
                }
                catch (JSONException var2_2) {
                    var2_2.printStackTrace();
                }
            }
        }
        return this.B != null;
    }

    private void a(JSONArray jSONArray) {
        this.B = new HashMap();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.optString("x");
            if (TextUtils.isEmpty((CharSequence)string)) continue;
            int n2 = jSONObject.optInt("idx", -1);
            h h2 = new h();
            String string2 = jSONObject.optString("p", null);
            h2.d = jSONObject.optString("d");
            h2.i = h2.d.contains("::");
            h2.a = string;
            h2.c = jSONObject.optString("v", null);
            h2.e = n2 != -1 ? String.valueOf(n2) : null;
            ArrayList<h> arrayList = (ArrayList<h>)this.B.get(string2);
            if (arrayList == null) {
                arrayList = new ArrayList<h>(1);
                this.B.put(string2, arrayList);
            }
            arrayList.add(h2);
        }
    }

    private void d(String string) {
        if (string == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            SharedPreferences.Editor editor = this.C().edit();
            if (jSONObject.has("disabled")) {
                this.u = !jSONObject.getBoolean("disabled");
                editor.putBoolean("pref_disable_all", !this.u);
            }
            if (jSONObject.has("sampling")) {
                this.v = jSONObject.getDouble("sampling");
                editor.putFloat("pref_sampling_rate", (float)this.v);
            }
            if (jSONObject.has("imp")) {
                this.w = jSONObject.getBoolean("imp");
                editor.putBoolean("pref_enable_imp", this.w);
            }
            if (jSONObject.has("throttle")) {
                this.x = jSONObject.getBoolean("throttle");
                editor.putBoolean("pref_enable_throttle", this.x);
            }
            editor.commit();
            this.a(jSONObject.getJSONArray("tags"));
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
        }
    }

    public boolean v() {
        this.F();
        return this.p && this.t < 1048576;
    }

    private boolean E() {
        String string;
        SharedPreferences sharedPreferences = this.C();
        String string2 = this.f.format(new Date(System.currentTimeMillis()));
        if (!TextUtils.equals((CharSequence)string2, (CharSequence)(string = sharedPreferences.getString("pref_date", "")))) {
            sharedPreferences.edit().putString("pref_date", string2).commit();
            return true;
        }
        return false;
    }

    private void F() {
        if (this.E()) {
            this.t = 0;
            this.C().edit().putInt("pref_cellular_data_size", 0).commit();
        } else {
            this.t = this.C().getInt("pref_cellular_data_size", 0);
        }
    }

    private void G() {
        SharedPreferences sharedPreferences = this.C();
        this.z = sharedPreferences.getLong("pref_user_install_time", 0);
        if (this.z == 0) {
            this.z = System.currentTimeMillis();
            sharedPreferences.edit().putLong("pref_user_install_time", this.z).commit();
        }
        if (sharedPreferences.contains("pref_enable_throttle")) {
            this.x = sharedPreferences.getBoolean("pref_enable_throttle", false);
        }
        if (sharedPreferences.contains("pref_enable_imp")) {
            this.w = sharedPreferences.getBoolean("pref_enable_imp", true);
        }
        if (sharedPreferences.contains("pref_disable_all")) {
            boolean bl2 = this.u = !sharedPreferences.getBoolean("pref_disable_all", false);
        }
        if (sharedPreferences.contains("pref_sampling_rate")) {
            this.v = sharedPreferences.getFloat("pref_sampling_rate", 1.0f);
        }
        if (sharedPreferences.contains("pref_server_settings")) {
            this.D().edit().putString("pref_server_settings", sharedPreferences.getString("pref_server_settings", null)).commit();
            sharedPreferences.edit().remove("pref_server_settings").commit();
        }
        this.F();
    }

    public long w() {
        return this.C().getLong("pref_vds_plugin_last_modified", 0);
    }

    @TargetApi(value=9)
    public void a(long l2) {
        this.C().edit().putLong("pref_vds_plugin_last_modified", l2).apply();
    }

    public long x() {
        return this.C().getLong("pref_js_src_last_modified", 1459325968000L);
    }

    @TargetApi(value=9)
    public void b(long l2) {
        this.C().edit().putLong("pref_js_src_last_modified", l2).apply();
    }

    public void d(boolean bl2) {
        if (this.C().contains("pref_enable_throttle")) {
            return;
        }
        this.x = bl2;
    }

    public void y() {
        if (this.C().contains("pref_disable_all")) {
            return;
        }
        this.u = false;
    }

    public boolean z() {
        return this.x;
    }

    public long A() {
        return this.z;
    }

    public void c(long l2) {
        this.z = l2;
        this.C().edit().putLong("pref_user_install_time", l2).commit();
    }

    static {
        c = GConfig.b = false;
        h = new Object();
    }
}

