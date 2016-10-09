/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.agent;

import com.growingio.android.sdk.agent.a;
import com.growingio.android.sdk.b.i;
import com.growingio.android.sdk.utils.LogUtil;
import com.growingio.android.sdk.utils.k;

class e
implements Runnable {
    private i a;
    private com.growingio.android.sdk.b.a b;

    private e() {
    }

    public void a(i i2) {
        this.a = i2;
        if (i2 != null) {
            this.b = k.a(i2);
        }
    }

    public boolean a() {
        return this.a != null;
    }

    @Override
    public void run() {
        try {
            k.a(this.b, this.a);
        }
        catch (Throwable var1_1) {
            LogUtil.d(var1_1);
        }
        this.a = null;
    }

    /* synthetic */ e(a a2) {
        this();
    }
}

