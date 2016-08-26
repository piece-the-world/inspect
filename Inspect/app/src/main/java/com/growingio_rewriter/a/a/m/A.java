/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.B;
import com.growingio.a.a.m.C;
import com.growingio.a.a.m.D;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class A {
    public static final int a = 2;
    public static final short b = 16384;

    private A() {
    }

    public static int a(short s2) {
        return s2;
    }

    public static short a(long l2) {
        short s2 = (short)l2;
        if ((long)s2 != l2) {
            throw new IllegalArgumentException("Out of range: " + l2);
        }
        return s2;
    }

    public static short b(long l2) {
        if (l2 > 32767) {
            return 32767;
        }
        if (l2 < -32768) {
            return -32768;
        }
        return (short)l2;
    }

    public static int a(short s2, short s3) {
        return s2 - s3;
    }

    public static boolean a(short[] arrs, short s2) {
        for (short s3 : arrs) {
            if (s3 != s2) continue;
            return true;
        }
        return false;
    }

    public static int b(short[] arrs, short s2) {
        return A.c(arrs, s2, 0, arrs.length);
    }

    private static int c(short[] arrs, short s2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrs[i2] != s2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(short[] arrs, short[] arrs2) {
        aU.a(arrs, (Object)"array");
        aU.a(arrs2, (Object)"target");
        if (arrs2.length == 0) {
            return 0;
        }
        block0 : for (int i2 = 0; i2 < arrs.length - arrs2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrs2.length; ++i3) {
                if (arrs[i2 + i3] != arrs2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(short[] arrs, short s2) {
        return A.d(arrs, s2, 0, arrs.length);
    }

    private static int d(short[] arrs, short s2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrs[i2] != s2) continue;
            return i2;
        }
        return -1;
    }

    public static /* varargs */ short a(short ... arrs) {
        aU.a(arrs.length > 0);
        short s2 = arrs[0];
        for (int i2 = 1; i2 < arrs.length; ++i2) {
            if (arrs[i2] >= s2) continue;
            s2 = arrs[i2];
        }
        return s2;
    }

    public static /* varargs */ short b(short ... arrs) {
        aU.a(arrs.length > 0);
        short s2 = arrs[0];
        for (int i2 = 1; i2 < arrs.length; ++i2) {
            if (arrs[i2] <= s2) continue;
            s2 = arrs[i2];
        }
        return s2;
    }

    public static /* varargs */ short[] a(short[] ... arrs) {
        int n2 = 0;
        for (short[] arrs2 : arrs) {
            n2 += arrs2.length;
        }
        short[][] arrs3 = new short[n2];
        int n3 = 0;
        for (short[] arrs4 : arrs) {
            System.arraycopy(arrs4, 0, arrs3, n3, arrs4.length);
            n3 += arrs4.length;
        }
        return arrs3;
    }

    public static byte[] b(short s2) {
        return new byte[]{(byte)(s2 >> 8), (byte)s2};
    }

    public static short a(byte[] arrby) {
        aU.a(arrby.length >= 2, "array too small: %s < %s", arrby.length, 2);
        return A.a(arrby[0], arrby[1]);
    }

    public static short a(byte by2, byte by3) {
        return (short)(by2 << 8 | by3 & 255);
    }

    public static R<String, Short> a() {
        return D.a;
    }

    public static short[] a(short[] arrs, int n2, int n3) {
        aU.a(n2 >= 0, "Invalid minLength: %s", n2);
        aU.a(n3 >= 0, "Invalid padding: %s", n3);
        return arrs.length < n2 ? Arrays.copyOf(arrs, n2 + n3) : arrs;
    }

    public static /* varargs */ String a(String string, short ... arrs) {
        aU.a(string);
        if (arrs.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrs.length * 6);
        stringBuilder.append(arrs[0]);
        for (int i2 = 1; i2 < arrs.length; ++i2) {
            stringBuilder.append(string).append(arrs[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator<short[]> b() {
        return B.a;
    }

    public static short[] a(Collection<? extends Number> collection) {
        if (collection instanceof C) {
            return ((C)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        short[] arrs = new short[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrs[i2] = ((Number)aU.a(arrobject[i2])).shortValue();
        }
        return arrs;
    }

    public static /* varargs */ List<Short> c(short ... arrs) {
        if (arrs.length == 0) {
            return Collections.emptyList();
        }
        return new C(arrs);
    }

    static /* synthetic */ int a(short[] arrs, short s2, int n2, int n3) {
        return A.c(arrs, s2, n2, n3);
    }

    static /* synthetic */ int b(short[] arrs, short s2, int n2, int n3) {
        return A.d(arrs, s2, n2, n3);
    }
}

