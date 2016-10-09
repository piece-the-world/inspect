/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.database.sqlite.SQLiteCantOpenDatabaseException
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Pair
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import android.annotation.TargetApi;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.ae;
import com.growingio.android.sdk.collection.ah;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.g;
import com.growingio.android.sdk.collection.n;
import com.growingio.android.sdk.snappy.e;
import com.growingio.android.sdk.utils.LogUtil;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ag
extends Handler {
    final /* synthetic */ ae a;

    ag(ae ae2, Looper looper) {
        this.a = ae2;
        super(looper);
    }

    public void handleMessage(Message msg) {
        switch (msg.what) {
            case 1: {
                ae.a(this.a).removeMessages(1);
                if (ae.b(this.a).o() < 1 || !ae.c(this.a).w() || !this.b()) break;
                ae.d(this.a).set(0);
                break;
            }
            case 0: {
                ae.a(this.a).removeMessages(0);
                if (ae.b(this.a).o() != 2) break;
                this.a();
                break;
            }
            case 2: {
                this.c();
                ae.a(this.a).sendEmptyMessageDelayed(2, 86400000);
            }
        }
    }

    private void a() {
        if (this.b()) {
            ae.d(this.a).set(0);
        }
        if (this.a(ah.d)) {
            ae.e(this.a).set(0);
        }
    }

    private boolean b() {
        boolean bl2 = this.a(ah.b);
        bl2 |= this.a(ah.a);
        return bl2 |= this.a(ah.c);
    }

    @TargetApi(value=11)
    private boolean a(ah ah2) {
        Pair pair = null;
        long l2 = 0;
        int n2 = 0;
        int n3 = ae.b(this.a).o();
        do {
            g g2 = this.a.a();
            try {
                try {
                    pair = g2.a(ah2);
                    if (pair != null) {
                        int n4 = this.a(ah2, (List)pair.second);
                        if (n4 > 0) {
                            l2 = g2.a(ah2, (String)pair.first);
                            if (n3 != 1) continue;
                            GConfig.q().a(n4);
                            continue;
                        }
                        if (++n2 < 2) continue;
                        return false;
                    }
                    return true;
                }
                catch (JSONException var8_8) {
                    LogUtil.d("GIO.MessageUploader", "generate data string error");
                    g2.a(ah2, (String)pair.first);
                    continue;
                }
            }
            catch (OutOfMemoryError var8_9) {
                n.a("oomr");
                continue;
            }
            catch (SQLiteCantOpenDatabaseException var8_10) {
                n.a("dbo");
                continue;
            }
            catch (Exception var8_11) {
                n.a(var8_11.getClass().getSimpleName());
                if (!GConfig.DEBUG) continue;
                var8_11.printStackTrace();
            }
        } while (l2 > 0);
        return false;
    }

    @TargetApi(value=9)
    private int a(ah ah2, List list) {
        JSONObject jSONObject;
        Object object3;
        String string;
        String string2;
        Object object2;
        JSONArray jSONArray = new JSONArray();
        int n2 = 0;
        String string3 = c.k().c();
        if (ah2 != ah.a) {
            if (k.e().a()) {
                string3 = c.k().d();
            }
            Object[] arrobject = new Object[4];
            arrobject[0] = "https://api.growingio.com/v2";
            arrobject[1] = string3;
            arrobject[2] = ah2 == ah.b ? "pv" : "action";
            arrobject[3] = System.currentTimeMillis();
            string2 = String.format(Locale.US, "%s/%s/android/%s?stm=%d", arrobject);
            try {
                for (Object object3 : list) {
                    object2 = new JSONObject((String)object3);
                    String string4 = object2.optString("t");
                    if ("imp".equals(string4) || "clck".equals(string4)) {
                        JSONArray jSONArray2 = object2.getJSONArray("e");
                        n2 += jSONArray2.length();
                    } else {
                        ++n2;
                    }
                    jSONArray.put(object2);
                }
            }
            catch (JSONException var8_8) {
                n.a("jsonu");
            }
            jSONObject = new JSONObject();
            jSONObject.put("ai", (Object)string3);
            jSONObject.put("u", (Object)ae.b(this.a).l());
            jSONObject.put("l", (Object)jSONArray);
            string = jSONObject.toString();
        } else {
            string2 = String.format(Locale.US, "%s/%s/android/events?stm=%d", "https://api.growingio.com/custom", string3, System.currentTimeMillis());
            try {
                for (Object object3 : list) {
                    object2 = new JSONObject((String)object3);
                    object2.put("u", (Object)ae.b(this.a).l());
                    jSONArray.put(object2);
                }
            }
            catch (JSONException var8_9) {
                n.a("jsonu");
            }
            string = jSONArray.toString();
        }
        if (jSONArray.length() == 0) {
            return 0;
        }
        jSONObject = e.a(string.getBytes(Charset.forName("UTF-8")));
        if (GConfig.DEBUG) {
            LogUtil.d("GIO.MessageUploader", "uploading ", string);
        }
        n.a("request");
        object3 = new HashMap();
        object3.put("Content-Type", "text/plain");
        if (GConfig.q().i()) {
            object3.put("X-GrowingIO-UID", ae.b(this.a).l());
        }
        object2 = new com.growingio.android.sdk.utils.e().a(string2).b("POST").a((Map)object3).a((byte[])jSONObject).a();
        if ((Integer)object2.b().first == 200) {
            n.a("success");
            n.a("upload", n2);
            return jSONObject.length;
        }
        return 0;
    }

    private void c() {
        long l2 = System.currentTimeMillis();
        long l3 = (l2 - 604800000) / 86400000 * 86400000;
        this.a.a().a(l3);
    }
}

