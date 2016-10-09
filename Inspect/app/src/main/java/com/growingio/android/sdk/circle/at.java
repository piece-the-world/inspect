/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package com.growingio.android.sdk.circle;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.HybridEventEditDialog;
import com.growingio.android.sdk.circle.aj;
import com.growingio.android.sdk.circle.k;

class at
extends WebViewClient {
    final /* synthetic */ HybridEventEditDialog a;

    at(HybridEventEditDialog hybridEventEditDialog) {
        this.a = hybridEventEditDialog;
    }

    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        k k2 = k.e();
        k2.a(this.a);
        k2.a("touch", null, null);
    }

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if (url.equals("growing.internal://close-web-view")) {
            this.a.dismiss();
        }
        return true;
    }
}

