/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import com.growingio.android.sdk.b.b;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
extends g {
    private static String c = "GIO.ActionEvent";
    public List a = new ArrayList();
    public long b;
    private String d;
    private boolean e;

    private a(String string) {
        this.d = string;
    }

    public static a a() {
        a a2 = new a("imp");
        a2.e = false;
        return a2;
    }

    public static a c() {
        a a2 = new a("clck");
        a2.e = true;
        return a2;
    }

    public a d() {
        a a2 = new a(this.d);
        a2.b = this.b;
        a2.e = this.e;
        a2.f = this.f;
        a2.g = this.g;
        return a2;
    }

    public boolean e() {
        return this.e;
    }

    @Override
    public JSONObject b() {
        JSONObject jSONObject = null;
        if (this.a.size() > 0) {
            jSONObject = this.i();
            try {
                JSONArray jSONArray = new JSONArray();
                for (b b2 : this.a) {
                    jSONArray.put((Object)b2.a());
                }
                jSONObject.put("t", (Object)this.d);
                jSONObject.put("ptm", this.b);
                jSONObject.put("e", (Object)jSONArray);
            }
            catch (JSONException var2_3) {
                LogUtil.d(c, "generate common event property error", (Throwable)var2_3);
            }
        }
        return jSONObject;
    }

    @Override
    public int f() {
        return this.a.size();
    }

    public String toString() {
        return this.d + " event with " + this.a.size() + " elements ActionEvent@" + this.hashCode();
    }
}

