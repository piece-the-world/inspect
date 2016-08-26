/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.util.Pair
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package com.growingio.android.sdk.a;

import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.a.a;
import com.growingio.android.sdk.b.o;
import org.json.JSONArray;
import org.json.JSONException;

public class h {
    public JSONArray a(o o2) {
        byte[] arrby = (byte[])a.a().a((String)"https://www.growingio.com/mobile/xrank", (String)"POST", (byte[])o2.toString().getBytes()).second;
        JSONArray jSONArray = null;
        if (arrby.length >= 0) {
            try {
                jSONArray = new JSONArray(new String(arrby));
            }
            catch (JSONException var4_4) {
                Log.d((String)"GIO.XPathRankAPI", (String)"parse rank data error");
            }
        }
        return jSONArray;
    }
}

