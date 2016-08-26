/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.collection.q;
import com.growingio.android.sdk.collection.x;
import com.growingio.android.sdk.collection.y;

class z
implements Runnable {
    final /* synthetic */ y a;

    z(y y2) {
        this.a = y2;
    }

    @Override
    public void run() {
        q.i();
        x.a(this.a.a);
    }
}

