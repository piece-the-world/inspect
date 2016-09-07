/*
 * Decompiled with CFR 0_115.
 */
package com.tendcloud.tenddata;

import com.tendcloud.tenddata.cv;

final class cw {
    private static final int b = -306674912;
    private static final int c = 1024;
    private static final int d = 1023;
    private static final int e = 65536;
    private static final int f = 65535;
    private final int g;
    private final int[] h = new int[1024];
    private final int[] i = new int[65536];
    private final int[] j;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    static final int[] a = new int[256];

    static int a(int n2) {
        int n3 = n2 - 1;
        n3 |= n3 >>> 1;
        n3 |= n3 >>> 2;
        n3 |= n3 >>> 4;
        n3 |= n3 >>> 8;
        n3 >>>= 1;
        if ((n3 |= 65535) > 16777216) {
            n3 >>>= 1;
        }
        return n3 + 1;
    }

    static int b(int n2) {
        return (66560 + cw.a(n2)) / 256 + 4;
    }

    cw(int n2) {
        this.j = new int[cw.a(n2)];
        this.g = this.j.length - 1;
    }

    void a(byte[] arrby, int n2) {
        int n3 = a[arrby[n2] & 255] ^ arrby[n2 + 1] & 255;
        this.k = n3 & 1023;
        this.l = (n3 ^= (arrby[n2 + 2] & 255) << 8) & 65535;
        this.m = (n3 ^= a[arrby[n2 + 3] & 255] << 5) & this.g;
    }

    int a() {
        return this.h[this.k];
    }

    int b() {
        return this.i[this.l];
    }

    int c() {
        return this.j[this.m];
    }

    void c(int n2) {
        this.h[this.k] = n2;
        this.i[this.l] = n2;
        this.j[this.m] = n2;
    }

    void d(int n2) {
        cv.a(this.h, n2);
        cv.a(this.i, n2);
        cv.a(this.j, n2);
    }

    static {
        for (int i2 = 0; i2 < 256; ++i2) {
            int n2 = i2;
            for (int i3 = 0; i3 < 8; ++i3) {
                if ((n2 & 1) != 0) {
                    n2 = n2 >>> 1 ^ -306674912;
                    continue;
                }
                n2 >>>= 1;
            }
            cw.a[i2] = n2;
        }
    }
}

