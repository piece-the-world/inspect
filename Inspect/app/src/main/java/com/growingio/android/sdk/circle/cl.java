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

class cl
implements Runnable {
    final /* synthetic */ ch a;

    cl(ch ch2) {
        this.a = ch2;
    }

    @Override
    public void run() {
        Toast.makeText((Context)cg.b(this.a.a), (CharSequence)"\u4e0b\u8f7d\u5708\u9009\u63d2\u4ef6\u5931\u8d25\uff0c\u8bf7\u7a0d\u540e\u91cd\u8bd5", (int)1).show();
    }
}

