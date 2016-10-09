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
import com.growingio.android.sdk.collection.ak;
import com.growingio.android.sdk.collection.al;

class am
implements Runnable {
    final /* synthetic */ i a;
    final /* synthetic */ al b;

    am(al al2, i i2) {
        this.b = al2;
        this.a = i2;
    }

    @Override
    public void run() {
        ((WebView)this.a.c).loadUrl(ak.a(this.b.a));
    }
}

