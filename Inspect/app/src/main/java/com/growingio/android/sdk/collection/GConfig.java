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
 *  android.os.Environment
 *  android.support.annotation.WorkerThread
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
import android.os.Environment;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.Configuration;
import com.growingio.android.sdk.collection.n;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.j;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GConfig {
    public static boolean DEBUG = false;
    public static final String GROWING_VERSION = "0.9.98_355b84e";
    public static boolean USE_ID;
    public static boolean CIRCLE_USE_ID;
    public static final String AGENT_VERSION = "0.9.98";
    private SimpleDateFormat a = new SimpleDateFormat("yyyy_MM_dd", Locale.US);
    private static GConfig b;
    private static final Object c;
    private Context d;
    private int e;
    private long f;
    private boolean g;
    private boolean h;
    private long i;
    private String j;
    private boolean k;
    private boolean l = DEBUG;
    public static String sGrowingScheme;
    public static String sAppVersion;
    private boolean m = false;
    private boolean n;
    private long o;
    private int p;
    private boolean q = true;
    private double r = -1.0;
    private boolean s = true;
    private boolean t = false;
    private boolean u = false;
    private final boolean v;
    private long w = 0;
    private boolean x = false;
    private HashMap y;

    public static boolean isInstrumented() {
        return false;
    }

    public boolean a() {
        return this.q;
    }

    public double b() {
        return this.r;
    }

    public boolean c() {
        return this.s;
    }

    public boolean d() {
        return this.n;
    }

    public void e() {
        if (this.E().contains("pref_enable_imp")) {
            return;
        }
        this.s = false;
    }

    public void f() {
        if (this.E().contains("pref_enable_imp")) {
            return;
        }
        this.s = true;
    }

    public boolean g() {
        return this.u;
    }

    public HashMap h() {
        return this.y;
    }

    public void a(String string) {
        this.j = string;
    }

    public boolean i() {
        return this.l;
    }

    boolean j() {
        return this.g || k.e().a();
    }

    public boolean k() {
        return this.h;
    }

    int l() {
        return this.e;
    }

    long m() {
        return this.f;
    }

    public String n() {
        return this.j;
    }

    public boolean o() {
        return this.v;
    }

    long p() {
        return this.i;
    }

    private GConfig(Configuration configuration) {
        this.d = configuration.a.getApplicationContext();
        DEBUG = configuration.k;
        this.f = configuration.s;
        this.e = configuration.q;
        this.i = configuration.r;
        this.u = configuration.p;
        this.o = configuration.t;
        this.s = !configuration.h;
        this.g = configuration.l;
        this.t = configuration.i;
        this.l = configuration.m;
        this.j = configuration.e;
        this.n = configuration.o;
        this.v = configuration.j;
        CIRCLE_USE_ID = GConfig.USE_ID = configuration.n;
        sGrowingScheme = configuration.c;
        if (this.l) {
            n.a(this.d);
        }
        this.D();
        this.I();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(Configuration configuration) {
        Object object = c;
        synchronized (object) {
            if (null == b) {
                b = new GConfig(configuration);
            }
        }
    }

    public static GConfig q() {
        return b;
    }

    @TargetApi(value=15)
    private void D() {
        Bundle bundle = j.a(this.d);
        this.h = bundle.getBoolean("com.growingio.android.GConfig.LocalMode", false);
        this.k = bundle.getBoolean("com.growingio.android.GConfig.EnableCellularTransmission", true);
        if (TextUtils.isEmpty((CharSequence)this.j)) {
            this.j = this.a(bundle, "com.growingio.android.GConfig.Channel");
            if (TextUtils.isEmpty((CharSequence)this.j)) {
                this.j = this.a(bundle);
            }
            if (this.j.length() > 32) {
                this.j = this.j.substring(0, 32);
            }
        }
        try {
            sAppVersion = this.d.getPackageManager().getPackageInfo((String)this.d.getPackageName(), (int)0).versionName;
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

    private SharedPreferences E() {
        return this.d.getSharedPreferences("growing_profile", 0);
    }

    private SharedPreferences F() {
        return this.d.getSharedPreferences("growing_server_pref", 0);
    }

    public boolean r() {
        return this.E().getBoolean("pref_show_circle_tip", true);
    }

    @TargetApi(value=9)
    public void a(boolean bl2) {
        this.E().edit().putBoolean("pref_show_circle_tip", bl2).apply();
    }

    public boolean s() {
        return this.m;
    }

    public void b(boolean bl2) {
        this.m = bl2;
    }

    public Point t() {
        SharedPreferences sharedPreferences = this.E();
        int n2 = sharedPreferences.getInt("pref_float_x", -1);
        int n3 = sharedPreferences.getInt("pref_float_y", -1);
        return new Point(n2, n3);
    }

    @TargetApi(value=9)
    public void a(int n2, int n3) {
        SharedPreferences sharedPreferences = this.E();
        sharedPreferences.edit().putInt("pref_float_x", n2).putInt("pref_float_y", n3).apply();
    }

    public void b(String string) {
        this.E().edit().putString("pref_settings_etag", string).commit();
    }

    public String u() {
        return this.E().getString("pref_settings_etag", "");
    }

    @TargetApi(value=9)
    public void c(String string) {
        this.F().edit().putString("pref_server_settings", string).apply();
        this.d(string);
    }

    public boolean v() {
        if (!this.x) {
            this.x = true;
            String string = this.F().getString("pref_server_settings", null);
            if (string != null) {
                try {
                    this.a(new JSONObject(string).getJSONArray("tags"));
                }
                catch (JSONException var2_2) {
                    var2_2.printStackTrace();
                }
            }
        }
        return this.y != null;
    }

    private void a(JSONArray jSONArray) {
        this.y = new HashMap();
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
            ArrayList<h> arrayList = (ArrayList<h>)this.y.get(string2);
            if (arrayList == null) {
                arrayList = new ArrayList<h>(1);
                this.y.put(string2, arrayList);
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
            SharedPreferences.Editor editor = this.E().edit();
            if (jSONObject.has("disabled")) {
                this.q = !jSONObject.getBoolean("disabled");
                editor.putBoolean("pref_disable_all", !this.q);
            }
            if (jSONObject.has("sampling")) {
                this.r = jSONObject.getDouble("sampling");
                editor.putFloat("pref_sampling_rate", (float)this.r);
            }
            if (jSONObject.has("throttle")) {
                this.t = jSONObject.getBoolean("throttle");
                editor.putBoolean("pref_enable_throttle", this.t);
            }
            if (jSONObject.has("imp")) {
                this.s = jSONObject.getBoolean("imp");
                editor.putBoolean("pref_enable_imp", this.s);
            }
            this.s |= this.t;
            if (jSONObject.has("net")) {
                boolean bl2 = jSONObject.getBoolean("net");
                this.u = !bl2;
                editor.putBoolean("pref_disable_cellular_impression", this.u);
            }
            editor.commit();
            this.a(jSONObject.getJSONArray("tags"));
        }
        catch (Exception var2_3) {
            var2_3.printStackTrace();
        }
    }

    public boolean w() {
        this.H();
        return this.k && (long)this.p < this.o;
    }

    public void a(int n2) {
        if (this.G()) {
            this.E().edit().putInt("pref_cellular_data_size", n2).commit();
            this.p = n2;
        } else {
            int n3 = this.E().getInt("pref_cellular_data_size", 0);
            this.p = n3 + n2;
            LogUtil.d("GIO.GConfig", "cellular data usage: ", this.p);
            this.E().edit().putInt("pref_cellular_data_size", this.p).commit();
        }
    }

    private boolean G() {
        String string;
        SharedPreferences sharedPreferences = this.E();
        String string2 = this.a.format(new Date(System.currentTimeMillis()));
        if (!TextUtils.equals((CharSequence)string2, (CharSequence)(string = sharedPreferences.getString("pref_date", "")))) {
            sharedPreferences.edit().putString("pref_date", string2).commit();
            return true;
        }
        return false;
    }

    private void H() {
        if (this.G()) {
            this.p = 0;
            this.E().edit().putInt("pref_cellular_data_size", 0).commit();
        } else {
            this.p = this.E().getInt("pref_cellular_data_size", 0);
        }
    }

    private void I() {
        SharedPreferences sharedPreferences = this.E();
        this.w = sharedPreferences.getLong("pref_user_install_time", 0);
        if (this.w == 0) {
            this.w = System.currentTimeMillis();
            sharedPreferences.edit().putLong("pref_user_install_time", this.w).commit();
        }
        if (sharedPreferences.contains("pref_enable_throttle")) {
            this.t |= sharedPreferences.getBoolean("pref_enable_throttle", false);
        }
        if (sharedPreferences.contains("pref_enable_imp")) {
            this.s &= sharedPreferences.getBoolean("pref_enable_imp", true);
        }
        this.s |= this.t;
        if (sharedPreferences.contains("pref_disable_cellular_impression")) {
            this.u = sharedPreferences.getBoolean("pref_disable_cellular_impression", false);
        }
        if (sharedPreferences.contains("pref_disable_all")) {
            boolean bl2 = this.q = !sharedPreferences.getBoolean("pref_disable_all", false);
        }
        if (sharedPreferences.contains("pref_sampling_rate")) {
            this.r = sharedPreferences.getFloat("pref_sampling_rate", 1.0f);
        }
        if (sharedPreferences.contains("pref_server_settings")) {
            this.F().edit().putString("pref_server_settings", sharedPreferences.getString("pref_server_settings", null)).commit();
            sharedPreferences.edit().remove("pref_server_settings").commit();
        }
        this.H();
    }

    public long x() {
        return this.E().getLong("pref_vds_plugin_last_modified", 0);
    }

    @TargetApi(value=9)
    public void a(long l2) {
        this.E().edit().putLong("pref_vds_plugin_last_modified", l2).apply();
    }

    public long y() {
        return this.E().getLong("pref_js_src_last_modified", 1459325968000L);
    }

    @TargetApi(value=9)
    public void b(long l2) {
        this.E().edit().putLong("pref_js_src_last_modified", l2).apply();
    }

    public void c(boolean bl2) {
        if (this.E().contains("pref_enable_throttle")) {
            return;
        }
        this.t = bl2;
    }

    public void z() {
        if (this.E().contains("pref_disable_all")) {
            return;
        }
        this.q = false;
    }

    public boolean A() {
        return this.t;
    }

    public boolean B() {
        return this.E().getBoolean("pref_device_activated", false) || this.J();
    }

    private boolean J() {
        if (g.c()) {
            return this.K().exists();
        }
        return false;
    }

    private File K() {
        return new File(Environment.getExternalStorageDirectory() + File.separator + ".growingio" + File.separator + this.d.getPackageName() + ".activated");
    }

    @WorkerThread
    public void C() {
        this.E().edit().putBoolean("pref_device_activated", true).commit();
        if (g.c()) {
            try {
                File file = this.K();
                if (file.mkdirs()) {
                    file.createNewFile();
                }
            }
            catch (Exception var1_2) {
                var1_2.printStackTrace();
            }
        }
    }

    public String toString() {
        return "DEBUG: " + DEBUG + "\n" + "Enabled: " + this.q + "\n" + "USE_ID: " + USE_ID + "\n" + "Context: " + (Object)this.d + "\n" + "Test Mode: " + this.g + "\n" + "Local Mode: " + this.h + "\n" + "Upload bulk size: " + this.e + "\n" + "Flush interval: " + this.f + "\n" + "Session interval: " + this.i + "\n" + "Channel: " + this.j + "\n" + "Track all fragments: " + this.n + "\n" + "Cellular data limit: " + this.o + "\n" + "Total cellular data size: " + this.p + "\n" + "Sampling: " + this.r + "\n" + "Enable impression: " + this.s + "\n" + "Throttle: " + this.t + "\n" + "Disable cellular impression: " + this.u + "\n" + "Instant filter initialized: " + this.x;
    }

    static {
        CIRCLE_USE_ID = GConfig.USE_ID = false;
        c = new Object();
    }
}

