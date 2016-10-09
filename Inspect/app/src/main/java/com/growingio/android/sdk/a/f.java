/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.util.Pair
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.a;

import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.a.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f {
    c a() {
        return c.a();
    }

    List b() {
        ArrayList<com.growingio.android.sdk.b.f> arrayList = new ArrayList<com.growingio.android.sdk.b.f>();
        byte[] arrby = (byte[])this.a().a((String)"https://www.growingio.com/mobile/events").second;
        if (arrby.length >= 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(new String(arrby));
            }
            catch (JSONException var4_4) {
                Log.d((String)"GIO.TagAPI", (String)"generate tags error", (Throwable)var4_4);
            }
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                try {
                    com.growingio.android.sdk.b.f f2 = new com.growingio.android.sdk.b.f(jSONArray.getJSONObject(i2));
                    if (f2.a || !"Android".equalsIgnoreCase(f2.e)) continue;
                    arrayList.add(f2);
                    continue;
                }
                catch (JSONException var5_7) {
                    var5_7.printStackTrace();
                }
            }
        }
        return arrayList;
    }
}

