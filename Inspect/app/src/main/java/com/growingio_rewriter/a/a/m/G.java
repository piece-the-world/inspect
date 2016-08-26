/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.H;
import com.growingio.a.a.m.I;
import java.util.Comparator;

public final class G {
    public static final byte a = -128;
    public static final byte b = -1;
    private static final int c = 255;

    private G() {
    }

    public static int a(byte by2) {
        return by2 & 255;
    }

    public static byte a(long l2) {
        if (l2 >> 8 != 0) {
            throw new IllegalArgumentException("Out of range: " + l2);
        }
        return (byte)l2;
    }

    public static byte b(long l2) {
        if (l2 > (long)G.a(-1)) {
            return -1;
        }
        if (l2 < 0) {
            return 0;
        }
        return (byte)l2;
    }

    public static int a(byte by2, byte by3) {
        return G.a(by2) - G.a(by3);
    }

    public static /* varargs */ byte a(byte ... arrby) {
        aU.a(arrby.length > 0);
        int n2 = G.a(arrby[0]);
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            int n3 = G.a(arrby[i2]);
            if (n3 >= n2) continue;
            n2 = n3;
        }
        return (byte)n2;
    }

    public static /* varargs */ byte b(byte ... arrby) {
        aU.a(arrby.length > 0);
        int n2 = G.a(arrby[0]);
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            int n3 = G.a(arrby[i2]);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return (byte)n2;
    }

    public static String b(byte by2) {
        return G.a(by2, 10);
    }

    public static String a(byte by2, int n2) {
        aU.a(n2 >= 2 && n2 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", n2);
        return Integer.toString(G.a(by2), n2);
    }

    public static byte a(String string) {
        return G.a(string, 10);
    }

    public static byte a(String string, int n2) {
        int n3 = Integer.parseInt(aU.a(string), n2);
        if (n3 >> 8 == 0) {
            return (byte)n3;
        }
        throw new NumberFormatException("out of range: " + n3);
    }

    public static /* varargs */ String a(String string, byte ... arrby) {
        aU.a(string);
        if (arrby.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrby.length * (3 + string.length()));
        stringBuilder.append(G.a(arrby[0]));
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            stringBuilder.append(string).append(G.b(arrby[i2]));
        }
        return stringBuilder.toString();
    }

    public static Comparator<byte[]> a() {
        return H.b;
    }

    static Comparator<byte[]> b() {
        return I.a;
    }
}

