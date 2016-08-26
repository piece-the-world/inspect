/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.j;
import com.growingio.a.a.m.k;
import com.growingio.a.a.m.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class i {
    public static final int a = 8;
    static final Pattern b = i.c();

    private i() {
    }

    public static int a(double d2) {
        return Double.valueOf(d2).hashCode();
    }

    public static int a(double d2, double d3) {
        return Double.compare(d2, d3);
    }

    public static boolean b(double d2) {
        return Double.NEGATIVE_INFINITY < d2 & d2 < Double.POSITIVE_INFINITY;
    }

    public static boolean a(double[] arrd, double d2) {
        for (double d3 : arrd) {
            if (d3 != d2) continue;
            return true;
        }
        return false;
    }

    public static int b(double[] arrd, double d2) {
        return i.c(arrd, d2, 0, arrd.length);
    }

    private static int c(double[] arrd, double d2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrd[i2] != d2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(double[] arrd, double[] arrd2) {
        aU.a(arrd, (Object)"array");
        aU.a(arrd2, (Object)"target");
        if (arrd2.length == 0) {
            return 0;
        }
        block0 : for (int i2 = 0; i2 < arrd.length - arrd2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrd2.length; ++i3) {
                if (arrd[i2 + i3] != arrd2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(double[] arrd, double d2) {
        return i.d(arrd, d2, 0, arrd.length);
    }

    private static int d(double[] arrd, double d2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrd[i2] != d2) continue;
            return i2;
        }
        return -1;
    }

    public static /* varargs */ double a(double ... arrd) {
        aU.a(arrd.length > 0);
        double d2 = arrd[0];
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            d2 = Math.min(d2, arrd[i2]);
        }
        return d2;
    }

    public static /* varargs */ double b(double ... arrd) {
        aU.a(arrd.length > 0);
        double d2 = arrd[0];
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            d2 = Math.max(d2, arrd[i2]);
        }
        return d2;
    }

    public static /* varargs */ double[] a(double[] ... arrd) {
        int n2 = 0;
        for (double[] arrd2 : arrd) {
            n2 += arrd2.length;
        }
        double[][] arrd3 = new double[n2];
        int n3 = 0;
        for (double[] arrd4 : arrd) {
            System.arraycopy(arrd4, 0, arrd3, n3, arrd4.length);
            n3 += arrd4.length;
        }
        return arrd3;
    }

    public static R<String, Double> a() {
        return k.a;
    }

    public static double[] a(double[] arrd, int n2, int n3) {
        aU.a(n2 >= 0, "Invalid minLength: %s", n2);
        aU.a(n3 >= 0, "Invalid padding: %s", n3);
        return arrd.length < n2 ? Arrays.copyOf(arrd, n2 + n3) : arrd;
    }

    public static /* varargs */ String a(String string, double ... arrd) {
        aU.a(string);
        if (arrd.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrd.length * 12);
        stringBuilder.append(arrd[0]);
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            stringBuilder.append(string).append(arrd[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator<double[]> b() {
        return l.a;
    }

    public static double[] a(Collection<? extends Number> collection) {
        if (collection instanceof j) {
            return ((j)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        double[] arrd = new double[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrd[i2] = ((Number)aU.a(arrobject[i2])).doubleValue();
        }
        return arrd;
    }

    public static /* varargs */ List<Double> c(double ... arrd) {
        if (arrd.length == 0) {
            return Collections.emptyList();
        }
        return new j(arrd);
    }

    private static Pattern c() {
        String string = "(?:\\d++(?:\\.\\d*+)?|\\.\\d++)";
        String string2 = string + "(?:[eE][+-]?\\d++)?[fFdD]?";
        String string3 = "(?:\\p{XDigit}++(?:\\.\\p{XDigit}*+)?|\\.\\p{XDigit}++)";
        String string4 = "0[xX]" + string3 + "[pP][+-]?\\d++[fFdD]?";
        String string5 = "[+-]?(?:NaN|Infinity|" + string2 + "|" + string4 + ")";
        return Pattern.compile(string5);
    }

    public static Double a(String string) {
        if (b.matcher(string).matches()) {
            try {
                return Double.parseDouble(string);
            }
            catch (NumberFormatException var1_1) {
                // empty catch block
            }
        }
        return null;
    }

    static /* synthetic */ int a(double[] arrd, double d2, int n2, int n3) {
        return i.c(arrd, d2, n2, n3);
    }

    static /* synthetic */ int b(double[] arrd, double d2, int n2, int n3) {
        return i.d(arrd, d2, n2, n3);
    }
}

