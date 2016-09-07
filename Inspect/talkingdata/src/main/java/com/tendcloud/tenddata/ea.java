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
import com.tendcloud.tenddata.AgentOption;
import com.tendcloud.tenddata.ef;
import com.tendcloud.tenddata.fu;
import com.tendcloud.tenddata.gg;

static final class ea
extends Handler {
    ea(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        if (!AgentOption.a()) {
            return;
        }
        switch (message.what) {
            case 102: {
                if (message.obj == null || !(message.obj instanceof fu.a)) break;
                fu.a a2 = (fu.a)message.obj;
                fu.b.a(1).a();
                try {
                    gg.a().post(a2);
                }
                catch (Throwable var3_4) {
                    // empty catch block
                }
                fu.b.a(1).b();
                break;
            }
            case 103: {
                if (message.obj == null || !(message.obj instanceof ef)) break;
                ef ef2 = (ef)message.obj;
                try {
                    gg.a().post(ef2);
                    break;
                }
                catch (Throwable var3_5) {
                    break;
                }
            }
        }
    }
}

