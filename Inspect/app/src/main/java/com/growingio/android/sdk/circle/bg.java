/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.be;
import com.growingio.android.sdk.utils.j;
import org.json.JSONArray;
import org.json.JSONObject;

class bg
extends l {
    final /* synthetic */ be a;

    bg(be be2) {
        this.a = be2;
    }

    @Override
    public boolean a(i i2) {
        return super.a(i2) || j.b(i2.c);
    }

    @Override
    public void b(i i2) {
        JSONObject jSONObject = i2.e();
        be.a(this.a, jSONObject, i2);
        if (jSONObject != null) {
            be.b(this.a).put((Object)jSONObject);
        }
    }
}

