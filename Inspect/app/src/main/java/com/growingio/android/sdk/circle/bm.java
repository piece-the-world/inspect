/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.content.DialogInterface;
import com.growingio.android.sdk.circle.bk;
import com.growingio.android.sdk.circle.bl;

class bm
implements DialogInterface.OnClickListener {
    final /* synthetic */ bl a;

    bm(bl bl2) {
        this.a = bl2;
    }

    public void onClick(DialogInterface dialog, int which) {
        dialog.dismiss();
        bk.a(this.a.a).i();
        bk.a(this.a.a).k();
    }
}

