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
import com.growingio.android.sdk.circle.ag;
import com.growingio.android.sdk.circle.ca;
import com.growingio.android.sdk.circle.j;
import java.util.List;

class al
implements View.OnClickListener {
    final /* synthetic */ ag a;

    al(ag ag2) {
        this.a = ag2;
    }

    public void onClick(View view) {
        if (ag.b(this.a) == null || ag.b(this.a).size() <= 1) {
            return;
        }
        Activity activity = this.a.a().d();
        if (activity == null) {
            return;
        }
        ca ca2 = new ca();
        ca2.a(activity, ag.b(this.a));
        this.a.a().a(ca2, ca.class.getName());
        ag.a(this.a, true);
        this.a.dismiss();
    }
}

