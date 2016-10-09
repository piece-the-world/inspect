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
import com.growingio.android.sdk.b.h;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.ac;
import com.growingio.android.sdk.collection.g;
import com.growingio.android.sdk.collection.n;
import com.growingio.android.sdk.collection.t;
import com.growingio.android.sdk.utils.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ab
extends Handler {
    final /* synthetic */ t a;

    ab(t t2, Looper looper) {
        this.a = t2;
        super(looper);
    }

    public void handleMessage(Message msg) {
        switch (msg.what) {
            case 0: {
                this.a((com.growingio.android.sdk.b.g)msg.obj);
            }
        }
        super.handleMessage(msg);
    }

    private void a(com.growingio.android.sdk.b.g g2) {
        block12 : {
            try {
                boolean bl2;
                boolean bl3 = bl2 = !(g2 instanceof a) || ((a)g2).f();
                if (g2 instanceof com.growingio.android.sdk.b.n && !(bl2 &= !((com.growingio.android.sdk.b.n)g2).b().getString("t").equals("imp")) && !GConfig.q().c()) {
                    return;
                }
                g g3 = g.a();
                if (g3 == null) {
                    g.a(t.c(this.a).j());
                    g3 = g.a();
                }
                if (!(bl2 || t.d(this.a).g() || t.d(this.a).A())) {
                    bl2 = true;
                }
                if (!bl2 && t.d(this.a).v()) {
                    String string = "imp";
                    Pair pair = this.b(g2);
                    if (pair.first != null) {
                        bl2 = true;
                        g3.a(string, !t.d(this.a).g(), (String)pair.first);
                    }
                    if (pair.second != null && !t.d(this.a).A()) {
                        g3.a(string, false, (String)pair.second);
                    }
                } else {
                    JSONObject jSONObject = g2.b();
                    String string = jSONObject.getString("t");
                    g3.a(string, bl2, jSONObject.toString());
                }
                t.e(this.a).a(bl2, g2.g());
            }
            catch (OutOfMemoryError var2_3) {
                n.a("oomw");
            }
            catch (JSONException var2_4) {
                n.a("jsonw");
            }
            catch (Exception var2_5) {
                n.a(var2_5.getClass().getSimpleName());
                if (!GConfig.DEBUG) break block12;
                var2_5.printStackTrace();
            }
        }
        if (g2.g() > 0) {
            n.a("events", g2.g());
            this.a();
        }
    }

    private Pair b(com.growingio.android.sdk.b.g g2) {
        HashMap hashMap = t.d(this.a).h();
        ArrayList arrayList = (ArrayList)hashMap.get(null);
        if (g2 instanceof a) {
            ArrayList arrayList2 = (ArrayList)hashMap.get(g2.g);
            int n2 = (arrayList2 != null ? arrayList2.size() : 0) + (arrayList != null ? arrayList.size() : 0);
            if (n2 == 0) {
                return new Pair((Object)null, (Object)g2.b().toString());
            }
            a a2 = ((a)g2).e();
            a a3 = ((a)g2).e();
            for (b b2 : ((a)g2).a) {
                if (arrayList != null && this.a(b2, arrayList) || arrayList2 != null && this.a(b2, arrayList2)) {
                    a2.a.add(b2);
                    continue;
                }
                a3.a.add(b2);
            }
            return new Pair((Object)(a2.g() > 0 ? a2.b().toString() : null), (Object)(a3.g() > 0 ? a3.b().toString() : null));
        }
        if (g2 instanceof com.growingio.android.sdk.b.n) {
            com.growingio.android.sdk.b.n n3 = (com.growingio.android.sdk.b.n)g2;
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
            if (!h2.i || !h2.d.equals(string) || h2.a != null && !j.a(h2.a, jSONObject.getString("x")) || h2.e != null && !h2.e.equals(String.valueOf(jSONObject.optInt("idx", -1))) || h2.c != null && !h2.c.equals(jSONObject.optString("v")) || h2.g != null && (!h2.g.equals(jSONObject.optString("h")) || h2.f != null && !h2.f.equals(jSONObject.optString("q")))) continue;
            return true;
        }
        return false;
    }

    private boolean a(b b2, ArrayList arrayList) {
        for (h h2 : arrayList) {
            if (h2.i || h2.a != null && !j.a(h2.a, b2.a) || h2.e != null && !h2.e.equals(String.valueOf(b2.c)) || h2.c != null && !h2.c.equals(b2.d)) continue;
            return true;
        }
        return false;
    }

    private void a() {
        if (t.f()) {
            return;
        }
        if (t.f(this.a) == null) {
            t.a(this.a, new ac(this));
            t.f(this.a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        }
    }

    static /* synthetic */ void a(ab ab2) {
        ab2.a();
    }
}

