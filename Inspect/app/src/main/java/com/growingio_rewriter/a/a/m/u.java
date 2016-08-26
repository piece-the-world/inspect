/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.v;
import com.growingio.a.a.m.w;
import com.growingio.a.a.m.x;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class u {
    public static final int a = 8;
    public static final long b = 0x4000000000000000L;
    private static final byte[] c = u.c();

    private u() {
    }

    public static int a(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    public static int a(long l2, long l3) {
        return l2 < l3 ? -1 : (l2 > l3 ? 1 : 0);
    }

    public static boolean a(long[] arrl, long l2) {
        for (long l3 : arrl) {
            if (l3 != l2) continue;
            return true;
        }
        return false;
    }

    public static int b(long[] arrl, long l2) {
        return u.c(arrl, l2, 0, arrl.length);
    }

    private static int c(long[] arrl, long l2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrl[i2] != l2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(long[] arrl, long[] arrl2) {
        aU.a(arrl, (Object)"array");
        aU.a(arrl2, (Object)"target");
        if (arrl2.length == 0) {
            return 0;
        }
        block0 : for (int i2 = 0; i2 < arrl.length - arrl2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrl2.length; ++i3) {
                if (arrl[i2 + i3] != arrl2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(long[] arrl, long l2) {
        return u.d(arrl, l2, 0, arrl.length);
    }

    private static int d(long[] arrl, long l2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrl[i2] != l2) continue;
            return i2;
        }
        return -1;
    }

    public static /* varargs */ long a(long ... arrl) {
        aU.a(arrl.length > 0);
        long l2 = arrl[0];
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            if (arrl[i2] >= l2) continue;
            l2 = arrl[i2];
        }
        return l2;
    }

    public static /* varargs */ long b(long ... arrl) {
        aU.a(arrl.length > 0);
        long l2 = arrl[0];
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            if (arrl[i2] <= l2) continue;
            l2 = arrl[i2];
        }
        return l2;
    }

    public static /* varargs */ long[] a(long[] ... arrl) {
        int n2 = 0;
        for (long[] arrl2 : arrl) {
            n2 += arrl2.length;
        }
        long[][] arrl3 = new long[n2];
        int n3 = 0;
        for (long[] arrl4 : arrl) {
            System.arraycopy(arrl4, 0, arrl3, n3, arrl4.length);
            n3 += arrl4.length;
        }
        return arrl3;
    }

    public static byte[] b(long l2) {
        byte[] arrby = new byte[8];
        for (int i2 = 7; i2 >= 0; --i2) {
            arrby[i2] = (byte)(l2 & 255);
            l2 >>= 8;
        }
        return arrby;
    }

    public static long a(byte[] arrby) {
        aU.a(arrby.length >= 8, "array too small: %s < %s", arrby.length, 8);
        return u.a(arrby[0], arrby[1], arrby[2], arrby[3], arrby[4], arrby[5], arrby[6], arrby[7]);
    }

    public static long a(byte by2, byte by3, byte by4, byte by5, byte by6, byte by7, byte by8, byte by9) {
        return ((long)by2 & 255) << 56 | ((long)by3 & 255) << 48 | ((long)by4 & 255) << 40 | ((long)by5 & 255) << 32 | ((long)by6 & 255) << 24 | ((long)by7 & 255) << 16 | ((long)by8 & 255) << 8 | (long)by9 & 255;
    }

    private static byte[] c() {
        int n2;
        byte[] arrby = new byte[128];
        Arrays.fill(arrby, -1);
        for (n2 = 0; n2 <= 9; ++n2) {
            arrby[48 + n2] = (byte)n2;
        }
        for (n2 = 0; n2 <= 26; ++n2) {
            arrby[65 + n2] = (byte)(10 + n2);
            arrby[97 + n2] = (byte)(10 + n2);
        }
        return arrby;
    }

    private static int a(char c2) {
        return c2 < '' ? c[c2] : -1;
    }

    public static Long a(String string) {
        return u.a(string, 10);
    }

    public static Long a(String string, int n2) {
        int n3;
        int n4;
        if (aU.a(string).isEmpty()) {
            return null;
        }
        if (n2 < 2 || n2 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + n2);
        }
        boolean bl2 = string.charAt(0) == '-';
        int n5 = n4 = bl2 ? 1 : 0;
        if (n4 == string.length()) {
            return null;
        }
        if ((n3 = u.a(string.charAt(n4++))) < 0 || n3 >= n2) {
            return null;
        }
        long l2 = - n3;
        long l3 = Long.MIN_VALUE / (long)n2;
        while (n4 < string.length()) {
            if ((n3 = u.a(string.charAt(n4++))) < 0 || n3 >= n2 || l2 < l3) {
                return null;
            }
            if ((l2 *= (long)n2) < Long.MIN_VALUE + (long)n3) {
                return null;
            }
            l2 -= (long)n3;
        }
        if (bl2) {
            return l2;
        }
        if (l2 == Long.MIN_VALUE) {
            return null;
        }
        return - l2;
    }

    public static R<String, Long> a() {
        return x.a;
    }

    public static long[] a(long[] arrl, int n2, int n3) {
        aU.a(n2 >= 0, "Invalid minLength: %s", n2);
        aU.a(n3 >= 0, "Invalid padding: %s", n3);
        return arrl.length < n2 ? Arrays.copyOf(arrl, n2 + n3) : arrl;
    }

    public static /* varargs */ String a(String string, long ... arrl) {
        aU.a(string);
        if (arrl.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrl.length * 10);
        stringBuilder.append(arrl[0]);
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            stringBuilder.append(string).append(arrl[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator<long[]> b() {
        return v.a;
    }

    public static long[] a(Collection<? extends Number> collection) {
        if (collection instanceof w) {
            return ((w)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        long[] arrl = new long[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrl[i2] = ((Number)aU.a(arrobject[i2])).longValue();
        }
        return arrl;
    }

    public static /* varargs */ List<Long> c(long ... arrl) {
        if (arrl.length == 0) {
            return Collections.emptyList();
        }
        return new w(arrl);
    }

    static /* synthetic */ int a(long[] arrl, long l2, int n2, int n3) {
        return u.c(arrl, l2, n2, n3);
    }

    static /* synthetic */ int b(long[] arrl, long l2, int n2, int n3) {
        return u.d(arrl, l2, n2, n3);
    }
}

