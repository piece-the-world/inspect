/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.content.DialogInterface;
import com.growingio.android.sdk.circle.da;
import com.growingio.android.sdk.circle.db;

class dc
implements DialogInterface.OnClickListener {
    final /* synthetic */ db a;

    dc(db db2) {
        this.a = db2;
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        dialogInterface.dismiss();
        da.a(this.a.a).i();
        da.a(this.a.a).k();
    }
}

