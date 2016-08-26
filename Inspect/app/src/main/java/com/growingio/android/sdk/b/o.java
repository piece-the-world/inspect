/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.b;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class o {
    String a;
    String b;
    ArrayList c;
    String d;

    public o(String string, String string2, ArrayList arrayList, String string3) {
        this.a = string;
        this.b = string2;
        this.c = arrayList;
        this.d = string3;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("domain", (Object)this.a);
            jSONObject.put("path", (Object)this.b);
            jSONObject.put("xpath", (Object)new JSONArray((Collection)this.c));
            jSONObject.put("range", (Object)this.d);
        }
        catch (JSONException var2_2) {
            // empty catch block
        }
        return jSONObject.toString();
    }
}

