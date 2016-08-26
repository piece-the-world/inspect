/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.DialogFragment
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.app.DialogFragment;
import android.view.View;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.ag;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.j;

class aj
implements View.OnClickListener {
    final /* synthetic */ ag a;

    aj(ag ag2) {
        this.a = ag2;
    }

    public void onClick(View view) {
        ar ar2 = new ar();
        Activity activity = this.a.a().d();
        if (activity != null) {
            ar2.a(ag.a(this.a), activity, null);
            this.a.a().a(ar2, ar.class.getName());
        }
        ag.a(this.a, true);
        this.a.dismiss();
    }
}

