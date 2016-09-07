/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.Message;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.dz;
import com.tendcloud.tenddata.fu;
import java.util.HashMap;

static final class gb
implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;

    gb(int n2, String string) {
        this.a = n2;
        this.b = string;
    }

    @Override
    public void run() {
        try {
            if (fu.b) {
                fu.a a2 = new fu.a();
                a2.a.put("apiType", this.a);
                a2.a.put("occurTime", String.valueOf(System.currentTimeMillis()));
                a2.a.put("pageName", this.b == null ? "" : cs.a(this.b));
                Message.obtain((Handler)dz.a(), (int)102, (Object)a2).sendToTarget();
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }
}

