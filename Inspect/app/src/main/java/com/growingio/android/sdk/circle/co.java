/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.PopupWindow
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.growingio.android.sdk.circle.cp;
import com.growingio.android.sdk.circle.cq;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.i;

public class co
extends PopupWindow {
    private TextView a;
    private View b;
    private int c;
    private int d;

    public co(Context context) {
        super(context);
        View view = g.a("growing_popup_tip", null, false);
        this.b = view.findViewById(g.c("growing_popup_tip_anchor_container"));
        this.a = (TextView)view.findViewById(g.c("tv_popup_tip"));
        this.setContentView(view);
        view.setOnClickListener((View.OnClickListener)new cp(this));
        this.setWidth(context.getResources().getDisplayMetrics().widthPixels);
        this.setHeight(context.getResources().getDisplayMetrics().heightPixels);
        this.setOutsideTouchable(true);
        this.setFocusable(true);
        this.setBackgroundDrawable(null);
        this.c = i.a(context, 79.0f);
        this.d = i.a(context, 20.0f);
    }

    @TargetApi(value=11)
    public void a(View view, String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        this.a.setText((CharSequence)string);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        this.showAtLocation(view, 17, 0, 0);
        this.a.post((Runnable)new cq(this, rect, view));
    }

    static /* synthetic */ View a(co co2) {
        return co2.b;
    }

    static /* synthetic */ int b(co co2) {
        return co2.d;
    }

    static /* synthetic */ TextView c(co co2) {
        return co2.a;
    }

    static /* synthetic */ int d(co co2) {
        return co2.c;
    }
}

