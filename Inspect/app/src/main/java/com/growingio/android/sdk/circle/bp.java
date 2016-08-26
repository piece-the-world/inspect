/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package com.growingio.android.sdk.circle;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.bo;

class bp
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ bo a;

    bp(bo bo2) {
        this.a = bo2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ar.k((ar)this.a.a).getLayoutParams().height = (Integer)valueAnimator.getAnimatedValue();
        ar.k(this.a.a).requestLayout();
    }
}

