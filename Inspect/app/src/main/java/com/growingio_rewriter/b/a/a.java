/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b.a;

public class a {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 32;
    public static final int g = 64;
    public static final int h = 64;
    public static final int i = 128;
    public static final int j = 128;
    public static final int k = 256;
    public static final int l = 512;
    public static final int m = 1024;
    public static final int n = 2048;
    public static final int o = 4096;
    public static final int p = 8192;
    public static final int q = 16384;
    public static final int r = 32768;
    public static final int s = 32;

    public static int a(int n2) {
        return n2 & -7 | 1;
    }

    public static int b(int n2) {
        return n2 & -4 | 4;
    }

    public static int c(int n2) {
        return n2 & -6 | 2;
    }

    public static int d(int n2) {
        return n2 & -8;
    }

    public static boolean e(int n2) {
        return (n2 & 1) != 0;
    }

    public static boolean f(int n2) {
        return (n2 & 4) != 0;
    }

    public static boolean g(int n2) {
        return (n2 & 2) != 0;
    }

    public static boolean h(int n2) {
        return (n2 & 7) == 0;
    }

    public static int a(int n2, int n3) {
        return n2 & ~ n3;
    }

    public static int i(int n2) {
        return n2;
    }

    public static int j(int n2) {
        return n2;
    }
}

