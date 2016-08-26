/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.b;

import java.lang.reflect.Modifier;

public class ad {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 32;
    public static final int g = 64;
    public static final int h = 128;
    public static final int i = 128;
    public static final int j = 256;
    public static final int k = 512;
    public static final int l = 1024;
    public static final int m = 2048;
    public static final int n = 8192;
    public static final int o = 16384;

    public static boolean a(int n2) {
        return (n2 & 1) != 0;
    }

    public static boolean b(int n2) {
        return (n2 & 2) != 0;
    }

    public static boolean c(int n2) {
        return (n2 & 4) != 0;
    }

    public static boolean d(int n2) {
        return (n2 & 7) == 0;
    }

    public static boolean e(int n2) {
        return (n2 & 8) != 0;
    }

    public static boolean f(int n2) {
        return (n2 & 16) != 0;
    }

    public static boolean g(int n2) {
        return (n2 & 32) != 0;
    }

    public static boolean h(int n2) {
        return (n2 & 64) != 0;
    }

    public static boolean i(int n2) {
        return (n2 & 128) != 0;
    }

    public static boolean j(int n2) {
        return (n2 & 256) != 0;
    }

    public static boolean k(int n2) {
        return (n2 & 512) != 0;
    }

    public static boolean l(int n2) {
        return (n2 & 8192) != 0;
    }

    public static boolean m(int n2) {
        return (n2 & 16384) != 0;
    }

    public static boolean n(int n2) {
        return (n2 & 1024) != 0;
    }

    public static boolean o(int n2) {
        return (n2 & 2048) != 0;
    }

    public static int p(int n2) {
        return n2 & -7 | 1;
    }

    public static int q(int n2) {
        return n2 & -4 | 4;
    }

    public static int r(int n2) {
        return n2 & -6 | 2;
    }

    public static int s(int n2) {
        return n2 & -8;
    }

    public static int a(int n2, int n3) {
        return n2 & ~ n3;
    }

    public static String t(int n2) {
        return Modifier.toString(n2);
    }
}

