/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.n;
import com.growingio.a.a.k.s;
import com.growingio.a.a.m.q;
import java.math.RoundingMode;

public final class f {
    static final int a = 1073741824;
    static final int b = -1257966797;
    static final byte[] c = new byte[]{9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    static final int[] d = new int[]{1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    static final int[] e = new int[]{3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    static final int f = 46340;
    private static final int[] h = new int[]{1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    static int[] g = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int a(int n2) {
        s.a("x", n2);
        if (n2 > 1073741824) {
            throw new ArithmeticException("ceilingPowerOfTwo(" + n2 + ") not representable as an int");
        }
        return 1 << - Integer.numberOfLeadingZeros(n2 - 1);
    }

    public static int b(int n2) {
        s.a("x", n2);
        return Integer.highestOneBit(n2);
    }

    public static boolean c(int n2) {
        return n2 > 0 & (n2 & n2 - 1) == 0;
    }

    static int a(int n2, int n3) {
        return ~ (~ (n2 - n3)) >>> 31;
    }

    public static int a(int n2, RoundingMode roundingMode) {
        s.a("x", n2);
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(f.c(n2));
            }
            case DOWN: 
            case FLOOR: {
                return 31 - Integer.numberOfLeadingZeros(n2);
            }
            case UP: 
            case CEILING: {
                return 32 - Integer.numberOfLeadingZeros(n2 - 1);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                int n3 = Integer.numberOfLeadingZeros(n2);
                int n4 = -1257966797 >>> n3;
                int n5 = 31 - n3;
                return n5 + f.a(n4, n2);
            }
        }
        throw new AssertionError();
    }

    public static int b(int n2, RoundingMode roundingMode) {
        s.a("x", n2);
        int n3 = f.f(n2);
        int n4 = d[n3];
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(n2 == n4);
            }
            case DOWN: 
            case FLOOR: {
                return n3;
            }
            case UP: 
            case CEILING: {
                return n3 + f.a(n4, n2);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                return n3 + f.a(e[n3], n2);
            }
        }
        throw new AssertionError();
    }

    private static int f(int n2) {
        byte by2 = c[Integer.numberOfLeadingZeros(n2)];
        return by2 - f.a(n2, d[by2]);
    }

    public static int b(int n2, int n3) {
        s.b("exponent", n3);
        switch (n2) {
            case 0: {
                return n3 == 0 ? 1 : 0;
            }
            case 1: {
                return 1;
            }
            case -1: {
                return (n3 & 1) == 0 ? 1 : -1;
            }
            case 2: {
                return n3 < 32 ? 1 << n3 : 0;
            }
            case -2: {
                if (n3 < 32) {
                    return (n3 & 1) == 0 ? 1 << n3 : - (1 << n3);
                }
                return 0;
            }
        }
        int n4 = 1;
        do {
            switch (n3) {
                case 0: {
                    return n4;
                }
                case 1: {
                    return n2 * n4;
                }
            }
            n4 *= (n3 & 1) == 0 ? 1 : n2;
            n2 *= n2;
            n3 >>= 1;
        } while (true);
    }

    public static int c(int n2, RoundingMode roundingMode) {
        s.b("x", n2);
        int n3 = f.g(n2);
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(n3 * n3 == n2);
            }
            case DOWN: 
            case FLOOR: {
                return n3;
            }
            case UP: 
            case CEILING: {
                return n3 + f.a(n3 * n3, n2);
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                int n4 = n3 * n3 + n3;
                return n3 + f.a(n4, n2);
            }
        }
        throw new AssertionError();
    }

    private static int g(int n2) {
        return (int)Math.sqrt(n2);
    }

    public static int a(int n2, int n3, RoundingMode roundingMode) {
        boolean bl2;
        aU.a(roundingMode);
        if (n3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int n4 = n2 / n3;
        int n5 = n2 - n3 * n4;
        if (n5 == 0) {
            return n4;
        }
        int n6 = 1 | (n2 ^ n3) >> 31;
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(n5 == 0);
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
                bl2 = n6 > 0;
                break;
            }
            case FLOOR: {
                bl2 = n6 < 0;
                break;
            }
            case HALF_DOWN: 
            case HALF_UP: 
            case HALF_EVEN: {
                int n7 = Math.abs(n5);
                int n8 = n7 - (Math.abs(n3) - n7);
                if (n8 == 0) {
                    bl2 = roundingMode == RoundingMode.HALF_UP || roundingMode == RoundingMode.HALF_EVEN & (n4 & 1) != 0;
                    break;
                }
                bl2 = n8 > 0;
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
        return bl2 ? n4 + n6 : n4;
    }

    public static int c(int n2, int n3) {
        if (n3 <= 0) {
            throw new ArithmeticException("Modulus " + n3 + " must be > 0");
        }
        int n4 = n2 % n3;
        return n4 >= 0 ? n4 : n4 + n3;
    }

    public static int d(int n2, int n3) {
        s.b("a", n2);
        s.b("b", n3);
        if (n2 == 0) {
            return n3;
        }
        if (n3 == 0) {
            return n2;
        }
        int n4 = Integer.numberOfTrailingZeros(n2);
        n2 >>= n4;
        int n5 = Integer.numberOfTrailingZeros(n3);
        n3 >>= n5;
        while (n2 != n3) {
            int n6 = n2 - n3;
            int n7 = n6 & n6 >> 31;
            n2 = n6 - n7 - n7;
            n3 += n7;
            n2 >>= Integer.numberOfTrailingZeros(n2);
        }
        return n2 << Math.min(n4, n5);
    }

    public static int e(int n2, int n3) {
        long l2 = (long)n2 + (long)n3;
        s.c(l2 == (long)((int)l2));
        return (int)l2;
    }

    public static int f(int n2, int n3) {
        long l2 = (long)n2 - (long)n3;
        s.c(l2 == (long)((int)l2));
        return (int)l2;
    }

    public static int g(int n2, int n3) {
        long l2 = (long)n2 * (long)n3;
        s.c(l2 == (long)((int)l2));
        return (int)l2;
    }

    public static int h(int n2, int n3) {
        s.b("exponent", n3);
        switch (n2) {
            case 0: {
                return n3 == 0 ? 1 : 0;
            }
            case 1: {
                return 1;
            }
            case -1: {
                return (n3 & 1) == 0 ? 1 : -1;
            }
            case 2: {
                s.c(n3 < 31);
                return 1 << n3;
            }
            case -2: {
                s.c(n3 < 32);
                return (n3 & 1) == 0 ? 1 << n3 : -1 << n3;
            }
        }
        int n4 = 1;
        do {
            switch (n3) {
                case 0: {
                    return n4;
                }
                case 1: {
                    return f.g(n4, n2);
                }
            }
            if ((n3 & 1) != 0) {
                n4 = f.g(n4, n2);
            }
            if ((n3 >>= 1) <= 0) continue;
            s.c(-46340 <= n2 & n2 <= 46340);
            n2 *= n2;
        } while (true);
    }

    public static int i(int n2, int n3) {
        return q.b((long)n2 + (long)n3);
    }

    public static int j(int n2, int n3) {
        return q.b((long)n2 - (long)n3);
    }

    public static int k(int n2, int n3) {
        return q.b((long)n2 * (long)n3);
    }

    public static int l(int n2, int n3) {
        s.b("exponent", n3);
        switch (n2) {
            case 0: {
                return n3 == 0 ? 1 : 0;
            }
            case 1: {
                return 1;
            }
            case -1: {
                return (n3 & 1) == 0 ? 1 : -1;
            }
            case 2: {
                if (n3 >= 31) {
                    return Integer.MAX_VALUE;
                }
                return 1 << n3;
            }
            case -2: {
                if (n3 >= 32) {
                    return Integer.MAX_VALUE + (n3 & 1);
                }
                return (n3 & 1) == 0 ? 1 << n3 : -1 << n3;
            }
        }
        int n4 = 1;
        int n5 = Integer.MAX_VALUE + (n2 >>> 31 & (n3 & 1));
        do {
            switch (n3) {
                case 0: {
                    return n4;
                }
                case 1: {
                    return f.k(n4, n2);
                }
            }
            if ((n3 & 1) != 0) {
                n4 = f.k(n4, n2);
            }
            if ((n3 >>= 1) <= 0) continue;
            if (-46340 > n2 | n2 > 46340) {
                return n5;
            }
            n2 *= n2;
        } while (true);
    }

    public static int d(int n2) {
        s.b("n", n2);
        return n2 < h.length ? h[n2] : Integer.MAX_VALUE;
    }

    public static int m(int n2, int n3) {
        s.b("n", n2);
        s.b("k", n3);
        aU.a(n3 <= n2, "k (%s) > n (%s)", n3, n2);
        if (n3 > n2 >> 1) {
            n3 = n2 - n3;
        }
        if (n3 >= g.length || n2 > g[n3]) {
            return Integer.MAX_VALUE;
        }
        switch (n3) {
            case 0: {
                return 1;
            }
            case 1: {
                return n2;
            }
        }
        long l2 = 1;
        for (int i2 = 0; i2 < n3; ++i2) {
            l2 *= (long)(n2 - i2);
            l2 /= (long)(i2 + 1);
        }
        return (int)l2;
    }

    public static int n(int n2, int n3) {
        return (n2 & n3) + ((n2 ^ n3) >> 1);
    }

    public static boolean e(int n2) {
        return n.f(n2);
    }

    private f() {
    }
}

