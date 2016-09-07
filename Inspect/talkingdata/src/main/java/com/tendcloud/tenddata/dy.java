/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.util.Base64;
import com.tendcloud.tenddata.ab;
import com.tendcloud.tenddata.ee;
import java.security.Key;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class dy {
    private static final String a = "AES/CBC/PKCS7Padding";
    private static final String b = "UTF-8";
    private static final String c = "SHA-256";
    private static final byte[] d = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private static SecretKeySpec c(String string) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] arrby = string.getBytes("UTF-8");
        messageDigest.update(arrby, 0, arrby.length);
        byte[] arrby2 = messageDigest.digest();
        String string2 = Base64.encodeToString((byte[])arrby2, (int)2);
        ee.a(string2);
        return new SecretKeySpec(arrby2, "AES");
    }

    private static SecretKeySpec d(String string) {
        String string2 = ee.a();
        SecretKeySpec secretKeySpec = string2 != null ? new SecretKeySpec(Base64.decode((String)string2, (int)2), "AES") : dy.c(string);
        return secretKeySpec;
    }

    static String a(String string) {
        try {
            SecretKeySpec secretKeySpec = dy.d(ab.a(ab.mContext));
            byte[] arrby = dy.a(secretKeySpec, d, string.getBytes("UTF-8"));
            String string2 = Base64.encodeToString((byte[])arrby, (int)2);
            return string2;
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    private static byte[] a(SecretKeySpec secretKeySpec, byte[] arrby, byte[] arrby2) {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(arrby);
        cipher.init(1, (Key)secretKeySpec, ivParameterSpec);
        byte[] arrby3 = cipher.doFinal(arrby2);
        return arrby3;
    }

    static String b(String string) {
        try {
            String string2 = ee.a();
            SecretKeySpec secretKeySpec = string2 == null ? dy.d(ab.a(ab.mContext)) : new SecretKeySpec(Base64.decode((String)string2, (int)2), "AES");
            byte[] arrby = Base64.decode((String)string, (int)2);
            byte[] arrby2 = dy.b(secretKeySpec, d, arrby);
            String string3 = new String(arrby2, "UTF-8");
            return string3;
        }
        catch (Throwable var1_2) {
            return null;
        }
    }

    private static byte[] b(SecretKeySpec secretKeySpec, byte[] arrby, byte[] arrby2) {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(arrby);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        byte[] arrby3 = cipher.doFinal(arrby2);
        return arrby3;
    }

    private static void a(String string, byte[] arrby) {
    }

    private static void a(String string, String string2) {
    }

    private static String a(byte[] arrby) {
        char[] arrc = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] arrc2 = new char[arrby.length * 2];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            int n2 = arrby[i2] & 255;
            arrc2[i2 * 2] = arrc[n2 >>> 4];
            arrc2[i2 * 2 + 1] = arrc[n2 & 15];
        }
        return new String(arrc2);
    }

    private dy() {
    }
}

