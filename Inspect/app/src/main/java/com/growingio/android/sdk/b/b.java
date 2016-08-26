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
import com.growingio.android.sdk.utils.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    public String a;
    public long b;
    public int c = -1;
    public String d;
    public String e;
    private volatile int f;

    public int hashCode() {
        int n2 = this.f;
        if (n2 == 0) {
            n2 = 17;
            n2 = n2 * 31 + (this.a != null ? this.a.hashCode() : 0);
            n2 = n2 * 31 + this.c;
            n2 = n2 * 31 + (this.d != null ? this.d.hashCode() : 0);
            this.f = n2 = n2 * 31 + (this.e != null ? this.e.hashCode() : 0);
        }
        return n2;
    }

    public String toString() {
        return String.format("tm: %d, xpath: %s, idx: %d, content: %s", this.b, this.a, this.c, this.d);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (Object)this.a);
            jSONObject.put("tm", System.currentTimeMillis());
            if (this.c >= 0) {
                jSONObject.put("idx", this.c);
            }
            if (!TextUtils.isEmpty((CharSequence)this.e)) {
                jSONObject.put("obj", (Object)this.e);
            }
            if (!TextUtils.isEmpty((CharSequence)this.d)) {
                jSONObject.put("v", (Object)this.d);
            }
        }
        catch (JSONException var2_2) {
            LogUtil.d("GIO.ActionStruct", "generate impress view error", (Throwable)var2_2);
            return null;
        }
        return jSONObject;
    }
}

