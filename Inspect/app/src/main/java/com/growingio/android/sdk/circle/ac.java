/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.growingio.android.sdk.circle.ab;
import com.growingio.android.sdk.circle.ad;
import com.growingio.android.sdk.circle.k;

class ac
implements Runnable {
    final /* synthetic */ ab a;

    ac(ab ab2) {
        this.a = ab2;
    }

    @Override
    public void run() {
        new AlertDialog.Builder((Context)k.e().d()).setTitle((CharSequence)"\u5708\u9009\u7ed3\u675f").setMessage((CharSequence)"\u65e0\u6cd5\u8fde\u63a5\u5230Web\u7aef\uff0c\u8bf7\u5c1d\u8bd5\u91cd\u65b0\u626b\u63cf\u4e8c\u7ef4\u7801").setPositiveButton((CharSequence)"\u77e5\u9053\u4e86", (DialogInterface.OnClickListener)new ad(this)).create().show();
    }
}

