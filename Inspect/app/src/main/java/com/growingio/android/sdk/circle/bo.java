/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.animation.AccelerateDecelerateInterpolator
 */
package com.growingio.android.sdk.circle;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.bp;

class bo
implements View.OnClickListener {
    final /* synthetic */ ar a;

    bo(ar ar2) {
        this.a = ar2;
    }

    public void onClick(View view) {
        int[] arrn = new int[2];
        arrn[0] = ar.k(this.a).getHeight();
        arrn[1] = ar.l(this.a) ? ar.m(this.a) : ar.n(this.a);
        ValueAnimator valueAnimator = ValueAnimator.ofInt((int[])arrn);
        valueAnimator.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new bp(this));
        valueAnimator.setDuration(300);
        valueAnimator.start();
        ar.b(this.a, !ar.l(this.a));
    }
}

