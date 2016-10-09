/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.circle.z;
import com.growingio.android.sdk.utils.i;

class y
implements Runnable {
    final /* synthetic */ k a;

    y(k k2) {
        this.a = k2;
    }

    @Override
    public void run() {
        i.a(new z(this));
    }
}

