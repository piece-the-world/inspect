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
import com.growingio.android.sdk.circle.da;
import com.growingio.android.sdk.circle.dc;
import com.growingio.android.sdk.circle.dd;
import com.growingio.android.sdk.utils.h;

class db
implements View.OnClickListener {
    final /* synthetic */ da a;

    db(da da2) {
        this.a = da2;
    }

    public void onClick(View view) {
        new AlertDialog.Builder(this.a.getContext()).setTitle((CharSequence)"\u5708\u9009").setMessage((CharSequence)"Web\u7aef\u5708\u9009\u4e2d").setPositiveButton((CharSequence)"\u9000\u51fa\u5708\u9009", (DialogInterface.OnClickListener)new dc(this)).setNegativeButton((CharSequence)"\u7ee7\u7eed\u5708\u9009", null).create().show();
        h.a(new dd(this), 300);
    }
}

