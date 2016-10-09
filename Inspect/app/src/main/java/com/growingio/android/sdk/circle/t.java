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
import com.growingio.android.sdk.circle.k;
import com.growingio.android.sdk.circle.u;
import com.growingio.android.sdk.utils.i;

class t
implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity a;
    final /* synthetic */ k b;

    t(k k2, Activity activity) {
        this.b = k2;
        this.a = activity;
    }

    public void onClick(DialogInterface dialog, int which) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)"http://fir.im/GIOAndroidApp"));
        this.a.startActivity(intent);
        i.a(new u(this), 1000);
    }
}

