/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import android.text.TextUtils;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.collection.aj;
import com.growingio.android.sdk.collection.c;
import org.json.JSONArray;
import org.json.JSONObject;

public class n
extends g {
    String a;
    i b;
    String c;
    JSONObject d;
    int e = 0;

    public n(String string, i i2, String string2) {
        this.a = string;
        this.b = i2;
        this.c = string2;
    }

    @Override
    public JSONObject b() {
        if (this.d != null) {
            return this.d;
        }
        try {
            JSONObject jSONObject = new JSONObject(this.a);
            String string = jSONObject.getString("t");
            jSONObject.put("s", (Object)aj.a());
            this.a(jSONObject, "d", this.h().b());
            this.a(jSONObject, "p", this.c);
            if (string.equals("imp") || string.equals("clck")) {
                int n2;
                JSONArray jSONArray = jSONObject.getJSONArray("e");
                this.e = n2 = jSONArray.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (jSONObject2.opt("idx") != null) {
                        this.a(jSONObject2, "x", this.b.i);
                    } else {
                        this.a(jSONObject2, "x", this.b.j);
                        if (this.b.e > -1) {
                            jSONObject.put("idx", this.b.e);
                        }
                    }
                    if (!jSONObject2.has("ex")) continue;
                    jSONObject2.remove("ex");
                    jSONObject2.remove("ey");
                    jSONObject2.remove("ew");
                    jSONObject2.remove("eh");
                }
            } else if (string.equals("page")) {
                this.e = 1;
                this.c(jSONObject);
                String string2 = jSONObject.optString("rp");
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    this.a(jSONObject, "rp", this.c);
                }
            }
            if (!string.equals("imp")) {
                this.a(jSONObject);
                this.b(jSONObject);
            }
            if (jSONObject.opt("tm") == null) {
                jSONObject.put("tm", System.currentTimeMillis());
            }
            this.d = jSONObject;
            return jSONObject;
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
            return null;
        }
    }

    private void a(JSONObject jSONObject, String string, String string2) {
        String string3 = jSONObject.getString(string);
        if (string3 != null) {
            jSONObject.put(string, (Object)(string2 + "::" + string3));
        }
    }

    @Override
    public int g() {
        return this.e;
    }
}

