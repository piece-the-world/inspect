/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.circle.x;
import com.growingio.android.sdk.utils.h;

class w
implements Runnable {
    final /* synthetic */ j a;

    w(j j2) {
        this.a = j2;
    }

    @Override
    public void run() {
        h.a(new x(this));
    }
}

