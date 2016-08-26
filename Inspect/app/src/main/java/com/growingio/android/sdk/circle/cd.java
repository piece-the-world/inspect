/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import android.widget.AdapterView;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.ca;
import com.growingio.android.sdk.circle.ce;

class cd
implements AdapterView.OnItemClickListener {
    final /* synthetic */ ca a;

    cd(ca ca2) {
        this.a = ca2;
    }

    public void onItemClick(AdapterView adapterView, View view, int n2, long l2) {
        com.growingio.android.sdk.utils.i.a(((i)ca.a((ca)this.a).get((int)n2)).c, new ce(this, n2));
    }
}

