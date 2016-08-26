/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.ar;

class bd
implements Runnable {
    final /* synthetic */ ar a;

    bd(ar ar2) {
        this.a = ar2;
    }

    @Override
    public void run() {
        this.a.dismiss();
    }
}

