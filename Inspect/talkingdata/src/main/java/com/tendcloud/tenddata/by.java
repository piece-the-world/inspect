/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 */
package com.tendcloud.tenddata;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.apptalkingdata.push.service.PushService;
import com.tendcloud.tenddata.az;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bk;

public class by {
    private static String a = by.class.getName();

    public static void a(Context context, String string) {
        try {
            bk.putCodePreferences(context);
            bk.putGatewayPreferences(context);
            Intent intent = new Intent(context, (Class)PushService.class);
            if (!az.a(string)) {
                intent.putExtra("service-cmd", string);
            }
            context.startService(intent);
        }
        catch (Throwable var2_3) {
            bh.b(a, "start service err" + var2_3.toString());
        }
    }

    public static void stop(Context context) {
        try {
            Intent intent = new Intent(context, (Class)PushService.class);
            context.stopService(intent);
        }
        catch (Throwable var1_2) {
            bh.b(a, "start service err" + var1_2.toString());
        }
    }
}

