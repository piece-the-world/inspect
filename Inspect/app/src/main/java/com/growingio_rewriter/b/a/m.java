/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

import java.io.IOException;
import java.io.OutputStream;

final class m
extends OutputStream {
    private byte[] a;
    private int b;

    public m() {
        this(32);
    }

    public m(int n2) {
        this.a = new byte[n2];
        this.b = 0;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.b;
    }

    public void a(int n2) {
        this.d(n2);
        this.b += n2;
    }

    @Override
    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        this.d(n3);
        System.arraycopy(arrby, n2, this.a, this.b, n3);
        this.b += n3;
    }

    @Override
    public void write(int n2) {
        this.d(1);
        int n3 = this.b;
        this.a[n3] = (byte)n2;
        this.b = n3 + 1;
    }

    public void b(int n2) {
        this.d(2);
        int n3 = this.b;
        this.a[n3] = (byte)(n2 >>> 8);
        this.a[n3 + 1] = (byte)n2;
        this.b = n3 + 2;
    }

    public void c(int n2) {
        this.d(4);
        int n3 = this.b;
        this.a[n3] = (byte)(n2 >>> 24);
        this.a[n3 + 1] = (byte)(n2 >>> 16);
        this.a[n3 + 2] = (byte)(n2 >>> 8);
        this.a[n3 + 3] = (byte)n2;
        this.b = n3 + 4;
    }

    public void a(long l2) {
        this.d(8);
        int n2 = this.b;
        this.a[n2] = (byte)(l2 >>> 56);
        this.a[n2 + 1] = (byte)(l2 >>> 48);
        this.a[n2 + 2] = (byte)(l2 >>> 40);
        this.a[n2 + 3] = (byte)(l2 >>> 32);
        this.a[n2 + 4] = (byte)(l2 >>> 24);
        this.a[n2 + 5] = (byte)(l2 >>> 16);
        this.a[n2 + 6] = (byte)(l2 >>> 8);
        this.a[n2 + 7] = (byte)l2;
        this.b = n2 + 8;
    }

    public void a(float f2) {
        this.c(Float.floatToIntBits(f2));
    }

    public void a(double d2) {
        this.a(Double.doubleToLongBits(d2));
    }

    public void a(String string) {
        int n2 = string.length();
        int n3 = this.b;
        this.d(n2 + 2);
        byte[] arrby = this.a;
        arrby[n3++] = (byte)(n2 >>> 8);
        arrby[n3++] = (byte)n2;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            if ('\u0001' > c2 || c2 > '') {
                this.a(string, n2, i2);
                return;
            }
            arrby[n3++] = (byte)c2;
        }
        this.b = n3;
    }

    private void a(String string, int n2, int n3) {
        int n4;
        int n5 = n2;
        for (n4 = n3; n4 < n2; ++n4) {
            char c2 = string.charAt(n4);
            if (c2 > '\u07ff') {
                n5 += 2;
                continue;
            }
            if (c2 != '\u0000' && c2 <= '') continue;
            ++n5;
        }
        if (n5 > 65535) {
            throw new RuntimeException("encoded string too long: " + n2 + n5 + " bytes");
        }
        this.d(n5 + 2);
        n4 = this.b;
        byte[] arrby = this.a;
        arrby[n4] = (byte)(n5 >>> 8);
        arrby[n4 + 1] = (byte)n5;
        n4 += 2 + n3;
        for (int i2 = n3; i2 < n2; ++i2) {
            char c3 = string.charAt(i2);
            if ('\u0001' <= c3 && c3 <= '') {
                arrby[n4++] = (byte)c3;
                continue;
            }
            if (c3 > '\u07ff') {
                arrby[n4] = (byte)(224 | c3 >> 12 & 15);
                arrby[n4 + 1] = (byte)(128 | c3 >> 6 & 63);
                arrby[n4 + 2] = (byte)(128 | c3 & 63);
                n4 += 3;
                continue;
            }
            arrby[n4] = (byte)(192 | c3 >> 6 & 31);
            arrby[n4 + 1] = (byte)(128 | c3 & 63);
            n4 += 2;
        }
        this.b = n4;
    }

    public void a(int n2, int n3) {
        this.a[n2] = (byte)n3;
    }

    public void b(int n2, int n3) {
        this.a[n2] = (byte)(n3 >>> 8);
        this.a[n2 + 1] = (byte)n3;
    }

    public void c(int n2, int n3) {
        this.a[n2] = (byte)(n3 >>> 24);
        this.a[n2 + 1] = (byte)(n3 >>> 16);
        this.a[n2 + 2] = (byte)(n3 >>> 8);
        this.a[n2 + 3] = (byte)n3;
    }

    public byte[] c() {
        byte[] arrby = new byte[this.b];
        System.arraycopy(this.a, 0, arrby, 0, this.b);
        return arrby;
    }

    public void a(OutputStream outputStream) throws IOException {
        outputStream.write(this.a, 0, this.b);
    }

    public void d(int n2) {
        int n3 = this.b + n2;
        if (n3 > this.a.length) {
            int n4 = this.a.length << 1;
            byte[] arrby = new byte[n4 > n3 ? n4 : n3];
            System.arraycopy(this.a, 0, arrby, 0, this.b);
            this.a = arrby;
        }
    }
}

