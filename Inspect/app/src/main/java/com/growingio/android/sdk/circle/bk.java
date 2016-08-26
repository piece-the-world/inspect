/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Toast
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.growingio.android.sdk.circle.ar;
import com.growingio.android.sdk.circle.bl;
import com.growingio.android.sdk.utils.h;

class bk
implements View.OnClickListener {
    final /* synthetic */ ar a;

    bk(ar ar2) {
        this.a = ar2;
    }

    public void onClick(View view) {
        if (TextUtils.isEmpty((CharSequence)ar.f(this.a).getText().toString().trim())) {
            Toast.makeText((Context)ar.g(this.a), (CharSequence)"\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a", (int)0).show();
            return;
        }
        ar.a(this.a, false);
        h.a(new bl(this), 500);
    }
}

