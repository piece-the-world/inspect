/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.cx;
import com.growingio.android.sdk.circle.cy;
import com.growingio.android.sdk.utils.g;

class cz
extends l {
    final /* synthetic */ cy a;

    cz(cy cy2) {
        this.a = cy2;
    }

    @Override
    public void b(i i2) {
        if (cy.a(this.a) != null) {
            if (this.a(cy.a(this.a), i2)) {
                this.c(i2);
            }
        } else {
            for (i i3 : cy.b(this.a)) {
                if (!this.a(i3, i2)) continue;
                this.c(i2);
            }
        }
    }

    void c(i i2) {
        cx cx2 = new cx(this.a.getContext());
        cx2.setBackgroundDrawable(g.b(cy.a(this.a) != null ? "growing_hit_view_bg" : "growing_tags_mask_bg"));
        this.a.addView((View)cx2);
        Rect rect = new Rect();
        com.growingio.android.sdk.utils.i.a(i2.c, rect, i2.f);
        cx2.a(rect);
        if (cy.a(this.a) != null) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(150);
            alphaAnimation.setStartOffset((long)(cy.c(this.a) * 30));
            cx2.startAnimation((Animation)alphaAnimation);
        }
    }

    boolean a(i i2, i i3) {
        return !(!com.growingio.android.sdk.utils.i.a(i2.j, i3.j) || i2.k != null && !i2.k.equals(i3.k) || i2.e != -2 && i2.e != i3.e);
    }
}

