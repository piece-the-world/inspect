/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.growingio.android.sdk.collection;

import android.app.Activity;
import com.growingio.android.sdk.b.c;
import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.collection.q;

class v
implements Runnable {
    final /* synthetic */ q a;

    v(q q2) {
        this.a = q2;
    }

    @Override
    public void run() {
        Activity activity = q.b(this.a).f();
        if (activity != null) {
            this.a.a(new c(activity, q.d(this.a), q.e(this.a), true));
        }
    }
}

