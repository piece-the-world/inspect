/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.e.a.a.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class f {
    public static short a(short s2) {
        return (short)(((s2 >> 0 & 255) << 8) + ((s2 >> 8 & 255) << 0));
    }

    public static int a(int n2) {
        return ((n2 >> 0 & 255) << 24) + ((n2 >> 8 & 255) << 16) + ((n2 >> 16 & 255) << 8) + ((n2 >> 24 & 255) << 0);
    }

    public static long a(long l2) {
        return ((l2 >> 0 & 255) << 56) + ((l2 >> 8 & 255) << 48) + ((l2 >> 16 & 255) << 40) + ((l2 >> 24 & 255) << 32) + ((l2 >> 32 & 255) << 24) + ((l2 >> 40 & 255) << 16) + ((l2 >> 48 & 255) << 8) + ((l2 >> 56 & 255) << 0);
    }

    public static float a(float f2) {
        return Float.intBitsToFloat(f.a(Float.floatToIntBits(f2)));
    }

    public static double a(double d2) {
        return Double.longBitsToDouble(f.a(Double.doubleToLongBits(d2)));
    }

    public static void a(byte[] arrby, int n2, short s2) {
        arrby[n2 + 0] = (byte)(s2 >> 0 & 255);
        arrby[n2 + 1] = (byte)(s2 >> 8 & 255);
    }

    public static short a(byte[] arrby, int n2) {
        return (short)(((arrby[n2 + 0] & 255) << 0) + ((arrby[n2 + 1] & 255) << 8));
    }

    public static int b(byte[] arrby, int n2) {
        return ((arrby[n2 + 0] & 255) << 0) + ((arrby[n2 + 1] & 255) << 8);
    }

    public static void a(byte[] arrby, int n2, int n3) {
        arrby[n2 + 0] = (byte)(n3 >> 0 & 255);
        arrby[n2 + 1] = (byte)(n3 >> 8 & 255);
        arrby[n2 + 2] = (byte)(n3 >> 16 & 255);
        arrby[n2 + 3] = (byte)(n3 >> 24 & 255);
    }

    public static int c(byte[] arrby, int n2) {
        return ((arrby[n2 + 0] & 255) << 0) + ((arrby[n2 + 1] & 255) << 8) + ((arrby[n2 + 2] & 255) << 16) + ((arrby[n2 + 3] & 255) << 24);
    }

    public static long d(byte[] arrby, int n2) {
        long l2 = ((arrby[n2 + 0] & 255) << 0) + ((arrby[n2 + 1] & 255) << 8) + ((arrby[n2 + 2] & 255) << 16);
        long l3 = arrby[n2 + 3] & 255;
        return (l3 << 24) + (0xFFFFFFFFL & l2);
    }

    public static void a(byte[] arrby, int n2, long l2) {
        arrby[n2 + 0] = (byte)(l2 >> 0 & 255);
        arrby[n2 + 1] = (byte)(l2 >> 8 & 255);
        arrby[n2 + 2] = (byte)(l2 >> 16 & 255);
        arrby[n2 + 3] = (byte)(l2 >> 24 & 255);
        arrby[n2 + 4] = (byte)(l2 >> 32 & 255);
        arrby[n2 + 5] = (byte)(l2 >> 40 & 255);
        arrby[n2 + 6] = (byte)(l2 >> 48 & 255);
        arrby[n2 + 7] = (byte)(l2 >> 56 & 255);
    }

    public static long e(byte[] arrby, int n2) {
        long l2 = f.c(arrby, n2);
        long l3 = f.c(arrby, n2 + 4);
        return (l3 << 32) + (0xFFFFFFFFL & l2);
    }

    public static void a(byte[] arrby, int n2, float f2) {
        f.a(arrby, n2, Float.floatToIntBits(f2));
    }

    public static float f(byte[] arrby, int n2) {
        return Float.intBitsToFloat(f.c(arrby, n2));
    }

    public static void a(byte[] arrby, int n2, double d2) {
        f.a(arrby, n2, Double.doubleToLongBits(d2));
    }

    public static double g(byte[] arrby, int n2) {
        return Double.longBitsToDouble(f.e(arrby, n2));
    }

    public static void a(OutputStream outputStream, short s2) throws IOException {
        outputStream.write((byte)(s2 >> 0 & 255));
        outputStream.write((byte)(s2 >> 8 & 255));
    }

    public static short a(InputStream inputStream) throws IOException {
        return (short)(((f.h(inputStream) & 255) << 0) + ((f.h(inputStream) & 255) << 8));
    }

    public static int b(InputStream inputStream) throws IOException {
        int n2 = f.h(inputStream);
        int n3 = f.h(inputStream);
        return ((n2 & 255) << 0) + ((n3 & 255) << 8);
    }

    public static void a(OutputStream outputStream, int n2) throws IOException {
        outputStream.write((byte)(n2 >> 0 & 255));
        outputStream.write((byte)(n2 >> 8 & 255));
        outputStream.write((byte)(n2 >> 16 & 255));
        outputStream.write((byte)(n2 >> 24 & 255));
    }

    public static int c(InputStream inputStream) throws IOException {
        int n2 = f.h(inputStream);
        int n3 = f.h(inputStream);
        int n4 = f.h(inputStream);
        int n5 = f.h(inputStream);
        return ((n2 & 255) << 0) + ((n3 & 255) << 8) + ((n4 & 255) << 16) + ((n5 & 255) << 24);
    }

    public static long d(InputStream inputStream) throws IOException {
        int n2 = f.h(inputStream);
        int n3 = f.h(inputStream);
        int n4 = f.h(inputStream);
        int n5 = f.h(inputStream);
        long l2 = ((n2 & 255) << 0) + ((n3 & 255) << 8) + ((n4 & 255) << 16);
        long l3 = n5 & 255;
        return (l3 << 24) + (0xFFFFFFFFL & l2);
    }

    public static void a(OutputStream outputStream, long l2) throws IOException {
        outputStream.write((byte)(l2 >> 0 & 255));
        outputStream.write((byte)(l2 >> 8 & 255));
        outputStream.write((byte)(l2 >> 16 & 255));
        outputStream.write((byte)(l2 >> 24 & 255));
        outputStream.write((byte)(l2 >> 32 & 255));
        outputStream.write((byte)(l2 >> 40 & 255));
        outputStream.write((byte)(l2 >> 48 & 255));
        outputStream.write((byte)(l2 >> 56 & 255));
    }

    public static long e(InputStream inputStream) throws IOException {
        byte[] arrby = new byte[8];
        for (int i2 = 0; i2 < 8; ++i2) {
            arrby[i2] = (byte)f.h(inputStream);
        }
        return f.e(arrby, 0);
    }

    public static void a(OutputStream outputStream, float f2) throws IOException {
        f.a(outputStream, Float.floatToIntBits(f2));
    }

    public static float f(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(f.c(inputStream));
    }

    public static void a(OutputStream outputStream, double d2) throws IOException {
        f.a(outputStream, Double.doubleToLongBits(d2));
    }

    public static double g(InputStream inputStream) throws IOException {
        return Double.longBitsToDouble(f.e(inputStream));
    }

    private static int h(InputStream inputStream) throws IOException {
        int n2 = inputStream.read();
        if (-1 == n2) {
            throw new EOFException("Unexpected EOF reached");
        }
        return n2;
    }
}

