/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 *  android.widget.Toast
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.b.l;
import com.growingio.android.sdk.circle.a;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.utils.m;

class g
implements Runnable {
    final /* synthetic */ a a;

    g(a a2) {
        this.a = a2;
    }

    @Override
    public void run() {
        Activity activity = j.e().d();
        if (a.i(this.a) != null && activity != null) {
            i i2 = new i(null, a.i((a)this.a).d, -2, true, true, true, a.i((a)this.a).o, a.i((a)this.a).i, a.i((a)this.a).j, a.i((a)this.a).r, null);
            a.b(this.a).a(i2);
            a.a(this.a).setVisibility(8);
            a.b(this.a, true);
            boolean bl2 = m.b(a.i((a)this.a).c);
            Toast.makeText((Context)activity, (CharSequence)("\u5df2\u9009\u4e2d\u6574" + (bl2 ? "\u5217" : "\u884c")), (int)0).show();
        }
    }
}

