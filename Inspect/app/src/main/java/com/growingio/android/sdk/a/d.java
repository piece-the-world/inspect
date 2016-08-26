/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.Pair
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.a;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.a.a;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.collection.GConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d {
    a a() {
        return a.a();
    }

    List b() {
        ArrayList<f> arrayList = new ArrayList<f>();
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
                    f f2 = new f(jSONArray.getJSONObject(i2));
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

    @TargetApi(value=9)
    public Pair a(f f2) {
        String string;
        String string2 = TextUtils.isEmpty((CharSequence)f2.b) ? "https://www.growingio.com/mobile/events" : "https://www.growingio.com/mobile/events/" + f2.b;
        String string3 = string = TextUtils.isEmpty((CharSequence)f2.b) ? "POST" : "PUT";
        if (GConfig.a) {
            Log.i((String)"GIO.TagAPI", (String)("save: " + f2.c()));
        }
        return this.a().a(string2, string, f2.toString().getBytes(Charset.forName("UTF-8")));
    }

    public JSONArray b(f f2) {
        byte[] arrby = (byte[])this.a().a((String)"https://www.growingio.com/mobile/realtime", (JSONObject)f2.d()).second;
        JSONArray jSONArray = null;
        if (arrby.length >= 0) {
            try {
                jSONArray = new JSONArray(new String(arrby));
            }
            catch (JSONException var4_4) {
                Log.d((String)"GIO.TagAPI", (String)"parse realtime data error");
            }
        }
        return jSONArray;
    }
}

