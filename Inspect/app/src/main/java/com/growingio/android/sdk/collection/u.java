/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.q;

class u
implements Runnable {
    final /* synthetic */ j a;
    final /* synthetic */ g b;
    final /* synthetic */ q c;

    u(q q2, j j2, g g2) {
        this.c = q2;
        this.a = j2;
        this.b = g2;
    }

    @Override
    public void run() {
        this.a.a("page", null, this.b);
    }
}

