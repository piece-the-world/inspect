/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.text.TextUtils
 *  android.view.View
 */
package com.growingio.android.sdk.circle;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.growingio.android.sdk.b.d;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.a;
import com.growingio.android.sdk.circle.ct;

class f
extends l {
    final /* synthetic */ a a;

    f(a a2) {
        this.a = a2;
    }

    @Override
    public void b(i i2) {
        boolean bl2 = com.growingio.android.sdk.utils.i.d(i2.c);
        if (!bl2 && (i2.n || TextUtils.isEmpty((CharSequence)i2.k))) {
            return;
        }
        com.growingio.android.sdk.utils.i.a(i2.c, a.d(this.a), i2.f);
        if (a.a(this.a, a.h(this.a), a.d(this.a))) {
            double d2 = ct.g();
            d d3 = new d();
            d3.a = String.valueOf((int)((double)a.d((a)this.a).left * d2));
            d3.b = String.valueOf((int)((double)a.d((a)this.a).top * d2));
            d3.c = String.valueOf((int)((double)a.d(this.a).width() * d2));
            d3.d = String.valueOf((int)((double)a.d(this.a).height() * d2));
            i2.g = d3;
            a.g(this.a).add(i2);
        }
    }
}

