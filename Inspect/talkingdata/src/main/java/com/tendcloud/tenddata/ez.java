/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tendcloud.tenddata.ey;

class ez
extends Handler {
    final /* synthetic */ ey a;

    ez(ey ey2, Looper looper) {
        this.a = ey2;
        super(looper);
    }

    public void handleMessage(Message message) {
        int n2 = message.what;
        switch (n2) {
            case 4: {
                ey.a(this.a);
                break;
            }
            case 0: {
                ey.b(this.a);
                break;
            }
            case 1: {
                ey.c(this.a);
                break;
            }
            case 3: {
                ey.d(this.a);
                break;
            }
            case 2: {
                break;
            }
            case 5: {
                this.a.b();
                break;
            }
            case 6: {
                ey.e(this.a);
                break;
            }
        }
    }
}

