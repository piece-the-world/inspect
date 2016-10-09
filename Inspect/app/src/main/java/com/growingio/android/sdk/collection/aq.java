/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.collection;

import com.growingio.android.sdk.b.n;
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.collection.VdsJsHelper;
import com.growingio.android.sdk.collection.VdsJsHelper$VdsBridge;

class aq
implements Runnable {
    final /* synthetic */ k a;
    final /* synthetic */ n b;
    final /* synthetic */ VdsJsHelper.VdsBridge c;

    aq(VdsJsHelper.VdsBridge vdsBridge, k k2, n n2) {
        this.c = vdsBridge;
        this.a = k2;
        this.b = n2;
    }

    @Override
    public void run() {
        this.a.a(this.b);
    }
}

