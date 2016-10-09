/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.k;

class n
implements Runnable {
    final /* synthetic */ k a;

    n(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        this.a.a("touch", null, null);
    }
}

