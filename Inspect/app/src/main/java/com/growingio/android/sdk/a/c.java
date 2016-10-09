/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.util.Log
 *  android.util.Pair
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.a;

import android.annotation.TargetApi;
import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.a.d;
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(value=11)
class c {
    com.growingio.android.sdk.utils.e a = new com.growingio.android.sdk.utils.e();
    private static final Object b = new Object();
    private static c c;

    private c() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static c a() {
        Object object = b;
        synchronized (object) {
            if (c == null) {
                c = new c();
            }
            return c;
        }
    }

    static com.growingio.android.sdk.collection.c b() {
        return com.growingio.android.sdk.collection.c.k();
    }

    static e c() {
        return e.a();
    }

    Pair a(String string, String string2, byte[] arrby) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Accept", "application/json");
        hashMap.put("token", c.c().d());
        hashMap.put("accountId", com.growingio.android.sdk.collection.c.k().c());
        com.growingio.android.sdk.utils.c c2 = this.a.a(string).b(string2).a(hashMap).a(arrby).a();
        Pair pair = c2.b();
        if ((Integer)pair.first == 403 || (Integer)pair.first == 404) {
            i.a(new d(this));
        }
        if (GConfig.DEBUG) {
            Log.w((String)"HttpUtil", (String)(string2 + " " + string + " response " + pair.first + " content:" + new String((byte[])pair.second)));
        }
        return pair;
    }

    Pair a(String string) {
        return this.a(string, "GET", null);
    }

    Pair a(String string, JSONObject jSONObject) {
        return this.a(string, "POST", jSONObject.toString().getBytes());
    }
}

