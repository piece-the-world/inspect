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
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.collection.ag;
import com.growingio.android.sdk.collection.ai;
import com.growingio.android.sdk.utils.a;
import com.growingio.android.sdk.utils.h;

class ah
extends l {
    final /* synthetic */ ag a;

    ah(ag ag2) {
        this.a = ag2;
    }

    @Override
    public void b(i i2) {
        if (i2.c instanceof WebView && ag.a((View)((WebView)i2.c))) {
            h.a(new ai(this, i2));
        } else if (!a.c((Object)i2.c) || ag.a(i2.c)) {
            // empty if block
        }
    }
}

