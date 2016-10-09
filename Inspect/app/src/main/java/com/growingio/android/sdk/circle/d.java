/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.circle;

import com.growingio.android.sdk.circle.HybridEventEditDialog;
import com.growingio.android.sdk.circle.a;

class d
implements Runnable {
    final /* synthetic */ HybridEventEditDialog a;
    final /* synthetic */ a b;

    d(a a2, HybridEventEditDialog hybridEventEditDialog) {
        this.b = a2;
        this.a = hybridEventEditDialog;
    }

    @Override
    public void run() {
        a.a(this.b, this.a, HybridEventEditDialog.class.getName());
    }
}

