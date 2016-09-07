/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationManager
 *  android.net.wifi.WifiManager
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.tendcloud.tenddata.AgentOption;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.cn;
import com.tendcloud.tenddata.cs;
import com.tendcloud.tenddata.ds;
import com.tendcloud.tenddata.dz;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.ee;
import com.tendcloud.tenddata.ef;
import com.tendcloud.tenddata.eg;
import com.tendcloud.tenddata.en;
import com.tendcloud.tenddata.eo;
import com.tendcloud.tenddata.ep;
import com.tendcloud.tenddata.eq;
import com.tendcloud.tenddata.er;
import com.tendcloud.tenddata.es;
import com.tendcloud.tenddata.fu;
import com.tendcloud.tenddata.gg;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.Random;
import java.util.zip.GZIPOutputStream;

class aa {
    private final String a = "app.xdrig.com";
    private final String b = null;
    private final String c = "https";
    private final String d = "https://app.xdrig.com/g/d";
    private volatile boolean e = false;
    private static volatile aa f = null;
    private static cn g = null;
    private ds h;
    private final int i = 30000;
    private int j;
    private boolean k;
    private long l;
    private Random m;
    private static Handler n = null;
    private static HandlerThread o = new HandlerThread("prepareSubmitHandlerThread");
    private FileLock p;
    private final String q = "-----BEGIN CERTIFICATE-----\nMIIDyDCCArACCQD9bypp/+5VujANBgkqhkiG9w0BAQUFADCBpDELMAkGA1UEBhMC\nQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxGDAWBgNVBAoM\nD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEuY29tMRIwEAYD\nVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNoLnBhbkB0ZW5k\nY2xvdWQuY29tMCAXDTE0MDUxNjA4MzkxMFoYDzIxMTQwNDIyMDgzOTEwWjCBpDEL\nMAkGA1UEBhMCQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcx\nGDAWBgNVBAoMD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEu\nY29tMRIwEAYDVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNo\nLnBhbkB0ZW5kY2xvdWQuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC\nAQEArssg6Iz/jp1/5I20O0aCUcF7Vqrce6DdwblXCbcT44CRYUSwyGteQfPUYGPA\n/2kyk/H/maK5UC6SkI9TOeDs+CBz1oCvxLUd20kMF3J3FT2XENE3fwCmlcppYpdO\nHTZBn72GyYuVLj4lI3MRm8DZoPzYYj0TaZxrX3qpy8cNV4LC7BiBnJtExqAvB0q7\nfUzeDIKrhkFxPbzOUE5txNwwRLu+/neOQJQ48UPesMH3QbYLhCh+l8f9G6TQ1pND\ndcwACsDrVjFPab0w+N1jeev/k+bd5YLxEaQ3HtZvmgOXBL+kREZyKhctaHqcwbWK\nAwJHQeYmJbzw/V4/NQCIGhnlFQIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQCRp0QL\nydMOemUDkk7n+zIPGa1Ndt2BXJYIgzMbpuWI9h2rVXfz7K9k8PZs9stt1S5ek6TQ\nbWxnrQxanyx2jFf4h+erds0jwAcJrDRG8kFcRsLdx/BjKcBG91HjYuC65RD9eyt+\nXzrmdF8UCvDo2LrL+nkAbufd5XnbBa8I7Jucsu2wOkCa8oatnuorgnh/soEL6zcb\nbLgnCqqXUBKCg5U+mS2WFqEoBnJJoeKDRp08T5juhAJNF/EynX63qn9dS3IqxqeZ\nJ/urMkKVxUCffyZdbezTeljqaaxsQ8xFSK58TSVYFEr9jAGO+jKUWb0tKMSUr/tN\n82L5ZccC8n6eg0YU\n-----END CERTIFICATE-----";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static aa a() {
        if (f != null) return f;
        reference var0 = aa.class;
        synchronized (aa.class) {
            if (f != null) return f;
            {
                f = new aa();
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return f;
        }
    }

    private aa() {
        this.h = this.a(1);
        this.i = 30000;
        this.j = 30000;
        this.k = false;
        this.l = SystemClock.elapsedRealtime() - (long)this.j;
        this.m = new Random();
        this.p = null;
        this.q = "-----BEGIN CERTIFICATE-----\nMIIDyDCCArACCQD9bypp/+5VujANBgkqhkiG9w0BAQUFADCBpDELMAkGA1UEBhMC\nQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxGDAWBgNVBAoM\nD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEuY29tMRIwEAYD\nVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNoLnBhbkB0ZW5k\nY2xvdWQuY29tMCAXDTE0MDUxNjA4MzkxMFoYDzIxMTQwNDIyMDgzOTEwWjCBpDEL\nMAkGA1UEBhMCQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcx\nGDAWBgNVBAoMD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEu\nY29tMRIwEAYDVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNo\nLnBhbkB0ZW5kY2xvdWQuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC\nAQEArssg6Iz/jp1/5I20O0aCUcF7Vqrce6DdwblXCbcT44CRYUSwyGteQfPUYGPA\n/2kyk/H/maK5UC6SkI9TOeDs+CBz1oCvxLUd20kMF3J3FT2XENE3fwCmlcppYpdO\nHTZBn72GyYuVLj4lI3MRm8DZoPzYYj0TaZxrX3qpy8cNV4LC7BiBnJtExqAvB0q7\nfUzeDIKrhkFxPbzOUE5txNwwRLu+/neOQJQ48UPesMH3QbYLhCh+l8f9G6TQ1pND\ndcwACsDrVjFPab0w+N1jeev/k+bd5YLxEaQ3HtZvmgOXBL+kREZyKhctaHqcwbWK\nAwJHQeYmJbzw/V4/NQCIGhnlFQIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQCRp0QL\nydMOemUDkk7n+zIPGa1Ndt2BXJYIgzMbpuWI9h2rVXfz7K9k8PZs9stt1S5ek6TQ\nbWxnrQxanyx2jFf4h+erds0jwAcJrDRG8kFcRsLdx/BjKcBG91HjYuC65RD9eyt+\nXzrmdF8UCvDo2LrL+nkAbufd5XnbBa8I7Jucsu2wOkCa8oatnuorgnh/soEL6zcb\nbLgnCqqXUBKCg5U+mS2WFqEoBnJJoeKDRp08T5juhAJNF/EynX63qn9dS3IqxqeZ\nJ/urMkKVxUCffyZdbezTeljqaaxsQ8xFSK58TSVYFEr9jAGO+jKUWb0tKMSUr/tN\n82L5ZccC8n6eg0YU\n-----END CERTIFICATE-----";
    }

    public final void onTDEBEventResponse(eg eg2) {
        try {
            this.l = SystemClock.elapsedRealtime();
            if (eg2 != null) {
                if (eg2.a != null && String.valueOf(eg2.a.get("action")).equals("Analytics")) {
                    if (Integer.valueOf(String.valueOf(eg2.a.get("statusCode"))) == 200) {
                        ed.a("Data submitting Succeed!");
                        en.f f2 = null;
                        if (eg2.b != null && eg2.b instanceof en.f) {
                            f2 = (en.f)eg2.b;
                        }
                        es.a(f2, fu.b.a(1));
                        this.j = 120000;
                        this.k = true;
                    } else {
                        this.e();
                        this.j = 120000 + (this.m.nextInt(60000) - 30000);
                        ed.a("Data submitting Failed!");
                        this.k = false;
                    }
                }
                if (!cj.c(ab.mContext)) {
                    this.e();
                }
                if (ee.i() != null && !ee.i().equals("2")) {
                    this.a(false);
                }
            }
            this.c();
            this.e = false;
        }
        catch (Throwable var2_3) {
            // empty catch block
        }
    }

    synchronized void a(boolean bl2) {
        if (!AgentOption.b()) {
            return;
        }
        Message message = Message.obtain();
        int n2 = message.what = bl2 ? 1 : 0;
        if (!bl2) {
            long l2 = SystemClock.elapsedRealtime() - this.l;
            if (l2 >= 0) {
                long l3 = 0;
                if (this.l > 0 && l2 < 120000) {
                    l3 = 120000 - l2;
                }
                n.removeMessages(0);
                n.removeMessages(1);
                n.sendMessageDelayed(message, l3);
            }
        } else {
            if (this.k) {
                this.j = 30000;
            }
            if (SystemClock.elapsedRealtime() - this.l > (long)this.j) {
                n.removeMessages(0);
                n.removeMessages(1);
                n.sendMessage(message);
            }
        }
    }

    private synchronized void b() {
        if (this.e) {
            return;
        }
        try {
            if (ab.f != null) {
                this.p = ab.f.tryLock();
            }
            if (this.p != null) {
                Message message;
                if (!cj.c(ab.mContext)) {
                    return;
                }
                en.f f2 = es.a(fu.b.a(1));
                ef ef2 = new ef();
                ef2.c = this.h.a;
                ef2.b = this.h.b;
                ef2.a = this.h.c;
                ef2.d = "Analytics";
                ef2.e = "-----BEGIN CERTIFICATE-----\nMIIDyDCCArACCQD9bypp/+5VujANBgkqhkiG9w0BAQUFADCBpDELMAkGA1UEBhMC\nQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxGDAWBgNVBAoM\nD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEuY29tMRIwEAYD\nVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNoLnBhbkB0ZW5k\nY2xvdWQuY29tMCAXDTE0MDUxNjA4MzkxMFoYDzIxMTQwNDIyMDgzOTEwWjCBpDEL\nMAkGA1UEBhMCQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcx\nGDAWBgNVBAoMD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEu\nY29tMRIwEAYDVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNo\nLnBhbkB0ZW5kY2xvdWQuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC\nAQEArssg6Iz/jp1/5I20O0aCUcF7Vqrce6DdwblXCbcT44CRYUSwyGteQfPUYGPA\n/2kyk/H/maK5UC6SkI9TOeDs+CBz1oCvxLUd20kMF3J3FT2XENE3fwCmlcppYpdO\nHTZBn72GyYuVLj4lI3MRm8DZoPzYYj0TaZxrX3qpy8cNV4LC7BiBnJtExqAvB0q7\nfUzeDIKrhkFxPbzOUE5txNwwRLu+/neOQJQ48UPesMH3QbYLhCh+l8f9G6TQ1pND\ndcwACsDrVjFPab0w+N1jeev/k+bd5YLxEaQ3HtZvmgOXBL+kREZyKhctaHqcwbWK\nAwJHQeYmJbzw/V4/NQCIGhnlFQIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQCRp0QL\nydMOemUDkk7n+zIPGa1Ndt2BXJYIgzMbpuWI9h2rVXfz7K9k8PZs9stt1S5ek6TQ\nbWxnrQxanyx2jFf4h+erds0jwAcJrDRG8kFcRsLdx/BjKcBG91HjYuC65RD9eyt+\nXzrmdF8UCvDo2LrL+nkAbufd5XnbBa8I7Jucsu2wOkCa8oatnuorgnh/soEL6zcb\nbLgnCqqXUBKCg5U+mS2WFqEoBnJJoeKDRp08T5juhAJNF/EynX63qn9dS3IqxqeZ\nJ/urMkKVxUCffyZdbezTeljqaaxsQ8xFSK58TSVYFEr9jAGO+jKUWb0tKMSUr/tN\n82L5ZccC8n6eg0YU\n-----END CERTIFICATE-----";
                ef2.g = f2;
                if (f2 == null) {
                    ed.a("No new data found!");
                    ef2.f = null;
                } else {
                    ed.a("New data found, Submitting...");
                    message = new Message();
                    message.put("entity", f2);
                    ef2.f = this.h.a((HashMap)message);
                    ef2.h = true;
                }
                message = Message.obtain();
                message.obj = ef2;
                message.what = 103;
                dz.a().sendMessage(message);
                this.e = true;
            } else {
                ed.b("Aborted submitting, file cannot be accessed due to lock.");
            }
        }
        catch (Throwable var1_2) {
            this.c();
        }
    }

    private void c() {
        if (this.p != null) {
            try {
                this.p.release();
            }
            catch (Throwable var1_1) {
                // empty catch block
            }
        }
    }

    private final void d() {
        if (!ee.d() && ab.mContext != null) {
            LocationManager locationManager = (LocationManager)ab.mContext.getApplicationContext().getSystemService("location");
            WifiManager wifiManager = (WifiManager)ab.mContext.getApplicationContext().getSystemService("wifi");
            try {
                cs.a((Object)locationManager, g, "mService", "android.location.ILocationManager");
                cs.a((Object)wifiManager, g, "mService", "android.net.wifi.IWifiManager");
            }
            catch (Throwable var3_3) {
                ed.c(var3_3.getMessage());
            }
        }
    }

    private final ds a(int n2) {
        a a2 = null;
        switch (n2) {
            case 1: {
                a2 = new a("app.xdrig.com", this.b, "https://app.xdrig.com/g/d");
                break;
            }
        }
        return a2;
    }

    private void e() {
        cs.execute(new er(this));
    }

    static /* synthetic */ void a(aa aa2) {
        aa2.b();
    }

    static {
        o.start();
        n = new eq(o.getLooper());
        try {
            gg.a().register(aa.a());
        }
        catch (Throwable var0) {
            // empty catch block
        }
    }

    final class a
    extends ds {
        a(String string, String string2, String string3) {
            this.a = string;
            this.b = string2;
            this.c = string3;
            this.d = 1;
        }

        @Override
        byte[] a(HashMap hashMap) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                ep ep2 = new ep(gZIPOutputStream);
                if (hashMap.containsKey("entity") && hashMap.get("entity") != null && hashMap.get("entity") instanceof en.f) {
                    en.f f2 = (en.f)hashMap.get("entity");
                    ep2.a(f2);
                    gZIPOutputStream.finish();
                    gZIPOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                return null;
            }
            catch (Throwable var2_3) {
                var2_3.printStackTrace();
                return null;
            }
        }
    }

}

