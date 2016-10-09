/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.collection.aj;
import com.growingio.android.sdk.collection.c;
import org.json.JSONException;
import org.json.JSONObject;

public class f
extends g {
    String a;
    JSONObject b;
    JSONObject c;
    long d;

    public f(JSONObject jSONObject) {
        this.c = jSONObject;
        try {
            jSONObject.put("s", (Object)aj.a());
            String string = jSONObject.getString("d");
            jSONObject.put("d", (Object)(c.k().b() + "::" + string));
            String string2 = jSONObject.getString("p");
            jSONObject.put("p", (Object)(c.k().t() + "::" + string2));
        }
        catch (JSONException var2_3) {
            var2_3.printStackTrace();
        }
    }

    public f(String string, JSONObject jSONObject, JSONObject jSONObject2) {
        this.a = string;
        this.b = jSONObject2;
    }

    boolean a() {
        return this.c != null;
    }

    @Override
    public JSONObject b() {
        try {
            if (this.c != null) {
                return this.c;
            }
            JSONObject jSONObject = this.j();
            jSONObject.put("n", (Object)this.a);
            jSONObject.put("t", (Object)"cstm");
            jSONObject.put("e", (Object)this.b);
            jSONObject.put("ptm", this.d);
            return jSONObject;
        }
        catch (JSONException var1_2) {
            var1_2.printStackTrace();
            return null;
        }
    }
}

