/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 */
package com.growingio.android.sdk.collection;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.growingio.android.sdk.utils.g;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

public class l {
    protected static UUID a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @TargetApi(value=9)
    public l(Context context) {
        if (a != null) return;
        reference var2_2 = l.class;
        synchronized (l.class) {
            if (a != null) return;
            SharedPreferences sharedPreferences = context.getSharedPreferences("device_id.xml", 0);
            String string = sharedPreferences.getString("device_id", null);
            if (string != null) {
                a = UUID.fromString(string);
            } else {
                String string2 = Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"android_id");
                try {
                    String string3;
                    if (!TextUtils.isEmpty((CharSequence)string2) && !"9774d56d682e549c".equals(string2)) {
                        a = UUID.nameUUIDFromBytes(string2.getBytes("utf8"));
                    } else if (g.e() && !TextUtils.isEmpty((CharSequence)(string3 = ((TelephonyManager)context.getSystemService("phone")).getDeviceId()))) {
                        a = UUID.nameUUIDFromBytes(string3.getBytes("utf8"));
                    }
                }
                catch (UnsupportedEncodingException var6_7) {
                    throw new RuntimeException(var6_7);
                }
                if (a == null) {
                    a = UUID.randomUUID();
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

