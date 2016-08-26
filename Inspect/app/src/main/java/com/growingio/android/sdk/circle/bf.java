/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.growingio.android.sdk.b.d;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.ct;
import java.util.List;

class bf
extends l {
    float a;
    int[] b;
    Rect c;
    final /* synthetic */ i d;
    final /* synthetic */ List e;
    final /* synthetic */ ar f;

    bf(ar ar2, i i2, List list) {
        this.f = ar2;
        this.d = i2;
        this.e = list;
        this.a = 0.0f;
        this.b = new int[2];
        this.c = new Rect();
    }

    @Override
    public boolean a(i i2) {
        return i2 == this.d || super.a(i2) && !com.growingio.android.sdk.utils.i.d(i2.c);
    }

    @Override
    public void b(i i2) {
        if (!TextUtils.isEmpty((CharSequence)i2.k) && TextUtils.isGraphic((CharSequence)i2.k)) {
            float f2;
            if (i2.c instanceof TextView && (f2 = ((TextView)i2.c).getTextSize()) > this.a) {
                ar.a(this.f, this.e.size());
                this.a = f2;
            }
            double d2 = ct.g();
            d d3 = new d();
            com.growingio.android.sdk.utils.i.a(i2.c, this.c, i2.f, this.b);
            d3.a = String.valueOf((int)((double)this.c.left * d2));
            d3.b = String.valueOf((int)((double)this.c.top * d2));
            d3.c = String.valueOf((int)((double)this.c.width() * d2));
            d3.d = String.valueOf((int)((double)this.c.height() * d2));
            i2.g = d3;
            this.e.add(i2);
        }
    }
}

