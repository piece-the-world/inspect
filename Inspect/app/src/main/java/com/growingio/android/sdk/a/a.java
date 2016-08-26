/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.os.Handler
 *  android.util.Log
 *  android.util.Pair
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.a;

import android.annotation.TargetApi;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import com.growingio.android.sdk.a.b;
import com.growingio.android.sdk.a.c;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.utils.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(value=11)
class a {
    e a = new e();
    private static final Object b = new Object();
    private static a c;

    private a() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static a a() {
        Object object = b;
        synchronized (object) {
            if (c == null) {
                c = new a();
            }
            return c;
        }
    }

    static com.growingio.android.sdk.collection.c b() {
        return com.growingio.android.sdk.collection.c.h();
    }

    static c c() {
        return c.a();
    }

    Pair a(String string, String string2, byte[] arrby) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Content-Type", "application/json");
        hashMap.put("Accept", "application/json");
        hashMap.put("token", a.c().d());
        hashMap.put("accountId", com.growingio.android.sdk.collection.c.h().d());
        com.growingio.android.sdk.utils.c c2 = this.a.a(string).b(string2).a(hashMap).a(arrby).a();
        Pair pair = c2.b();
        if ((Integer)pair.first == 403 || (Integer)pair.first == 404) {
            a.b().c().post((Runnable)new b(this));
        }
        if (GConfig.a) {
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

