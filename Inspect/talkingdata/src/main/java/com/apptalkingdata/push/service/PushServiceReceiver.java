/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.apptalkingdata.push.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tendcloud.tenddata.bg;
import com.tendcloud.tenddata.bh;
import com.tendcloud.tenddata.bo;

public final class PushServiceReceiver
extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        bg.init(context);
        try {
            String string = intent.getAction();
            if ("android.intent.action.BOOT_COMPLETED".equals(string) || "android.net.conn.CONNECTIVITY_CHANGE".equals(string) || "android.intent.action.USER_PRESENT".equals(string) || "android.intent.extra.DONT_KILL_APP".equals(string) || "android.intent.action.PACKAGE_REMOVED".equals(string)) {
                bo.a(context);
            } else if ("android.intent.action.CMD".equals(string)) {
                bo.a(context, intent);
            } else if ("android.talkingdata.action.media.MESSAGE".equals(string)) {
                bo.b(context, intent);
            }
        }
        catch (Throwable var3_4) {
            bh.a("PushServiceReceiver", "onReceive err", var3_4);
        }
    }
}

