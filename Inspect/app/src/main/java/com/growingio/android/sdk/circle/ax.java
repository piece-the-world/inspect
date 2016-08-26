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

class ax
implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ar a;

    ax(ar ar2) {
        this.a = ar2;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        ar.f(this.a, bl2);
    }
}

