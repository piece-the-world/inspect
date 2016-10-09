/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.growingio.android.sdk.circle;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.growingio.android.sdk.circle.bk;
import com.growingio.android.sdk.circle.bm;
import com.growingio.android.sdk.circle.bn;
import com.growingio.android.sdk.utils.i;

class bl
implements View.OnClickListener {
    final /* synthetic */ bk a;

    bl(bk bk2) {
        this.a = bk2;
    }

    public void onClick(View v2) {
        new AlertDialog.Builder(this.a.getContext()).setTitle((CharSequence)"\u5708\u9009").setMessage((CharSequence)"Web\u7aef\u5708\u9009\u4e2d").setPositiveButton((CharSequence)"\u9000\u51fa\u5708\u9009", (DialogInterface.OnClickListener)new bm(this)).setNegativeButton((CharSequence)"\u7ee7\u7eed\u5708\u9009", null).create().show();
        i.a(new bn(this), 300);
    }
}

