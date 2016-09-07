/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.AssetManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  org.json.JSONObject
 */
package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import com.tendcloud.tenddata.cn;
import com.tendcloud.tenddata.ct;
import com.tendcloud.tenddata.cu;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.nio.channels.FileChannel;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;

public class cs {
    static final boolean a = false;
    public static boolean b = true;
    public static String c = "TDLog";
    public static boolean d = false;
    public static boolean e = false;
    private static final String g = "UTF-8";
    private static String h = "ge";
    private static String i = "tp";
    private static String j = "rop";
    private static final ExecutorService k = Executors.newSingleThreadExecutor();
    private static final byte l = 61;
    private static final String m = "US-ASCII";
    private static final byte[] n = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static byte[] o = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void execute(Runnable runnable) {
        k.execute(runnable);
    }

    public static String a(Context context, String string) {
        try {
            InputStream inputStream = context.getAssets().open(string);
            byte[] arrby = new byte[inputStream.available()];
            inputStream.read(arrby);
            inputStream.close();
            String string2 = new String(arrby);
            JSONObject jSONObject = new JSONObject(string2);
            String string3 = jSONObject.getString("td_channel_id");
            return string3;
        }
        catch (Throwable var2_3) {
            return null;
        }
    }

    public static void a(Object object, cn cn2, String string, String string2) {
        Field field = object.getClass().getDeclaredField(string);
        field.setAccessible(true);
        Object object2 = field.get(object);
        Class class_ = Class.forName(string2);
        ct ct2 = new ct(cn2, object2);
        Object object3 = Proxy.newProxyInstance(object.getClass().getClassLoader(), new Class[]{class_}, ct2);
        field.set(object, object3);
    }

    public static void a(Class class_, cn cn2, String string, String string2) {
        Field field = class_.getDeclaredField(string);
        field.setAccessible(true);
        Object object = field.get(null);
        Class class_2 = Class.forName(string2);
        cu cu2 = new cu(cn2, object);
        Object object2 = Proxy.newProxyInstance(class_.getClass().getClassLoader(), new Class[]{class_2}, cu2);
        field.set(null, object2);
    }

    public static final String a(String string) {
        if (string.length() > 256) {
            return string.substring(0, 256);
        }
        return string;
    }

    public static final boolean b(String string) {
        return string == null || "".equals(string.trim());
    }

    public static String c(String string) {
        try {
            byte[] arrby = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
            return cs.a(arrby);
        }
        catch (Exception var1_2) {
            return null;
        }
    }

    public static boolean b(Context context, String string) {
        try {
            return context.checkCallingOrSelfPermission(string) == 0;
        }
        catch (Throwable var2_2) {
            return false;
        }
    }

    public static boolean a(int n2) {
        return Build.VERSION.SDK_INT >= n2;
    }

    public static String a(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte by2 : arrby) {
            int n2 = by2 & 255;
            if (n2 < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(n2));
        }
        return stringBuilder.toString();
    }

    public static byte[] a(int[] arrn, int[] arrn2) {
        String string = "kiG9w0BAQUFADCBqjELMAkGA0JFSUpJTkcxEDAOBgNVBAcMB0JFSUpJTkcxFjAUBgNVB";
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = arrn[i2] * arrn2[arrn2.length - 1 - i2] - arrn[arrn.length - 1 - i2] * arrn2[i2] + string.charAt(i2);
            arrn2[i2] = arrn2[i2] * arrn[arrn.length - 1 - i2] + arrn2[arrn2.length - 1 - i2] * arrn[i2] - string.charAt(string.length() - 1 - i2);
        }
        String string2 = Arrays.toString(arrn) + Arrays.hashCode(arrn2);
        return string2.getBytes();
    }

    public static byte[] a(byte[] arrby, byte[] arrby2) {
        int n2;
        SecureRandom secureRandom = new SecureRandom();
        DESKeySpec dESKeySpec = new DESKeySpec(arrby);
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = secretKeyFactory.generateSecret(dESKeySpec);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        byte[] arrby3 = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        IvParameterSpec ivParameterSpec = new IvParameterSpec(arrby3);
        cipher.init(2, (Key)secretKey, ivParameterSpec, secureRandom);
        byte[] arrby4 = cipher.doFinal(arrby2);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(arrby4));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while ((n2 = inflaterInputStream.read()) != -1) {
            byteArrayOutputStream.write(n2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] a(byte[] arrby, int n2, int n3, byte[] arrby2, int n4) {
        byte[] arrby3 = n;
        int n5 = (n3 > 0 ? arrby[n2] << 24 >>> 8 : 0) | (n3 > 1 ? arrby[n2 + 1] << 24 >>> 16 : 0) | (n3 > 2 ? arrby[n2 + 2] << 24 >>> 24 : 0);
        switch (n3) {
            case 3: {
                arrby2[n4] = arrby3[n5 >>> 18];
                arrby2[n4 + 1] = arrby3[n5 >>> 12 & 63];
                arrby2[n4 + 2] = arrby3[n5 >>> 6 & 63];
                arrby2[n4 + 3] = arrby3[n5 & 63];
                return arrby2;
            }
            case 2: {
                arrby2[n4] = arrby3[n5 >>> 18];
                arrby2[n4 + 1] = arrby3[n5 >>> 12 & 63];
                arrby2[n4 + 2] = arrby3[n5 >>> 6 & 63];
                arrby2[n4 + 3] = 61;
                return arrby2;
            }
            case 1: {
                arrby2[n4] = arrby3[n5 >>> 18];
                arrby2[n4 + 1] = arrby3[n5 >>> 12 & 63];
                arrby2[n4 + 2] = 61;
                arrby2[n4 + 3] = 61;
                return arrby2;
            }
        }
        return arrby2;
    }

    public static String b(byte[] arrby) {
        String string;
        block3 : {
            string = null;
            try {
                string = cs.a(arrby, 0, arrby.length);
            }
            catch (IOException var2_2) {
                if (f) break block3;
                throw new AssertionError((Object)var2_2.getMessage());
            }
        }
        assert (string != null);
        return string;
    }

    public static String a(byte[] arrby, int n2, int n3) {
        byte[] arrby2 = cs.b(arrby, n2, n3);
        try {
            return new String(arrby2, "US-ASCII");
        }
        catch (UnsupportedEncodingException var4_4) {
            return new String(arrby2);
        }
    }

    public static byte[] b(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            throw new NullPointerException("Cannot serialize a null array.");
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + n2);
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + n3);
        }
        if (n2 + n3 > arrby.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", n2, n3, arrby.length));
        }
        int n4 = n3 / 3 * 4 + (n3 % 3 > 0 ? 4 : 0);
        byte[] arrby2 = new byte[n4];
        int n5 = 0;
        int n6 = 0;
        int n7 = n3 - 2;
        while (n5 < n7) {
            cs.a(arrby, n5 + n2, 3, arrby2, n6);
            n5 += 3;
            n6 += 4;
        }
        if (n5 < n3) {
            cs.a(arrby, n5 + n2, n3 - n5, arrby2, n6);
            n6 += 4;
        }
        if (n6 <= arrby2.length - 1) {
            byte[] arrby3 = new byte[n6];
            System.arraycopy(arrby2, 0, arrby3, 0, n6);
            return arrby3;
        }
        return arrby2;
    }

    public static boolean a(Context context) {
        return false;
    }

    public static String c(Context context, String string) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String string2 = cs.a(bundle, string);
            return string2;
        }
        catch (PackageManager.NameNotFoundException var3_4) {
            return null;
        }
    }

    private static String a(Bundle bundle, String string) {
        if (bundle == null) {
            return null;
        }
        for (String string2 : bundle.keySet()) {
            if (!string2.equalsIgnoreCase(string)) continue;
            return String.valueOf(bundle.get(string));
        }
        return null;
    }

    public static byte[] b(byte[] arrby, byte[] arrby2) {
        try {
            DESKeySpec dESKeySpec = new DESKeySpec(arrby2);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = secretKeyFactory.generateSecret(dESKeySpec);
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(o);
            cipher.init(1, (Key)secretKey, ivParameterSpec);
            byte[] arrby3 = cipher.doFinal(arrby);
            return arrby3;
        }
        catch (Exception var2_3) {
            return null;
        }
    }

    public static byte[] c(byte[] arrby, byte[] arrby2) {
        try {
            DESKeySpec dESKeySpec = new DESKeySpec(arrby2);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = secretKeyFactory.generateSecret(dESKeySpec);
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(o);
            cipher.init(2, (Key)secretKey, ivParameterSpec);
            byte[] arrby3 = cipher.doFinal(arrby);
            return arrby3;
        }
        catch (Exception var2_3) {
            return null;
        }
    }

    public static String a() {
        return null;
    }

    public static String d(String string) {
        if (string == null) {
            return null;
        }
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] arrby = messageDigest.digest(string.getBytes("UTF-8"));
            return cs.a(arrby);
        }
        catch (Exception var2_3) {
            return null;
        }
    }

    public static FileChannel d(Context context, String string) {
        FileChannel fileChannel = null;
        RandomAccessFile randomAccessFile = null;
        try {
            File file = new File(context.getFilesDir(), string + "td.lock");
            if (!file.exists()) {
                file.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file, "rw");
            fileChannel = randomAccessFile.getChannel();
        }
        catch (Throwable var4_5) {
            try {
                randomAccessFile.close();
                fileChannel = null;
            }
            catch (Exception var5_6) {
                // empty catch block
            }
        }
        return fileChannel;
    }
}

