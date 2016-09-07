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
import com.tendcloud.tenddata.ef;
import com.tendcloud.tenddata.ej;
import com.tendcloud.tenddata.fu;

static final class ek
extends Handler {
    ek(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        try {
            if (message.obj != null && message.obj instanceof ef) {
                ej.a((ef)message.obj);
                int n2 = ej.b().i;
                if (ej.b().f == null) {
                    ej.a(ej.a());
                    return;
                }
                fu.c = false;
                ej.a(ej.a(), ej.b().a, ej.b().b, ej.b().c, ej.b().e, ej.b().f, ej.b().g, n2, ej.b().h);
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }
}

