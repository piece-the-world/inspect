/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.util.Base64
 *  android.view.View
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.util.Base64;
import android.view.View;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.j;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.bd;
import com.growingio.android.sdk.circle.bf;
import com.growingio.android.sdk.circle.bg;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.k;
import com.growingio.android.sdk.utils.n;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class be {
    private final String a = "GIO.ScreenshotInfo";
    private WeakReference b = null;
    private JSONArray c = new JSONArray();
    private List d;
    private i e;
    private JSONArray f;
    private String g;
    private String h;
    private String i;
    private l j;

    public be(Activity activity, List list, i i2) {
        this.j = new bg(this);
        this.b = new WeakReference<Activity>(activity);
        this.d = list;
        this.e = i2;
    }

    @TargetApi(value=8)
    public JSONObject a() {
        Activity activity = (Activity)this.b.get();
        JSONObject jSONObject = new JSONObject();
        if (activity != null) {
            View[] arrview = n.c();
            byte[] arrby = bd.a(arrview, null);
            try {
                this.g = c.k().b(activity);
                this.h = c.k().b();
                jSONObject.put("page", (Object)this.g);
                jSONObject.put("screenshotWidth", bd.c());
                jSONObject.put("screenshotHeight", bd.e());
                jSONObject.put("title", (Object)activity.getTitle());
                this.i = "data:image/jpeg;base64," + Base64.encodeToString((byte[])arrby, (int)2);
                jSONObject.put("impress", (Object)this.a(arrview));
                if (this.e != null) {
                    this.f = new JSONArray();
                    bf bf2 = new bf(this);
                    bf2.b(this.e);
                    this.e.a(bf2);
                    this.e.b();
                    jSONObject.put("targets", (Object)this.f);
                }
                jSONObject.put("screenshot", (Object)this.i);
            }
            catch (JSONException var5_6) {
                LogUtil.d("GIO.ScreenshotInfo", "generate screenshot data error", (Throwable)var5_6);
            }
        }
        return jSONObject;
    }

    private JSONArray a(View[] arrview) {
        this.c = new JSONArray();
        k.a(arrview, this.j);
        if (this.d != null) {
            for (i i2 : this.d) {
                JSONObject jSONObject = this.a(i2);
                if (jSONObject == null) continue;
                this.c.put((Object)jSONObject);
            }
        }
        return this.c;
    }

    private JSONObject a(i i2) {
        JSONObject jSONObject = i2.e();
        this.a(jSONObject, i2);
        return jSONObject;
    }

    private void a(JSONObject jSONObject, i i2) {
        if (jSONObject == null) {
            return;
        }
        String string = this.g;
        String string2 = this.h;
        if (i2.q != null) {
            string = this.g + "::" + i2.q.b;
            string2 = this.h + "::" + i2.q.a;
        }
        try {
            jSONObject.put("domain", (Object)string2);
            jSONObject.put("page", (Object)string);
        }
        catch (JSONException var5_5) {
            var5_5.printStackTrace();
        }
    }

    static /* synthetic */ JSONArray a(be be2) {
        return be2.f;
    }

    static /* synthetic */ void a(be be2, JSONObject jSONObject, i i2) {
        be2.a(jSONObject, i2);
    }

    static /* synthetic */ JSONArray b(be be2) {
        return be2.c;
    }
}

