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
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.ak;
import com.growingio.android.sdk.collection.am;
import com.growingio.android.sdk.collection.an;
import com.growingio.android.sdk.collection.e;
import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.h;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class VdsJsHelper$VdsBridge {
    final /* synthetic */ VdsJsHelper a;

    private VdsJsHelper$VdsBridge(VdsJsHelper vdsJsHelper) {
        this.a = vdsJsHelper;
    }

    @JavascriptInterface
    public void saveEvent(String string) {
        if (VdsJsHelper.a(this.a) != null) {
            VdsJsHelper.a(this.a, true);
            LogUtil.d("VdsJsHelper", string);
            if (GConfig.o().a()) {
                n n2 = new n(string, VdsJsHelper.a(this.a), VdsJsHelper.b(this.a));
                q.d().a(n2);
                j j2 = j.e();
                if (j2.c()) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        String string2 = jSONObject.getString("t");
                        if (string2.equals("clck")) {
                            List list = VdsJsHelper.a(this.a, jSONObject);
                            if (list.size() > 0) {
                                i i2 = (i)list.get(0);
                                j2.a(i2);
                            }
                        } else if (string2.equals("page")) {
                            h.a(new am(this, j2, n2));
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
    public void saveCustomEvent(String string) {
        LogUtil.d("VdsJsHelper", string);
        try {
            if (GConfig.o().a()) {
                q.d().a(new e(new JSONObject(string)));
            }
        }
        catch (Exception var2_2) {
            var2_2.printStackTrace();
        }
    }

    @JavascriptInterface
    public void hoverNodes(String string) {
        if (VdsJsHelper.a(this.a) == null || VdsJsHelper.c(this.a).get() == null) {
            return;
        }
        LogUtil.d("VdsJsHelper", string);
        ((View)VdsJsHelper.c(this.a).get()).postDelayed((Runnable)new an(this, string), 100);
    }

    /* synthetic */ VdsJsHelper$VdsBridge(VdsJsHelper vdsJsHelper, ak ak2) {
        this(vdsJsHelper);
    }
}

