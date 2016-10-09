/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnKeyListener
 *  android.view.KeyEvent
 */
package com.growingio.android.sdk.circle;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.growingio.android.sdk.circle.HybridEventEditDialog;

class ar
implements DialogInterface.OnKeyListener {
    final /* synthetic */ HybridEventEditDialog a;

    ar(HybridEventEditDialog hybridEventEditDialog) {
        this.a = hybridEventEditDialog;
    }

    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
        if (keyCode == 4 && event.getAction() == 1) {
            if (HybridEventEditDialog.a().canGoBack()) {
                HybridEventEditDialog.a().goBack();
            } else {
                this.a.dismiss();
            }
            return true;
        }
        return false;
    }
}

