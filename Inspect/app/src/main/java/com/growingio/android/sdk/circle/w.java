/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.utils.j;

class w
extends l {
    float a;
    final /* synthetic */ i b;
    final /* synthetic */ k c;

    w(k k2, i i2) {
        this.c = k2;
        this.b = i2;
        this.a = 0.0f;
    }

    @Override
    public boolean a(i i2) {
        return i2 == this.b || super.a(i2) && !j.c(i2.c);
    }

    @Override
    public void b(i i2) {
        if (!TextUtils.isEmpty((CharSequence)i2.k) && TextUtils.isGraphic((CharSequence)i2.k)) {
            float f2;
            float f3 = f2 = i2.c instanceof TextView ? ((TextView)i2.c).getTextSize() : 0.0f;
            if (f2 > this.a) {
                this.a = f2;
                k.a(this.c, i2.k);
            }
        }
    }
}

