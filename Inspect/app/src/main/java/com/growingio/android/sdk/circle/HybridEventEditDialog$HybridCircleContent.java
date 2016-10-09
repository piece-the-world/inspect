/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.webkit.JavascriptInterface
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.au;
import com.growingio.android.sdk.circle.bd;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.j;
import com.growingio.android.sdk.utils.n;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class HybridEventEditDialog$HybridCircleContent {
    boolean a;
    String b;

    HybridEventEditDialog$HybridCircleContent(String data) {
        this.b = data;
    }

    HybridEventEditDialog$HybridCircleContent(List nodes, Activity foregroundActivity, String path, String domain) {
        JSONObject jSONObject = new JSONObject();
        try {
            c c2 = c.k();
            PackageManager packageManager = c2.j().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(c2.b(), 0);
            jSONObject.put("sdkVersion", (Object)"0.9.98_355b84e");
            jSONObject.put("projectId", (Object)c2.c());
            jSONObject.put("accessToken", (Object)e.a().d());
            jSONObject.put("appVersion", (Object)packageInfo.versionName);
            jSONObject.put("platform", (Object)"Android");
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("domain", (Object)domain);
            jSONObject2.put("page", (Object)path);
            CharSequence charSequence = foregroundActivity.getTitle();
            if (TextUtils.isEmpty((CharSequence)charSequence)) {
                charSequence = j.a(foregroundActivity.getClass());
            }
            jSONObject2.put("title", (Object)charSequence);
            jSONObject2.put("snapshot", (Object)("data:image/jpeg;base64," + Base64.encodeToString((byte[])bd.a(n.c(), null), (int)2)));
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            JSONObject jSONObject3 = null;
            if (nodes.size() > 0 && ((i)nodes.get((int)0)).q != null) {
                i i2 = (i)nodes.get(0);
                this.a = true;
                jSONObject3 = new JSONObject();
                jSONObject3.put("domain", (Object)(domain + "::" + i2.q.a));
                jSONObject3.put("page", (Object)(path + "::" + i2.q.b));
                jSONObject3.put("query", (Object)i2.q.c);
            }
            for (i i3 : nodes) {
                au au2 = new au(this, jSONArray3, jSONArray2);
                i3.a(au2);
                au2.b(i3);
                i3.b();
            }
            jSONObject2.put("e", (Object)jSONArray2);
            jSONArray.put((Object)jSONObject2);
            if (jSONObject3 != null) {
                jSONObject3.put("e", (Object)jSONArray3);
                jSONArray.put((Object)jSONObject3);
            }
            jSONObject.put("pages", (Object)jSONArray);
            this.b = jSONObject.toString();
        }
        catch (Exception var6_7) {
            var6_7.printStackTrace();
        }
    }

    @JavascriptInterface
    public String getData() {
        return this.b;
    }
}

