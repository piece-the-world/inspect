/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.k;

class ah
implements Runnable {
    final /* synthetic */ i a;
    final /* synthetic */ k b;

    ah(k k2, i i2) {
        this.b = k2;
        this.a = i2;
    }

    @Override
    public void run() {
        this.b.a("click", this.a, null);
    }
}

