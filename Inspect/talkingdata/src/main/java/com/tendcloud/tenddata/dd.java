/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import java.io.OutputStream;
import java.util.Arrays;

public final class dd {
    static final int a = 8;
    static final int b = -16777216;
    static final int c = 11;
    static final int d = 2048;
    static final short e = 1024;
    static final int f = 5;
    private static final int h = 4;
    private static final int i = 4;
    private static final int[] j = new int[128];
    private long k;
    private int l;
    private int m;
    private byte n;
    private final byte[] o;
    private int p;

    public dd(int n2) {
        this.o = new byte[n2];
        this.a();
    }

    public static final void initProbs(short[] arrs) {
        Arrays.fill(arrs, 1024);
    }

    public void a() {
        this.k = 0;
        this.l = -1;
        this.n = 0;
        this.m = 1;
        this.p = 0;
    }

    public int b() {
        return this.p + this.m + 5 - 1;
    }

    public int c() {
        for (int i2 = 0; i2 < 5; ++i2) {
            this.d();
        }
        return this.p;
    }

    public void write(OutputStream outputStream) {
        outputStream.write(this.o, 0, this.p);
    }

    private void d() {
        int n2 = (int)(this.k >>> 32);
        if (n2 != 0 || this.k < 0xFF000000L) {
            int n3 = this.n;
            do {
                this.o[this.p++] = (byte)(n3 + n2);
                n3 = 255;
            } while (--this.m != 0);
            this.n = (byte)(this.k >>> 24);
        }
        ++this.m;
        this.k = (this.k & 0xFFFFFF) << 8;
    }

    public void a(short[] arrs, int n2, int n3) {
        short s2 = arrs[n2];
        int n4 = (this.l >>> 11) * s2;
        if (n3 == 0) {
            this.l = n4;
            arrs[n2] = (short)(s2 + (2048 - s2 >>> 5));
        } else {
            this.k += (long)n4 & 0xFFFFFFFFL;
            this.l -= n4;
            arrs[n2] = (short)(s2 - (s2 >>> 5));
        }
        if ((this.l & -16777216) == 0) {
            this.l <<= 8;
            this.d();
        }
    }

    public static int a(int n2, int n3) {
        assert (n3 == 0 || n3 == 1);
        return j[(n2 ^ - n3 & 2047) >>> 4];
    }

    public void a(short[] arrs, int n2) {
        int n3 = 1;
        int n4 = arrs.length;
        do {
            int n5 = n2 & (n4 >>>= 1);
            this.a(arrs, n3, n5);
            n3 <<= 1;
            if (n5 == 0) continue;
            n3 |= 1;
        } while (n4 != 1);
    }

    public static int b(short[] arrs, int n2) {
        int n3 = 0;
        n2 |= arrs.length;
        do {
            int n4 = n2 & 1;
            n3 += dd.a(arrs[n2 >>>= 1], n4);
        } while (n2 != 1);
        return n3;
    }

    public void c(short[] arrs, int n2) {
        int n3 = 1;
        n2 |= arrs.length;
        do {
            int n4 = n2 & 1;
            this.a(arrs, n3, n4);
            n3 = n3 << 1 | n4;
        } while ((n2 >>>= 1) != 1);
    }

    public static int d(short[] arrs, int n2) {
        int n3 = 0;
        int n4 = 1;
        n2 |= arrs.length;
        do {
            int n5 = n2 & 1;
            n3 += dd.a(arrs[n4], n5);
            n4 = n4 << 1 | n5;
        } while ((n2 >>>= 1) != 1);
        return n3;
    }

    public void b(int n2, int n3) {
        do {
            this.l >>>= 1;
            this.k += (long)(this.l & 0 - (n2 >>> --n3 & 1));
            if ((this.l & -16777216) != 0) continue;
            this.l <<= 8;
            this.d();
        } while (n3 != 0);
    }

    public static int a(int n2) {
        return n2 << 4;
    }

    static {
        for (int i2 = 8; i2 < 2048; i2 += 16) {
            int n2 = i2;
            int n3 = 0;
            for (int i3 = 0; i3 < 4; ++i3) {
                n2 *= n2;
                n3 <<= 1;
                while ((n2 & -65536) != 0) {
                    n2 >>>= 1;
                    ++n3;
                }
            }
            dd.j[i2 >> 4] = 161 - n3;
        }
    }
}

