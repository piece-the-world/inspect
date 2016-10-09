/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class bh
extends View {
    public bh(Context context) {
        super(context);
    }

    public void a(Rect rect) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)this.getLayoutParams();
        layoutParams.leftMargin = rect.left;
        layoutParams.topMargin = rect.top;
        layoutParams.width = rect.width();
        layoutParams.height = rect.height();
        this.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    }
}

