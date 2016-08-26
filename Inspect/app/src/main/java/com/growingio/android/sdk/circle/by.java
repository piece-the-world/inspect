/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.circle.bz;
import com.growingio.android.sdk.utils.g;
import java.util.ArrayList;
import java.util.List;

public class by
extends BaseAdapter {
    List a = new ArrayList();
    private f b;

    by(List list) {
        this.a = list;
    }

    public int getCount() {
        return this.a.size();
    }

    public Object getItem(int n2) {
        return this.a.get(n2);
    }

    public long getItemId(int n2) {
        return n2;
    }

    public View getView(int n2, View view, ViewGroup viewGroup) {
        bz bz2;
        if (view != null && view.getTag() != null) {
            bz2 = (bz)view.getTag();
        } else {
            bz2 = new bz(this);
            view = g.a("growing_item_matched_page", null, false);
            bz2.a = (TextView)view.findViewById(g.c("tv_matched_page_name"));
            bz2.b = (ImageView)view.findViewById(g.c("iv_matched_page"));
            view.setTag((Object)bz2);
        }
        bz2.a.setText((CharSequence)((f)this.a.get((int)n2)).c);
        if (this.b == this.a.get(n2)) {
            bz2.b.setSelected(true);
        } else {
            bz2.b.setSelected(false);
        }
        return view;
    }

    public void a(f f2) {
        if (this.b == f2) {
            return;
        }
        this.b = f2;
        this.notifyDataSetChanged();
    }
}

