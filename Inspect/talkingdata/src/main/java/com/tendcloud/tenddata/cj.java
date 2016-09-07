/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.DhcpInfo
 *  android.net.NetworkInfo
 *  android.net.NetworkInfo$State
 *  android.net.Proxy
 *  android.net.wifi.ScanResult
 *  android.net.wifi.WifiConfiguration
 *  android.net.wifi.WifiInfo
 *  android.net.wifi.WifiManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.telephony.CellIdentityCdma
 *  android.telephony.CellIdentityGsm
 *  android.telephony.CellIdentityLte
 *  android.telephony.CellIdentityWcdma
 *  android.telephony.CellInfo
 *  android.telephony.CellInfoCdma
 *  android.telephony.CellInfoGsm
 *  android.telephony.CellInfoLte
 *  android.telephony.CellInfoWcdma
 *  android.telephony.CellLocation
 *  android.telephony.CellSignalStrengthCdma
 *  android.telephony.CellSignalStrengthGsm
 *  android.telephony.CellSignalStrengthLte
 *  android.telephony.CellSignalStrengthWcdma
 *  android.telephony.NeighboringCellInfo
 *  android.telephony.SubscriptionInfo
 *  android.telephony.SubscriptionManager
 *  android.telephony.TelephonyManager
 *  android.telephony.cdma.CdmaCellLocation
 *  android.telephony.gsm.GsmCellLocation
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.NeighboringCellInfo;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.tendcloud.tenddata.ck;
import com.tendcloud.tenddata.cs;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class cj {
    static TelephonyManager a;
    static final String b = "www.talkingdata.net";
    static final int c = 80;
    private static final String[] g;
    private static final String[] h;
    static boolean d;
    static final long e = 300000;
    static long f;

    static void a(Context context) {
        try {
            a = (TelephonyManager)context.getSystemService("phone");
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
    }

    public static String b(Context context) {
        try {
            Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                NetworkInterface networkInterface = enumeration.nextElement();
                Enumeration<InetAddress> enumeration2 = networkInterface.getInetAddresses();
                while (enumeration2.hasMoreElements()) {
                    InetAddress inetAddress = enumeration2.nextElement();
                    if (inetAddress.isLoopbackAddress() || !(inetAddress instanceof Inet4Address)) continue;
                    return inetAddress.getHostAddress().toString();
                }
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean c(Context context) {
        block18 : {
            try {
                Object object;
                boolean bl2 = true;
                if (cs.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    bl2 = false;
                    object = (ConnectivityManager)context.getSystemService("connectivity");
                    NetworkInfo networkInfo = object.getActiveNetworkInfo();
                    if (networkInfo != null) {
                        return networkInfo.isConnected();
                    }
                    NetworkInfo networkInfo2 = object.getNetworkInfo(0);
                    if (networkInfo2 != null && networkInfo2.getState().equals((Object)NetworkInfo.State.UNKNOWN)) {
                        bl2 = true;
                    } else {
                        return false;
                    }
                }
                if (!bl2 || SystemClock.elapsedRealtime() - f <= 300000) break block18;
                f = SystemClock.elapsedRealtime();
                object = null;
                try {
                    object = cj.a() ? new Socket(Proxy.getDefaultHost(), Proxy.getDefaultPort()) : new Socket("www.talkingdata.net", 80);
                    d = true;
                }
                catch (Throwable var3_6) {
                    d = false;
                }
                finally {
                    if (object != null) {
                        try {
                            object.close();
                        }
                        catch (Throwable var3_5) {}
                    }
                }
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
        return d;
    }

    public static boolean d(Context context) {
        try {
            if (cs.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                return networkInfo != null && networkInfo.isAvailable();
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return false;
    }

    public static boolean e(Context context) {
        boolean bl2 = false;
        try {
            WifiManager wifiManager = (WifiManager)context.getSystemService("wifi");
            bl2 = wifiManager.isWifiEnabled();
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
        return bl2;
    }

    public static boolean f(Context context) {
        try {
            if (a == null) {
                cj.a(context);
            }
            return a.getSimState() == 5;
        }
        catch (Throwable var1_1) {
            return false;
        }
    }

    public static boolean g(Context context) {
        try {
            if (cs.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                return networkInfo != null && 1 == networkInfo.getType() && networkInfo.isConnected();
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return false;
    }

    public static boolean h(Context context) {
        try {
            if (a == null) {
                cj.a(context);
            }
            return a.getDataState() == 2;
        }
        catch (Throwable var1_1) {
            return false;
        }
    }

    public static boolean a() {
        try {
            if (cs.a(11)) {
                String string = System.getProperty("http.proxyHost");
                return !TextUtils.isEmpty((CharSequence)string);
            }
            return !TextUtils.isEmpty((CharSequence)Proxy.getDefaultHost());
        }
        catch (Throwable var0_1) {
            return false;
        }
    }

    public static String i(Context context) {
        if (!cj.c(context)) {
            return "OFFLINE";
        }
        if (cj.g(context)) {
            return "WIFI";
        }
        return cj.j(context);
    }

    public static String j(Context context) {
        String string = g[0];
        try {
            if (a == null) {
                cj.a(context);
            }
            return cj.a(a.getNetworkType());
        }
        catch (Throwable var2_2) {
            return string;
        }
    }

    private static String a(int n2) {
        return n2 >= 0 && n2 < g.length ? g[n2] : String.valueOf(n2);
    }

    private static String b(int n2) {
        return n2 >= 0 && n2 < h.length ? h[n2] : String.valueOf(n2);
    }

    public static String k(Context context) {
        try {
            if (a == null) {
                cj.a(context);
            }
            return a.getNetworkOperator();
        }
        catch (Throwable var1_1) {
            return null;
        }
    }

    public static String l(Context context) {
        try {
            if (a == null) {
                cj.a(context);
            }
            return a.getSimOperator();
        }
        catch (Throwable var1_1) {
            return null;
        }
    }

    public static String m(Context context) {
        try {
            if (a == null) {
                cj.a(context);
            }
            return a.getNetworkCountryIso();
        }
        catch (Throwable var1_1) {
            return null;
        }
    }

    public static String n(Context context) {
        try {
            if (a == null) {
                cj.a(context);
            }
            return a.getSimCountryIso();
        }
        catch (Throwable var1_1) {
            return null;
        }
    }

    public static String o(Context context) {
        try {
            if (cs.a(23) && context.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                return null;
            }
            if (cs.b(context, "android.permission.READ_PHONE_STATE") && Build.VERSION.SDK_INT >= 18) {
                if (a == null) {
                    cj.a(context);
                }
                return a.getGroupIdLevel1();
            }
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
        return null;
    }

    public static String p(Context context) {
        try {
            if (a == null) {
                cj.a(context);
            }
            return a.getNetworkOperatorName();
        }
        catch (Throwable var1_1) {
            return null;
        }
    }

    public static String q(Context context) {
        try {
            if (a == null) {
                cj.a(context);
            }
            return a.getSimOperatorName();
        }
        catch (Throwable var1_1) {
            return null;
        }
    }

    public static JSONArray r(Context context) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject = new JSONObject();
            jSONObject.put("type", (Object)"wifi");
            jSONObject.put("available", cj.e(context));
            jSONObject.put("connected", cj.g(context));
            jSONObject.put("current", (Object)cj.w(context));
            jSONObject.put("scannable", (Object)cj.x(context));
            jSONObject.put("configured", (Object)cj.u(context));
            jSONArray.put((Object)jSONObject);
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
        try {
            jSONObject = new JSONObject();
            jSONObject.put("type", (Object)"cellular");
            jSONObject.put("available", cj.f(context));
            jSONObject.put("connected", cj.h(context));
            jSONObject.put("current", (Object)cj.s(context));
            jSONObject.put("scannable", (Object)cj.t(context));
            jSONArray.put((Object)jSONObject);
        }
        catch (Throwable var2_4) {
            // empty catch block
        }
        return jSONArray.length() > 0 ? jSONArray : null;
    }

    public static JSONArray s(Context context) {
        try {
            if (!cs.b) {
                return null;
            }
            if (cs.a(23) && context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return null;
            }
            if (cs.b(context, "android.permission.ACCESS_COARSE_LOCATION") || cs.b(context, "android.permission.ACCESS_FINE_LOCATION")) {
                CellLocation cellLocation;
                if (a == null) {
                    cj.a(context);
                }
                JSONObject jSONObject = new JSONObject();
                if (cs.d || cs.e) {
                    CdmaCellLocation cdmaCellLocation;
                    cellLocation = a.getCellLocation();
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation)cellLocation;
                        if (gsmCellLocation != null) {
                            jSONObject.put("systemId", gsmCellLocation.getLac());
                            jSONObject.put("networkId", gsmCellLocation.getCid());
                            if (cs.a(9)) {
                                jSONObject.put("basestationId", gsmCellLocation.getPsc());
                            }
                        }
                    } else if (cellLocation instanceof CdmaCellLocation && null != (cdmaCellLocation = (CdmaCellLocation)cellLocation)) {
                        jSONObject.put("systemId", cdmaCellLocation.getSystemId());
                        jSONObject.put("networkId", cdmaCellLocation.getNetworkId());
                        jSONObject.put("basestationId", cdmaCellLocation.getBaseStationId());
                        jSONObject.put("location", (Object)cj.a(cdmaCellLocation.getBaseStationLatitude(), cdmaCellLocation.getBaseStationLongitude()));
                    }
                }
                jSONObject.put("type", (Object)cj.j(context));
                jSONObject.put("mcc", (Object)cj.k(context));
                jSONObject.put("operator", (Object)cj.p(context));
                jSONObject.put("country", (Object)cj.m(context));
                cellLocation = new JSONArray();
                cellLocation.put((Object)jSONObject);
                return cellLocation;
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return null;
    }

    public static JSONArray t(Context context) {
        if (!cs.b) {
            return null;
        }
        if (cs.a(23) && context.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            return null;
        }
        if (cs.b(context, "android.permission.ACCESS_COARSE_LOCATION") || cs.b(context, "android.permission.ACCESS_FINE_LOCATION")) {
            try {
                List list;
                if (a == null) {
                    cj.a(context);
                }
                JSONArray jSONArray = new JSONArray();
                if (cs.a(17)) {
                    List list2 = a.getAllCellInfo();
                    if (list2 != null) {
                        for (CellInfo cellInfo : list2) {
                            try {
                                CellInfoGsm cellInfoGsm;
                                CellIdentityGsm cellIdentityGsm;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("registered", cellInfo.isRegistered());
                                jSONObject.put("ts", cellInfo.getTimeStamp());
                                int n2 = -1;
                                int n3 = -1;
                                int n4 = -1;
                                int n5 = -1;
                                int n6 = -1;
                                CellSignalStrengthGsm cellSignalStrengthGsm = null;
                                String string = null;
                                if (cellInfo instanceof CellInfoGsm) {
                                    string = "GSM";
                                    cellInfoGsm = (CellInfoGsm)cellInfo;
                                    cellIdentityGsm = cellInfoGsm.getCellIdentity();
                                    n2 = cellIdentityGsm.getLac();
                                    n3 = cellIdentityGsm.getCid();
                                    n5 = cellIdentityGsm.getMcc();
                                    n6 = cellIdentityGsm.getMnc();
                                    cellSignalStrengthGsm = cellInfoGsm.getCellSignalStrength();
                                } else if (cellInfo instanceof CellInfoCdma) {
                                    CellSignalStrengthCdma cellSignalStrengthCdma;
                                    string = "CDMA";
                                    cellInfoGsm = (CellInfoCdma)cellInfo;
                                    cellIdentityGsm = cellInfoGsm.getCellIdentity();
                                    n2 = cellIdentityGsm.getSystemId();
                                    n3 = cellIdentityGsm.getNetworkId();
                                    n4 = cellIdentityGsm.getBasestationId();
                                    cellSignalStrengthGsm = cellSignalStrengthCdma = cellInfoGsm.getCellSignalStrength();
                                    jSONObject.put("cdmaDbm", cellSignalStrengthCdma.getCdmaDbm());
                                    jSONObject.put("cdmaDbm", cellSignalStrengthCdma.getCdmaDbm());
                                    jSONObject.put("cdmaEcio", cellSignalStrengthCdma.getCdmaEcio());
                                    jSONObject.put("evdoDbm", cellSignalStrengthCdma.getEvdoDbm());
                                    jSONObject.put("evdoEcio", cellSignalStrengthCdma.getEvdoEcio());
                                    jSONObject.put("evdoSnr", cellSignalStrengthCdma.getEvdoSnr());
                                    jSONObject.put("location", (Object)cj.a(cellIdentityGsm.getLatitude(), cellIdentityGsm.getLongitude()));
                                } else if (cellInfo instanceof CellInfoWcdma) {
                                    string = "WCDMA";
                                    cellInfoGsm = (CellInfoWcdma)cellInfo;
                                    cellIdentityGsm = cellInfoGsm.getCellIdentity();
                                    n2 = cellIdentityGsm.getLac();
                                    n3 = cellIdentityGsm.getCid();
                                    n4 = cellIdentityGsm.getPsc();
                                    n5 = cellIdentityGsm.getMcc();
                                    n6 = cellIdentityGsm.getMnc();
                                    cellSignalStrengthGsm = cellInfoGsm.getCellSignalStrength();
                                } else if (cellInfo instanceof CellInfoLte) {
                                    string = "LTE";
                                    cellInfoGsm = (CellInfoLte)cellInfo;
                                    cellIdentityGsm = cellInfoGsm.getCellIdentity();
                                    n2 = cellIdentityGsm.getTac();
                                    n3 = cellIdentityGsm.getPci();
                                    n4 = cellIdentityGsm.getCi();
                                    n5 = cellIdentityGsm.getMcc();
                                    n6 = cellIdentityGsm.getMnc();
                                    cellSignalStrengthGsm = cellInfoGsm.getCellSignalStrength();
                                }
                                if (n2 != -1) {
                                    jSONObject.put("systemId", n2);
                                }
                                if (n3 != -1) {
                                    jSONObject.put("networkId", n3);
                                }
                                if (n4 != -1) {
                                    jSONObject.put("basestationId", n4);
                                }
                                if (n5 != -1) {
                                    jSONObject.put("mcc", n5);
                                }
                                if (n6 != -1) {
                                    jSONObject.put("mnc", n6);
                                }
                                if (cellSignalStrengthGsm != null) {
                                    jSONObject.put("asuLevel", cellSignalStrengthGsm.getAsuLevel());
                                    jSONObject.put("dbm", cellSignalStrengthGsm.getDbm());
                                }
                                jSONObject.put("type", (Object)string);
                                jSONArray.put((Object)jSONObject);
                            }
                            catch (Throwable var5_10) {}
                        }
                    }
                } else if (cs.a(5) && (cs.d || cs.e) && (list = a.getNeighboringCellInfo()) != null) {
                    for (NeighboringCellInfo neighboringCellInfo : list) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("systemId", neighboringCellInfo.getLac());
                            jSONObject.put("netId", neighboringCellInfo.getCid());
                            jSONObject.put("basestationId", neighboringCellInfo.getPsc());
                            jSONObject.put("asuLevel", neighboringCellInfo.getRssi());
                            jSONObject.put("type", (Object)cj.a(neighboringCellInfo.getNetworkType()));
                            jSONArray.put((Object)jSONObject);
                        }
                        catch (Throwable var5_12) {}
                    }
                }
                return jSONArray.length() > 0 ? jSONArray : null;
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
        return null;
    }

    public static JSONObject a(int n2, int n3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lat", n2);
            jSONObject.put("lng", n3);
            jSONObject.put("unit", (Object)"qd");
        }
        catch (Throwable var3_3) {
            // empty catch block
        }
        return jSONObject;
    }

    public static JSONArray u(Context context) {
        try {
            List list;
            WifiManager wifiManager;
            if (!cs.b) {
                return null;
            }
            if (cs.b(context, "android.permission.ACCESS_WIFI_STATE") && (list = (wifiManager = (WifiManager)context.getSystemService("wifi")).getConfiguredNetworks()) != null) {
                JSONArray jSONArray = new JSONArray();
                for (WifiConfiguration wifiConfiguration : list) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("networkId", wifiConfiguration.networkId);
                        jSONObject.put("priority", wifiConfiguration.priority);
                        jSONObject.put("name", (Object)wifiConfiguration.SSID);
                        jSONObject.put("id", (Object)wifiConfiguration.BSSID);
                        jSONObject.put("allowedKeyManagement", (Object)cj.a(wifiConfiguration.allowedKeyManagement));
                        jSONObject.put("allowedAuthAlgorithms", (Object)cj.a(wifiConfiguration.allowedAuthAlgorithms));
                        jSONObject.put("allowedGroupCiphers", (Object)cj.a(wifiConfiguration.allowedGroupCiphers));
                        jSONObject.put("allowedPairwiseCiphers", (Object)cj.a(wifiConfiguration.allowedPairwiseCiphers));
                        jSONArray.put((Object)jSONObject);
                    }
                    catch (Throwable var6_8) {}
                }
                return jSONArray.length() > 0 ? jSONArray : null;
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return null;
    }

    public static String v(Context context) {
        String string = null;
        try {
            WifiInfo wifiInfo;
            WifiManager wifiManager;
            if (!cs.b) {
                return null;
            }
            if (cs.b(context, "android.permission.ACCESS_WIFI_STATE") && (wifiManager = (WifiManager)context.getSystemService("wifi")).isWifiEnabled() && cj.g(context) && (wifiInfo = wifiManager.getConnectionInfo()) != null && wifiInfo.getBSSID() != null) {
                try {
                    string = wifiInfo.getSSID();
                }
                catch (Throwable var4_5) {}
            }
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
        return string;
    }

    public static JSONArray w(Context context) {
        block6 : {
            try {
                WifiManager wifiManager;
                if (!cs.b) {
                    return null;
                }
                if (!cs.b(context, "android.permission.ACCESS_WIFI_STATE") || !(wifiManager = (WifiManager)context.getSystemService("wifi")).isWifiEnabled()) break block6;
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                String string = null;
                if (wifiInfo == null || wifiInfo.getBSSID() == null) break block6;
                string = wifiInfo.getBSSID();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", (Object)wifiInfo.getSSID());
                    jSONObject.put("id", (Object)string);
                    jSONObject.put("level", wifiInfo.getRssi());
                    jSONObject.put("hidden", wifiInfo.getHiddenSSID());
                    jSONObject.put("ip", wifiInfo.getIpAddress());
                    jSONObject.put("speed", wifiInfo.getLinkSpeed());
                    jSONObject.put("networkId", wifiInfo.getNetworkId());
                    jSONObject.put("mac", (Object)wifiInfo.getMacAddress());
                    DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
                    if (dhcpInfo != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("dns1", dhcpInfo.dns1);
                        jSONObject2.put("dns2", dhcpInfo.dns2);
                        jSONObject2.put("gw", dhcpInfo.gateway);
                        jSONObject2.put("ip", dhcpInfo.ipAddress);
                        jSONObject2.put("mask", dhcpInfo.netmask);
                        jSONObject2.put("server", dhcpInfo.serverAddress);
                        jSONObject2.put("leaseDuration", dhcpInfo.leaseDuration);
                        jSONObject.put("dhcp", (Object)jSONObject2);
                    }
                }
                catch (Throwable var6_8) {
                    // empty catch block
                }
                jSONArray.put((Object)jSONObject);
                return jSONArray;
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static JSONArray x(Context context) {
        block14 : {
            if (!cs.b || !cs.d && !cs.e) {
                return null;
            }
            try {
                Object object;
                JSONArray jSONArray;
                Object object2;
                WifiManager wifiManager;
                if (!cs.b(context, "android.permission.ACCESS_WIFI_STATE") || !(wifiManager = (WifiManager)context.getSystemService("wifi")).isWifiEnabled() && (Build.VERSION.SDK_INT < 18 || !wifiManager.isScanAlwaysAvailable())) break block14;
                if (cs.b(context, "android.permission.CHANGE_WIFI_STATE")) {
                    try {
                        object2 = new Object();
                        jSONArray = new IntentFilter("android.net.wifi.SCAN_RESULTS");
                        context.registerReceiver((BroadcastReceiver)new ck(object2, context), (IntentFilter)jSONArray);
                        wifiManager.startScan();
                        object = object2;
                        synchronized (object) {
                            object2.wait(2000);
                        }
                    }
                    catch (Throwable var2_4) {
                        // empty catch block
                    }
                }
                if ((object2 = wifiManager.getScanResults()) != null) {
                    jSONArray = new JSONArray();
                    object = object2.iterator();
                    while (object.hasNext()) {
                        ScanResult scanResult = (ScanResult)object.next();
                        if (scanResult.level < -85) continue;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", (Object)scanResult.BSSID);
                            jSONObject.put("name", (Object)scanResult.SSID);
                            jSONObject.put("level", scanResult.level);
                            jSONObject.put("freq", scanResult.frequency);
                            if (cs.a(17)) {
                                jSONObject.put("ts", scanResult.timestamp);
                                jSONObject.put("scanTs", System.currentTimeMillis() - SystemClock.elapsedRealtime() + scanResult.timestamp / 1000);
                            }
                            jSONArray.put((Object)jSONObject);
                        }
                        catch (Throwable var7_10) {}
                    }
                    return jSONArray;
                }
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
        return null;
    }

    private static JSONArray a(BitSet bitSet) {
        int n2 = bitSet.cardinality();
        if (bitSet == null || n2 < 1) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int n3 = bitSet.nextSetBit(0);
        while (n3 >= 0) {
            jSONArray.put(n3);
            n3 = bitSet.nextSetBit(n3 + 1);
        }
        return null;
    }

    public static JSONArray y(Context context) {
        JSONArray jSONArray;
        block23 : {
            jSONArray = new JSONArray();
            try {
                String string;
                JSONObject jSONObject;
                Object object;
                TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
                ArrayList<String> arrayList = new ArrayList<String>();
                if (cs.a(22)) {
                    JSONObject jSONObject2;
                    SubscriptionManager subscriptionManager = (SubscriptionManager)context.getSystemService("telephony_subscription_service");
                    try {
                        jSONObject2 = cj.a(telephonyManager, subscriptionManager, 0);
                        jSONObject2.put("imei", (Object)telephonyManager.getDeviceId());
                        jSONArray.put((Object)jSONObject2);
                    }
                    catch (Throwable var5_8) {
                        // empty catch block
                    }
                    try {
                        jSONObject2 = cj.a(telephonyManager, subscriptionManager, 1);
                        jSONObject2.put("imei", (Object)(cs.a(23) && telephonyManager.getPhoneCount() == 2 ? telephonyManager.getDeviceId(1) : null));
                        if (jSONObject2.length() > 0) {
                            jSONArray.put((Object)jSONObject2);
                        }
                        break block23;
                    }
                    catch (Throwable var5_9) {}
                    break block23;
                }
                String string2 = telephonyManager.getDeviceId();
                if (cj.b(string2.trim()).booleanValue()) {
                    arrayList.add(string2.trim());
                    object = cj.a(telephonyManager, string2);
                    if (object != null) {
                        jSONArray.put(object);
                    }
                }
                try {
                    object = (TelephonyManager)context.getSystemService("phone1");
                    string = object.getDeviceId();
                    if (string != null && cj.b(string).booleanValue() && !arrayList.contains(string)) {
                        arrayList.add(string);
                        jSONObject = cj.a((TelephonyManager)object, string);
                        if (jSONObject != null) {
                            jSONArray.put((Object)jSONObject);
                        }
                    }
                }
                catch (Throwable var5_11) {
                    // empty catch block
                }
                try {
                    object = (TelephonyManager)context.getSystemService("phone2");
                    string = object.getDeviceId();
                    if (string != null && cj.b(string).booleanValue() && !arrayList.contains(string)) {
                        arrayList.add(string);
                        jSONObject = cj.a((TelephonyManager)object, string);
                        if (jSONObject != null) {
                            jSONArray.put((Object)jSONObject);
                        }
                    }
                }
                catch (Throwable var5_12) {
                    // empty catch block
                }
                object = cj.D(context);
                string = cj.C(context);
                if (string != null) {
                    object = string;
                }
                if ((string = cj.B(context)) != null) {
                    object = string;
                }
                if ((string = cj.A(context)) != null) {
                    object = string;
                }
                if (object != null && object.length() > 0) {
                    for (int i2 = 0; i2 < object.length(); ++i2) {
                        JSONObject jSONObject3 = object.getJSONObject(i2);
                        String string3 = jSONObject3.getString("imei");
                        if (arrayList.contains(string3)) continue;
                        arrayList.add(string3);
                        jSONArray.put((Object)jSONObject3);
                    }
                }
            }
            catch (Throwable var2_3) {
                // empty catch block
            }
        }
        return jSONArray;
    }

    private static JSONObject a(TelephonyManager telephonyManager, String string) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("imei", (Object)string.trim());
            jSONObject.put("subscriberId", (Object)(telephonyManager.getSubscriberId() == null ? "" : telephonyManager.getSubscriberId()));
            jSONObject.put("simSerialNumber", (Object)(telephonyManager.getSimSerialNumber() == null ? "" : telephonyManager.getSimSerialNumber()));
            jSONObject.put("dataState", telephonyManager.getDataState());
            jSONObject.put("networkType", (Object)cj.a(telephonyManager.getNetworkType()));
            jSONObject.put("networkOperator", (Object)telephonyManager.getNetworkOperator());
            jSONObject.put("phoneType", (Object)cj.b(telephonyManager.getPhoneType()));
            jSONObject.put("simOperator", (Object)(telephonyManager.getSimOperator() == null ? "" : telephonyManager.getSimOperator()));
            jSONObject.put("simOperatorName", (Object)(telephonyManager.getSimOperatorName() == null ? "" : telephonyManager.getSimOperatorName()));
            jSONObject.put("simCountryIso", (Object)(telephonyManager.getSimCountryIso() == null ? "" : telephonyManager.getSimCountryIso()));
            return jSONObject;
        }
        catch (Throwable var2_3) {
            return null;
        }
    }

    private static JSONObject a(TelephonyManager telephonyManager, SubscriptionManager subscriptionManager, int n2) {
        JSONObject jSONObject = new JSONObject();
        try {
            SubscriptionInfo subscriptionInfo;
            if (cs.a(22) && (subscriptionInfo = subscriptionManager.getActiveSubscriptionInfoForSimSlotIndex(n2)) != null) {
                jSONObject.put("simSerialNumber", (Object)(subscriptionInfo.getIccId() == null ? "" : subscriptionInfo.getIccId()));
                jSONObject.put("simOperator", (Object)("" + subscriptionInfo.getMcc() + "0" + subscriptionInfo.getMnc()));
                jSONObject.put("simOperatorName", (Object)(subscriptionInfo.getCarrierName() == null ? "" : subscriptionInfo.getCarrierName()));
                jSONObject.put("simCountryIso", (Object)(subscriptionInfo.getCountryIso() == null ? "" : subscriptionInfo.getCountryIso()));
                int n3 = subscriptionInfo.getSubscriptionId();
                Method method = telephonyManager.getClass().getMethod("getSubscriberId", Integer.TYPE);
                method.setAccessible(true);
                Object object = method.invoke((Object)telephonyManager, n3);
                jSONObject.put("subscriberId", (Object)(object == null ? "" : object));
            }
        }
        catch (Throwable var4_5) {
            // empty catch block
        }
        return jSONObject;
    }

    public static JSONObject z(Context context) {
        JSONObject jSONObject = null;
        try {
            jSONObject = new JSONObject();
            TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            jSONObject.put("dataState", telephonyManager.getDataState());
            jSONObject.put("networkType", (Object)cj.a(telephonyManager.getNetworkType()));
            jSONObject.put("networkOperator", (Object)telephonyManager.getNetworkOperator());
            jSONObject.put("phoneType", (Object)cj.b(telephonyManager.getPhoneType()));
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
        return jSONObject;
    }

    private static Boolean a(String string) {
        try {
            char c2 = '0';
            if (string.length() > 0) {
                c2 = string.charAt(0);
            }
            Boolean bl2 = true;
            for (int i2 = 0; i2 < string.length(); ++i2) {
                char c3 = string.charAt(i2);
                if (c2 == c3) continue;
                bl2 = false;
                break;
            }
            return bl2;
        }
        catch (Throwable var1_2) {
            return false;
        }
    }

    private static Boolean b(String string) {
        try {
            Integer n2 = string.length();
            if (n2 > 10 && n2 < 20 && !cj.a(string.trim()).booleanValue()) {
                return true;
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return false;
    }

    private static JSONArray A(Context context) {
        try {
            Object object;
            Integer n2;
            Integer n3;
            JSONObject jSONObject;
            JSONArray jSONArray = new JSONArray();
            TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            Class class_ = Class.forName("com.android.internal.telephony.Phone");
            try {
                Field field = class_.getField("GEMINI_SIM_1");
                field.setAccessible(true);
                n2 = (Integer)field.get(null);
                object = class_.getField("GEMINI_SIM_2");
                object.setAccessible(true);
                n3 = (Integer)object.get(null);
            }
            catch (Throwable var6_6) {
                n2 = 0;
                n3 = 1;
            }
            Method method = TelephonyManager.class.getDeclaredMethod("getDeviceIdGemini", Integer.TYPE);
            if (telephonyManager == null || method == null) {
                return null;
            }
            object = ((String)method.invoke((Object)telephonyManager, n2)).trim();
            String string = ((String)method.invoke((Object)telephonyManager, n3)).trim();
            if (cj.b((String)object).booleanValue()) {
                jSONObject = cj.a(TelephonyManager.class, (Object)telephonyManager, n2, (String)object, "Gemini");
                jSONArray.put((Object)jSONObject);
            }
            if (cj.b(string).booleanValue()) {
                jSONObject = cj.a(TelephonyManager.class, (Object)telephonyManager, n3, string, "Gemini");
                jSONArray.put((Object)jSONObject);
            }
            return jSONArray;
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    private static JSONArray B(Context context) {
        try {
            Integer n2;
            JSONObject jSONObject;
            Integer n3;
            Field field;
            JSONArray jSONArray = new JSONArray();
            TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            Class class_ = Class.forName("com.android.internal.telephony.Phone");
            try {
                Field field2 = class_.getField("GEMINI_SIM_1");
                field2.setAccessible(true);
                n2 = (Integer)field2.get(null);
                field = class_.getField("GEMINI_SIM_2");
                field.setAccessible(true);
                n3 = (Integer)field.get(null);
            }
            catch (Throwable var6_6) {
                n2 = 0;
                n3 = 1;
            }
            Method method = TelephonyManager.class.getMethod("getDefault", Integer.TYPE);
            field = (TelephonyManager)method.invoke((Object)telephonyManager, n2);
            TelephonyManager telephonyManager2 = (TelephonyManager)method.invoke((Object)telephonyManager, n3);
            String string = field.getDeviceId().trim();
            String string2 = telephonyManager2.getDeviceId().trim();
            if (cj.b(string).booleanValue() && (jSONObject = cj.a((TelephonyManager)field, string)) != null) {
                jSONArray.put((Object)jSONObject);
            }
            if (cj.b(string2).booleanValue() && (jSONObject = cj.a(telephonyManager2, string2)) != null) {
                jSONArray.put((Object)jSONObject);
            }
            return jSONArray;
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    private static JSONArray C(Context context) {
        try {
            JSONObject jSONObject;
            JSONArray jSONArray = new JSONArray();
            Class class_ = Class.forName("com.android.internal.telephony.PhoneFactory");
            Method method = class_.getMethod("getServiceName", String.class, Integer.TYPE);
            String string = (String)method.invoke(class_, "phone", 1);
            TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
            String string2 = telephonyManager.getDeviceId().trim();
            TelephonyManager telephonyManager2 = (TelephonyManager)context.getSystemService(string);
            String string3 = telephonyManager2.getDeviceId().trim();
            if (cj.b(string2).booleanValue() && (jSONObject = cj.a(telephonyManager, string2)) != null) {
                jSONArray.put((Object)jSONObject);
            }
            if (cj.b(string3).booleanValue() && (jSONObject = cj.a(telephonyManager2, string3)) != null) {
                jSONArray.put((Object)jSONObject);
            }
            return jSONArray;
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    private static JSONArray D(Context context) {
        try {
            JSONObject jSONObject;
            JSONArray jSONArray = new JSONArray();
            Class class_ = Class.forName("android.telephony.MSimTelephonyManager");
            Object object = context.getSystemService("phone_msim");
            Integer n2 = 0;
            Integer n3 = 1;
            Method method = class_.getMethod("getDeviceId", Integer.TYPE);
            String string = ((String)method.invoke(object, n2)).trim();
            String string2 = ((String)method.invoke(object, n3)).trim();
            if (cj.b(string).booleanValue()) {
                jSONObject = cj.a(class_, object, n2, string, "");
                jSONArray.put((Object)jSONObject);
            }
            if (cj.b(string2).booleanValue()) {
                jSONObject = cj.a(class_, object, n3, string2, "");
                jSONArray.put((Object)jSONObject);
            }
            return jSONArray;
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    private static JSONObject a(Class class_, Object object, Integer n2, String string, String string2) {
        Method method;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("imei", (Object)string);
        try {
            method = class_.getMethod("getSubscriberId" + string2, Integer.TYPE);
            jSONObject.put("subscriberId", (Object)(method.invoke(object, n2) == null ? "" : ((String)method.invoke(object, n2)).trim()));
        }
        catch (Throwable var6_7) {
            // empty catch block
        }
        try {
            method = class_.getMethod("getSimSerialNumber" + string2, Integer.TYPE);
            jSONObject.put("simSerialNumber", (Object)(method.invoke(object, n2) == null ? "" : ((String)method.invoke(object, n2)).trim()));
        }
        catch (Throwable var6_8) {
            // empty catch block
        }
        try {
            method = class_.getMethod("getDataState" + string2, Integer.TYPE);
            jSONObject.put("dataState", (Object)((Integer)method.invoke(object, n2)));
        }
        catch (Throwable var6_9) {
            // empty catch block
        }
        try {
            method = class_.getMethod("getNetworkType" + string2, Integer.TYPE);
            jSONObject.put("networkType", (Object)cj.a((Integer)method.invoke(object, n2)));
        }
        catch (Throwable var6_10) {
            // empty catch block
        }
        try {
            method = class_.getMethod("getNetworkOperator" + string2, Integer.TYPE);
            jSONObject.put("networkOperator", (Object)((String)method.invoke(object, n2)));
        }
        catch (Throwable var6_11) {
            // empty catch block
        }
        try {
            method = class_.getMethod("getPhoneType" + string2, Integer.TYPE);
            jSONObject.put("phoneType", (Object)cj.b((Integer)method.invoke(object, n2)));
        }
        catch (Throwable var6_12) {
            // empty catch block
        }
        try {
            method = class_.getMethod("getSimOperator" + string2, Integer.TYPE);
            jSONObject.put("simOperator", (Object)(method.invoke(object, n2) == null ? "" : ((String)method.invoke(object, n2)).trim()));
        }
        catch (Throwable var6_13) {
            // empty catch block
        }
        try {
            method = class_.getMethod("getSimOperatorName" + string2, Integer.TYPE);
            jSONObject.put("simOperatorName", (Object)(method.invoke(object, n2) == null ? "" : ((String)method.invoke(object, n2)).trim()));
        }
        catch (Throwable var6_14) {
            // empty catch block
        }
        return jSONObject;
    }

    static {
        g = new String[]{"UNKNOWN", "GPRS", "EDGE", "UMTS", "CDMA", "EVDO_0", "EVDO_A", "1xRTT", "HSDPA", "HSUPA", "HSPA", "IDEN", "EVDO_B", "LTE", "EHRPD", "HSPAP"};
        h = new String[]{"NONE", "GSM", "CDMA", "SIP"};
        d = false;
        f = -300000;
    }
}

