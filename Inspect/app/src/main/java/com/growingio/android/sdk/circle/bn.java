/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.bk;
import com.growingio.android.sdk.circle.bl;
import com.growingio.android.sdk.collection.t;

class bn
implements Runnable {
    final /* synthetic */ bl a;

    bn(bl bl2) {
        this.a = bl2;
    }

    @Override
    public void run() {
        bk.b(this.a.a);
        t.d().a(true);
    }
}

