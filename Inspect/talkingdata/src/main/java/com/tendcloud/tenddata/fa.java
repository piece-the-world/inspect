/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.os.Environment
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Environment;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cb;
import com.tendcloud.tenddata.ce;
import com.tendcloud.tenddata.cf;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

final class fa {
    private static volatile fa b = null;
    private final String c = "sdk";
    private final String d = "env";
    private final String e = "networks";
    private final String f = "locations";
    private final String g = "appInstall";
    private final String h = "appUninstall";
    private final String i = "apps";
    private final String j = "appQuit";
    private final String k = "trafficStats";
    private final String l = "/tdCacheLogs/";
    static final String a = "Android";
    private JSONArray m = new JSONArray();

    fa() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static fa a() {
        if (b != null) return b;
        reference var0 = fa.class;
        synchronized (fa.class) {
            if (b != null) return b;
            {
                b = new fa();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return b;
        }
    }

    byte[] b() {
        try {
            if (this.m.length() > 0) {
                return this.c(this.m.toString());
            }
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        return null;
    }

    File[] c() {
        return new File(Environment.getExternalStorageDirectory() + "/tdCacheLogs/").listFiles();
    }

    void d() {
        this.m = new JSONArray();
    }

    void a(JSONObject jSONObject) {
        this.e();
        this.m.put((Object)this.c(jSONObject, "trafficStats"));
    }

    void a(String string) {
        this.e();
        this.m.put((Object)this.b(string, "appInstall"));
    }

    void b(String string) {
        this.e();
        this.m.put((Object)this.b(string, "appUninstall"));
    }

    void a(JSONArray jSONArray, JSONArray jSONArray2, String string) {
        this.e();
        this.m.put((Object)this.c(jSONArray, jSONArray2, string));
    }

    void b(JSONArray jSONArray, JSONArray jSONArray2, String string) {
        this.e();
        this.m.put((Object)this.d(jSONArray, jSONArray2, string));
    }

    void a(JSONObject jSONObject, String string) {
        this.e();
        this.m.put((Object)this.b(jSONObject, string));
    }

    void a(String string, String string2, String string3) {
        this.e();
        this.m.put((Object)this.a(string, string2, string3, "apps"));
    }

    void a(String string, String string2) {
        this.e();
        this.m.put((Object)this.b(string, string2, "apps"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @TargetApi(value=23)
    private void e() {
        if (this.m.length() > 10) {
            try {
                if (cs.a(23) && ab.mContext.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    return;
                }
                String string = Environment.getExternalStorageState();
                if ("mounted".equals(string)) {
                    File file = new File(Environment.getExternalStorageDirectory() + "/tdCacheLogs/");
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    File file2 = new File(file, this.f());
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileOutputStream.write(this.c(this.m.toString()));
                        fileOutputStream.flush();
                    }
                    catch (Throwable var5_6) {}
                    finally {
                        fileOutputStream.close();
                    }
                }
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
            this.d();
        }
    }

    private String f() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            stringBuilder.append(simpleDateFormat.format(date));
            stringBuilder.append("-");
            stringBuilder.append(Integer.toHexString(System.identityHashCode((Object)ab.mContext.getApplicationInfo())));
            stringBuilder.append("-");
            stringBuilder.append(String.valueOf(System.currentTimeMillis()));
            return stringBuilder.toString();
        }
        catch (Throwable var2_3) {
            return stringBuilder.toString();
        }
    }

    private JSONObject c(JSONArray jSONArray, JSONArray jSONArray2, String string) {
        if (jSONArray == null && jSONArray2 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sessionid", (Object)string);
            JSONArray jSONArray3 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object)"wifi");
            jSONObject2.put("scannable", (Object)jSONArray);
            jSONObject2.put("current", (Object)jSONArray2);
            jSONArray3.put((Object)jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("domain", (Object)"env");
            jSONObject3.put("name", (Object)"wifiUpdate");
            return this.a(null, jSONArray3, jSONObject, "networks");
        }
        catch (Throwable var4_5) {
            return null;
        }
    }

    private JSONObject d(JSONArray jSONArray, JSONArray jSONArray2, String string) {
        if (jSONArray == null && jSONArray2 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sessionId", (Object)string);
            JSONArray jSONArray3 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object)"cellular");
            jSONObject2.put("scannable", (Object)jSONArray2);
            jSONObject2.put("current", (Object)jSONArray);
            jSONArray3.put((Object)jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("domain", (Object)"env");
            jSONObject3.put("name", (Object)"cellUpdate");
            return this.a(jSONObject3, jSONArray3, jSONObject, "networks");
        }
        catch (Throwable var4_5) {
            return null;
        }
    }

    private JSONObject b(JSONObject jSONObject, String string) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sessionId", (Object)string);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put((Object)jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("domain", (Object)"env");
            jSONObject3.put("name", (Object)"locationUpdate");
            return this.a(jSONObject3, jSONArray, jSONObject2, "locations");
        }
        catch (Throwable var3_4) {
            return null;
        }
    }

    private JSONObject a(String string, String string2, String string3, String string4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("asad", (Object)string);
            jSONObject.put("ras", (Object)string2);
            if (string2 == null || string2.isEmpty()) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sessionId", (Object)string3);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("domain", (Object)"env");
            jSONObject3.put("name", (Object)string4);
            jSONObject3.put("data", (Object)jSONObject);
            return this.a(jSONObject3, null, jSONObject2, null);
        }
        catch (Throwable var6_7) {
            return null;
        }
    }

    private JSONObject b(String string, String string2, String string3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("aas", (Object)string);
            if (string == null || string.isEmpty()) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sessionId", (Object)string2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("domain", (Object)"env");
            jSONObject3.put("name", (Object)string3);
            jSONObject3.put("data", (Object)jSONObject);
            return this.a(jSONObject3, null, jSONObject2, null);
        }
        catch (Throwable var5_6) {
            return null;
        }
    }

    private JSONObject c(JSONObject jSONObject, String string) {
        try {
            if (jSONObject == null || jSONObject.length() <= 0) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("domain", (Object)"env");
            jSONObject2.put("name", (Object)string);
            jSONObject2.put("data", (Object)jSONObject);
            return this.a(jSONObject2, null, null, null);
        }
        catch (Throwable var3_4) {
            return null;
        }
    }

    private JSONObject b(String string, String string2) {
        JSONObject jSONObject = new JSONObject();
        if (string == null || string.isEmpty()) {
            return null;
        }
        try {
            jSONObject.put("pkgName", (Object)string);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("domain", (Object)"sdk");
            jSONObject2.put("name", (Object)string2);
            jSONObject2.put("data", (Object)jSONObject);
            return this.a(jSONObject2, null, null, null);
        }
        catch (Throwable var4_5) {
            return null;
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, String string) {
        JSONObject jSONObject3 = null;
        try {
            jSONObject3 = new JSONObject();
            jSONObject3.put("device", (Object)fa.g());
            jSONObject3.put("app", (Object)fa.h());
            jSONObject3.put("ts", System.currentTimeMillis());
            jSONObject3.put("sdk", (Object)fa.i());
            if (string != null && !string.isEmpty() && jSONArray != null) {
                jSONObject3.put(string, (Object)jSONArray);
                jSONObject3.put("appContext", (Object)jSONObject2);
            } else if (string == null && jSONArray == null && jSONObject2 != null) {
                jSONObject3.put("appContext", (Object)jSONObject2);
            }
            jSONObject3.put("action", (Object)jSONObject);
            return jSONObject3;
        }
        catch (Throwable var6_6) {
            return jSONObject3;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private byte[] c(String var1_1) {
        var2_2 = new ByteArrayOutputStream();
        var3_3 = null;
        var4_4 = new Deflater(9, true);
        try {
            var3_3 = new DeflaterOutputStream((OutputStream)var2_2, var4_4);
            var3_3.write(var1_1.getBytes("UTF-8"));
            ** if (var3_3 == null) goto lbl-1000
        }
        catch (Throwable var5_6) {
            if (var3_3 != null) {
                try {
                    var3_3.close();
                }
                catch (Throwable var5_7) {}
            }
            catch (Throwable var6_8) {
                if (var3_3 == null) throw var6_8;
                try {
                    var3_3.close();
                    throw var6_8;
                }
                catch (Throwable var7_9) {
                    // empty catch block
                }
                throw var6_8;
            }
        }
lbl-1000: // 1 sources:
        {
            try {
                var3_3.close();
            }
            catch (Throwable var5_5) {}
        }
lbl-1000: // 2 sources:
        {
        }
        var4_4.end();
        return var2_2.toByteArray();
    }

    private static JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object object;
            JSONArray jSONArray;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tid", (Object)ce.a(ab.mContext));
            try {
                jSONArray = cj.y(ab.mContext);
                object = new JSONArray();
                if (jSONArray != null && jSONArray.length() > 0) {
                    object.put(jSONArray.getJSONObject(0).get("imei"));
                    if (jSONArray.length() == 2) {
                        try {
                            object.put(jSONArray.getJSONObject(1).get("imei"));
                        }
                        catch (Throwable var4_6) {
                            // empty catch block
                        }
                    }
                }
                jSONObject2.put("imeis", object);
            }
            catch (Throwable var2_4) {
                // empty catch block
            }
            jSONArray = new JSONArray();
            jSONArray.put((Object)ce.f(ab.mContext));
            jSONObject2.put("wifiMacs", (Object)jSONArray);
            object = ce.b(ab.mContext);
            jSONObject2.put("androidId", object);
            jSONObject2.put("adId", (Object)ce.g(ab.mContext));
            jSONObject2.put("serialNo", (Object)(ce.a() == null ? "" : ce.a()));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("manufacture", (Object)cf.b());
            jSONObject3.put("brand", (Object)cf.c());
            jSONObject3.put("model", (Object)cf.d());
            jSONObject.put("hardwareConfig", (Object)jSONObject3);
            jSONObject.put("deviceId", (Object)jSONObject2);
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return jSONObject;
    }

    private static JSONObject h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", (Object)ab.a(ab.mContext));
            jSONObject.put("name", (Object)cb.a().h(ab.mContext));
            jSONObject.put("globalId", (Object)cb.a().a(ab.mContext));
            jSONObject.put("versionName", (Object)cb.a().c(ab.mContext));
            jSONObject.put("versionCode", cb.a().b(ab.mContext));
            jSONObject.put("installTime", cb.a().d(ab.mContext));
            jSONObject.put("updateTime", cb.a().e(ab.mContext));
            jSONObject.put("channel", (Object)ab.getPartnerId(ab.mContext));
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        return jSONObject;
    }

    private static JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", (Object)"Android");
            jSONObject.put("version", (Object)"Android+TD+V2.2.37 gp");
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        return jSONObject;
    }
}

