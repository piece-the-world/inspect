/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 */
package com.growingio.android.sdk.circle;

import android.widget.RadioGroup;
import com.growingio.android.sdk.circle.ar;

class av
implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ ar a;

    av(ar ar2) {
        this.a = ar2;
    }

    public void onCheckedChanged(RadioGroup radioGroup, int n2) {
        ar.d(this.a, false);
        ar.v(this.a);
        ar.q(this.a);
    }
}

