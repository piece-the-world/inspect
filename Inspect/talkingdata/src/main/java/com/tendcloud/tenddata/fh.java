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
import com.tendcloud.tenddata.fc;
import com.tendcloud.tenddata.ff;

static final class fh
extends Handler {
    fh(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        try {
            fc fc2 = fc.a();
            switch (message.what) {
                case 101: {
                    fc2.c();
                    break;
                }
                case 102: {
                    fc2.b((ff)message.obj);
                    break;
                }
                case 103: {
                    fc2.a((ff)message.obj);
                    break;
                }
                case 104: {
                    fc2.d();
                    break;
                }
                case 105: {
                    fc2.e();
                    break;
                }
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }
}

