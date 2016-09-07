/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Message
 *  android.os.Vibrator
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Message;
import android.os.Vibrator;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.co;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.ew;

class ex
implements co.a {
    final /* synthetic */ ew.b a;

    ex(ew.b b2) {
        this.a = b2;
    }

    @Override
    public void a() {
        if (ew.a(ew.a()) != null) {
            Message message = ew.a(ew.a()).obtainMessage(1);
            ew.a(ew.a()).sendMessage(message);
            if (cs.b(ab.mContext, "android.permission.VIBRATE")) {
                Vibrator vibrator = (Vibrator)ab.mContext.getSystemService("vibrator");
                vibrator.vibrate(100);
            }
        }
    }
}

