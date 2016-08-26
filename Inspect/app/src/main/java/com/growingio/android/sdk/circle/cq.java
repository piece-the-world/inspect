/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.growingio.android.sdk.circle;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.growingio.android.sdk.circle.co;

class cq
implements Runnable {
    final /* synthetic */ Rect a;
    final /* synthetic */ View b;
    final /* synthetic */ co c;

    cq(co co2, Rect rect, View view) {
        this.c = co2;
        this.a = rect;
        this.b = view;
    }

    @Override
    public void run() {
        int[] arrn = new int[2];
        co.a(this.c).getRootView().getLocationOnScreen(arrn);
        co.a((co)this.c).getLayoutParams().height = this.a.top + co.b(this.c) - arrn[1];
        ((RelativeLayout.LayoutParams)co.c((co)this.c).getLayoutParams()).leftMargin = this.a.left + this.b.getWidth() / 2 - co.d(this.c);
    }
}

