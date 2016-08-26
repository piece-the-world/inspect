/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.j;

class af
implements Runnable {
    final /* synthetic */ i a;
    final /* synthetic */ j b;

    af(j j2, i i2) {
        this.b = j2;
        this.a = i2;
    }

    @Override
    public void run() {
        this.b.a("click", this.a, null);
    }
}

