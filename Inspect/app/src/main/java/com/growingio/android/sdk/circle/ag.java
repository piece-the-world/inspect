/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.DialogFragment
 */
package com.growingio.android.sdk.circle;

import android.app.DialogFragment;
import com.growingio.android.sdk.circle.HybridEventEditDialog;
import com.growingio.android.sdk.circle.k;

class ag
implements Runnable {
    final /* synthetic */ HybridEventEditDialog a;
    final /* synthetic */ k b;

    ag(k k2, HybridEventEditDialog hybridEventEditDialog) {
        this.b = k2;
        this.a = hybridEventEditDialog;
    }

    @Override
    public void run() {
        this.b.a(this.a, HybridEventEditDialog.class.getName());
    }
}

