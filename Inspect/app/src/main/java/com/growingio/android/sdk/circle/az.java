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
import com.growingio.android.sdk.utils.g;

class az
implements View.OnClickListener {
    final /* synthetic */ ar a;

    az(ar ar2) {
        this.a = ar2;
    }

    public void onClick(View view) {
        ar.a(this.a, view, g.a("growing_label_strict_text_desc", new Object[0]));
    }
}

