/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.b.g;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.circle.j;

class m
implements Runnable {
    final /* synthetic */ j a;

    m(j j2) {
        this.a = j2;
    }

    @Override
    public void run() {
        this.a.a("touch", null, null);
    }
}

