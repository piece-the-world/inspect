/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import com.growingio.android.sdk.circle.ca;

class cc
implements View.OnClickListener {
    final /* synthetic */ ca a;

    cc(ca ca2) {
        this.a = ca2;
    }

    public void onClick(View view) {
        this.a.dismiss();
    }
}

