/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.location.Location
 *  android.location.LocationManager
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.net.TrafficStats
 *  android.net.wifi.ScanResult
 *  android.net.wifi.WifiManager
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.telephony.CellLocation
 *  android.telephony.PhoneStateListener
 *  android.telephony.TelephonyManager
 *  android.telephony.cdma.CdmaCellLocation
 *  android.telephony.gsm.GsmCellLocation
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cr;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.eb;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.ez;
import com.tendcloud.tenddata.fa;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONObject;

final class ey {
    private static volatile ey b = null;
    private Handler c = null;
    private HandlerThread d = new HandlerThread("envHandlerThread");
    private List e = null;
    private long f;
    private Map g = new HashMap();
    private StringBuffer h = new StringBuffer();
    private StringBuffer i = new StringBuffer();
    private static String j;
    private WifiManager k;
    private boolean l = false;
    private boolean m = true;
    private int n = 0;
    private int o = 0;
    private FileChannel p;
    private final String q = "xdrig.com";
    private final String r = null;
    private final String s = "https";
    private final String t = "https://xdrig.com/td";
    static String a;
    private static final CRC32 u;
    private static String v;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static ey a() {
        if (b != null) return b;
        reference var0 = ey.class;
        synchronized (ey.class) {
            if (b != null) return b;
            {
                b = new ey();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return b;
        }
    }

    private ey() {
        this.d.start();
        this.c = new ez(this, this.d.getLooper());
        this.a(4, 0);
    }

    private void a(int n2, long l2) {
        Message message = Message.obtain();
        message.what = n2;
        this.c.sendMessageDelayed(message, l2);
    }

    private void c() {
        try {
            FileLock fileLock = null;
            if (this.p != null) {
                fileLock = this.p.tryLock();
                this.l = fileLock != null;
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    private String a(Context context) {
        return null;
    }

    private void d() {
        try {
            Thread.sleep(5000);
            File file = new File(ab.mContext.getFilesDir(), "tdlock.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            this.p = new RandomAccessFile(file, "rw").getChannel();
            this.c();
            if (!this.l) {
                this.b();
            } else {
                this.e();
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    void b() {
        try {
            this.c();
            if (!this.l) {
                this.a(5, 1800000);
            } else {
                this.e();
            }
        }
        catch (Throwable var1_1) {
            // empty catch block
        }
    }

    private void e() {
        this.h();
        this.k();
        this.m();
        this.n();
        this.f();
        this.p();
    }

    private void f() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (cs.a(8)) {
                long l2 = TrafficStats.getTotalTxBytes();
                jSONObject.put("wifiTx", l2);
                long l3 = TrafficStats.getTotalRxBytes();
                jSONObject.put("wifiRx", l3);
                long l4 = TrafficStats.getMobileTxBytes();
                jSONObject.put("mobileTx", l4);
                long l5 = TrafficStats.getMobileRxBytes();
                jSONObject.put("mobileRx", l5);
                fa.a().a(jSONObject);
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    private void g() {
        try {
            String string = "";
            String string2 = "";
            if (!cs.a(21)) {
                Long[][] arrlong = cr.e(ab.mContext);
                string = Arrays.toString(arrlong[0]);
            }
            if (ab.h) {
                string2 = ee.b();
            }
            fa.a().a("", string, string2);
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    private long a(String string) {
        long l2 = 1125899906842597L;
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            l2 = 131 * l2 + (long)string.charAt(i2);
        }
        return l2;
    }

    private void h() {
        if (ab.mContext != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            b b2 = new b();
            ab.mContext.registerReceiver((BroadcastReceiver)b2, intentFilter);
        }
    }

    private void i() {
    }

    private void j() {
        if (!cs.b(ab.mContext, "android.permission.ACCESS_WIFI_STATE")) {
            return;
        }
        try {
            this.k = (WifiManager)ab.mContext.getSystemService("wifi");
            if (this.k.isWifiEnabled()) {
                d d2 = new d();
                ab.mContext.registerReceiver((BroadcastReceiver)d2, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @TargetApi(value=23)
    private void k() {
        try {
            if (cs.a(23)) {
                try {
                    if (ab.mContext.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
                        this.a(6, 3600000);
                        return;
                    }
                    if (ab.mContext.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || ab.mContext.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) ** GOTO lbl20
                    this.a(6, 3600000);
                    return;
                }
                catch (Throwable var1_1) {}
            } else {
                try {
                    if (!cs.b(ab.mContext, "android.permission.READ_PHONE_STATE")) {
                        return;
                    }
                    if (!cs.b(ab.mContext, "android.permission.ACCESS_COARSE_LOCATION") && !cs.b(ab.mContext, "android.permission.ACCESS_FINE_LOCATION")) {
                        return;
                    }
                }
                catch (Throwable var1_2) {
                    // empty catch block
                }
            }
lbl20: // 4 sources:
            this.l();
            return;
        }
        catch (Throwable var1_3) {
            // empty catch block
        }
    }

    private void l() {
        if (ab.mContext != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager)ab.mContext.getSystemService("phone");
                if (telephonyManager.getSimState() == 5) {
                    CellLocation cellLocation = telephonyManager.getCellLocation();
                    c c2 = new c();
                    telephonyManager.listen((PhoneStateListener)c2, 16);
                    CellLocation.requestLocationUpdate();
                }
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
    }

    @TargetApi(value=23)
    private void m() {
        if (cs.a(23) ? ab.mContext.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 && ab.mContext.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0 : !cs.b(ab.mContext, "android.permission.ACCESS_COARSE_LOCATION") && !cs.b(ab.mContext, "android.permission.ACCESS_FINE_LOCATION")) {
            return;
        }
        try {
            LocationManager locationManager = (LocationManager)ab.mContext.getSystemService("location");
            boolean bl2 = locationManager.isProviderEnabled("gps");
            boolean bl3 = locationManager.isProviderEnabled("network");
            if (bl2 || bl3) {
                Location location = locationManager.getLastKnownLocation("passive");
                String string = null;
                if (ab.h) {
                    string = ee.b();
                }
                if (location != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("lat", location.getLatitude());
                        jSONObject.put("lng", location.getLongitude());
                        jSONObject.put("ts", location.getTime());
                        if (cs.a(17)) {
                            jSONObject.put("elapsed", location.getElapsedRealtimeNanos());
                        }
                        if (location.hasAltitude()) {
                            jSONObject.put("altitude", location.getAltitude());
                        }
                        if (location.hasAccuracy()) {
                            jSONObject.put("accurate", (double)location.getAccuracy());
                        }
                        if (location.hasBearing()) {
                            jSONObject.put("bearing", (double)location.getBearing());
                        }
                        if (location.hasSpeed()) {
                            jSONObject.put("speed", (double)location.getSpeed());
                        }
                        jSONObject.put("provider", (Object)location.getProvider());
                        fa.a().a(jSONObject, string);
                    }
                    catch (Throwable var6_8) {
                        // empty catch block
                    }
                }
            }
            this.a(1, 180000);
        }
        catch (Throwable var1_5) {
            // empty catch block
        }
    }

    private void n() {
    }

    private void o() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void p() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager)ab.mContext.getSystemService("connectivity");
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable()) {
                if (networkInfo.getType() == 1) {
                    File[] arrfile;
                    File[] arrfile2 = fa.a().c();
                    if (arrfile2 != null) {
                        arrfile = arrfile2;
                        int n2 = arrfile.length;
                        for (int i2 = 0; i2 < n2; ++i2) {
                            File file = arrfile[i2];
                            try {
                                this.a(ey.a(file));
                            }
                            catch (Throwable var8_9) {}
                            finally {
                                file.delete();
                            }
                        }
                    }
                    if ((arrfile = fa.a().b()) == null) {
                        return;
                    }
                    if (this.a((byte[])arrfile) == 200) {
                        fa.a().d();
                    }
                } else if (networkInfo.getType() == 9 || networkInfo.getType() == 0) {
                    // empty if block
                }
            }
            this.a(0, 600000);
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    private int a(byte[] arrby) {
        try {
            u.reset();
            u.update(arrby);
            StringBuilder stringBuilder = new StringBuilder("https://xdrig.com/td");
            stringBuilder.append("/" + a);
            stringBuilder.append("/" + Long.toHexString(u.getValue()));
            return cc.a(ab.mContext, "xdrig.com", this.r, stringBuilder.toString(), v, arrby).a();
        }
        catch (Throwable var2_3) {
            return 600;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] a(File file) {
        FileInputStream fileInputStream = null;
        try {
            int n2;
            fileInputStream = new FileInputStream(file);
            long l2 = file.length();
            if (l2 > Integer.MAX_VALUE) {
                byte[] arrby = null;
                return arrby;
            }
            byte[] arrby = new byte[(int)l2];
            int n3 = 0;
            try {
                for (n2 = 0; n2 < arrby.length && n3 >= 0; n2 += n3) {
                    n3 = fileInputStream.read(arrby, n2, arrby.length - n2);
                }
            }
            catch (Throwable var7_10) {
                byte[] arrby2 = null;
                try {
                    fileInputStream.close();
                }
                catch (Throwable var9_16) {
                    return null;
                }
                return arrby2;
            }
            if (n2 < arrby.length) {
                byte[] arrby3 = null;
                return arrby3;
            }
            byte[] arrby4 = arrby;
            return arrby4;
        }
        catch (Throwable var3_3) {
            byte[] arrby = null;
            return arrby;
        }
        finally {
            try {
                fileInputStream.close();
            }
            catch (Throwable var6_7) {
                return null;
            }
        }
    }

    static /* synthetic */ void a(ey ey2) {
        ey2.d();
    }

    static /* synthetic */ void b(ey ey2) {
        ey2.p();
    }

    static /* synthetic */ void c(ey ey2) {
        ey2.m();
    }

    static /* synthetic */ void d(ey ey2) {
        ey2.n();
    }

    static /* synthetic */ void e(ey ey2) {
        ey2.k();
    }

    static {
        a = "v1";
        u = new CRC32();
        v = "-----BEGIN CERTIFICATE-----\nMIIDyDCCArACCQD9bypp/+5VujANBgkqhkiG9w0BAQUFADCBpDELMAkGA1UEBhMC\nQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxGDAWBgNVBAoM\nD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEuY29tMRIwEAYD\nVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNoLnBhbkB0ZW5k\nY2xvdWQuY29tMCAXDTE0MDUxNjA4MzkxMFoYDzIxMTQwNDIyMDgzOTEwWjCBpDEL\nMAkGA1UEBhMCQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcx\nGDAWBgNVBAoMD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEu\nY29tMRIwEAYDVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNo\nLnBhbkB0ZW5kY2xvdWQuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC\nAQEArssg6Iz/jp1/5I20O0aCUcF7Vqrce6DdwblXCbcT44CRYUSwyGteQfPUYGPA\n/2kyk/H/maK5UC6SkI9TOeDs+CBz1oCvxLUd20kMF3J3FT2XENE3fwCmlcppYpdO\nHTZBn72GyYuVLj4lI3MRm8DZoPzYYj0TaZxrX3qpy8cNV4LC7BiBnJtExqAvB0q7\nfUzeDIKrhkFxPbzOUE5txNwwRLu+/neOQJQ48UPesMH3QbYLhCh+l8f9G6TQ1pND\ndcwACsDrVjFPab0w+N1jeev/k+bd5YLxEaQ3HtZvmgOXBL+kREZyKhctaHqcwbWK\nAwJHQeYmJbzw/V4/NQCIGhnlFQIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQCRp0QL\nydMOemUDkk7n+zIPGa1Ndt2BXJYIgzMbpuWI9h2rVXfz7K9k8PZs9stt1S5ek6TQ\nbWxnrQxanyx2jFf4h+erds0jwAcJrDRG8kFcRsLdx/BjKcBG91HjYuC65RD9eyt+\nXzrmdF8UCvDo2LrL+nkAbufd5XnbBa8I7Jucsu2wOkCa8oatnuorgnh/soEL6zcb\nbLgnCqqXUBKCg5U+mS2WFqEoBnJJoeKDRp08T5juhAJNF/EynX63qn9dS3IqxqeZ\nJ/urMkKVxUCffyZdbezTeljqaaxsQ8xFSK58TSVYFEr9jAGO+jKUWb0tKMSUr/tN\n82L5ZccC8n6eg0YU\n-----END CERTIFICATE-----";
    }

    class c
    extends PhoneStateListener {
        long a;
        long b;
        int c;

        c() {
            this.a = 0;
            this.b = 0;
        }

        public void onCellLocationChanged(CellLocation cellLocation) {
            try {
                if (cellLocation.getClass().equals(GsmCellLocation.class)) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation)cellLocation;
                    this.c = gsmCellLocation.getLac();
                    this.a();
                } else if (cellLocation.getClass().equals(CdmaCellLocation.class)) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation)cellLocation;
                    this.c = cdmaCellLocation.getNetworkId();
                    this.a();
                }
            }
            catch (Throwable var2_4) {
                // empty catch block
            }
        }

        private void a() {
            try {
                this.a = System.currentTimeMillis();
                if (this.c != ey.this.o && this.c > 1 && this.a - this.b > 180000) {
                    String string = null;
                    if (ab.h) {
                        string = ee.b();
                    }
                    JSONArray jSONArray = cj.s(ab.mContext);
                    JSONArray jSONArray2 = cj.t(ab.mContext);
                    if (jSONArray != null || jSONArray2 != null) {
                        fa.a().b(jSONArray, jSONArray2, string);
                    }
                    this.b = this.a;
                    ey.this.o = this.c;
                }
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
        }
    }

    class d
    extends BroadcastReceiver {
        eb a;
        ArrayList b;
        JSONArray c;
        eb.c d;
        eb.c e;
        double f;
        long g;
        long h;

        d() {
            this.a = new eb();
            this.f = 0.0;
            this.g = 0;
            this.h = 0;
        }

        public void onReceive(Context context, Intent intent) {
            this.g = System.currentTimeMillis();
            if (this.g - this.h > 60000) {
                this.h = this.g;
                this.d = this.a();
                if (this.d == null) {
                    this.d = this.b();
                }
                this.e = this.b();
                String string = null;
                if (ab.h) {
                    string = ee.b();
                }
                if (this.b != null) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (ScanResult scanResult : this.b) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("id", (Object)scanResult.BSSID);
                            jSONObject.put("name", (Object)scanResult.SSID);
                            jSONObject.put("level", scanResult.level);
                            jSONObject.put("freq", scanResult.frequency);
                            jSONArray.put((Object)jSONObject);
                        }
                        JSONArray jSONArray2 = cj.w(ab.mContext);
                        fa.a().a(jSONArray, jSONArray2, string);
                    }
                    catch (Throwable var4_5) {
                        // empty catch block
                    }
                }
                this.f = this.a.a(this.d, this.e);
            }
        }

        private eb.c a() {
            try {
                JSONArray jSONArray = this.c;
                this.d = this.a(jSONArray);
            }
            catch (Throwable var1_2) {
                // empty catch block
            }
            return this.d;
        }

        private eb.c b() {
            try {
                this.b = (ArrayList)ey.this.k.getScanResults();
                if (this.b != null) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < this.b.size(); ++i2) {
                            if (((ScanResult)this.b.get((int)i2)).level < -75) continue;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("SSID", (Object)((ScanResult)this.b.get((int)i2)).SSID);
                            jSONObject.put("BSSID", (Object)((ScanResult)this.b.get((int)i2)).BSSID);
                            jSONObject.put("level", ((ScanResult)this.b.get((int)i2)).level);
                            jSONArray.put((Object)jSONObject);
                        }
                        this.c = jSONArray;
                        this.e = this.a(jSONArray);
                    }
                    catch (Throwable var1_2) {}
                }
            }
            catch (Throwable var1_3) {
                // empty catch block
            }
            return this.e;
        }

        private eb.c a(JSONArray jSONArray) {
            eb.c c2 = null;
            if (jSONArray != null) {
                ArrayList<eb.a> arrayList = new ArrayList<eb.a>();
                for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        eb eb2 = this.a;
                        eb2.getClass();
                        eb.a a2 = new eb.a(eb2, jSONObject.getString("SSID"), jSONObject.getString("BSSID"), (byte)jSONObject.getInt("level"), 0, 0);
                        arrayList.add(a2);
                        continue;
                    }
                    catch (Throwable var5_6) {
                        // empty catch block
                    }
                }
                c2 = this.a.new eb.c();
                c2.a(arrayList);
            }
            return c2;
        }
    }

    class b
    extends BroadcastReceiver {
        private String b;

        b() {
            this.b = null;
        }

        public void onReceive(Context context, Intent intent) {
            try {
                this.b = intent.getAction();
                if (!"android.intent.action.SCREEN_ON".equals(this.b)) {
                    if ("android.intent.action.SCREEN_OFF".equals(this.b)) {
                        ey.this.m = false;
                    } else if ("android.intent.action.USER_PRESENT".equals(this.b)) {
                        ey.this.m = true;
                    }
                }
            }
            catch (Throwable var3_3) {
                // empty catch block
            }
        }
    }

    static class a {
        static final int a = 0;
        static final int b = 1;
        static final int c = 2;
        static final int d = 3;
        static final int e = 4;
        static final int f = 5;
        static final int g = 6;
        private static final long h = 60000;
        private static final double i = 0.7;
        private static final long j = 180000;
        private static final long k = 180000;
        private static final long l = 604800000;
        private static final long m = 5000;
        private static final long n = 600000;
        private static final long o = 1800000;
        private static final long p = 3600000;

        a() {
        }
    }

}

