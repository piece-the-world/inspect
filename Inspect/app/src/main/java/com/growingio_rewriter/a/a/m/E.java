/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.F;
import java.util.Comparator;

public final class E {
    public static final byte a = 64;

    private E() {
    }

    public static byte a(long l2) {
        byte by2 = (byte)l2;
        if ((long)by2 != l2) {
            throw new IllegalArgumentException("Out of range: " + l2);
        }
        return by2;
    }

    public static byte b(long l2) {
        if (l2 > 127) {
            return 127;
        }
        if (l2 < -128) {
            return -128;
        }
        return (byte)l2;
    }

    public static int a(byte by2, byte by3) {
        return by2 - by3;
    }

    public static /* varargs */ byte a(byte ... arrby) {
        aU.a(arrby.length > 0);
        byte by2 = arrby[0];
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            if (arrby[i2] >= by2) continue;
            by2 = arrby[i2];
        }
        return by2;
    }

    public static /* varargs */ byte b(byte ... arrby) {
        aU.a(arrby.length > 0);
        byte by2 = arrby[0];
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            if (arrby[i2] <= by2) continue;
            by2 = arrby[i2];
        }
        return by2;
    }

    public static /* varargs */ String a(String string, byte ... arrby) {
        aU.a(string);
        if (arrby.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrby.length * 5);
        stringBuilder.append(arrby[0]);
        for (int i2 = 1; i2 < arrby.length; ++i2) {
            stringBuilder.append(string).append(arrby[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator<byte[]> a() {
        return F.a;
    }
}

