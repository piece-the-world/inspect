/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 */
package com.growingio.android.sdk.collection;

import android.view.View;
import android.webkit.WebView;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.collection.ag;
import com.growingio.android.sdk.collection.ah;

class ai
implements Runnable {
    final /* synthetic */ i a;
    final /* synthetic */ ah b;

    ai(ah ah2, i i2) {
        this.b = ah2;
        this.a = i2;
    }

    @Override
    public void run() {
        ((WebView)this.a.c).loadUrl(ag.a(this.b.a));
    }
}

