/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import android.webkit.WebView;
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.ag;
import com.growingio.android.sdk.utils.a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class q
extends l {
    final /* synthetic */ j a;

    q(j j2) {
        this.a = j2;
    }

    @Override
    public void b(i i2) {
        if (i2.c instanceof WebView || a.c((Object)i2.c)) {
            View view = i2.c;
            JSONArray jSONArray = new JSONArray();
            for (f f2 : j.j(this.a).f()) {
                jSONArray.put((Object)f2.b());
            }
            boolean bl2 = GConfig.o().r();
            if (ag.a(view)) {
                if (bl2) {
                    com.growingio.android.sdk.utils.i.a(view, "_vds_hybrid.setTags", e.c().f());
                    com.growingio.android.sdk.utils.i.a(view, "_vds_hybrid.setShowCircledTags", true);
                } else {
                    com.growingio.android.sdk.utils.i.a(view, "_vds_hybrid.setTags", new Object[0]);
                    com.growingio.android.sdk.utils.i.a(view, "_vds_hybrid.setShowCircledTags", false);
                }
            }
        }
    }
}

