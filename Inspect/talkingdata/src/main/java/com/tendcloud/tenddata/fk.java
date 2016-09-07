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
import com.tendcloud.tenddata.fj;

static final class fk
extends Handler {
    fk(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        try {
            fj.b();
        }
        catch (Throwable var2_2) {
            // empty catch block
        }
    }
}

