/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.growingio.android.sdk.circle.a;
import com.growingio.android.sdk.circle.bu;
import com.growingio.android.sdk.circle.ct;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.i;

public class aq
extends bu {
    public aq(Context context) {
        super(context);
        this.a();
    }

    private void a() {
        this.setBackgroundColor(-1090519040);
        ImageView imageView = new ImageView(this.getContext());
        Drawable drawable = g.b("growing_tip_arrow");
        imageView.setImageDrawable(drawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = ct.e() / 2 - a.a - drawable.getIntrinsicHeight();
        this.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
        TextView textView = new TextView(this.getContext());
        textView.setText((CharSequence)g.a("growing_circle_tip_mask", new Object[0]));
        textView.setTextColor(-723724);
        textView.setTextSize(2, 18.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = layoutParams.topMargin - a.a / 2 - i.b(this.getContext(), 18.0f);
        this.addView((View)textView, (ViewGroup.LayoutParams)layoutParams2);
    }
}

