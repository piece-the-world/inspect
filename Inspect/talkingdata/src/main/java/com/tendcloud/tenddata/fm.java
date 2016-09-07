/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.TalkingDataSMSApplyCallback;
import com.tendcloud.tenddata.fl;

class fm
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ TalkingDataSMSApplyCallback b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ fl e;

    fm(fl fl2, String string, TalkingDataSMSApplyCallback talkingDataSMSApplyCallback, int n2, String string2) {
        this.e = fl2;
        this.a = string;
        this.b = talkingDataSMSApplyCallback;
        this.c = n2;
        this.d = string2;
    }

    @Override
    public void run() {
        if (this.a.equals("apply") && this.b != null) {
            if (this.c == 200) {
                this.b.onApplySucc(this.d);
            } else {
                this.b.onApplyFailed(this.c, this.d);
            }
        }
    }
}

