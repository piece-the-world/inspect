/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import com.growingio.android.sdk.circle.a;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.t;

class b
implements View.OnClickListener {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    public void onClick(View v2) {
        this.a.getCircleManager().j();
        this.a.setVisibility(8);
        a.a(this.a).setVisibility(8);
        a.b(this.a).setVisibility(8);
        t.d().a("CircleModeChooserDialog", null);
        a.c(this.a);
    }
}

