/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Pair
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.growingio.android.sdk.b.a;
import com.growingio.android.sdk.b.b;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.b.n;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.f;
import com.growingio.android.sdk.collection.m;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.collection.y;
import com.growingio.android.sdk.utils.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class x
extends Handler {
    final /* synthetic */ q a;

    x(q q2, Looper looper) {
        this.a = q2;
        super(looper);
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 0: {
                this.a((g)message.obj);
            }
        }
        super.handleMessage(message);
    }

    private void a(g g2) {
        block11 : {
            try {
                boolean bl2;
                boolean bl3 = bl2 = !(g2 instanceof a) || ((a)g2).e();
                if (g2 instanceof n && !(bl2 &= !((n)g2).b().getString("t").equals("imp")) && !GConfig.o().c()) {
                    return;
                }
                f f2 = f.a();
                if (f2 == null) {
                    f.a(q.b(this.a).g());
                    f2 = f.a();
                }
                if (!bl2 && q.c(this.a).u()) {
                    String string = "imp";
                    Pair pair = this.b(g2);
                    if (pair.first != null) {
                        bl2 = true;
                        f2.a(string, true, (String)pair.first);
                    }
                    if (pair.second != null && !q.c(this.a).z()) {
                        f2.a(string, false, (String)pair.second);
                    }
                } else {
                    JSONObject jSONObject = g2.b();
                    String string = jSONObject.getString("t");
                    f2.a(string, bl2, jSONObject.toString());
                }
                q.f(this.a).a(bl2);
            }
            catch (OutOfMemoryError var2_3) {
                m.a("oomw");
            }
            catch (JSONException var2_4) {
                m.a("jsonw");
            }
            catch (Exception var2_5) {
                m.a(var2_5.getClass().getSimpleName());
                if (!GConfig.a) break block11;
                var2_5.printStackTrace();
            }
        }
        if (g2.f() > 0) {
            m.a("events", g2.f());
            this.a();
        }
    }

    private Pair b(g g2) {
        HashMap hashMap = q.c(this.a).f();
        ArrayList arrayList = (ArrayList)hashMap.get(null);
        if (g2 instanceof a) {
            ArrayList arrayList2 = (ArrayList)hashMap.get(g2.g);
            int n2 = (arrayList2 != null ? arrayList2.size() : 0) + (arrayList != null ? arrayList.size() : 0);
            if (n2 == 0) {
                return new Pair((Object)null, (Object)g2.b().toString());
            }
            a a2 = ((a)g2).d();
            a a3 = ((a)g2).d();
            for (b b2 : ((a)g2).a) {
                if (arrayList != null && this.a(b2, arrayList) || arrayList2 != null && this.a(b2, arrayList2)) {
                    a2.a.add(b2);
                    continue;
                }
                a3.a.add(b2);
            }
            return new Pair((Object)(a2.f() > 0 ? a2.b().toString() : null), (Object)(a3.f() > 0 ? a3.b().toString() : null));
        }
        if (g2 instanceof n) {
            n n3 = (n)g2;
            JSONObject jSONObject = n3.b();
            try {
                JSONObject jSONObject2;
                String string = jSONObject.getString("d");
                String string2 = jSONObject.getString("p");
                ArrayList arrayList3 = (ArrayList)hashMap.get(string2);
                ArrayList arrayList4 = (ArrayList)hashMap.get(g2.g + "::" + '*');
                int n4 = (arrayList3 != null ? arrayList3.size() : 0) + (arrayList != null ? arrayList.size() : 0) + (arrayList4 != null ? arrayList4.size() : 0);
                if (n4 == 0) {
                    return new Pair((Object)null, (Object)g2.b().toString());
                }
                JSONArray jSONArray = jSONObject.getJSONArray("e");
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                int n5 = jSONArray.length();
                for (int i2 = 0; i2 < n5; ++i2) {
                    jSONObject2 = jSONArray.getJSONObject(i2);
                    if (arrayList != null && this.a(jSONObject2, arrayList, string) || arrayList4 != null && this.a(jSONObject2, arrayList4, string) || arrayList3 != null && this.a(jSONObject2, arrayList3, string)) {
                        jSONArray2.put((Object)jSONObject2);
                        continue;
                    }
                    jSONArray3.put((Object)jSONObject2);
                }
                String string3 = jSONArray2.length() > 0 ? jSONObject.put("e", (Object)jSONArray2).toString() : null;
                jSONObject2 = jSONArray3.length() > 0 ? jSONObject.put("e", (Object)jSONArray3).toString() : null;
                return new Pair((Object)string3, (Object)jSONObject2);
            }
            catch (JSONException var6_10) {
                var6_10.printStackTrace();
            }
        }
        return new Pair((Object)null, (Object)null);
    }

    private boolean a(JSONObject jSONObject, ArrayList arrayList, String string) {
        for (h h2 : arrayList) {
            if (!h2.i || !h2.d.equals(string) || h2.a != null && !i.a(h2.a, jSONObject.getString("x")) || h2.e != null && !h2.e.equals(String.valueOf(jSONObject.optInt("idx", -1))) || h2.c != null && !h2.c.equals(jSONObject.optString("v")) || h2.g != null && (!h2.g.equals(jSONObject.optString("h")) || h2.f != null && !h2.f.equals(jSONObject.optString("q")))) continue;
            return true;
        }
        return false;
    }

    private boolean a(b b2, ArrayList arrayList) {
        for (h h2 : arrayList) {
            if (h2.i || h2.a != null && !i.a(h2.a, b2.a) || h2.e != null && !h2.e.equals(String.valueOf(b2.c)) || h2.c != null && !h2.c.equals(b2.d)) continue;
            return true;
        }
        return false;
    }

    private void a() {
        if (q.g()) {
            return;
        }
        if (q.g(this.a) == null) {
            q.a(this.a, new y(this));
            q.g(this.a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }

    static /* synthetic */ void a(x x2) {
        x2.a();
    }
}

