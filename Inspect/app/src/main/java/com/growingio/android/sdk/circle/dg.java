/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.growingio.android.sdk.a.h;
import com.growingio.android.sdk.b.o;
import com.growingio.android.sdk.circle.de;
import com.growingio.android.sdk.circle.df;
import com.growingio.android.sdk.circle.dh;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class dg
extends AsyncTask {
    df a;
    private List c;
    final /* synthetic */ de b;

    dg(de de2, List list, df df2) {
        this.b = de2;
        this.c = list;
        this.a = df2;
    }

    protected /* varargs */ List a(o ... arro) {
        JSONArray jSONArray = new h().a(arro[0]);
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            try {
                int n2 = ((JSONObject)jSONArray.get(i2)).getInt("rank");
                String string = ((JSONObject)jSONArray.get(i2)).getString("xpath");
                if (TextUtils.isEmpty((CharSequence)string)) continue;
                hashMap.put(string, n2);
                continue;
            }
            catch (JSONException var5_6) {
                var5_6.printStackTrace();
            }
        }
        Collections.sort(this.c, new dh(this, hashMap));
        return this.c;
    }

    protected void a(List list) {
        this.a.a(list);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((List)object);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a((o[])arrobject);
    }
}

