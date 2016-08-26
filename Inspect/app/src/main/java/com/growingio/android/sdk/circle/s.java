/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.net.Uri
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.growingio.android.sdk.circle.j;
import com.growingio.android.sdk.circle.t;
import com.growingio.android.sdk.utils.h;

class s
implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity a;
    final /* synthetic */ j b;

    s(j j2, Activity activity) {
        this.b = j2;
        this.a = activity;
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)"http://fir.im/GIOAndroidApp"));
        this.a.startActivity(intent);
        h.a(new t(this), 1000);
    }
}

