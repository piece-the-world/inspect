/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import android.view.ViewGroup;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.collection.q;
import org.json.JSONException;
import org.json.JSONObject;

class bj
implements Runnable {
    final /* synthetic */ ar a;

    bj(ar ar2) {
        this.a = ar2;
    }

    @Override
    public void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            String string = "element";
            if (ar.c(this.a)) {
                string = "page";
            }
            jSONObject.put("type", (Object)string);
            String string2 = "short_press";
            if (ar.d(this.a)) {
                string2 = "long_press";
            }
            jSONObject.put("trigger", (Object)string2);
        }
        catch (JSONException var2_3) {
            // empty catch block
        }
        this.a.a().a("EventDetailEditWindow", null);
        this.a.a().a("/GioWindow/EventDetailEditWindow[0]", jSONObject.toString(), false);
        ar.a(this.a, ((ViewGroup)ar.e(this.a).getDecorView().getRootView()).getChildAt(0));
    }
}

