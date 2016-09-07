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
import com.tendcloud.tenddata.TalkingDataSMS;
import com.tendcloud.tenddata.cb;
import com.tendcloud.tenddata.ce;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cs;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class fo {
    static final int a = 1;
    static final int b = 0;
    static final int c = 0;
    static final String d = "Android";
    static JSONObject e = new JSONObject();
    static JSONObject f = new JSONObject();
    static JSONObject g = new JSONObject();
    static JSONObject h = null;
    static String i = null;
    static String j = null;

    fo() {
    }

    static String a(String string) {
        try {
            if (h == null) {
                h = new JSONObject();
                h.put("device", (Object)fo.d());
                h.put("app", (Object)fo.e());
                h.put("sdk", (Object)fo.f());
                h.put("action", (Object)new JSONObject());
            }
            return h.toString();
        }
        catch (JSONException var1_1) {
            return null;
        }
    }

    private static JSONObject d() {
        return f;
    }

    private static JSONObject e() {
        return e;
    }

    private static JSONObject f() {
        return g;
    }

    static void a() {
        try {
            JSONArray jSONArray;
            Object object;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", (Object)ce.a(TalkingDataSMS.b));
            try {
                jSONArray = cj.y(TalkingDataSMS.b);
                object = new JSONArray();
                if (jSONArray != null) {
                    object.put(jSONArray.getJSONObject(0).get("imei"));
                    if (jSONArray.length() == 2) {
                        object.put(jSONArray.getJSONObject(1).get("imei"));
                    }
                }
                jSONObject.put("imeis", object);
            }
            catch (Exception var1_3) {
                // empty catch block
            }
            jSONArray = new JSONArray();
            jSONArray.put((Object)ce.f(TalkingDataSMS.b));
            jSONObject.put("wifiMacs", (Object)jSONArray);
            object = ce.b(TalkingDataSMS.b);
            jSONObject.put("androidId", object);
            jSONObject.put("adId", (Object)ce.g(TalkingDataSMS.b));
            jSONObject.put("serialNo", (Object)(ce.a() == null ? "" : ce.a()));
            f.put("deviceId", (Object)jSONObject);
        }
        catch (Throwable var0_1) {
            // empty catch block
        }
    }

    static void b() {
        try {
            e.put("name", (Object)cb.a().h(TalkingDataSMS.b));
            e.put("globalId", (Object)cb.a().a(TalkingDataSMS.b));
            e.put("versionName", (Object)cb.a().c(TalkingDataSMS.b));
            e.put("versionCode", cb.a().b(TalkingDataSMS.b));
            e.put("installTime", cb.a().d(TalkingDataSMS.b));
            e.put("updateTime", cb.a().e(TalkingDataSMS.b));
            e.put("cert", (Object)cs.a(fo.a(TalkingDataSMS.b, TalkingDataSMS.b.getPackageName())));
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }

    static void c() {
        try {
            g.put("version", 1);
            g.put("minorVersion", 0);
            g.put("build", 0);
            g.put("platform", (Object)"Android");
        }
        catch (Throwable var0) {
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
}

