/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.r;
import com.growingio.a.a.m.s;
import com.growingio.a.a.m.t;
import com.growingio.a.a.m.u;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class q {
    public static final int a = 4;
    public static final int b = 1073741824;

    private q() {
    }

    public static int a(int n2) {
        return n2;
    }

    public static int a(long l2) {
        int n2 = (int)l2;
        if ((long)n2 != l2) {
            throw new IllegalArgumentException("Out of range: " + l2);
        }
        return n2;
    }

    public static int b(long l2) {
        if (l2 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l2 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)l2;
    }

    public static int a(int n2, int n3) {
        return n2 < n3 ? -1 : (n2 > n3 ? 1 : 0);
    }

    public static boolean a(int[] arrn, int n2) {
        for (int n3 : arrn) {
            if (n3 != n2) continue;
            return true;
        }
        return false;
    }

    public static int b(int[] arrn, int n2) {
        return q.c(arrn, n2, 0, arrn.length);
    }

    private static int c(int[] arrn, int n2, int n3, int n4) {
        for (int i2 = n3; i2 < n4; ++i2) {
            if (arrn[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(int[] arrn, int[] arrn2) {
        aU.a(arrn, (Object)"array");
        aU.a(arrn2, (Object)"target");
        if (arrn2.length == 0) {
            return 0;
        }
        block0 : for (int i2 = 0; i2 < arrn.length - arrn2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrn2.length; ++i3) {
                if (arrn[i2 + i3] != arrn2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(int[] arrn, int n2) {
        return q.d(arrn, n2, 0, arrn.length);
    }

    private static int d(int[] arrn, int n2, int n3, int n4) {
        for (int i2 = n4 - 1; i2 >= n3; --i2) {
            if (arrn[i2] != n2) continue;
            return i2;
        }
        return -1;
    }

    public static /* varargs */ int a(int ... arrn) {
        aU.a(arrn.length > 0);
        int n2 = arrn[0];
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            if (arrn[i2] >= n2) continue;
            n2 = arrn[i2];
        }
        return n2;
    }

    public static /* varargs */ int b(int ... arrn) {
        aU.a(arrn.length > 0);
        int n2 = arrn[0];
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            if (arrn[i2] <= n2) continue;
            n2 = arrn[i2];
        }
        return n2;
    }

    public static /* varargs */ int[] a(int[] ... arrn) {
        int n2 = 0;
        for (int[] arrn2 : arrn) {
            n2 += arrn2.length;
        }
        int[][] arrn3 = new int[n2];
        int n3 = 0;
        for (int[] arrn4 : arrn) {
            System.arraycopy(arrn4, 0, arrn3, n3, arrn4.length);
            n3 += arrn4.length;
        }
        return arrn3;
    }

    public static byte[] b(int n2) {
        return new byte[]{(byte)(n2 >> 24), (byte)(n2 >> 16), (byte)(n2 >> 8), (byte)n2};
    }

    public static int a(byte[] arrby) {
        aU.a(arrby.length >= 4, "array too small: %s < %s", arrby.length, 4);
        return q.a(arrby[0], arrby[1], arrby[2], arrby[3]);
    }

    public static int a(byte by2, byte by3, byte by4, byte by5) {
        return by2 << 24 | (by3 & 255) << 16 | (by4 & 255) << 8 | by5 & 255;
    }

    public static R<String, Integer> a() {
        return s.a;
    }

    public static int[] a(int[] arrn, int n2, int n3) {
        aU.a(n2 >= 0, "Invalid minLength: %s", n2);
        aU.a(n3 >= 0, "Invalid padding: %s", n3);
        return arrn.length < n2 ? Arrays.copyOf(arrn, n2 + n3) : arrn;
    }

    public static /* varargs */ String a(String string, int ... arrn) {
        aU.a(string);
        if (arrn.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrn.length * 5);
        stringBuilder.append(arrn[0]);
        for (int i2 = 1; i2 < arrn.length; ++i2) {
            stringBuilder.append(string).append(arrn[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator<int[]> b() {
        return t.a;
    }

    public static int[] a(Collection<? extends Number> collection) {
        if (collection instanceof r) {
            return ((r)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        int[] arrn = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrn[i2] = ((Number)aU.a(arrobject[i2])).intValue();
        }
        return arrn;
    }

    public static /* varargs */ List<Integer> c(int ... arrn) {
        if (arrn.length == 0) {
            return Collections.emptyList();
        }
        return new r(arrn);
    }

    public static Integer a(String string) {
        return q.a(string, 10);
    }

    public static Integer a(String string, int n2) {
        Long l2 = u.a(string, n2);
        if (l2 == null || l2 != (long)l2.intValue()) {
            return null;
        }
        return l2.intValue();
    }

    static /* synthetic */ int a(int[] arrn, int n2, int n3, int n4) {
        return q.c(arrn, n2, n3, n4);
    }

    static /* synthetic */ int b(int[] arrn, int n2, int n3, int n4) {
        return q.d(arrn, n2, n3, n4);
    }
}

