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
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.ak;
import com.growingio.android.sdk.utils.j;

class p
extends l {
    final /* synthetic */ k a;

    p(k k2) {
        this.a = k2;
    }

    @Override
    public void b(i i2) {
        WebView webView;
        if (i2.c instanceof WebView && ak.a((View)(webView = (WebView)i2.c))) {
            k.i(this.a);
            j.a((View)webView, "_vds_hybrid.snapshotAllElements", new Object[0]);
        }
    }
}

