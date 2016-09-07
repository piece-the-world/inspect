/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tendcloud.tenddata.TalkingDataSMS;
import com.tendcloud.tenddata.cc;
import com.tendcloud.tenddata.fl;
import com.tendcloud.tenddata.fs;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

final class fr {
    private static final CRC32 d = new CRC32();
    static Handler a = null;
    private static final HandlerThread e = new HandlerThread("NetWorkThread");
    static String b = "";
    static int c = 0;
    private static String f;

    fr() {
    }

    static final Handler a() {
        return a;
    }

    static void a(byte[] arrby) {
        try {
            byte[] arrby2 = fr.b(arrby);
            d.reset();
            d.update(arrby2);
            cc.d d2 = cc.a(TalkingDataSMS.b, "eauth.xdrig.com", fl.c, "https://eauth.xdrig.com/smsauth/v1/" + b + "/" + Long.toHexString(d.getValue()), f, arrby2);
            Bundle bundle = new Bundle();
            bundle.putInt("status", d2.a());
            bundle.putString("message", d2.b());
            bundle.putString("action", "SMS");
            fl.a().onResponse(bundle);
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] b(byte[] arrby) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = null;
        Deflater deflater = new Deflater(9, true);
        try {
            deflaterOutputStream = new DeflaterOutputStream((OutputStream)byteArrayOutputStream, deflater);
            deflaterOutputStream.write(arrby);
        }
        catch (FileNotFoundException var4_5) {
            var4_5.printStackTrace();
        }
        catch (IOException var4_7) {
            var4_7.printStackTrace();
        }
        finally {
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.close();
                }
                catch (IOException var4_6) {
                    var4_6.printStackTrace();
                }
            }
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }

    static {
        e.start();
        a = new fs(e.getLooper());
        f = "-----BEGIN CERTIFICATE-----\nMIIDyDCCArACCQD9bypp/+5VujANBgkqhkiG9w0BAQUFADCBpDELMAkGA1UEBhMC\nQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcxGDAWBgNVBAoM\nD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEuY29tMRIwEAYD\nVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNoLnBhbkB0ZW5k\nY2xvdWQuY29tMCAXDTE0MDUxNjA4MzkxMFoYDzIxMTQwNDIyMDgzOTEwWjCBpDEL\nMAkGA1UEBhMCQ04xEDAOBgNVBAgMB0JlaUppbmcxEDAOBgNVBAcMB0JlaUppbmcx\nGDAWBgNVBAoMD1RhbGtpbmdEYXRhLmNvbTEYMBYGA1UECwwPVGFsa2luZ0RhdGEu\nY29tMRIwEAYDVQQDDAl4ZHJpZy5jb20xKTAnBgkqhkiG9w0BCQEWGmhpZXJhcmNo\nLnBhbkB0ZW5kY2xvdWQuY29tMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC\nAQEArssg6Iz/jp1/5I20O0aCUcF7Vqrce6DdwblXCbcT44CRYUSwyGteQfPUYGPA\n/2kyk/H/maK5UC6SkI9TOeDs+CBz1oCvxLUd20kMF3J3FT2XENE3fwCmlcppYpdO\nHTZBn72GyYuVLj4lI3MRm8DZoPzYYj0TaZxrX3qpy8cNV4LC7BiBnJtExqAvB0q7\nfUzeDIKrhkFxPbzOUE5txNwwRLu+/neOQJQ48UPesMH3QbYLhCh+l8f9G6TQ1pND\ndcwACsDrVjFPab0w+N1jeev/k+bd5YLxEaQ3HtZvmgOXBL+kREZyKhctaHqcwbWK\nAwJHQeYmJbzw/V4/NQCIGhnlFQIDAQABMA0GCSqGSIb3DQEBBQUAA4IBAQCRp0QL\nydMOemUDkk7n+zIPGa1Ndt2BXJYIgzMbpuWI9h2rVXfz7K9k8PZs9stt1S5ek6TQ\nbWxnrQxanyx2jFf4h+erds0jwAcJrDRG8kFcRsLdx/BjKcBG91HjYuC65RD9eyt+\nXzrmdF8UCvDo2LrL+nkAbufd5XnbBa8I7Jucsu2wOkCa8oatnuorgnh/soEL6zcb\nbLgnCqqXUBKCg5U+mS2WFqEoBnJJoeKDRp08T5juhAJNF/EynX63qn9dS3IqxqeZ\nJ/urMkKVxUCffyZdbezTeljqaaxsQ8xFSK58TSVYFEr9jAGO+jKUWb0tKMSUr/tN\n82L5ZccC8n6eg0YU\n-----END CERTIFICATE-----";
    }
}

