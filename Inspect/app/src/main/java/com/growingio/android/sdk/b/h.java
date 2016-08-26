/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class h {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i = false;

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("domain", (Object)this.d);
            jSONObject.put("path", (Object)this.b);
            if (!TextUtils.isEmpty((CharSequence)this.a)) {
                jSONObject.put("xpath", (Object)this.a);
            }
            if (!TextUtils.isEmpty((CharSequence)this.c)) {
                jSONObject.put("content", (Object)this.c);
            }
            if (!TextUtils.isEmpty((CharSequence)this.e)) {
                jSONObject.put("index", (Object)this.e);
            }
            if (!TextUtils.isEmpty((CharSequence)this.f)) {
                jSONObject.put("query", (Object)this.f);
            }
            if (!TextUtils.isEmpty((CharSequence)"href")) {
                jSONObject.put("href", (Object)this.g);
            }
            if (!TextUtils.isEmpty((CharSequence)this.h)) {
                jSONObject.put("nodeType", (Object)this.h);
            }
        }
        catch (JSONException var2_2) {
            // empty catch block
        }
        return jSONObject;
    }

    public static h a(JSONObject jSONObject) {
        h h2 = new h();
        try {
            h2.d = jSONObject.getString("domain");
            h2.a = jSONObject.optString("xpath");
            h2.b = jSONObject.optString("path");
            h2.c = jSONObject.optString("content");
            h2.e = jSONObject.optString("index");
            h2.f = jSONObject.optString("query");
            h2.g = jSONObject.optString("href");
            h2.h = jSONObject.optString("nodeType");
        }
        catch (JSONException var2_2) {
            // empty catch block
        }
        return h2;
    }

    public h b() {
        h h2 = new h();
        h2.a = this.a;
        h2.b = this.b;
        h2.c = this.c;
        h2.d = this.d;
        h2.e = this.e;
        h2.f = this.f;
        h2.g = this.g;
        h2.h = this.h;
        return h2;
    }
}

