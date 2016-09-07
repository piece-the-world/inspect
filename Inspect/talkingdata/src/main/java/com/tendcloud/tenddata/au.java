/*
 * Decompiled with CFR 0_115.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.av;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

@SuppressLint(value={"Assert"})
public class au {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 2;
    public static final int e = 4;
    public static final int f = 8;
    public static final int g = 16;
    public static final int h = 32;
    private static final int j = 76;
    private static final byte k = 61;
    private static final byte l = 10;
    private static final String m = "US-ASCII";
    private static final byte n = -5;
    private static final byte o = -1;
    private static final byte[] p = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] q = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] r = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] s = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] t = new byte[]{45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] u = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    private static final byte[] b(int n2) {
        if ((n2 & 16) == 16) {
            return r;
        }
        if ((n2 & 32) == 32) {
            return t;
        }
        return p;
    }

    private static final byte[] c(int n2) {
        if ((n2 & 16) == 16) {
            return s;
        }
        if ((n2 & 32) == 32) {
            return u;
        }
        return q;
    }

    private au() {
    }

    private static byte[] b(byte[] arrby, byte[] arrby2, int n2, int n3) {
        au.b(arrby2, 0, n2, arrby, 0, n3);
        return arrby;
    }

    private static byte[] b(byte[] arrby, int n2, int n3, byte[] arrby2, int n4, int n5) {
        byte[] arrby3 = au.b(n5);
        int n6 = (n3 > 0 ? arrby[n2] << 24 >>> 8 : 0) | (n3 > 1 ? arrby[n2 + 1] << 24 >>> 16 : 0) | (n3 > 2 ? arrby[n2 + 2] << 24 >>> 24 : 0);
        switch (n3) {
            case 3: {
                arrby2[n4] = arrby3[n6 >>> 18];
                arrby2[n4 + 1] = arrby3[n6 >>> 12 & 63];
                arrby2[n4 + 2] = arrby3[n6 >>> 6 & 63];
                arrby2[n4 + 3] = arrby3[n6 & 63];
                return arrby2;
            }
            case 2: {
                arrby2[n4] = arrby3[n6 >>> 18];
                arrby2[n4 + 1] = arrby3[n6 >>> 12 & 63];
                arrby2[n4 + 2] = arrby3[n6 >>> 6 & 63];
                arrby2[n4 + 3] = 61;
                return arrby2;
            }
            case 1: {
                arrby2[n4] = arrby3[n6 >>> 18];
                arrby2[n4 + 1] = arrby3[n6 >>> 12 & 63];
                arrby2[n4 + 2] = 61;
                arrby2[n4 + 3] = 61;
                return arrby2;
            }
        }
        return arrby2;
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] arrby = new byte[3];
        byte[] arrby2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int n2 = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(arrby, 0, n2);
            au.b(arrby2, arrby, n2, 0);
            byteBuffer2.put(arrby2);
        }
    }

    public static void a(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] arrby = new byte[3];
        byte[] arrby2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int n2 = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(arrby, 0, n2);
            au.b(arrby2, arrby, n2, 0);
            for (int i2 = 0; i2 < 4; ++i2) {
                charBuffer.put((char)(arrby2[i2] & 255));
            }
        }
    }

    public static String a(Serializable serializable) {
        return au.a(serializable, 0);
    }

    public static String a(Serializable serializable, int n2) {
        if (serializable == null) {
            throw new NullPointerException("Cannot serialize a null object.");
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        OutputStream outputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            outputStream = new b(byteArrayOutputStream, 1 | n2);
            if ((n2 & 2) != 0) {
                deflaterOutputStream = new GZIPOutputStream(outputStream);
                objectOutputStream = new ObjectOutputStream(deflaterOutputStream);
            } else {
                objectOutputStream = new ObjectOutputStream(outputStream);
            }
            objectOutputStream.writeObject(serializable);
        }
        catch (IOException var6_10) {
            throw var6_10;
        }
        finally {
            try {
                objectOutputStream.close();
            }
            catch (Exception var8_13) {}
            try {
                deflaterOutputStream.close();
            }
            catch (Exception var8_14) {}
            try {
                outputStream.close();
            }
            catch (Exception var8_15) {}
            try {
                byteArrayOutputStream.close();
            }
            catch (Exception var8_16) {}
        }
        try {
            return new String(byteArrayOutputStream.toByteArray(), "US-ASCII");
        }
        catch (UnsupportedEncodingException var6_11) {
            return new String(byteArrayOutputStream.toByteArray());
        }
    }

    public static String a(byte[] arrby) {
        String string;
        block3 : {
            string = null;
            try {
                string = au.a(arrby, 0, arrby.length, 0);
            }
            catch (IOException var2_2) {
                if (i) break block3;
                throw new AssertionError((Object)var2_2.getMessage());
            }
        }
        assert (string != null);
        return string;
    }

    public static String a(byte[] arrby, int n2) {
        return au.a(arrby, 0, arrby.length, n2);
    }

    public static String a(byte[] arrby, int n2, int n3) {
        String string;
        block3 : {
            string = null;
            try {
                string = au.a(arrby, n2, n3, 0);
            }
            catch (IOException var4_4) {
                if (i) break block3;
                throw new AssertionError((Object)var4_4.getMessage());
            }
        }
        assert (string != null);
        return string;
    }

    public static String a(byte[] arrby, int n2, int n3, int n4) {
        byte[] arrby2 = au.b(arrby, n2, n3, n4);
        try {
            return new String(arrby2, "US-ASCII");
        }
        catch (UnsupportedEncodingException var5_5) {
            return new String(arrby2);
        }
    }

    public static byte[] b(byte[] arrby) {
        byte[] arrby2;
        block2 : {
            arrby2 = null;
            try {
                arrby2 = au.b(arrby, 0, arrby.length, 0);
            }
            catch (IOException var2_2) {
                if (i) break block2;
                throw new AssertionError((Object)("IOExceptions only come from GZipping, which is turned off: " + var2_2.getMessage()));
            }
        }
        return arrby2;
    }

    public static byte[] b(byte[] arrby, int n2, int n3, int n4) {
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
        if ((n4 & 2) != 0) {
            ByteArrayOutputStream byteArrayOutputStream = null;
            DeflaterOutputStream deflaterOutputStream = null;
            b b2 = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                b2 = new b(byteArrayOutputStream, 1 | n4);
                deflaterOutputStream = new GZIPOutputStream(b2);
                deflaterOutputStream.write(arrby, n2, n3);
                deflaterOutputStream.close();
            }
            catch (IOException var7_13) {
                throw var7_13;
            }
            finally {
                try {
                    deflaterOutputStream.close();
                }
                catch (Exception var9_17) {}
                try {
                    b2.close();
                }
                catch (Exception var9_18) {}
                try {
                    byteArrayOutputStream.close();
                }
                catch (Exception var9_19) {}
            }
            return byteArrayOutputStream.toByteArray();
        }
        boolean bl2 = (n4 & 8) != 0;
        int n5 = n3 / 3 * 4 + (n3 % 3 > 0 ? 4 : 0);
        if (bl2) {
            n5 += n5 / 76;
        }
        byte[] arrby2 = new byte[n5];
        int n6 = 0;
        int n7 = 0;
        int n8 = n3 - 2;
        int n9 = 0;
        while (n6 < n8) {
            au.b(arrby, n6 + n2, 3, arrby2, n7, n4);
            if (bl2 && (n9 += 4) >= 76) {
                arrby2[n7 + 4] = 10;
                ++n7;
                n9 = 0;
            }
            n6 += 3;
            n7 += 4;
        }
        if (n6 < n3) {
            au.b(arrby, n6 + n2, n3 - n6, arrby2, n7, n4);
            n7 += 4;
        }
        if (n7 <= arrby2.length - 1) {
            byte[] arrby3 = new byte[n7];
            System.arraycopy(arrby2, 0, arrby3, 0, n7);
            return arrby3;
        }
        return arrby2;
    }

    private static int b(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        if (arrby == null) {
            throw new NullPointerException("Source array was null.");
        }
        if (arrby2 == null) {
            throw new NullPointerException("Destination array was null.");
        }
        if (n2 < 0 || n2 + 3 >= arrby.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", arrby.length, n2));
        }
        if (n3 < 0 || n3 + 2 >= arrby2.length) {
            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", arrby2.length, n3));
        }
        byte[] arrby3 = au.c(n4);
        if (arrby[n2 + 2] == 61) {
            int n5 = (arrby3[arrby[n2]] & 255) << 18 | (arrby3[arrby[n2 + 1]] & 255) << 12;
            arrby2[n3] = (byte)(n5 >>> 16);
            return 1;
        }
        if (arrby[n2 + 3] == 61) {
            int n6 = (arrby3[arrby[n2]] & 255) << 18 | (arrby3[arrby[n2 + 1]] & 255) << 12 | (arrby3[arrby[n2 + 2]] & 255) << 6;
            arrby2[n3] = (byte)(n6 >>> 16);
            arrby2[n3 + 1] = (byte)(n6 >>> 8);
            return 2;
        }
        int n7 = (arrby3[arrby[n2]] & 255) << 18 | (arrby3[arrby[n2 + 1]] & 255) << 12 | (arrby3[arrby[n2 + 2]] & 255) << 6 | arrby3[arrby[n2 + 3]] & 255;
        arrby2[n3] = (byte)(n7 >> 16);
        arrby2[n3 + 1] = (byte)(n7 >> 8);
        arrby2[n3 + 2] = (byte)n7;
        return 3;
    }

    public static byte[] c(byte[] arrby) {
        byte[] arrby2 = null;
        arrby2 = au.c(arrby, 0, arrby.length, 0);
        return arrby2;
    }

    public static byte[] c(byte[] arrby, int n2, int n3, int n4) {
        if (arrby == null) {
            throw new NullPointerException("Cannot decode null source array.");
        }
        if (n2 < 0 || n2 + n3 > arrby.length) {
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", arrby.length, n2, n3));
        }
        if (n3 == 0) {
            return new byte[0];
        }
        if (n3 < 4) {
            throw new IllegalArgumentException("Base64-encoded string must have at least four characters, but length specified was " + n3);
        }
        byte[] arrby2 = au.c(n4);
        int n5 = n3 * 3 / 4;
        byte[] arrby3 = new byte[n5];
        int n6 = 0;
        byte[] arrby4 = new byte[4];
        int n7 = 0;
        int n8 = 0;
        byte by2 = 0;
        for (n8 = n2; n8 < n2 + n3; ++n8) {
            by2 = arrby2[arrby[n8] & 255];
            if (by2 >= -5) {
                if (by2 < -1) continue;
                arrby4[n7++] = arrby[n8];
                if (n7 <= 3) continue;
                n6 += au.b(arrby4, 0, arrby3, n6, n4);
                n7 = 0;
                if (arrby[n8] != 61) continue;
                break;
            }
            throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", arrby[n8] & 255, n8));
        }
        byte[] arrby5 = new byte[n6];
        System.arraycopy(arrby3, 0, arrby5, 0, n6);
        return arrby5;
    }

    public static byte[] a(String string) {
        return au.a(string, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] a(String string, int n2) {
        boolean bl2;
        int n3;
        byte[] arrby;
        if (string == null) {
            throw new NullPointerException("Input string was null.");
        }
        try {
            arrby = string.getBytes("US-ASCII");
        }
        catch (UnsupportedEncodingException var3_3) {
            arrby = string.getBytes();
        }
        arrby = au.c(arrby, 0, arrby.length, n2);
        boolean bl3 = bl2 = (n2 & 4) != 0;
        if (arrby != null && arrby.length >= 4 && !bl2 && 35615 == (n3 = arrby[0] & 255 | arrby[1] << 8 & 65280)) {
            ByteArrayInputStream byteArrayInputStream = null;
            GZIPInputStream gZIPInputStream = null;
            ByteArrayOutputStream byteArrayOutputStream = null;
            byte[] arrby2 = new byte[2048];
            int n4 = 0;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayInputStream = new ByteArrayInputStream(arrby);
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                while ((n4 = gZIPInputStream.read(arrby2)) >= 0) {
                    byteArrayOutputStream.write(arrby2, 0, n4);
                }
                arrby = byteArrayOutputStream.toByteArray();
            }
            catch (IOException var10_14) {
                var10_14.printStackTrace();
            }
            finally {
                try {
                    byteArrayOutputStream.close();
                }
                catch (Exception var10_15) {}
                try {
                    gZIPInputStream.close();
                }
                catch (Exception var10_16) {}
                try {
                    byteArrayInputStream.close();
                }
                catch (Exception var10_17) {}
            }
        }
        return arrby;
    }

    public static Object b(String string) {
        return au.a(string, 0, null);
    }

    public static Object a(String string, int n2, ClassLoader classLoader) {
        byte[] arrby = au.a(string, n2);
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        Object object = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(arrby);
            objectInputStream = classLoader == null ? new ObjectInputStream(byteArrayInputStream) : new av(byteArrayInputStream, classLoader);
            object = objectInputStream.readObject();
        }
        catch (IOException var7_9) {
            throw var7_9;
        }
        catch (ClassNotFoundException var7_10) {
            throw var7_10;
        }
        finally {
            try {
                byteArrayInputStream.close();
            }
            catch (Exception var9_12) {}
            try {
                objectInputStream.close();
            }
            catch (Exception var9_13) {}
        }
        return object;
    }

    public static void a(byte[] arrby, String string) {
        if (arrby == null) {
            throw new NullPointerException("Data to encode was null.");
        }
        b b2 = null;
        try {
            b2 = new b(new FileOutputStream(string), 1);
            b2.write(arrby);
        }
        catch (IOException var3_4) {
            throw var3_4;
        }
        finally {
            try {
                b2.close();
            }
            catch (Exception var5_6) {}
        }
    }

    public static void a(String string, String string2) {
        b b2 = null;
        try {
            b2 = new b(new FileOutputStream(string2), 0);
            b2.write(string.getBytes("US-ASCII"));
        }
        catch (IOException var3_4) {
            throw var3_4;
        }
        finally {
            try {
                b2.close();
            }
            catch (Exception var5_6) {}
        }
    }

    public static byte[] c(String string) {
        byte[] arrby = null;
        FilterInputStream filterInputStream = null;
        try {
            File file = new File(string);
            byte[] arrby2 = null;
            int n2 = 0;
            int n3 = 0;
            if (file.length() > Integer.MAX_VALUE) {
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            }
            arrby2 = new byte[(int)file.length()];
            filterInputStream = new a(new BufferedInputStream(new FileInputStream(file)), 0);
            while ((n3 = filterInputStream.read(arrby2, n2, 4096)) >= 0) {
                n2 += n3;
            }
            arrby = new byte[n2];
            System.arraycopy(arrby2, 0, arrby, 0, n2);
        }
        catch (IOException var3_5) {
            throw var3_5;
        }
        finally {
            try {
                filterInputStream.close();
            }
            catch (Exception var8_10) {}
        }
        return arrby;
    }

    public static String d(String string) {
        String string2 = null;
        FilterInputStream filterInputStream = null;
        try {
            File file = new File(string);
            byte[] arrby = new byte[Math.max((int)((double)file.length() * 1.4 + 1.0), 40)];
            int n2 = 0;
            int n3 = 0;
            filterInputStream = new a(new BufferedInputStream(new FileInputStream(file)), 1);
            while ((n3 = filterInputStream.read(arrby, n2, 4096)) >= 0) {
                n2 += n3;
            }
            string2 = new String(arrby, 0, n2, "US-ASCII");
        }
        catch (IOException var3_5) {
            throw var3_5;
        }
        finally {
            try {
                filterInputStream.close();
            }
            catch (Exception var8_10) {}
        }
        return string2;
    }

    public static void b(String string, String string2) {
        String string3 = au.d(string);
        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(string2));
            outputStream.write(string3.getBytes("US-ASCII"));
        }
        catch (IOException var4_5) {
            throw var4_5;
        }
        finally {
            try {
                outputStream.close();
            }
            catch (Exception var6_7) {}
        }
    }

    public static void c(String string, String string2) {
        byte[] arrby = au.c(string);
        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(string2));
            outputStream.write(arrby);
        }
        catch (IOException var4_5) {
            throw var4_5;
        }
        finally {
            try {
                outputStream.close();
            }
            catch (Exception var6_7) {}
        }
    }

    public static class b
    extends FilterOutputStream {
        private boolean a;
        private int b;
        private byte[] c;
        private int d;
        private int e;
        private boolean f;
        private byte[] g;
        private boolean h;
        private int i;
        private byte[] j;

        public b(OutputStream outputStream) {
            this(outputStream, 1);
        }

        public b(OutputStream outputStream, int n2) {
            super(outputStream);
            this.f = (n2 & 8) != 0;
            this.a = (n2 & 1) != 0;
            this.d = this.a ? 3 : 4;
            this.c = new byte[this.d];
            this.b = 0;
            this.e = 0;
            this.h = false;
            this.g = new byte[4];
            this.i = n2;
            this.j = au.c(n2);
        }

        @Override
        public void write(int n2) {
            if (this.h) {
                this.out.write(n2);
                return;
            }
            if (this.a) {
                this.c[this.b++] = (byte)n2;
                if (this.b >= this.d) {
                    this.out.write(au.b(this.g, this.c, this.d, this.i));
                    this.e += 4;
                    if (this.f && this.e >= 76) {
                        this.out.write(10);
                        this.e = 0;
                    }
                    this.b = 0;
                }
            } else if (this.j[n2 & 127] > -5) {
                this.c[this.b++] = (byte)n2;
                if (this.b >= this.d) {
                    int n3 = au.b(this.c, 0, this.g, 0, this.i);
                    this.out.write(this.g, 0, n3);
                    this.b = 0;
                }
            } else if (this.j[n2 & 127] != -5) {
                throw new IOException("Invalid character in Base64 data.");
            }
        }

        @Override
        public void write(byte[] arrby, int n2, int n3) {
            if (this.h) {
                this.out.write(arrby, n2, n3);
                return;
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                this.write(arrby[n2 + i2]);
            }
        }

        public void a() {
            if (this.b > 0) {
                if (this.a) {
                    this.out.write(au.b(this.g, this.c, this.b, this.i));
                    this.b = 0;
                } else {
                    throw new IOException("Base64 input not properly padded.");
                }
            }
        }

        @Override
        public void close() {
            this.a();
            super.close();
            this.c = null;
            this.out = null;
        }

        public void b() {
            this.a();
            this.h = true;
        }

        public void c() {
            this.h = false;
        }
    }

    public static class a
    extends FilterInputStream {
        private boolean a;
        private int b;
        private byte[] c;
        private int d;
        private int e;
        private int f;
        private boolean g;
        private int h;
        private byte[] i;

        public a(InputStream inputStream) {
            this(inputStream, 0);
        }

        public a(InputStream inputStream, int n2) {
            super(inputStream);
            this.h = n2;
            this.g = (n2 & 8) > 0;
            this.a = (n2 & 1) > 0;
            this.d = this.a ? 4 : 3;
            this.c = new byte[this.d];
            this.b = -1;
            this.f = 0;
            this.i = au.c(n2);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public int read() {
            if (this.b < 0) {
                byte[] arrby;
                if (this.a) {
                    int n2;
                    arrby = new byte[3];
                    int n3 = 0;
                    for (int i2 = 0; i2 < 3 && (n2 = this.in.read()) >= 0; ++i2) {
                        arrby[i2] = (byte)n2;
                        ++n3;
                    }
                    if (n3 <= 0) return -1;
                    au.b(arrby, 0, n3, this.c, 0, this.h);
                    this.b = 0;
                    this.e = 4;
                } else {
                    int n4;
                    block11 : {
                        arrby = new byte[4];
                        n4 = 0;
                        n4 = 0;
                        while (n4 < 4) {
                            int n5 = 0;
                            while ((n5 = this.in.read()) >= 0 && this.i[n5 & 127] <= -5) {
                            }
                            if (n5 >= 0) {
                                arrby[n4] = (byte)n5;
                                ++n4;
                                continue;
                            }
                            break block11;
                        }
                        return -1;
                    }
                    if (n4 == 4) {
                        this.e = au.b(arrby, 0, this.c, 0, this.h);
                        this.b = 0;
                    } else {
                        if (n4 != 0) throw new IOException("Improperly padded Base64 input.");
                        return -1;
                    }
                }
            }
            if (this.b < 0) throw new IOException("Error in Base64 code reading stream.");
            if (this.b >= this.e) {
                return -1;
            }
            if (this.a && this.g && this.f >= 76) {
                this.f = 0;
                return 10;
            }
            ++this.f;
            byte by2 = this.c[this.b++];
            if (this.b < this.d) return by2 & 255;
            this.b = -1;
            return by2 & 255;
        }

        @Override
        public int read(byte[] arrby, int n2, int n3) {
            int n4;
            for (n4 = 0; n4 < n3; ++n4) {
                int n5 = this.read();
                if (n5 < 0) {
                    if (n4 != 0) break;
                    return -1;
                }
                arrby[n2 + n4] = (byte)n5;
            }
            return n4;
        }
    }

}

