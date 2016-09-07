/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.bw;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ax {
    private static final String a = "AESCrypt";
    private static final String b = "growls523?19:coudiest";
    private static final String c = "AES/CBC/PKCS5Padding";
    private static final byte[] d = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private static SecretKeySpec a(String string) {
        byte[] arrby = bw.b(string + "growls523?19:coudiest");
        return new SecretKeySpec(arrby, "AES");
    }

    public static byte[] a(String string, byte[] arrby) {
        try {
            SecretKeySpec secretKeySpec = ax.a(string);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(d);
            cipher.init(1, (Key)secretKeySpec, ivParameterSpec);
            byte[] arrby2 = cipher.doFinal(arrby);
            byte[] arrby3 = new byte[arrby2.length + d.length];
            System.arraycopy(d, 0, arrby3, 0, d.length);
            System.arraycopy(arrby2, 0, arrby3, d.length, arrby2.length);
            return arrby3;
        }
        catch (UnsupportedEncodingException var2_3) {
            throw new GeneralSecurityException(var2_3);
        }
    }

    public static byte[] b(String string, byte[] arrby) {
        try {
            SecretKeySpec secretKeySpec = ax.a(string);
            if (arrby.length <= d.length) {
                throw new RuntimeException("bad data to decryption");
            }
            byte[] arrby2 = new byte[d.length];
            System.arraycopy(arrby, 0, arrby2, 0, arrby2.length);
            byte[] arrby3 = new byte[arrby.length - d.length];
            System.arraycopy(arrby, arrby2.length, arrby3, 0, arrby3.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(arrby2);
            cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
            byte[] arrby4 = cipher.doFinal(arrby3);
            return arrby4;
        }
        catch (UnsupportedEncodingException var2_3) {
            throw new GeneralSecurityException(var2_3);
        }
    }

    private ax() {
    }
}

