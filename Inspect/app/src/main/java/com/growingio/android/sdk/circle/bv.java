/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.DialogFragment
 *  android.content.DialogInterface
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.utils.g;

@TargetApi(value=11)
public class bv
extends DialogFragment {
    private RelativeLayout a;
    private LinearLayout b;
    private TextView c;

    j a() {
        return j.e();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.getDialog().requestWindowFeature(1);
        View view = g.a("growing_dialog_login", viewGroup, false);
        this.a(view);
        return view;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.a().h();
    }

    void a(View view) {
        this.a = (RelativeLayout)view.findViewById(g.c("rl_loading"));
        this.b = (LinearLayout)view.findViewById(g.c("ll_error"));
        this.c = (TextView)view.findViewById(g.c("tv_error"));
        this.b();
    }

    private void b() {
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }
}

