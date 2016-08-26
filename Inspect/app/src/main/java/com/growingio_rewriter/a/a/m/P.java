/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.Q;
import com.growingio.a.a.m.u;
import com.growingio.a.a.m.y;
import java.math.BigInteger;
import java.util.Comparator;

public final class P {
    public static final long a = -1;
    private static final long[] b = new long[37];
    private static final int[] c = new int[37];
    private static final int[] d = new int[37];

    private P() {
    }

    private static long b(long l2) {
        return l2 ^ Long.MIN_VALUE;
    }

    public static int a(long l2, long l3) {
        return u.a(P.b(l2), P.b(l3));
    }

    public static /* varargs */ long a(long ... arrl) {
        aU.a(arrl.length > 0);
        long l2 = P.b(arrl[0]);
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            long l3 = P.b(arrl[i2]);
            if (l3 >= l2) continue;
            l2 = l3;
        }
        return P.b(l2);
    }

    public static /* varargs */ long b(long ... arrl) {
        aU.a(arrl.length > 0);
        long l2 = P.b(arrl[0]);
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            long l3 = P.b(arrl[i2]);
            if (l3 <= l2) continue;
            l2 = l3;
        }
        return P.b(l2);
    }

    public static /* varargs */ String a(String string, long ... arrl) {
        aU.a(string);
        if (arrl.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrl.length * 5);
        stringBuilder.append(P.a(arrl[0]));
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            stringBuilder.append(string).append(P.a(arrl[i2]));
        }
        return stringBuilder.toString();
    }

    public static Comparator<long[]> a() {
        return Q.a;
    }

    public static long b(long l2, long l3) {
        long l4;
        if (l3 < 0) {
            if (P.a(l2, l3) < 0) {
                return 0;
            }
            return 1;
        }
        if (l2 >= 0) {
            return l2 / l3;
        }
        long l5 = l2 - (l4 = (l2 >>> 1) / l3 << 1) * l3;
        return l4 + (long)(P.a(l5, l3) >= 0) ? 1 : 0;
    }

    public static long c(long l2, long l3) {
        long l4;
        if (l3 < 0) {
            if (P.a(l2, l3) < 0) {
                return l2;
            }
            return l2 - l3;
        }
        if (l2 >= 0) {
            return l2 % l3;
        }
        long l5 = (l2 >>> 1) / l3 << 1;
        return l4 - (P.a(l4 = l2 - l5 * l3, l3) >= 0 ? l3 : 0);
    }

    public static long a(String string) {
        return P.a(string, 10);
    }

    public static long b(String string) {
        y y2 = y.a(string);
        try {
            return P.a(y2.a, y2.b);
        }
        catch (NumberFormatException var2_2) {
            NumberFormatException numberFormatException = new NumberFormatException("Error parsing value: " + string);
            numberFormatException.initCause(var2_2);
            throw numberFormatException;
        }
    }

    public static long a(String string, int n2) {
        aU.a(string);
        if (string.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        if (n2 < 2 || n2 > 36) {
            throw new NumberFormatException("illegal radix: " + n2);
        }
        int n3 = d[n2] - 1;
        long l2 = 0;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n4 = Character.digit(string.charAt(i2), n2);
            if (n4 == -1) {
                throw new NumberFormatException(string);
            }
            if (i2 > n3 && P.a(l2, n4, n2)) {
                throw new NumberFormatException("Too large for unsigned long: " + string);
            }
            l2 = l2 * (long)n2 + (long)n4;
        }
        return l2;
    }

    private static boolean a(long l2, int n2, int n3) {
        if (l2 >= 0) {
            if (l2 < b[n3]) {
                return false;
            }
            if (l2 > b[n3]) {
                return true;
            }
            return n2 > c[n3];
        }
        return true;
    }

    public static String a(long l2) {
        return P.a(l2, 10);
    }

    public static String a(long l2, int n2) {
        aU.a(n2 >= 2 && n2 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", n2);
        if (l2 == 0) {
            return "0";
        }
        char[] arrc = new char[64];
        int n3 = arrc.length;
        if (l2 < 0) {
            long l3 = P.b(l2, (long)n2);
            long l4 = l2 - l3 * (long)n2;
            arrc[--n3] = Character.forDigit((int)l4, n2);
            l2 = l3;
        }
        while (l2 > 0) {
            arrc[--n3] = Character.forDigit((int)(l2 % (long)n2), n2);
            l2 /= (long)n2;
        }
        return new String(arrc, n3, arrc.length - n3);
    }

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i2 = 2; i2 <= 36; ++i2) {
            P.b[i2] = P.b(-1, (long)i2);
            P.c[i2] = (int)P.c(-1, i2);
            P.d[i2] = bigInteger.toString(i2).length() - 1;
        }
    }
}

