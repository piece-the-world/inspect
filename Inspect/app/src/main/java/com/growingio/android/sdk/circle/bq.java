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

class bq
implements View.OnClickListener {
    final /* synthetic */ ar a;

    bq(ar ar2) {
        this.a = ar2;
    }

    public void onClick(View view) {
        if (ar.o(this.a)) {
            ar.c(this.a, false);
        }
    }
}

