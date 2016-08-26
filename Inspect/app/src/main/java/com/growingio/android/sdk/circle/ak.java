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
import com.growingio.android.sdk.circle.ag;
import com.growingio.android.sdk.utils.a;
import java.util.ArrayList;

class ak
extends l {
    final /* synthetic */ ag a;

    ak(ag ag2) {
        this.a = ag2;
    }

    @Override
    public boolean a(i i2) {
        return super.a(i2);
    }

    @Override
    public void b(i i2) {
        if ((i2.c instanceof WebView || a.c((Object)i2.c)) && com.growingio.android.sdk.collection.ag.a(i2.c)) {
            if (ag.b(this.a) == null) {
                ag.a(this.a, new ArrayList());
            }
            ag.b(this.a).add(i2);
        }
    }
}

