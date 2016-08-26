/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import com.growingio.android.sdk.circle.aa;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.utils.h;

class z
implements Runnable {
    final /* synthetic */ j a;

    z(j j2) {
        this.a = j2;
    }

    @Override
    public void run() {
        if (this.a.d() == null || this.a.d().isFinishing()) {
            return;
        }
        h.a(new aa(this));
    }
}

