/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class l {
    String a;
    HashMap b;

    l(String string) {
        this.a = string;
        this.b = new HashMap();
    }

    l(String string, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.a = string;
            this.b = new HashMap();
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                this.b.put(string2, jSONObject.getInt(string2));
            }
        }
        catch (JSONException var3_4) {
            var3_4.printStackTrace();
        }
    }

    String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.b != null) {
                for (String string : this.b.keySet()) {
                    jSONObject.put(string, this.b.get(string));
                }
            }
        }
        catch (JSONException var2_3) {
            var2_3.printStackTrace();
        }
        return jSONObject.toString();
    }
}

