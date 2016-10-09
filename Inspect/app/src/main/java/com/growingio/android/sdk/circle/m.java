/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.k;

class m
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ i b;
    final /* synthetic */ g c;
    final /* synthetic */ k d;

    m(k k2, String string, i i2, g g2) {
        this.d = k2;
        this.a = string;
        this.b = i2;
        this.c = g2;
    }

    @Override
    public void run() {
        com.growingio.android.sdk.utils.i.b(k.d(this.d));
        k.a(this.d, this.a, this.b, this.c);
        k.a(this.d, null);
    }
}

