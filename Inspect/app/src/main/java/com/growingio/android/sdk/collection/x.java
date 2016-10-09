/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.t;

class x
implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ g b;
    final /* synthetic */ t c;

    x(t t2, k k2, g g2) {
        this.c = t2;
        this.a = k2;
        this.b = g2;
    }

    @Override
    public void run() {
        this.a.a("page", null, this.b);
    }
}

