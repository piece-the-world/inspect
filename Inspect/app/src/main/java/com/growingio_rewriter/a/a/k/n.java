/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.f;
import com.growingio.a.a.k.p;
import com.growingio.a.a.k.s;
import java.math.RoundingMode;

public final class n {
    static final long a = 0x4000000000000000L;
    static final long b = -5402926248376769404L;
    static final byte[] c = new byte[]{19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};
    static final long[] d = new long[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    static final long[] e = new long[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};
    static final long f = 3037000499L;
    static final long[] g = new long[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};
    static final int[] h = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};
    static final int[] i = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};
    private static final int j = -545925251;
    private static final long[][] k = new long[][]{{291830, 126401071349994536L}, {885594168, 725270293939359937L, 3569819667048198375L}, {273919523040L, 15, 7363882082L, 992620450144556L}, {47636622961200L, 2, 2570940, 211991001, 3749873356L}, {7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, {585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, {Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long a(long l2) {
        s.a("x", l2);
        if (l2 > 0x4000000000000000L) {
            throw new ArithmeticException("ceilingPowerOfTwo(" + l2 + ") is not representable as a long");
        }
        return 1 << - Long.numberOfLeadingZeros(l2 - 1);
    }

    public static long b(long l2) {
        s.a("x", l2);
        return 1 << 63 - Long.numberOfLeadingZeros(l2);
    }

    public static boolean c(long l2) {
        return l2 > 0 & (l2 & l2 - 1) == 0;
    }

    static int a(long l2, long l3) {
        return (int)((l2 - l3 ^ -1 ^ -1) >>> 63);
    }

    public static int a(long l2, RoundingMode roundingMode) {
        s.a("x", l2);
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(n.c(l2));
            }
            case DOWN: 
            case FLOOR: {
                return 63 - Long.numberOfLeadingZeros(l2);
            }
            case UP: 
            case CEILING: {
                return 64 - Long.numberOfLeadingZeros(l2 - 1);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                int n2 = Long.numberOfLeadingZeros(l2);
                long l3 = -5402926248376769404L >>> n2;
                int n3 = 63 - n2;
                return n3 + n.a(l3, l2);
            }
        }
        throw new AssertionError((Object)"impossible");
    }

    public static int b(long l2, RoundingMode roundingMode) {
        s.a("x", l2);
        int n2 = n.d(l2);
        long l3 = d[n2];
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(l2 == l3);
            }
            case DOWN: 
            case FLOOR: {
                return n2;
            }
            case UP: 
            case CEILING: {
                return n2 + n.a(l3, l2);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                return n2 + n.a(e[n2], l2);
            }
        }
        throw new AssertionError();
    }

    static int d(long l2) {
        byte by2 = c[Long.numberOfLeadingZeros(l2)];
        return by2 - n.a(l2, d[by2]);
    }

    public static long a(long l2, int n2) {
        s.b("exponent", n2);
        if (-2 <= l2 && l2 <= 2) {
            switch ((int)l2) {
                case 0: {
                    return n2 == 0 ? 1 : 0;
                }
                case 1: {
                    return 1;
                }
                case -1: {
                    return (n2 & 1) == 0 ? 1 : -1;
                }
                case 2: {
                    return n2 < 64 ? 1 << n2 : 0;
                }
                case -2: {
                    if (n2 < 64) {
                        return (n2 & 1) == 0 ? 1 << n2 : - (1 << n2);
                    }
                    return 0;
                }
            }
            throw new AssertionError();
        }
        long l3 = 1;
        do {
            switch (n2) {
                case 0: {
                    return l3;
                }
                case 1: {
                    return l3 * l2;
                }
            }
            l3 *= (n2 & 1) == 0 ? 1 : l2;
            l2 *= l2;
            n2 >>= 1;
        } while (true);
    }

    public static long c(long l2, RoundingMode roundingMode) {
        s.b("x", l2);
        if (n.e(l2)) {
            return f.c((int)l2, roundingMode);
        }
        long l3 = (long)Math.sqrt(l2);
        long l4 = l3 * l3;
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(l4 == l2);
                return l3;
            }
            case DOWN: 
            case FLOOR: {
                if (l2 < l4) {
                    return l3 - 1;
                }
                return l3;
            }
            case UP: 
            case CEILING: {
                if (l2 > l4) {
                    return l3 + 1;
                }
                return l3;
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                long l5 = l3 - (long)(l2 < l4) ? 1 : 0;
                long l6 = l5 * l5 + l5;
                return l5 + (long)n.a(l6, l2);
            }
        }
        throw new AssertionError();
    }

    public static long a(long l2, long l3, RoundingMode roundingMode) {
        boolean bl2;
        aU.a(roundingMode);
        long l4 = l2 / l3;
        long l5 = l2 - l3 * l4;
        if (l5 == 0) {
            return l4;
        }
        int n2 = 1 | (int)((l2 ^ l3) >> 63);
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(l5 == 0);
            }
            case DOWN: {
                bl2 = false;
                break;
            }
            case UP: {
                bl2 = true;
                break;
            }
            case CEILING: {
                bl2 = n2 > 0;
                break;
            }
            case FLOOR: {
                bl2 = n2 < 0;
                break;
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                long l6 = Math.abs(l5);
                long l7 = l6 - (Math.abs(l3) - l6);
                if (l7 == 0) {
                    bl2 = roundingMode == RoundingMode.HALF_UP | roundingMode == RoundingMode.HALF_EVEN & (l4 & 1) != 0;
                    break;
                }
                bl2 = l7 > 0;
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
        return bl2 ? l4 + (long)n2 : l4;
    }

    public static int b(long l2, int n2) {
        return (int)n.b(l2, (long)n2);
    }

    public static long b(long l2, long l3) {
        if (l3 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long l4 = l2 % l3;
        return l4 >= 0 ? l4 : l4 + l3;
    }

    public static long c(long l2, long l3) {
        s.b("a", l2);
        s.b("b", l3);
        if (l2 == 0) {
            return l3;
        }
        if (l3 == 0) {
            return l2;
        }
        int n2 = Long.numberOfTrailingZeros(l2);
        l2 >>= n2;
        int n3 = Long.numberOfTrailingZeros(l3);
        l3 >>= n3;
        while (l2 != l3) {
            long l4 = l2 - l3;
            long l5 = l4 & l4 >> 63;
            l2 = l4 - l5 - l5;
            l3 += l5;
            l2 >>= Long.numberOfTrailingZeros(l2);
        }
        return l2 << Math.min(n2, n3);
    }

    public static long d(long l2, long l3) {
        long l4 = l2 + l3;
        s.c((l2 ^ l3) < 0 | (l2 ^ l4) >= 0);
        return l4;
    }

    public static long e(long l2, long l3) {
        long l4 = l2 - l3;
        s.c((l2 ^ l3) >= 0 | (l2 ^ l4) >= 0);
        return l4;
    }

    public static long f(long l2, long l3) {
        int n2 = Long.numberOfLeadingZeros(l2) + Long.numberOfLeadingZeros(l2 ^ -1) + Long.numberOfLeadingZeros(l3) + Long.numberOfLeadingZeros(l3 ^ -1);
        if (n2 > 65) {
            return l2 * l3;
        }
        s.c(n2 >= 64);
        s.c(l2 >= 0 | l3 != Long.MIN_VALUE);
        long l4 = l2 * l3;
        s.c(l2 == 0 || l4 / l2 == l3);
        return l4;
    }

    public static long c(long l2, int n2) {
        s.b("exponent", n2);
        if (l2 >= -2 & l2 <= 2) {
            switch ((int)l2) {
                case 0: {
                    return n2 == 0 ? 1 : 0;
                }
                case 1: {
                    return 1;
                }
                case -1: {
                    return (n2 & 1) == 0 ? 1 : -1;
                }
                case 2: {
                    s.c(n2 < 63);
                    return 1 << n2;
                }
                case -2: {
                    s.c(n2 < 64);
                    return (n2 & 1) == 0 ? 1 << n2 : -1 << n2;
                }
            }
            throw new AssertionError();
        }
        long l3 = 1;
        do {
            switch (n2) {
                case 0: {
                    return l3;
                }
                case 1: {
                    return n.f(l3, l2);
                }
            }
            if ((n2 & 1) != 0) {
                l3 = n.f(l3, l2);
            }
            if ((n2 >>= 1) <= 0) continue;
            s.c(-3037000499L <= l2 && l2 <= 3037000499L);
            l2 *= l2;
        } while (true);
    }

    public static long g(long l2, long l3) {
        long l4;
        if ((l2 ^ l3) < 0 | (l2 ^ (l4 = l2 + l3)) >= 0) {
            return l4;
        }
        return Long.MAX_VALUE + (l4 >>> 63 ^ 1);
    }

    public static long h(long l2, long l3) {
        long l4;
        if ((l2 ^ l3) >= 0 | (l2 ^ (l4 = l2 - l3)) >= 0) {
            return l4;
        }
        return Long.MAX_VALUE + (l4 >>> 63 ^ 1);
    }

    public static long i(long l2, long l3) {
        int n2 = Long.numberOfLeadingZeros(l2) + Long.numberOfLeadingZeros(l2 ^ -1) + Long.numberOfLeadingZeros(l3) + Long.numberOfLeadingZeros(l3 ^ -1);
        if (n2 > 65) {
            return l2 * l3;
        }
        long l4 = Long.MAX_VALUE + ((l2 ^ l3) >>> 63);
        if (n2 < 64 | l2 < 0 & l3 == Long.MIN_VALUE) {
            return l4;
        }
        long l5 = l2 * l3;
        if (l2 == 0 || l5 / l2 == l3) {
            return l5;
        }
        return l4;
    }

    public static long d(long l2, int n2) {
        s.b("exponent", n2);
        if (l2 >= -2 & l2 <= 2) {
            switch ((int)l2) {
                case 0: {
                    return n2 == 0 ? 1 : 0;
                }
                case 1: {
                    return 1;
                }
                case -1: {
                    return (n2 & 1) == 0 ? 1 : -1;
                }
                case 2: {
                    if (n2 >= 63) {
                        return Long.MAX_VALUE;
                    }
                    return 1 << n2;
                }
                case -2: {
                    if (n2 >= 64) {
                        return Long.MAX_VALUE + (long)(n2 & 1);
                    }
                    return (n2 & 1) == 0 ? 1 << n2 : -1 << n2;
                }
            }
            throw new AssertionError();
        }
        long l3 = 1;
        long l4 = Long.MAX_VALUE + (l2 >>> 63 & (long)(n2 & 1));
        do {
            switch (n2) {
                case 0: {
                    return l3;
                }
                case 1: {
                    return n.i(l3, l2);
                }
            }
            if ((n2 & 1) != 0) {
                l3 = n.i(l3, l2);
            }
            if ((n2 >>= 1) <= 0) continue;
            if (-3037000499L > l2 | l2 > 3037000499L) {
                return l4;
            }
            l2 *= l2;
        } while (true);
    }

    public static long a(int n2) {
        s.b("n", n2);
        return n2 < g.length ? g[n2] : Long.MAX_VALUE;
    }

    public static long a(int n2, int n3) {
        s.b("n", n2);
        s.b("k", n3);
        aU.a(n3 <= n2, "k (%s) > n (%s)", n3, n2);
        if (n3 > n2 >> 1) {
            n3 = n2 - n3;
        }
        switch (n3) {
            case 0: {
                return 1;
            }
            case 1: {
                return n2;
            }
        }
        if (n2 < g.length) {
            return g[n2] / (g[n3] * g[n2 - n3]);
        }
        if (n3 >= h.length || n2 > h[n3]) {
            return Long.MAX_VALUE;
        }
        if (n3 < i.length && n2 <= i[n3]) {
            long l2 = n2--;
            for (int i2 = 2; i2 <= n3; ++i2) {
                l2 *= (long)n2;
                l2 /= (long)i2;
                --n2;
            }
            return l2;
        }
        int n4 = n.a((long)n2, RoundingMode.CEILING);
        long l3 = 1;
        long l4 = n2--;
        long l5 = 1;
        int n5 = n4;
        int n6 = 2;
        while (n6 <= n3) {
            if (n5 + n4 < 63) {
                l4 *= (long)n2;
                l5 *= (long)n6;
                n5 += n4;
            } else {
                l3 = n.a(l3, l4, l5);
                l4 = n2;
                l5 = n6;
                n5 = n4;
            }
            ++n6;
            --n2;
        }
        return n.a(l3, l4, l5);
    }

    static long a(long l2, long l3, long l4) {
        if (l2 == 1) {
            return l3 / l4;
        }
        long l5 = n.c(l2, l4);
        return (l2 /= l5) * (l3 / (l4 /= l5));
    }

    static boolean e(long l2) {
        return (long)((int)l2) == l2;
    }

    public static long j(long l2, long l3) {
        return (l2 & l3) + ((l2 ^ l3) >> 1);
    }

    public static boolean f(long l2) {
        if (l2 < 2) {
            s.b("n", l2);
            return false;
        }
        if (l2 == 2 || l2 == 3 || l2 == 5 || l2 == 7 || l2 == 11 || l2 == 13) {
            return true;
        }
        if ((-545925251 & 1 << (int)(l2 % 30)) != 0) {
            return false;
        }
        if (l2 % 7 == 0 || l2 % 11 == 0 || l2 % 13 == 0) {
            return false;
        }
        if (l2 < 289) {
            return true;
        }
        for (long[] arrl : k) {
            if (l2 > arrl[0]) continue;
            for (int i2 = 1; i2 < arrl.length; ++i2) {
                if (p.a(arrl[i2], l2)) continue;
                return false;
            }
            return true;
        }
        throw new AssertionError();
    }

    private n() {
    }
}

