/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import android.webkit.WebView;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.ag;

class o
extends l {
    final /* synthetic */ j a;

    o(j j2) {
        this.a = j2;
    }

    @Override
    public void b(i i2) {
        WebView webView;
        if (i2.c instanceof WebView && ag.a((View)(webView = (WebView)i2.c))) {
            j.i(this.a);
            com.growingio.android.sdk.utils.i.a((View)webView, "_vds_hybrid.snapshotAllElements", new Object[0]);
        }
    }
}

