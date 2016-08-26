/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

public class l {
    public static int a(byte[] arrby, int n2) {
        return (arrby[n2] & 255) << 8 | arrby[n2 + 1] & 255;
    }

    public static int b(byte[] arrby, int n2) {
        return arrby[n2] << 8 | arrby[n2 + 1] & 255;
    }

    public static void a(int n2, byte[] arrby, int n3) {
        arrby[n3] = (byte)(n2 >>> 8);
        arrby[n3 + 1] = (byte)n2;
    }

    public static int c(byte[] arrby, int n2) {
        return arrby[n2] << 24 | (arrby[n2 + 1] & 255) << 16 | (arrby[n2 + 2] & 255) << 8 | arrby[n2 + 3] & 255;
    }

    public static void b(int n2, byte[] arrby, int n3) {
        arrby[n3] = (byte)(n2 >>> 24);
        arrby[n3 + 1] = (byte)(n2 >>> 16);
        arrby[n3 + 2] = (byte)(n2 >>> 8);
        arrby[n3 + 3] = (byte)n2;
    }

    static void a(byte[] arrby, int n2, byte[] arrby2, int n3) {
        arrby2[n3] = arrby[n2];
        arrby2[n3 + 1] = arrby[n2 + 1];
        arrby2[n3 + 2] = arrby[n2 + 2];
        arrby2[n3 + 3] = arrby[n2 + 3];
    }
}

