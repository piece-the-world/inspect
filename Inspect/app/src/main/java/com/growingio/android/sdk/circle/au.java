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
import com.growingio.android.sdk.utils.g;

class au
implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ar a;

    au(ar ar2) {
        this.a = ar2;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        ar.r(this.a).setVisibility(bl2 ? 0 : 8);
        ar.t(this.a).setVisibility(bl2 && !ar.s(this.a).isChecked() ? 0 : 8);
        ar.u(this.a).setText((CharSequence)g.a(bl2 ? "growing_label_collapse_text" : "growing_label_expand_text", new Object[0]));
    }
}

