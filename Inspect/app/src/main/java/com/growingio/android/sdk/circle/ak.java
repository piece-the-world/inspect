/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.support.annotation.Nullable
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.ScrollView
 *  android.widget.Switch
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import com.growingio.android.sdk.circle.al;
import com.growingio.android.sdk.circle.am;
import com.growingio.android.sdk.circle.an;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.GrowingIO;
import com.growingio.android.sdk.utils.j;

@TargetApi(value=11)
public class ak
extends DialogFragment {
    private boolean a = false;

    k a() {
        return k.e();
    }

    @TargetApi(value=17)
    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.getDialog().requestWindowFeature(1);
        Context context = inflater.getContext();
        ScrollView scrollView = new ScrollView(context);
        scrollView.setBackgroundColor(-1052689);
        LinearLayout linearLayout = new LinearLayout(context);
        scrollView.addView((View)linearLayout);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText((CharSequence)"\u5708\u9009");
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        textView.setBackgroundColor(-13325603);
        linearLayout.addView((View)textView, -1, j.a(context, 56.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        Switch switch_ = new Switch(context);
        switch_.setText((CharSequence)"\u9ad8\u4eae\u5df2\u5708\u9009\u533a\u57df");
        switch_.setTextColor(-13421773);
        switch_.setChecked(false);
        switch_.setTextSize(16.0f);
        switch_.setVisibility(0);
        switch_.setChecked(GConfig.q().s());
        switch_.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new al(this));
        linearLayout2.addView((View)switch_, -1, j.a(context, 60.0f));
        View view = new View(context);
        view.setBackgroundColor(-4605511);
        linearLayout2.addView(view, -1, j.a(context, 1.0f));
        RelativeLayout relativeLayout = new RelativeLayout(context);
        TextView textView2 = new TextView(context);
        textView2.setText((CharSequence)"\u63d0\u793a: \u62d6\u52a8\u5c0f\u7ea2\u70b9\u8fdb\u884c\u5708\u9009");
        textView2.setTextColor(-5921371);
        textView2.setId(View.generateViewId());
        textView2.setTextSize(12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        relativeLayout.addView((View)textView2, (ViewGroup.LayoutParams)layoutParams);
        TextView textView3 = new TextView(context);
        textView3.setTextSize(12.0f);
        textView3.setTextColor(-5921371);
        textView3.setText((CharSequence)("\u7248\u672c: " + GrowingIO.getVersion()));
        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = j.a(context, 5.0f);
        layoutParams.addRule(5, textView2.getId());
        layoutParams.addRule(3, textView2.getId());
        relativeLayout.addView((View)textView3, (ViewGroup.LayoutParams)layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = layoutParams2.topMargin = j.a(context, 10.0f);
        linearLayout2.addView((View)relativeLayout, (ViewGroup.LayoutParams)layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.rightMargin = layoutParams3.leftMargin = j.a(context, 15.0f);
        linearLayout.addView((View)linearLayout2, (ViewGroup.LayoutParams)layoutParams3);
        view = new View(context);
        view.setBackgroundColor(-4605511);
        linearLayout.addView(view, -1, j.a(context, 1.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout.addView((View)linearLayout3);
        TextView textView4 = new TextView(context);
        textView4.setText((CharSequence)"\u8fd4\u56de\u5708\u9009");
        textView4.setTextColor(-13421773);
        textView4.setGravity(17);
        TextView textView5 = new TextView(context);
        textView5.setText((CharSequence)"\u9000\u51fa\u5708\u9009");
        textView5.setTextColor(-13421773);
        textView5.setGravity(17);
        view = new View(context);
        view.setBackgroundColor(-4605511);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, j.a(context, 48.0f));
        layoutParams4.weight = 1.0f;
        linearLayout3.addView((View)textView4, (ViewGroup.LayoutParams)layoutParams4);
        linearLayout3.addView(view, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(j.a(context, 1.0f), -1));
        layoutParams4 = new LinearLayout.LayoutParams(-1, j.a(context, 48.0f));
        layoutParams4.weight = 1.0f;
        linearLayout3.addView((View)textView5, (ViewGroup.LayoutParams)layoutParams4);
        textView5.setOnClickListener((View.OnClickListener)new am(this));
        textView4.setOnClickListener((View.OnClickListener)new an(this));
        return scrollView;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.getDialog().getWindow().setLayout((int)((float)displayMetrics.widthPixels - displayMetrics.density * 40.0f), -2);
    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        if (!this.a) {
            k.e().g();
        }
    }
}

