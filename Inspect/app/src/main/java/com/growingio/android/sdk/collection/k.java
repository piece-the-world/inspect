/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.telephony.TelephonyManager
 */
package com.growingio.android.sdk.collection;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class k {
    protected static UUID a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public k(Context context) {
        if (a != null) return;
        reference var2_2 = k.class;
        synchronized (k.class) {
            if (a != null) return;
            SharedPreferences sharedPreferences = context.getSharedPreferences("device_id.xml", 0);
            String string = sharedPreferences.getString("device_id", null);
            if (string != null) {
                a = UUID.fromString(string);
            } else {
                String string2 = Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"android_id");
                try {
                    String string3;
                    a = !"9774d56d682e549c".equals(string2) ? UUID.nameUUIDFromBytes(string2.getBytes("utf8")) : ((string3 = ((TelephonyManager)context.getSystemService("phone")).getDeviceId()) != null ? UUID.nameUUIDFromBytes(string3.getBytes("utf8")) : UUID.randomUUID());
                }
                catch (UnsupportedEncodingException var6_7) {
                    throw new RuntimeException(var6_7);
                }
                sharedPreferences.edit().putString("device_id", a.toString()).apply();
            }
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return;
        }
    }

    public UUID a() {
        return a;
    }
}

