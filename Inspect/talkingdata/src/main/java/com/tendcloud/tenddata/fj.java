/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.cj;
import com.tendcloud.tenddata.ed;
import com.tendcloud.tenddata.fc;
import com.tendcloud.tenddata.fi;
import com.tendcloud.tenddata.fk;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

final class fj {
    private static String g = "utf-8";
    private static final CRC32 h = new CRC32();
    private static String i = "-----BEGIN CERTIFICATE-----\nMIIDyDCCArACCQD9bypp/+5VujANBgkqhkiG9w0BAQUFADCBpDELMAkGA1UEBhMC\nQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxGDAWBgNVBAoM\nD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEuY29tMRIwEAYD\nVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNoLnBhbkB0ZW5k\nY2xvdWQuY29tMCAXDTE0MDUxNjA4MzkxMFoYDzIxMTQwNDIyMDgzOTEwWjCBpDEL\nMAkGA1UEBhMCQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcx\nGDAWBgNVBAoMD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEu\nY29tMRIwEAYDVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNo\nLnBhbkB0ZW5kY2xvdWQuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC\nAQEArssg6Iz/jp1/5I20O0aCUcF7Vqrce6DdwblXCbcT44CRYUSwyGteQfPUYGPA\n/2kyk/H/maK5UC6SkI9TOeDs+CBz1oCvxLUd20kMF3J3FT2XENE3fwCmlcppYpdO\nHTZBn72GyYuVLj4lI3MRm8DZoPzYYj0TaZxrX3qpy8cNV4LC7BiBnJtExqAvB0q7\nfUzeDIKrhkFxPbzOUE5txNwwRLu+/neOQJQ48UPesMH3QbYLhCh+l8f9G6TQ1pND\ndcwACsDrVjFPab0w+N1jeev/k+bd5YLxEaQ3HtZvmgOXBL+kREZyKhctaHqcwbWK\nAwJHQeYmJbzw/V4/NQCIGhnlFQIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQCRp0QL\nydMOemUDkk7n+zIPGa1Ndt2BXJYIgzMbpuWI9h2rVXfz7K9k8PZs9stt1S5ek6TQ\nbWxnrQxanyx2jFf4h+erds0jwAcJrDRG8kFcRsLdx/BjKcBG91HjYuC65RD9eyt+\nXzrmdF8UCvDo2LrL+nkAbufd5XnbBa8I7Jucsu2wOkCa8oatnuorgnh/soEL6zcb\nbLgnCqqXUBKCg5U+mS2WFqEoBnJJoeKDRp08T5juhAJNF/EynX63qn9dS3IqxqeZ\nJ/urMkKVxUCffyZdbezTeljqaaxsQ8xFSK58TSVYFEr9jAGO+jKUWb0tKMSUr/tN\n82L5ZccC8n6eg0YU\n-----END CERTIFICATE-----";
    static final int a = 0;
    static final int b = 1;
    static final int c = 2;
    static final int d = 3;
    static long e = 300000;
    static Handler f = null;
    private static final HandlerThread j = new HandlerThread("NetWorkThread");

    fj() {
    }

    static final Handler a() {
        return f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static byte[] a(String var0) {
        var1_1 = new ByteArrayOutputStream();
        var2_2 = null;
        var3_3 = new Deflater(9, true);
        try {
            var2_2 = new DeflaterOutputStream((OutputStream)var1_1, var3_3);
            var2_2.write(var0.getBytes("UTF-8"));
            ** if (var2_2 == null) goto lbl-1000
        }
        catch (FileNotFoundException var4_5) {
            if (var2_2 != null) {
                try {
                    var2_2.close();
                }
                catch (IOException var4_6) {}
            }
            catch (Throwable var4_7) {
                if (var2_2 != null) {
                    try {
                        var2_2.close();
                    }
                    catch (IOException var4_8) {}
                }
                catch (Throwable var5_9) {
                    if (var2_2 == null) throw var5_9;
                    try {
                        var2_2.close();
                        throw var5_9;
                    }
                    catch (IOException var6_10) {
                        // empty catch block
                    }
                    throw var5_9;
                }
            }
        }
lbl-1000: // 1 sources:
        {
            try {
                var2_2.close();
            }
            catch (IOException var4_4) {}
        }
lbl-1000: // 2 sources:
        {
        }
        var3_3.end();
        return var1_1.toByteArray();
    }

    private static void c() {
        try {
            if (!cj.c(ab.mContext)) {
                return;
            }
            if (ab.mContext == null) {
                return;
            }
            List list = fi.a();
            if (null == list || list.size() <= 0) {
                return;
            }
            boolean bl2 = fj.b(fj.a(list));
            if (bl2) {
                fi.b();
            } else {
                if (!f.hasMessages(2)) {
                    fj.a().sendEmptyMessageDelayed(2, e);
                }
                fi.c();
            }
            ed.a("Send pushEvent success : " + bl2);
        }
        catch (Throwable var0_1) {
            // empty catch block
        }
    }

    private static boolean b(String string) {
        try {
            byte[] arrby = fj.a(string);
            h.reset();
            h.update(arrby);
            StringBuilder stringBuilder = new StringBuilder("https://xdrig.com/push");
            stringBuilder.append("/" + fc.f);
            stringBuilder.append("/" + Long.toHexString(h.getValue()));
            ed.a("Send pushEvent");
            cc.d d2 = cc.a(ab.mContext, "xdrig.com", fc.c, stringBuilder.toString(), i, arrby);
            int n2 = d2.a();
            if (n2 == 200) {
                return true;
            }
            ed.a("Send pushEvent# response status code: " + n2);
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        return false;
    }

    static String a(List list) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            for (String string : list) {
                stringBuilder.append(string);
                stringBuilder.append(",");
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    static /* synthetic */ void b() {
        fj.c();
    }

    static {
        j.start();
        f = new fk(j.getLooper());
    }
}

