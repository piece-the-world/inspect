/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
package com.growingio.android.sdk.circle;

import android.widget.CompoundButton;
import com.growingio.android.sdk.circle.ar;

class ba
implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ar a;

    ba(ar ar2) {
        this.a = ar2;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        ar.d(this.a, false);
        ar.w(this.a).setEnabled(bl2);
        ar.q(this.a);
    }
}

