/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.Signature
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cb;
import com.tendcloud.tenddata.ce;
import com.tendcloud.tenddata.cf;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cm;
import com.tendcloud.tenddata.cs;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class fe {
    static final double a = 1.2;
    static final int b = 0;
    static final String c = "Android";
    static final int d = 0;
    static final JSONArray e = new JSONArray();
    static JSONObject f = new JSONObject();
    static JSONObject g = new JSONObject();
    static JSONObject h = new JSONObject();
    static JSONObject i = null;
    static JSONObject j = new JSONObject();
    static String k = cm.b(ab.mContext, "TD_app_pefercen_profile", "TD_appId", "");

    fe() {
    }

    static String a(JSONObject jSONObject) {
        try {
            long l2 = System.currentTimeMillis();
            if (i == null) {
                i = new JSONObject();
                i.put("device", (Object)fe.d());
                i.put("app", (Object)fe.e());
                i.put("sdk", (Object)fe.g());
            }
            i.put("appContext", (Object)fe.f());
            i.put("ts", l2);
            i.put("action", (Object)jSONObject);
            return i.toString();
        }
        catch (JSONException var1_2) {
            return null;
        }
    }

    private static JSONObject d() {
        return g;
    }

    private static JSONObject e() {
        return f;
    }

    private static JSONObject f() {
        return h;
    }

    private static JSONObject g() {
        return j;
    }

    static void a() {
        try {
            JSONArray jSONArray;
            Object object;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", (Object)ce.a(ab.mContext));
            try {
                jSONArray = cj.y(ab.mContext);
                object = new JSONArray();
                if (jSONArray != null && jSONArray.length() > 0) {
                    object.put(jSONArray.getJSONObject(0).get("imei"));
                    if (jSONArray.length() == 2) {
                        try {
                            object.put(jSONArray.getJSONObject(1).get("imei"));
                        }
                        catch (Throwable var3_5) {
                            // empty catch block
                        }
                    }
                }
                jSONObject.put("imeis", object);
            }
            catch (Throwable var1_3) {
                // empty catch block
            }
            jSONArray = new JSONArray();
            jSONArray.put((Object)ce.f(ab.mContext));
            jSONObject.put("wifiMacs", (Object)jSONArray);
            object = ce.b(ab.mContext);
            jSONObject.put("androidId", object);
            jSONObject.put("adId", (Object)ce.g(ab.mContext));
            jSONObject.put("serialNo", (Object)(ce.a() == null ? "" : ce.a()));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("manufacture", (Object)cf.b());
            jSONObject2.put("brand", (Object)cf.c());
            jSONObject2.put("model", (Object)cf.d());
            g.put("hardwareConfig", (Object)jSONObject2);
            g.put("deviceId", (Object)jSONObject);
        }
        catch (Throwable var0_1) {
            // empty catch block
        }
    }

    static void b() {
        try {
            f.put("name", (Object)cb.a().h(ab.mContext));
            f.put("globalId", (Object)cb.a().a(ab.mContext));
            f.put("versionName", (Object)cb.a().c(ab.mContext));
            f.put("versionCode", cb.a().b(ab.mContext));
            f.put("installTime", cb.a().d(ab.mContext));
            f.put("updateTime", cb.a().e(ab.mContext));
            f.put("cert", (Object)cs.a(fe.a(ab.mContext, ab.mContext.getPackageName())));
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }

    static void a(String string, JSONObject jSONObject, JSONObject jSONObject2, String string2) {
        try {
            h.put("sessionId", (Object)string);
            h.put("account", (Object)jSONObject);
            h.put("subAccount", (Object)jSONObject2);
            h.put("push", (Object)string2);
        }
        catch (Throwable var4_4) {
            // empty catch block
        }
    }

    static byte[] a(Context context, String string) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(string, 64);
            Signature[] arrsignature = packageInfo.signatures;
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] arrby = arrsignature[0].toByteArray();
            certificateFactory.generateCertificate(new ByteArrayInputStream(arrby));
            return arrby;
        }
        catch (Throwable var2_3) {
            return null;
        }
    }

    static void c() {
        try {
            j.put("features", (Object)e);
            j.put("minorVersion", 0);
            j.put("build", 0);
            j.put("platform", (Object)"Android");
            j.put("version", 1.2);
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }
}

