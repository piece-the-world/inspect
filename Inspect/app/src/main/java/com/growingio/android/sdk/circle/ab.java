/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import com.growingio.android.sdk.circle.ac;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.utils.i;

class ab
implements Runnable {
    final /* synthetic */ k a;

    ab(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        if (this.a.d() == null || this.a.d().isFinishing()) {
            return;
        }
        i.a(new ac(this));
    }
}

