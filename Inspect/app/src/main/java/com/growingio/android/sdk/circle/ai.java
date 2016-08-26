/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
package com.growingio.android.sdk.circle;

import android.widget.CompoundButton;
import com.growingio.android.sdk.circle.ag;
import com.growingio.android.sdk.circle.j;

class ai
implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ag a;

    ai(ag ag2) {
        this.a = ag2;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean bl2) {
        j.e().a(bl2);
    }
}

