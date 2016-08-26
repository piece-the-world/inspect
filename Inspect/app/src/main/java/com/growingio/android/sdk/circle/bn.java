/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.by;
import com.growingio.android.sdk.circle.cr;
import java.util.List;

class bn
implements AdapterView.OnItemClickListener {
    final /* synthetic */ ar a;

    bn(ar ar2) {
        this.a = ar2;
    }

    public void onItemClick(AdapterView adapterView, View view, int n2, long l2) {
        if (ar.a(this.a).getAdapter() instanceof cr) {
            i i2 = (i)this.a.c.get(n2);
            ar.a(this.a, i2);
        } else if (ar.a(this.a).getAdapter() instanceof by) {
            ar.a(this.a, (f)ar.i(this.a).get(n2));
            ((by)ar.a(this.a).getAdapter()).a(ar.j(this.a));
        }
    }
}

