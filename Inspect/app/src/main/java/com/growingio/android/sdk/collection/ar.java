/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.j;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.VdsJsHelper$VdsBridge;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class ar
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ VdsJsHelper$VdsBridge b;

    ar(VdsJsHelper$VdsBridge vdsJsHelper$VdsBridge, String string) {
        this.b = vdsJsHelper$VdsBridge;
        this.a = string;
    }

    @Override
    public void run() {
        try {
            List list;
            JSONObject jSONObject = new JSONObject(this.a);
            String string = jSONObject.getString("t");
            if (string.equals("snap") && (list = VdsJsHelper.a(this.b.a, jSONObject)).size() > 0) {
                i i2 = (i)list.get(0);
                k.e().a(list, i2.q.a, i2.q.b);
            }
        }
        catch (JSONException var1_2) {
            var1_2.printStackTrace();
        }
    }
}

