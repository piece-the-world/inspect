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
import com.growingio.android.sdk.circle.ar;

class as
implements DialogInterface.OnKeyListener {
    final /* synthetic */ ar a;

    as(ar ar2) {
        this.a = ar2;
    }

    public boolean onKey(DialogInterface dialogInterface, int n2, KeyEvent keyEvent) {
        if (n2 == 4 && keyEvent.getAction() == 1 && ar.a(this.a).isShown()) {
            ar.b(this.a);
            return true;
        }
        return false;
    }
}

