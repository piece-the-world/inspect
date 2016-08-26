/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.da;
import com.growingio.android.sdk.circle.db;
import com.growingio.android.sdk.collection.q;

class dd
implements Runnable {
    final /* synthetic */ db a;

    dd(db db2) {
        this.a = db2;
    }

    @Override
    public void run() {
        da.b(this.a.a);
        q.d().a(true);
    }
}

