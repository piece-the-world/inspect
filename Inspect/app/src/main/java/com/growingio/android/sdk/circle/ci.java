/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
package com.growingio.android.sdk.circle;

import android.content.Context;
import android.widget.Toast;
import com.growingio.android.sdk.circle.cg;
import com.growingio.android.sdk.circle.ch;

class ci
implements Runnable {
    final /* synthetic */ ch a;

    ci(ch ch2) {
        this.a = ch2;
    }

    @Override
    public void run() {
        Toast.makeText((Context)cg.b(this.a.a), (CharSequence)"\u5f00\u59cb\u51c6\u5907\u5708\u9009", (int)1).show();
    }
}

