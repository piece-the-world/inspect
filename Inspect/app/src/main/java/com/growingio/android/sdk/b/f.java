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
import com.growingio.android.sdk.b.d;
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.collection.GConfig;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class f {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public h f;
    public h g;
    String h;
    public String i;
    d j;

    public f() {
    }

    public f(JSONObject jSONObject) {
        try {
            this.b = jSONObject.getString("id");
            this.c = jSONObject.getString("name");
            this.d = jSONObject.getString("eventType");
            this.e = jSONObject.getString("platform");
            this.i = jSONObject.optString("source");
            this.f = h.a(jSONObject.getJSONObject("attrs"));
            this.g = h.a(jSONObject.getJSONObject("filter"));
            this.j = d.a(jSONObject.getJSONObject("screenshot"));
            this.a = TextUtils.equals((CharSequence)jSONObject.optString("status"), (CharSequence)"archived");
        }
        catch (JSONException var2_2) {
            // empty catch block
        }
    }

    public void a(String string) {
        this.c = string;
    }

    public void b(String string) {
        this.g.c = string;
    }

    public void c(String string) {
        this.g.e = string;
    }

    public void a(d d2) {
        this.j = d2;
    }

    public f a() {
        f f2 = new f();
        f2.b = this.b;
        f2.e = this.e;
        f2.d = this.d;
        f2.c = this.c;
        f2.h = this.h;
        f2.f = this.f.b();
        f2.g = this.g.b();
        return f2;
    }

    public String toString() {
        return this.b().toString();
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", (Object)this.b);
            jSONObject.put("name", (Object)this.c);
            jSONObject.put("eventType", (Object)this.d);
            jSONObject.put("platform", (Object)this.e);
            jSONObject.put("attrs", (Object)this.f.a());
            jSONObject.put("filter", (Object)this.g.a());
            jSONObject.put("comment", (Object)this.h);
            jSONObject.put("appVersion", (Object)GConfig.e);
            jSONObject.put("sdkVersion", (Object)"0.9.90_6a708c0");
            if (!TextUtils.isEmpty((CharSequence)this.i)) {
                jSONObject.put("source", (Object)this.i);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (this.j != null) {
                jSONObject2 = this.j.a();
            }
            jSONObject.put("screenshot", (Object)jSONObject2);
        }
        catch (JSONException var2_3) {
            // empty catch block
        }
        return jSONObject;
    }

    public String c() {
        return this.d().toString();
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", (Object)this.b);
            jSONObject.put("name", (Object)this.c);
            jSONObject.put("eventType", (Object)this.d);
            jSONObject.put("platform", (Object)this.e);
            if (this.f != null) {
                jSONObject.put("attrs", (Object)this.f.a());
            }
            if (this.g != null) {
                jSONObject.put("filter", (Object)this.g.a());
            }
            jSONObject.put("comment", (Object)this.h);
        }
        catch (JSONException var2_2) {
            // empty catch block
        }
        return jSONObject;
    }

    public boolean a(f f2) {
        return TextUtils.equals((CharSequence)f2.d, (CharSequence)this.d) && "Android".equalsIgnoreCase(f2.e) && TextUtils.equals((CharSequence)f2.g.d, (CharSequence)this.f.d) && TextUtils.equals((CharSequence)f2.g.b, (CharSequence)this.f.b) && TextUtils.equals((CharSequence)f2.g.f, (CharSequence)this.f.f);
    }

    public boolean b(f f2) {
        return "Android".equalsIgnoreCase(f2.e) && this.d.equals(f2.d) && this.a(this.f.d, f2.g.d) && this.a(this.f.b, f2.g.b) && this.a(this.f.f, f2.g.f);
    }

    private boolean a(String string, String string2) {
        return TextUtils.equals((CharSequence)string, (CharSequence)string2) || TextUtils.isEmpty((CharSequence)string2) || string2.contains("*") && string != null && Pattern.matches(string2.replace("*", ".*"), string);
    }
}

