/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.text.TextUtils
 *  android.view.View
 */
package com.growingio.android.sdk.circle;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.a;
import com.growingio.android.sdk.utils.j;

class f
extends l {
    final /* synthetic */ a a;

    f(a a2) {
        this.a = a2;
    }

    @Override
    public boolean a(i i2) {
        if (a.b(i2.c)) {
            j.a(i2.c, a.d(this.a), i2.f);
            return a.d(this.a).contains(a.e((a)this.a).x, a.e((a)this.a).y);
        }
        return false;
    }

    @Override
    public void b(i i2) {
        boolean bl2 = j.c(i2.c);
        if (!bl2 && (i2.n || TextUtils.isEmpty((CharSequence)i2.k))) {
            return;
        }
        if (!a.f(this.a) && bl2) {
            a.a(this.a, true);
        }
        if (!a.f(this.a) || bl2) {
            a.g(this.a).add(0, i2);
        }
    }
}

