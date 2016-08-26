/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.Toast
 */
package com.growingio.android.sdk.a;

import android.content.Context;
import android.widget.Toast;
import com.growingio.android.sdk.a.a;

class b
implements Runnable {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    @Override
    public void run() {
        Toast.makeText((Context)a.b().g(), (CharSequence)"\u767b\u5f55\u4fe1\u606f\u5df2\u5931\u6548\uff0c\u8bf7\u91cd\u65b0\u4eceGrowingIO App\u5524\u9192\u5b9a\u4e49", (int)0).show();
    }
}

