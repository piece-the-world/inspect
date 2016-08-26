/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.utils.h;

class l
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ i b;
    final /* synthetic */ g c;
    final /* synthetic */ j d;

    l(j j2, String string, i i2, g g2) {
        this.d = j2;
        this.a = string;
        this.b = i2;
        this.c = g2;
    }

    @Override
    public void run() {
        h.b(j.d(this.d));
        j.a(this.d, this.a, this.b, this.c);
        j.a(this.d, null);
    }
}

