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
import com.growingio.android.sdk.circle.be;
import org.json.JSONArray;
import org.json.JSONObject;

class bf
extends l {
    final /* synthetic */ be a;

    bf(be be2) {
        this.a = be2;
    }

    @Override
    public void b(i i2) {
        JSONObject jSONObject = i2.e();
        if (jSONObject != null) {
            be.a(this.a).put((Object)jSONObject);
        }
    }
}

