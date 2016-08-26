/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import com.growingio.android.sdk.circle.co;

class cp
implements View.OnClickListener {
    final /* synthetic */ co a;

    cp(co co2) {
        this.a = co2;
    }

    public void onClick(View view) {
        this.a.dismiss();
    }
}

