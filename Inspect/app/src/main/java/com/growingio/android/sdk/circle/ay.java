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
import com.growingio.android.sdk.circle.aw;
import com.growingio.android.sdk.circle.ax;

class ay
implements Runnable {
    final /* synthetic */ ax a;

    ay(ax ax2) {
        this.a = ax2;
    }

    @Override
    public void run() {
        Toast.makeText((Context)aw.b(this.a.a), (CharSequence)"\u5f00\u59cb\u51c6\u5907\u5708\u9009", (int)1).show();
    }
}

