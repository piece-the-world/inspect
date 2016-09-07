/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.telephony.TelephonyManager
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.tendcloud.tenddata.bh;

public class bj {
    public static final String a = "newwork";

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.getTypeName().equalsIgnoreCase("wifi")) {
            return true;
        }
        return false;
    }

    public static String b(Context context) {
        String string = "no_network";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null) {
                return string;
            }
            if (networkInfo.getType() == 1) {
                string = "wifi";
            } else {
                switch (networkInfo.getSubtype()) {
                    case 0: {
                        string = "UNKNOWN";
                        break;
                    }
                    case 1: {
                        string = "GPRS";
                        break;
                    }
                    case 2: {
                        string = "EDGE";
                        break;
                    }
                    case 3: {
                        string = "UMTS";
                        break;
                    }
                    case 4: {
                        string = "CDMA";
                        break;
                    }
                    case 5: {
                        string = "EVDO_0";
                        break;
                    }
                    case 6: {
                        string = "EVDO_A";
                        break;
                    }
                    case 7: {
                        string = "1xRTT";
                        break;
                    }
                    case 8: {
                        string = "HSDPA";
                        break;
                    }
                    case 9: {
                        string = "HSUPA";
                        break;
                    }
                    case 10: {
                        string = "HSPA";
                        break;
                    }
                    case 11: {
                        string = "IDEN";
                        break;
                    }
                    case 12: {
                        string = "EVDO_B";
                        break;
                    }
                    case 13: {
                        string = "LTE";
                        break;
                    }
                    case 14: {
                        string = "EHRPD";
                        break;
                    }
                    case 15: {
                        string = "HSPAP";
                    }
                }
            }
        }
        catch (Exception var2_3) {
            bh.b("newwork", var2_3.getMessage());
        }
        return string;
    }

    public static String c(Context context) {
        String string = "";
        try {
            TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            String string2 = telephonyManager.getSimOperator();
            if (string2 != null) {
                string = string2;
            }
        }
        catch (Exception var2_3) {
            bh.b("newwork", var2_3.getMessage());
        }
        return string;
    }

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getApplicationContext().getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null) {
            return networkInfo.isConnectedOrConnecting();
        }
        return false;
    }
}

