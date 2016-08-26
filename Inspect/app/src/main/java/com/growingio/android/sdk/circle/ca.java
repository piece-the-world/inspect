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
 *  android.os.Bundle
 *  android.support.annotation.Nullable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 */
package com.growingio.android.sdk.circle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.growingio.android.sdk.circle.GIOCircleRootPanel;
import com.growingio.android.sdk.circle.cb;
import com.growingio.android.sdk.circle.cc;
import com.growingio.android.sdk.circle.cd;
import com.growingio.android.sdk.circle.cf;
import com.growingio.android.sdk.circle.ct;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.utils.g;
import com.growingio.android.sdk.utils.h;
import com.growingio.android.sdk.utils.i;
import java.util.List;

@TargetApi(value=11)
public class ca
extends DialogFragment {
    private int a = -2;
    private boolean b = false;
    private ListView c;
    private List d;

    j a() {
        return j.e();
    }

    public ca() {
        this.setStyle(0, 16973837);
        ct.a();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = super.onCreateDialog(bundle);
        dialog.getWindow().getDecorView().setTag((Object)"DO_NOT_DRAW");
        return dialog;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = g.a("growing_dialog_page_chooser", null, false);
        this.a(view);
        GIOCircleRootPanel gIOCircleRootPanel = new GIOCircleRootPanel(view.getContext());
        gIOCircleRootPanel.addView(view);
        h.a(new cb(this), 300);
        return gIOCircleRootPanel;
    }

    void a(View view) {
        Activity activity = j.e().d();
        if (activity == null) {
            return;
        }
        view.findViewById(g.c("tv_cancel")).setOnClickListener((View.OnClickListener)new cc(this));
        this.c = (ListView)view.findViewById(g.c("lv_page_screenshots"));
        this.c.setOnItemClickListener((AdapterView.OnItemClickListener)new cd(this));
        if (this.d == null) {
            return;
        }
        cf cf2 = new cf(this);
        this.c.setAdapter((ListAdapter)cf2);
    }

    public void a(Activity activity, List list) {
        this.d = list;
        if (activity != null) {
            this.a = activity.getRequestedOrientation();
            activity.setRequestedOrientation(i.a(activity));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Activity activity = j.e().d();
        if (this.a == -1 && activity != null) {
            activity.setRequestedOrientation(-1);
        }
        if (!this.b) {
            j.e().g();
        }
        this.d = null;
    }

    static /* synthetic */ List a(ca ca2) {
        return ca2.d;
    }

    static /* synthetic */ boolean a(ca ca2, boolean bl2) {
        ca2.b = bl2;
        return ca2.b;
    }
}

