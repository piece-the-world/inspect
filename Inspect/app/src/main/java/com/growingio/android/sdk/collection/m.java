/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.collection.n;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class m {
    String a;
    String b;
    HashMap c;

    m(String string, String string2) {
        this.a = string;
        this.b = string2;
        this.c = new HashMap();
    }

    m(String string, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.a = string;
            this.c = new HashMap();
            Iterator iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                if (string2.equals("detail_date")) {
                    this.b = jSONObject.getString("detail_date");
                    continue;
                }
                this.c.put(string2, jSONObject.getInt(string2));
            }
            if (this.b == null) {
                this.b = n.a.format(new Date());
            }
        }
        catch (JSONException var3_4) {
            var3_4.printStackTrace();
        }
    }

    String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.c != null) {
                for (String string : this.c.keySet()) {
                    jSONObject.put(string, this.c.get(string));
                }
            }
            jSONObject.put("detail_date", (Object)this.b);
        }
        catch (JSONException var2_3) {
            var2_3.printStackTrace();
        }
        return jSONObject.toString();
    }
}

