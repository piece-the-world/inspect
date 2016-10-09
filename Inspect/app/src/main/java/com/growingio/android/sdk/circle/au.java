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
import com.growingio.android.sdk.circle.HybridEventEditDialog$HybridCircleContent;
import org.json.JSONArray;
import org.json.JSONObject;

class au
extends l {
    final /* synthetic */ JSONArray a;
    final /* synthetic */ JSONArray b;
    final /* synthetic */ HybridEventEditDialog$HybridCircleContent c;

    au(HybridEventEditDialog$HybridCircleContent hybridCircleContent, JSONArray jSONArray, JSONArray jSONArray2) {
        this.c = hybridCircleContent;
        this.a = jSONArray;
        this.b = jSONArray2;
    }

    @Override
    public void b(i i2) {
        if (this.c.a) {
            this.a.put((Object)i2.e());
        } else {
            this.b.put((Object)i2.e());
        }
    }
}

