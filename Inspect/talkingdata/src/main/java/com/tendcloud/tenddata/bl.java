/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.Intent;
import com.tendcloud.tenddata.ba;
import com.tendcloud.tenddata.bb;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bm;
import com.tendcloud.tenddata.bw;
import com.tendcloud.tenddata.by;

public class bl {
    private static final String a = bl.class.getName();

    public static void start(Context context) {
        bl.a(context, null, null);
    }

    public static void a(Context context, String string, String string2) {
        if (context == null) {
            throw new RuntimeException("[mpush] start service error, context is required");
        }
        ba.commonInit(context);
        try {
            Intent intent = new Intent();
            intent.setAction("android.talkingdata.action.media.TD.TOKEN");
            intent.putExtra("mpush_token", bw.a(context));
            context.sendBroadcast(intent);
        }
        catch (Exception var3_4) {
            bh.b(a, var3_4.getMessage());
        }
        by.a(context, "service-start");
        bb.submitExecutor(new bm(context));
    }

    public static void a(Context context, boolean bl2) {
        bh.setIsShow(bl2);
    }
}

