/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.k.e;
import com.growingio.a.a.k.n;
import com.growingio.a.a.k.s;
import com.growingio.a.a.m.a;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

public final class c {
    private static final double c = -2.147483648E9;
    private static final double d = 2.147483647E9;
    private static final double e = -9.223372036854776E18;
    private static final double f = 9.223372036854776E18;
    private static final double g = Math.log(2.0);
    static final int a = 170;
    static final double[] b = new double[]{1.0, 2.0922789888E13, 2.631308369336935E35, 1.2413915592536073E61, 1.2688693218588417E89, 7.156945704626381E118, 9.916779348709496E149, 1.974506857221074E182, 3.856204823625804E215, 5.5502938327393044E249, 4.7147236359920616E284};

    static double a(double d2, RoundingMode roundingMode) {
        if (!e.c(d2)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(c.c(d2));
                return d2;
            }
            case FLOOR: {
                if (d2 >= 0.0 || c.c(d2)) {
                    return d2;
                }
                return d2 - 1.0;
            }
            case CEILING: {
                if (d2 <= 0.0 || c.c(d2)) {
                    return d2;
                }
                return d2 + 1.0;
            }
            case DOWN: {
                return d2;
            }
            case UP: {
                if (c.c(d2)) {
                    return d2;
                }
                return d2 + Math.copySign(1.0, d2);
            }
            case HALF_EVEN: {
                return Math.rint(d2);
            }
            case HALF_UP: {
                double d3 = Math.rint(d2);
                if (Math.abs(d2 - d3) == 0.5) {
                    return d2 + Math.copySign(0.5, d2);
                }
                return d3;
            }
            case HALF_DOWN: {
                double d4 = Math.rint(d2);
                if (Math.abs(d2 - d4) == 0.5) {
                    return d2;
                }
                return d4;
            }
        }
        throw new AssertionError();
    }

    public static int b(double d2, RoundingMode roundingMode) {
        double d3 = c.a(d2, roundingMode);
        s.b(d3 > -2.147483649E9 & d3 < 2.147483648E9);
        return (int)d3;
    }

    public static long c(double d2, RoundingMode roundingMode) {
        double d3 = c.a(d2, roundingMode);
        s.b(-9.223372036854776E18 - d3 < 1.0 & d3 < 9.223372036854776E18);
        return (long)d3;
    }

    public static BigInteger d(double d2, RoundingMode roundingMode) {
        if (-9.223372036854776E18 - (d2 = c.a(d2, roundingMode)) < 1.0 & d2 < 9.223372036854776E18) {
            return BigInteger.valueOf((long)d2);
        }
        int n2 = Math.getExponent(d2);
        long l2 = e.b(d2);
        BigInteger bigInteger = BigInteger.valueOf(l2).shiftLeft(n2 - 52);
        return d2 < 0.0 ? bigInteger.negate() : bigInteger;
    }

    public static boolean a(double d2) {
        return d2 > 0.0 && e.c(d2) && n.c(e.b(d2));
    }

    public static double b(double d2) {
        return Math.log(d2) / g;
    }

    public static int e(double d2, RoundingMode roundingMode) {
        boolean bl2;
        aU.a(d2 > 0.0 && e.c(d2), (Object)"x must be positive and finite");
        int n2 = Math.getExponent(d2);
        if (!e.d(d2)) {
            return c.e(d2 * 4.503599627370496E15, roundingMode) - 52;
        }
        switch (roundingMode) {
            case UNNECESSARY: {
                s.a(c.a(d2));
            }
            case FLOOR: {
                bl2 = false;
                break;
            }
            case CEILING: {
                bl2 = !c.a(d2);
                break;
            }
            case DOWN: {
                bl2 = n2 < 0 & !c.a(d2);
                break;
            }
            case UP: {
                bl2 = n2 >= 0 & !c.a(d2);
                break;
            }
            case HALF_EVEN: 
            case HALF_UP: 
            case HALF_DOWN: {
                double d3 = e.e(d2);
                bl2 = d3 * d3 > 2.0;
                break;
            }
            default: {
                throw new AssertionError();
            }
        }
        return bl2 ? n2 + 1 : n2;
    }

    public static boolean c(double d2) {
        return e.c(d2) && (d2 == 0.0 || 52 - Long.numberOfTrailingZeros(e.b(d2)) <= Math.getExponent(d2));
    }

    public static double a(int n2) {
        s.b("n", n2);
        if (n2 > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d2 = 1.0;
        for (int i2 = 1 + (n2 & -16); i2 <= n2; ++i2) {
            d2 *= (double)i2;
        }
        return d2 * b[n2 >> 4];
    }

    public static boolean a(double d2, double d3, double d4) {
        s.a("tolerance", d4);
        return Math.copySign(d2 - d3, 1.0) <= d4 || d2 == d3 || Double.isNaN(d2) && Double.isNaN(d3);
    }

    public static int b(double d2, double d3, double d4) {
        if (c.a(d2, d3, d4)) {
            return 0;
        }
        if (d2 < d3) {
            return -1;
        }
        if (d2 > d3) {
            return 1;
        }
        return a.a(Double.isNaN(d2), Double.isNaN(d3));
    }

    public static /* varargs */ double a(double ... arrd) {
        aU.a(arrd.length > 0, (Object)"Cannot take mean of 0 values");
        long l2 = 1;
        double d2 = c.d(arrd[0]);
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            c.d(arrd[i2]);
            d2 += (arrd[i2] - d2) / (double)(++l2);
        }
        return d2;
    }

    public static /* varargs */ double a(int ... arrn) {
        aU.a(arrn.length > 0, (Object)"Cannot take mean of 0 values");
        long l2 = 0;
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            l2 += (long)arrn[i2];
        }
        return (double)l2 / (double)arrn.length;
    }

    public static /* varargs */ double a(long ... arrl) {
        aU.a(arrl.length > 0, (Object)"Cannot take mean of 0 values");
        long l2 = 1;
        double d2 = arrl[0];
        for (int i2 = 1; i2 < arrl.length; ++i2) {
            d2 += ((double)arrl[i2] - d2) / (double)(++l2);
        }
        return d2;
    }

    public static double a(Iterable<? extends Number> iterable) {
        return c.a(iterable.iterator());
    }

    public static double a(Iterator<? extends Number> iterator) {
        aU.a(iterator.hasNext(), (Object)"Cannot take mean of 0 values");
        long l2 = 1;
        double d2 = c.d(iterator.next().doubleValue());
        while (iterator.hasNext()) {
            double d3 = c.d(iterator.next().doubleValue());
            d2 += (d3 - d2) / (double)(++l2);
        }
        return d2;
    }

    private static double d(double d2) {
        aU.a(e.c(d2));
        return d2;
    }

    private c() {
    }
}

