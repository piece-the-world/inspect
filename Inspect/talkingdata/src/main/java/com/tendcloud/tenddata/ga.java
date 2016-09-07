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
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.dz;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.fu;
import java.util.HashMap;

static final class ga
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    ga(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    @Override
    public void run() {
        block2 : {
            try {
                ed.a("onPause being called! pageName: " + this.a);
                fu.a a2 = new fu.a();
                a2.a.put("isPageOrSession", this.b);
                a2.a.put("apiType", 3);
                a2.a.put("occurTime", String.valueOf(System.currentTimeMillis()));
                a2.a.put("pageName", this.a);
                Message.obtain((Handler)dz.a(), (int)102, (Object)a2).sendToTarget();
            }
            catch (Throwable var1_2) {
                if (!TCAgent.LOG_ON) break block2;
                var1_2.printStackTrace();
            }
        }
    }
}

