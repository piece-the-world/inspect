/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.webkit.WebChromeClient
 *  android.webkit.WebView
 */
package com.growingio.android.sdk.circle;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.growingio.android.sdk.circle.HybridEventEditDialog;

class as
extends WebChromeClient {
    final /* synthetic */ HybridEventEditDialog a;

    as(HybridEventEditDialog hybridEventEditDialog) {
        this.a = hybridEventEditDialog;
    }

    public void onCloseWindow(WebView window) {
        this.a.dismiss();
    }
}

