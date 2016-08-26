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
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.aa;
import com.growingio.android.sdk.collection.ad;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.collection.f;
import com.growingio.android.sdk.collection.m;
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

class ac
extends Handler {
    final /* synthetic */ aa a;

    ac(aa aa2, Looper looper) {
        this.a = aa2;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1: {
                aa.a(this.a).removeMessages(1);
                if (aa.b(this.a).l() < 1 || !aa.c(this.a).v() || !this.b()) break;
                aa.d(this.a).set(0);
                break;
            }
            case 0: {
                aa.a(this.a).removeMessages(0);
                if (aa.b(this.a).l() != 2 || !this.a()) break;
                aa.e(this.a).set(0);
                break;
            }
            case 2: {
                this.c();
                aa.a(this.a).sendEmptyMessageDelayed(2, 86400000);
            }
        }
    }

    private boolean a() {
        boolean bl2 = this.b();
        return bl2 |= this.a(ad.d);
    }

    private boolean b() {
        boolean bl2 = this.a(ad.b);
        bl2 |= this.a(ad.a);
        return bl2 |= this.a(ad.c);
    }

    @TargetApi(value=11)
    private boolean a(ad ad2) {
        Pair pair = null;
        long l2 = 0;
        int n2 = 0;
        do {
            f f2 = this.a.a();
            try {
                try {
                    pair = f2.a(ad2);
                    if (pair != null) {
                        int n3 = this.a(ad2, (List)pair.second);
                        if (n3 > 0) {
                            l2 = f2.a(ad2, (String)pair.first);
                            continue;
                        }
                        if (++n2 < 2) continue;
                        return false;
                    }
                    return true;
                }
                catch (JSONException var7_7) {
                    LogUtil.d("GIO.MessageUploader", "generate data string error");
                    f2.a(ad2, (String)pair.first);
                    continue;
                }
            }
            catch (OutOfMemoryError var7_8) {
                m.a("oomr");
                continue;
            }
            catch (SQLiteCantOpenDatabaseException var7_9) {
                m.a("dbo");
                continue;
            }
            catch (Exception var7_10) {
                m.a(var7_10.getClass().getSimpleName());
                if (!GConfig.a) continue;
                var7_10.printStackTrace();
            }
        } while (l2 > 0);
        return false;
    }

    @TargetApi(value=9)
    private int a(ad ad2, List list) {
        JSONObject jSONObject;
        Object object3;
        String string;
        String string2;
        Object object2;
        JSONArray jSONArray = new JSONArray();
        int n2 = 0;
        String string3 = c.h().d();
        if (ad2 != ad.a) {
            if (j.e().a()) {
                string3 = c.h().e();
            }
            Object[] arrobject = new Object[4];
            arrobject[0] = "https://api.growingio.com/v2/";
            arrobject[1] = string3;
            arrobject[2] = ad2 == ad.b ? "pv" : "action";
            arrobject[3] = System.currentTimeMillis();
            string2 = String.format(Locale.US, "%s%s/android/%s?stm=%d", arrobject);
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
                m.a("jsonu");
            }
            jSONObject = new JSONObject();
            jSONObject.put("ai", (Object)string3);
            jSONObject.put("u", (Object)aa.b(this.a).i());
            jSONObject.put("l", (Object)jSONArray);
            string = jSONObject.toString();
        } else {
            string2 = String.format(Locale.US, "%s%s/android/events?stm=%d", "https://api.growingio.com/custom/", string3, System.currentTimeMillis());
            try {
                for (Object object3 : list) {
                    object2 = new JSONObject((String)object3);
                    object2.put("u", (Object)aa.b(this.a).i());
                    jSONArray.put(object2);
                }
            }
            catch (JSONException var8_9) {
                m.a("jsonu");
            }
            string = jSONArray.toString();
        }
        if (jSONArray.length() == 0) {
            return 0;
        }
        jSONObject = e.a(string.getBytes(Charset.forName("UTF-8")));
        if (GConfig.a) {
            LogUtil.d("GIO.MessageUploader", "uploading " + string);
        }
        m.a("request");
        object3 = new HashMap();
        object3.put("Content-Type", "text/plain");
        if (GConfig.o().g()) {
            object3.put("X-GrowingIO-UID", aa.b(this.a).i());
        }
        object2 = new com.growingio.android.sdk.utils.e().a(string2).b("POST").a((Map)object3).a((byte[])jSONObject).a();
        if ((Integer)object2.b().first == 200) {
            m.a("success");
            m.a("upload", n2);
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

