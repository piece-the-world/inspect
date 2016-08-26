/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import com.growingio.android.sdk.circle.ar;

class bg
implements View.OnClickListener {
    final /* synthetic */ ar a;

    bg(ar ar2) {
        this.a = ar2;
    }

    public void onClick(View view) {
        this.a.dismiss();
    }
}

