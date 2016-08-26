/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView
 *  android.widget.AbsListView$LayoutParams
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.ca;
import com.growingio.android.sdk.circle.ct;

class cf
extends BaseAdapter {
    final /* synthetic */ ca a;

    cf(ca ca2) {
        this.a = ca2;
    }

    public int getCount() {
        return ca.a(this.a).size();
    }

    public Object getItem(int n2) {
        return ca.a(this.a).get(n2);
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new ImageView(viewGroup.getContext());
            view.setLayoutParams((ViewGroup.LayoutParams)new AbsListView.LayoutParams(-1, com.growingio.android.sdk.utils.i.a(viewGroup.getContext(), 150.0f)));
            int n3 = com.growingio.android.sdk.utils.i.a(viewGroup.getContext(), 15.0f);
            view.setPadding(n3, n3, n3, n3);
        }
        ((ImageView)view).setImageBitmap(ct.a((i)ca.a(this.a).get(n2)));
        return view;
    }
}

