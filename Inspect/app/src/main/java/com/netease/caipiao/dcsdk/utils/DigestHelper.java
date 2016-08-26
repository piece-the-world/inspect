package com.netease.caipiao.dcsdk.utils;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestHelper {
    private DigestHelper() {
    }

    public static String MD5(String seed) {
        if (!TextUtils.isEmpty(seed)) {
            try {
                MessageDigest digest = MessageDigest.getInstance("MD5");
                digest.update(seed.getBytes());
                return byteToHex(digest.digest());
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String getStringFromBytes(byte[] digest) {
        if (digest == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : digest) {
            stringBuilder.append(b);
        }
        return stringBuilder.toString();
    }

    public static String byteToHex(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] str = new char[(j * 2)];
        int k = 0;
        for (byte byte0 : bytes) {
            int i = k + 1;
            str[k] = hexDigits[(byte0 >>> 4) & 15];
            k = i + 1;
            str[i] = hexDigits[byte0 & 15];
        }
        return new String(str);
    }
}
