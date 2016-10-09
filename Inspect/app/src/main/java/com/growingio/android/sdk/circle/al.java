/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
package com.growingio.android.sdk.circle;

import android.widget.CompoundButton;
import com.growingio.android.sdk.circle.ak;
import com.growingio.android.sdk.circle.k;

class al
implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ak a;

    al(ak ak2) {
        this.a = ak2;
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        k.e().a(isChecked);
    }
}

