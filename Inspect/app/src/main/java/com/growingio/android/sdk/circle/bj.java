/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.ShapeDrawable
 *  android.graphics.drawable.shapes.RoundRectShape
 *  android.graphics.drawable.shapes.Shape
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.bh;
import com.growingio.android.sdk.circle.bi;
import com.growingio.android.sdk.utils.j;

class bj
extends l {
    float a;
    ShapeDrawable b;
    ShapeDrawable c;
    final /* synthetic */ bi d;

    bj(bi bi2) {
        this.d = bi2;
        this.a = j.a(this.d.getContext(), 3.0f);
        this.b = new ShapeDrawable((Shape)new RoundRectShape(new float[]{this.a, this.a, this.a, this.a, this.a, this.a, this.a, this.a}, null, null));
        this.c = new ShapeDrawable((Shape)new RoundRectShape(new float[]{this.a, this.a, this.a, this.a, this.a, this.a, this.a, this.a}, null, null));
        this.b.getPaint().setColor(1291798564);
        this.b.getPaint().setStrokeWidth((float)j.a(this.d.getContext(), 1.0f));
        this.b.getPaint().setAntiAlias(true);
        this.c.getPaint().setColor(1291836708);
        this.c.getPaint().setStrokeWidth((float)j.a(this.d.getContext(), 1.0f));
        this.c.getPaint().setAntiAlias(true);
    }

    @Override
    public void b(i i2) {
        if (bi.a(this.d) != null) {
            if (TextUtils.equals((CharSequence)bi.a((bi)this.d).j, (CharSequence)i2.j)) {
                this.c(i2);
            }
        } else {
            for (i i3 : bi.b(this.d)) {
                if (!this.a(i3, i2)) continue;
                this.c(i2);
            }
        }
    }

    void c(i i2) {
        bh bh2 = new bh(this.d.getContext());
        bh2.setBackgroundDrawable((Drawable)(bi.a(this.d) != null ? this.b : this.c));
        this.d.addView((View)bh2);
        Rect rect = new Rect();
        j.a(i2.c, rect, i2.f);
        bh2.a(rect);
        if (bi.a(this.d) != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setStartOffset((long)(bi.c(this.d) * 30));
            bh2.startAnimation((Animation)alphaAnimation);
        }
    }

    boolean a(i i2, i i3) {
        return !(!j.a(i2.j, i3.j) || i2.k != null && !i2.k.equals(i3.k) || i2.e != -2 && i2.e != i3.e);
    }
}

