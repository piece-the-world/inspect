/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.JavascriptInterface
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import android.view.View;
import android.webkit.JavascriptInterface;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.n;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.ao;
import com.growingio.android.sdk.collection.aq;
import com.growingio.android.sdk.collection.ar;
import com.growingio.android.sdk.collection.f;
import com.growingio.android.sdk.collection.t;
import com.growingio.android.sdk.utils.LogUtil;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class VdsJsHelper$VdsBridge {
    final /* synthetic */ VdsJsHelper a;

    private VdsJsHelper$VdsBridge(VdsJsHelper vdsJsHelper) {
        this.a = vdsJsHelper;
    }

    @JavascriptInterface
    public void saveEvent(String event) {
        if (VdsJsHelper.a(this.a) != null) {
            VdsJsHelper.a(this.a, true);
            LogUtil.d("VdsJsHelper", event);
            if (GConfig.q().a()) {
                n n2 = new n(event, VdsJsHelper.a(this.a), VdsJsHelper.b(this.a));
                t.d().a(n2);
                k k2 = k.e();
                if (k2.c()) {
                    try {
                        JSONObject jSONObject = new JSONObject(event);
                        String string = jSONObject.getString("t");
                        if (string.equals("clck")) {
                            List list = VdsJsHelper.a(this.a, jSONObject);
                            if (list.size() > 0) {
                                i i2 = (i)list.get(0);
                                k2.a(i2);
                            }
                        } else if (string.equals("page")) {
                            com.growingio.android.sdk.utils.i.a(new aq(this, k2, n2));
                        }
                    }
                    catch (JSONException var4_5) {
                        var4_5.printStackTrace();
                    }
                }
            }
        }
    }

    @JavascriptInterface
    public void saveCustomEvent(String event) {
        LogUtil.d("VdsJsHelper", event);
        try {
            if (GConfig.q().a()) {
                t.d().a(new f(new JSONObject(event)));
            }
        }
        catch (Exception var2_2) {
            var2_2.printStackTrace();
        }
    }

    @JavascriptInterface
    public void hoverNodes(String message) {
        if (VdsJsHelper.a(this.a) == null || VdsJsHelper.c(this.a).get() == null) {
            return;
        }
        LogUtil.d("VdsJsHelper", message);
        ((View)VdsJsHelper.c(this.a).get()).postDelayed((Runnable)new ar(this, message), 100);
    }

    /* synthetic */ VdsJsHelper$VdsBridge(VdsJsHelper x0, ao x1) {
        this(x0);
    }
}

