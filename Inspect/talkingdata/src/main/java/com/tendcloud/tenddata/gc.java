/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Message
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.tendcloud.tenddata.dz;
import com.tendcloud.tenddata.fu;
import java.util.HashMap;

static final class gc
implements Runnable {
    final /* synthetic */ Throwable a;
    final /* synthetic */ Context b;

    gc(Throwable throwable, Context context) {
        this.a = throwable;
        this.b = context;
    }

    @Override
    public void run() {
        try {
            if (this.a == null) {
                return;
            }
            if (this.b != null && !fu.b) {
                fu.a(this.b, null, null);
            }
            fu.a a2 = new fu.a();
            a2.a.put("apiType", 5);
            a2.a.put("occurTime", String.valueOf(System.currentTimeMillis()));
            a2.a.put("throwable", this.a);
            Message.obtain((Handler)dz.a(), (int)102, (Object)a2).sendToTarget();
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }
}

