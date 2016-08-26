/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.support.annotation.Nullable
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.growingio.android.sdk.a.e;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.GIOCircleRootPanel;
import com.growingio.android.sdk.circle.ah;
import com.growingio.android.sdk.circle.ai;
import com.growingio.android.sdk.circle.aj;
import com.growingio.android.sdk.circle.ak;
import com.growingio.android.sdk.circle.al;
import com.growingio.android.sdk.circle.am;
import com.growingio.android.sdk.circle.ao;
import com.growingio.android.sdk.circle.ap;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.GConfig;
import com.growingio.android.sdk.collection.c;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.h;
import com.growingio.android.sdk.utils.m;
import java.util.List;

@TargetApi(value=11)
public class ag
extends DialogFragment {
    private boolean a = false;
    private f b;
    private List c;

    j a() {
        return j.e();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.getDialog().requestWindowFeature(1);
        View view = g.a("growing_dialog_circle_mode_chooser_v2", null, false);
        this.b(view);
        this.a(view);
        GIOCircleRootPanel gIOCircleRootPanel = new GIOCircleRootPanel(view.getContext());
        gIOCircleRootPanel.addView(view);
        h.a(new ah(this), 300);
        return gIOCircleRootPanel;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.getDialog().getWindow().setLayout((int)((float)displayMetrics.widthPixels - displayMetrics.density * 40.0f), -2);
    }

    void a(View view) {
        Activity activity;
        Activity activity2 = j.e().d();
        if (activity2 == null) {
            return;
        }
        ((TextView)view.findViewById(g.c("tv_version"))).setText((CharSequence)g.a("growing_label_version_tip", "0.9.90_6a708c0"));
        CompoundButton compoundButton = (CompoundButton)view.findViewById(g.c("sw_show_tags"));
        compoundButton.setVisibility(0);
        compoundButton.setChecked(GConfig.o().r());
        compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)new ai(this));
        view.findViewById(g.c("ll_show_tags_container")).setVisibility(0);
        TextView textView = (TextView)view.findViewById(g.c("tv_page_name"));
        c c2 = c.h();
        this.b = e.c().a(c2.b(), c2.a(activity2), null);
        if (this.b.b != null) {
            this.b = this.b.a();
            textView.setText((CharSequence)this.b.c);
        } else {
            activity = j.e().d();
            if (activity != null) {
                CharSequence charSequence = activity.getTitle();
                if (TextUtils.isEmpty((CharSequence)charSequence)) {
                    charSequence = activity.getClass().getSimpleName();
                }
                this.b.c = "\u9875\u9762-" + charSequence;
                textView.setText(charSequence);
            }
        }
        view.findViewById(g.c("btn_define_page")).setOnClickListener((View.OnClickListener)new aj(this));
        if (Build.VERSION.SDK_INT >= 19) {
            activity = view.findViewById(g.c("rl_h5_page"));
            activity.setVisibility(8);
            this.a(activity2);
            if (this.c == null || this.c.isEmpty()) {
                return;
            }
            this.c((View)activity);
        }
    }

    private void a(Activity activity) {
        if (activity == null) {
            return;
        }
        m.a(activity.getWindow().getDecorView(), "", new ak(this));
    }

    private void c(View view) {
        TextView textView = (TextView)view.findViewById(g.c("tv_h5_page_name"));
        if (this.c.size() > 1) {
            textView.setText((CharSequence)"\u591a\u4e2a\u9875\u9762");
            view.setVisibility(0);
            view.findViewById(g.c("btn_define_h5_page")).setOnClickListener((View.OnClickListener)new al(this));
        } else {
            com.growingio.android.sdk.utils.i.a(((i)this.c.get((int)0)).c, new am(this, textView, view));
        }
    }

    void b(View view) {
        TextView textView = (TextView)view.findViewById(g.c("btn_positive"));
        textView.setOnClickListener((View.OnClickListener)new ao(this));
        view.findViewById(g.c("btn_negative")).setOnClickListener((View.OnClickListener)new ap(this));
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (!this.a) {
            j.e().g();
        }
    }

    static /* synthetic */ f a(ag ag2) {
        return ag2.b;
    }

    static /* synthetic */ boolean a(ag ag2, boolean bl2) {
        ag2.a = bl2;
        return ag2.a;
    }

    static /* synthetic */ List b(ag ag2) {
        return ag2.c;
    }

    static /* synthetic */ List a(ag ag2, List list) {
        ag2.c = list;
        return ag2.c;
    }
}

