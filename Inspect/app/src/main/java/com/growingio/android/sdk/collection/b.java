/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 *  android.webkit.WebView
 */
package com.growingio.android.sdk.collection;

import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.a;
import com.growingio.android.sdk.collection.ag;

class b
extends l {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    @Override
    public void b(i i2) {
        boolean bl2 = false;
        if (a.a(this.a).get(i2.hashCode()) == null) {
            com.growingio.android.sdk.b.b b2 = a.a(this.a, i2);
            a.a(this.a).put(i2.hashCode(), (Object)b2);
            a.b(this.a).add(b2);
            bl2 = true;
        }
        if (i2.c instanceof WebView || com.growingio.android.sdk.utils.a.c((Object)i2.c)) {
            if (GConfig.a) {
                Log.d((String)"GIO.ActionCalculator", (String)("traverseCallBack: update view node for " + (Object)i2.c));
            }
            ag.a(i2.c, i2, bl2);
        }
    }
}

