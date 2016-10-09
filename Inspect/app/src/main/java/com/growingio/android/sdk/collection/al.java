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
import com.growingio.android.sdk.collection.ak;
import com.growingio.android.sdk.collection.am;
import com.growingio.android.sdk.utils.a;

class al
extends l {
    final /* synthetic */ ak a;

    al(ak ak2) {
        this.a = ak2;
    }

    @Override
    public void b(i i2) {
        if (i2.c instanceof WebView && ak.a((View)((WebView)i2.c))) {
            com.growingio.android.sdk.utils.i.a(new am(this, i2));
        } else if (!a.d((Object)i2.c) || ak.a(i2.c)) {
            // empty if block
        }
    }
}

