/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.cs;
import com.growingio.android.sdk.circle.ct;
import com.growingio.android.sdk.utils.g;
import java.util.ArrayList;
import java.util.List;

class cr
extends BaseAdapter {
    LayoutInflater a;
    List b = new ArrayList();
    private i c;

    cr(LayoutInflater layoutInflater, List list) {
        this.a = layoutInflater;
        this.b = list;
        this.notifyDataSetChanged();
    }

    public int getCount() {
        return this.b.size();
    }

    public Object getItem(int n2) {
        return this.b.get(n2);
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        cs cs2;
        if (view != null && view.getTag() != null) {
            cs2 = (cs)view.getTag();
        } else {
            cs2 = new cs(this);
            view = g.a("growing_item_screenshot", null, false);
            cs2.a = (TextView)view.findViewById(g.c("tv_name"));
            cs2.b = (ImageView)view.findViewById(g.c("iv_screenshot"));
            view.setTag((Object)cs2);
        }
        i i2 = (i)this.b.get(n2);
        if (this.c == i2) {
            cs2.a.setText((CharSequence)(com.growingio.android.sdk.utils.i.c(i2.c) + "\n(\u5f53\u524d\u9009\u4e2d)"));
        } else {
            cs2.a.setText((CharSequence)com.growingio.android.sdk.utils.i.c(i2.c));
        }
        cs2.b.setImageBitmap(ct.a(i2));
        return view;
    }

    public void a(i i2) {
        this.c = i2;
        this.notifyDataSetChanged();
    }
}

