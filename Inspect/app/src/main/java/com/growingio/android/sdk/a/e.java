/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.util.Pair
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.a;

import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.a.c;
import com.growingio.android.sdk.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class e {
    private String b;
    private String c;
    private static e d;
    private static final Object e;
    public static final Object a;

    private e() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static e a() {
        Object object = e;
        synchronized (object) {
            if (d == null) {
                d = new e();
                return d;
            }
            return d;
        }
    }

    com.growingio.android.sdk.collection.c b() {
        return com.growingio.android.sdk.collection.c.k();
    }

    c c() {
        return c.a();
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Pair a(String string) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("grantType", (Object)"login_token");
            jSONObject.put("deviceId", (Object)this.b().l());
            jSONObject.put("loginToken", (Object)string);
        }
        catch (JSONException var3_3) {
            Log.d((String)"GIO.LoginAPI", (String)"gen login json error");
        }
        Pair pair = this.c().a("https://www.growingio.com/oauth2/token", jSONObject);
        if ((Integer)pair.first == 200 && ((byte[])pair.second).length > 0) {
            Object object = a;
            synchronized (object) {
                try {
                    JSONObject jSONObject2 = new JSONObject(new String((byte[])pair.second));
                    this.b = jSONObject2.getString("accessToken");
                    this.c = jSONObject2.getString("userId");
                    Log.i((String)"GIO.LoginAPI", (String)"get access token by login token success");
                }
                catch (JSONException var5_7) {
                    LogUtil.d("GIO.LoginAPI", "parse the loginToken error");
                }
            }
        }
        return pair;
    }

    @Deprecated
    public void f() {
        this.b = "";
    }

    static {
        e = new Object();
        a = new Object();
    }
}

