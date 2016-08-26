/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.k.w;
import com.growingio.a.a.k.x;
import com.growingio.a.a.k.y;

public final class v {
    public static y a() {
        return v.a(2).a(1);
    }

    public static x b() {
        return v.a(4);
    }

    public static x c() {
        return v.a(100);
    }

    public static x a(int n2) {
        return new x(n2, null);
    }

    private static /* varargs */ boolean b(double ... arrd) {
        for (double d2 : arrd) {
            if (!Double.isNaN(d2)) continue;
            return true;
        }
        return false;
    }

    private static double b(double d2, double d3, double d4, double d5) {
        if (d2 == Double.NEGATIVE_INFINITY) {
            if (d3 == Double.POSITIVE_INFINITY) {
                return Double.NaN;
            }
            return Double.NEGATIVE_INFINITY;
        }
        if (d3 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        return d2 + (d3 - d2) * d4 / d5;
    }

    private static void b(int n2, int n3) {
        if (n2 < 0 || n2 > n3) {
            throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + n3);
        }
    }

    private static double[] b(long[] arrl) {
        int n2 = arrl.length;
        double[] arrd = new double[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrd[i2] = arrl[i2];
        }
        return arrd;
    }

    private static double[] b(int[] arrn) {
        int n2 = arrn.length;
        double[] arrd = new double[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrd[i2] = arrn[i2];
        }
        return arrd;
    }

    private static void b(int n2, double[] arrd, int n3, int n4) {
        if (n2 == n3) {
            int n5 = n3;
            for (int i2 = n3 + 1; i2 <= n4; ++i2) {
                if (arrd[n5] <= arrd[i2]) continue;
                n5 = i2;
            }
            if (n5 != n3) {
                v.c(arrd, n5, n3);
            }
            return;
        }
        while (n4 > n3) {
            int n6 = v.a(arrd, n3, n4);
            if (n6 >= n2) {
                n4 = n6 - 1;
            }
            if (n6 > n2) continue;
            n3 = n6 + 1;
        }
    }

    private static int a(double[] arrd, int n2, int n3) {
        v.b(arrd, n2, n3);
        double d2 = arrd[n2];
        int n4 = n3;
        for (int i2 = n3; i2 > n2; --i2) {
            if (arrd[i2] <= d2) continue;
            v.c(arrd, n4, i2);
            --n4;
        }
        v.c(arrd, n2, n4);
        return n4;
    }

    private static void b(double[] arrd, int n2, int n3) {
        boolean bl2;
        int n4 = n2 + n3 >>> 1;
        boolean bl3 = arrd[n3] < arrd[n4];
        boolean bl4 = arrd[n4] < arrd[n2];
        boolean bl5 = bl2 = arrd[n3] < arrd[n2];
        if (bl3 == bl4) {
            v.c(arrd, n4, n2);
        } else if (bl3 != bl2) {
            v.c(arrd, n2, n3);
        }
    }

    private static void b(int[] arrn, int n2, int n3, double[] arrd, int n4, int n5) {
        int n6;
        int n7;
        int n8 = v.a(arrn, n2, n3, n4, n5);
        int n9 = arrn[n8];
        v.b(n9, arrd, n4, n5);
        for (n6 = n8 - 1; n6 >= n2 && arrn[n6] == n9; --n6) {
        }
        if (n6 >= n2) {
            v.b(arrn, n2, n6, arrd, n4, n9 - 1);
        }
        for (n7 = n8 + 1; n7 <= n3 && arrn[n7] == n9; ++n7) {
        }
        if (n7 <= n3) {
            v.b(arrn, n7, n3, arrd, n9 + 1, n5);
        }
    }

    private static int a(int[] arrn, int n2, int n3, int n4, int n5) {
        if (n2 == n3) {
            return n2;
        }
        int n6 = n4 + n5 >>> 1;
        int n7 = n2;
        int n8 = n3;
        while (n8 > n7 + 1) {
            int n9 = n7 + n8 >>> 1;
            if (arrn[n9] > n6) {
                n8 = n9;
                continue;
            }
            if (arrn[n9] < n6) {
                n7 = n9;
                continue;
            }
            return n9;
        }
        if (n4 + n5 - arrn[n7] - arrn[n8] > 0) {
            return n8;
        }
        return n7;
    }

    private static void c(double[] arrd, int n2, int n3) {
        double d2 = arrd[n2];
        arrd[n2] = arrd[n3];
        arrd[n3] = d2;
    }

    static /* synthetic */ void a(int n2, int n3) {
        v.b(n2, n3);
    }

    static /* synthetic */ double[] a(long[] arrl) {
        return v.b(arrl);
    }

    static /* synthetic */ double[] a(int[] arrn) {
        return v.b(arrn);
    }

    static /* synthetic */ boolean a(double[] arrd) {
        return v.b(arrd);
    }

    static /* synthetic */ void a(int n2, double[] arrd, int n3, int n4) {
        v.b(n2, arrd, n3, n4);
    }

    static /* synthetic */ double a(double d2, double d3, double d4, double d5) {
        return v.b(d2, d3, d4, d5);
    }

    static /* synthetic */ void a(int[] arrn, int n2, int n3, double[] arrd, int n4, int n5) {
        v.b(arrn, n2, n3, arrd, n4, n5);
    }
}

