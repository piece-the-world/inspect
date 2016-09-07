/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

static final class ck
extends BroadcastReceiver {
    final /* synthetic */ Object a;
    final /* synthetic */ Context b;

    ck(Object object, Context context) {
        this.a = object;
        this.b = context;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void onReceive(Context context, Intent intent) {
        try {
            Object object = this.a;
            synchronized (object) {
                try {
                    this.a.notifyAll();
                }
                catch (Throwable var4_5) {}
                finally {
                    this.b.unregisterReceiver((BroadcastReceiver)this);
                }
            }
        }
        catch (Throwable var3_4) {
            // empty catch block
        }
    }
}

