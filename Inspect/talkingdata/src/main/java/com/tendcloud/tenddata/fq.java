/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
package com.tendcloud.tenddata;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tendcloud.tenddata.fl;

static final class fq
extends Handler {
    fq(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        try {
            if (message.obj != null && message.obj instanceof fl) {
                Bundle bundle = message.getData();
                fl fl2 = (fl)message.obj;
                switch (message.what) {
                    case 101: {
                        fl2.a(bundle);
                        break;
                    }
                    case 102: {
                        fl2.b();
                        break;
                    }
                }
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }
}

