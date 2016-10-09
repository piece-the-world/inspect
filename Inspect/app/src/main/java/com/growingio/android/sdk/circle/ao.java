/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.growingio.android.sdk.circle.a;
import com.growingio.android.sdk.circle.ap;
import com.growingio.android.sdk.circle.aq;
import com.growingio.android.sdk.circle.bd;
import com.growingio.android.sdk.utils.j;

public class ao
extends aq {
    public ao(Context context) {
        super(context);
        this.a();
    }

    private void a() {
        this.setBackgroundColor(-1090519040);
        ap ap2 = new ap(this, this.getContext());
        int n2 = j.a(this.getContext(), 42.0f);
        int n3 = j.a(this.getContext(), 80.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n2, n3);
        layoutParams.gravity = 1;
        layoutParams.topMargin = bd.d() / 2 - a.a - n3;
        this.addView((View)ap2, (ViewGroup.LayoutParams)layoutParams);
        TextView textView = new TextView(this.getContext());
        textView.setTextColor(-723724);
        textView.setTextSize(2, 18.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = layoutParams.topMargin - a.a / 2 - j.b(this.getContext(), 18.0f);
        this.addView((View)textView, (ViewGroup.LayoutParams)layoutParams2);
    }
}

