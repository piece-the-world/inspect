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
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.fr;

static final class fs
extends Handler {
    fs(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        try {
            fr.b = message.getData().getString("action");
            if (message.obj != null && message.obj instanceof byte[]) {
                byte[] arrby = (byte[])message.obj;
                if (fr.b.equals("verify")) {
                    cc.a = fr.c = message.getData().getInt("timeout");
                    cc.b = fr.c;
                }
                fr.a(arrby);
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }
}

