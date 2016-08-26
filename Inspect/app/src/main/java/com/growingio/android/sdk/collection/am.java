/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.b.n;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.VdsJsHelper$VdsBridge;

class am
implements Runnable {
    final /* synthetic */ j a;
    final /* synthetic */ n b;
    final /* synthetic */ VdsJsHelper.VdsBridge c;

    am(VdsJsHelper.VdsBridge vdsBridge, j j2, n n2) {
        this.c = vdsBridge;
        this.a = j2;
        this.b = n2;
    }

    @Override
    public void run() {
        this.a.a(this.b);
    }
}

