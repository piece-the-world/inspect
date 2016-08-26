/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.cu;
import org.json.JSONArray;
import org.json.JSONObject;

class cw
extends l {
    final /* synthetic */ cu a;

    cw(cu cu2) {
        this.a = cu2;
    }

    @Override
    public void b(i i2) {
        JSONObject jSONObject = i2.e();
        cu.a(this.a, jSONObject, i2);
        if (jSONObject != null) {
            cu.b(this.a).put((Object)jSONObject);
        }
    }
}

