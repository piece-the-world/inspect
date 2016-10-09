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
import com.growingio.android.sdk.a.g;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.ak;
import com.growingio.android.sdk.utils.a;
import com.growingio.android.sdk.utils.j;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

class r
extends l {
    final /* synthetic */ k a;

    r(k k2) {
        this.a = k2;
    }

    @Override
    public void b(i i2) {
        if (i2.c instanceof WebView || a.d((Object)i2.c)) {
            View view = i2.c;
            JSONArray jSONArray = new JSONArray();
            for (f f2 : k.j(this.a).f()) {
                jSONArray.put((Object)f2.b());
            }
            boolean bl2 = GConfig.q().s();
            if (ak.a(view)) {
                if (bl2) {
                    j.a(view, "_vds_hybrid.setTags", g.c().f());
                    j.a(view, "_vds_hybrid.setShowCircledTags", true);
                } else {
                    j.a(view, "_vds_hybrid.setTags", new Object[0]);
                    j.a(view, "_vds_hybrid.setShowCircledTags", false);
                }
            }
        }
    }
}

