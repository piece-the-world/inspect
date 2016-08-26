/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.d.a;

public class w {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 16;
    public static final int d = 17;
    public static final int e = 18;
    public static final int f = 19;
    public static final int g = 20;
    public static final int h = 21;
    public static final int i = 22;
    public static final int j = 23;
    public static final int k = 64;
    public static final int l = 65;
    public static final int m = 66;
    public static final int n = 67;
    public static final int o = 68;
    public static final int p = 69;
    public static final int q = 70;
    public static final int r = 71;
    public static final int s = 72;
    public static final int t = 73;
    public static final int u = 74;
    public static final int v = 75;
    private int w;

    public w(int n2) {
        this.w = n2;
    }

    public static w a(int n2) {
        return new w(n2 << 24);
    }

    public static w a(int n2, int n3) {
        return new w(n2 << 24 | n3 << 16);
    }

    public static w a(int n2, int n3, int n4) {
        return new w(n2 << 24 | n3 << 16 | n4 << 8);
    }

    public static w b(int n2) {
        return new w(268435456 | (n2 &= 65535) << 8);
    }

    public static w c(int n2) {
        return new w(369098752 | n2 << 16);
    }

    public static w d(int n2) {
        return new w(385875968 | n2 << 8);
    }

    public static w e(int n2) {
        return new w(1107296256 | n2 << 8);
    }

    public static w b(int n2, int n3) {
        return new w(n2 << 24 | n3);
    }

    public int a() {
        return this.w >>> 24;
    }

    public int b() {
        return (this.w & 16711680) >> 16;
    }

    public int c() {
        return (this.w & 65280) >> 8;
    }

    public int d() {
        return (short)((this.w & 16776960) >> 8);
    }

    public int e() {
        return (this.w & 16711680) >> 16;
    }

    public int f() {
        return (this.w & 16776960) >> 8;
    }

    public int g() {
        return (this.w & 16776960) >> 8;
    }

    public int h() {
        return this.w & 255;
    }

    public int i() {
        return this.w;
    }
}

