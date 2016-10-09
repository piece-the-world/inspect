/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.growingio.android.sdk.utils;

import android.text.TextUtils;

public class f {
    public static String a(int n2, String string) {
        switch (n2) {
            case 1: 
            case 2: 
            case 7: 
            case 11: {
                return "2G";
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 12: 
            case 14: 
            case 15: {
                return "3G";
            }
            case 13: {
                return "4G";
            }
        }
        if (!TextUtils.isEmpty((CharSequence)string) && (string.equalsIgnoreCase("TD-SCDMA") || string.equalsIgnoreCase("WCDMA") || string.equalsIgnoreCase("CDMA2000"))) {
            return "3G";
        }
        return "UNKNOWN";
    }
}

