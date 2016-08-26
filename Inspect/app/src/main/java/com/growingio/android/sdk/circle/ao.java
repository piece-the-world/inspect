/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.view.View;
import com.growingio.android.sdk.circle.ag;
import com.growingio.android.sdk.circle.j;

class ao
implements View.OnClickListener {
    final /* synthetic */ ag a;

    ao(ag ag2) {
        this.a = ag2;
    }

    public void onClick(View view) {
        this.a.dismiss();
        this.a.a().i();
        this.a.a().k();
    }
}

