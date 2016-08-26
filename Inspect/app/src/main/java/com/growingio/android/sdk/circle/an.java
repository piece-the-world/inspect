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
import com.growingio.android.sdk.circle.am;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.ca;
import com.growingio.android.sdk.circle.j;
import java.util.List;

class an
implements View.OnClickListener {
    final /* synthetic */ f a;
    final /* synthetic */ am b;

    an(am am2, f f2) {
        this.b = am2;
        this.a = f2;
    }

    public void onClick(View view) {
        if (ag.b(this.b.c) == null || ag.b(this.b.c).isEmpty()) {
            return;
        }
        Activity activity = this.b.c.a().d();
        if (activity == null) {
            return;
        }
        if (ag.b(this.b.c).size() == 1) {
            ar ar2 = new ar();
            ar2.a(this.a, activity, (i)ag.b(this.b.c).get(0));
            this.b.c.a().a(ar2, ar.class.getName());
        } else {
            ca ca2 = new ca();
            ca2.a(activity, ag.b(this.b.c));
            this.b.c.a().a(ca2, ca.class.getName());
        }
        ag.a(this.b.c, true);
        this.b.c.dismiss();
    }
}

