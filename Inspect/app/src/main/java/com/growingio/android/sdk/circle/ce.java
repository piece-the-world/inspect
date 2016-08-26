/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.DialogFragment
 *  android.text.TextUtils
 *  android.view.View
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.app.DialogFragment;
import android.text.TextUtils;
import android.view.View;
import com.growingio.android.sdk.b.f;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.ca;
import com.growingio.android.sdk.circle.cd;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.utils.l;

class ce
implements l {
    final /* synthetic */ int a;
    final /* synthetic */ cd b;

    ce(cd cd2, int n2) {
        this.b = cd2;
        this.a = n2;
    }

    @Override
    public void a(f f2) {
        Object object;
        if (f2 == null) {
            return;
        }
        if (f2.b != null) {
            f2 = f2.a();
        } else {
            f2.c = "H5\u9875\u9762";
            object = com.growingio.android.sdk.utils.i.e(((i)ca.a((ca)this.b.a).get((int)this.a)).c);
            if (!TextUtils.isEmpty((CharSequence)object)) {
                f2.c = object;
            }
        }
        object = new ar();
        Activity activity = this.b.a.a().d();
        if (activity != null) {
            object.a(f2, activity, (i)ca.a(this.b.a).get(this.a));
            this.b.a.a().a((DialogFragment)object, ar.class.getName());
            ca.a(this.b.a, true);
            this.b.a.dismiss();
        }
    }
}

