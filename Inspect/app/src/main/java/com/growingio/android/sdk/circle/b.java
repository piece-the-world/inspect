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
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.q;

class b
implements View.OnClickListener {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    public void onClick(View view) {
        this.a.getCircleManager().j();
        this.a.setVisibility(8);
        a.a(this.a).setVisibility(8);
        a.b(this.a).setVisibility(8);
        q.d().a("CircleModeChooserDialog", null);
        a.c(this.a);
    }
}

