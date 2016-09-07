/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.TalkingDataSMSVerifyCallback;
import com.tendcloud.tenddata.fl;

class fn
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ TalkingDataSMSVerifyCallback b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ fl e;

    fn(fl fl2, String string, TalkingDataSMSVerifyCallback talkingDataSMSVerifyCallback, int n2, String string2) {
        this.e = fl2;
        this.a = string;
        this.b = talkingDataSMSVerifyCallback;
        this.c = n2;
        this.d = string2;
    }

    @Override
    public void run() {
        if (this.a.equals("verify") && this.b != null) {
            if (this.c == 200) {
                this.b.onVerifySucc(this.d);
            } else {
                this.b.onVerifyFailed(this.c, this.d);
            }
        }
    }
}

