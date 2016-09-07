/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Message
 */
package com.tendcloud.tenddata;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import com.tendcloud.tenddata.TCAgent;
import com.tendcloud.tenddata.dz;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.fu;
import java.util.HashMap;

static final class fz
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Activity c;

    fz(String string, boolean bl2, Activity activity) {
        this.a = string;
        this.b = bl2;
        this.c = activity;
    }

    @Override
    public void run() {
        block2 : {
            try {
                ed.a("onResume being called! pageName: " + this.a + ", FromAPI: " + String.valueOf(this.b));
                fu.a a2 = new fu.a();
                a2.a.put("context", this.c);
                a2.a.put("isPageOrSession", this.b);
                a2.a.put("apiType", 2);
                a2.a.put("occurTime", System.currentTimeMillis());
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

