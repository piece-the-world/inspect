/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.b.R;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.m.i;
import com.growingio.a.a.m.n;
import com.growingio.a.a.m.o;
import com.growingio.a.a.m.p;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class m {
    public static final int a = 4;

    private m() {
    }

    public static int a(float f2) {
        return Float.valueOf(f2).hashCode();
    }

    public static int a(float f2, float f3) {
        return Float.compare(f2, f3);
    }

    public static boolean b(float f2) {
        return Float.NEGATIVE_INFINITY < f2 & f2 < Float.POSITIVE_INFINITY;
    }

    public static boolean a(float[] arrf, float f2) {
        for (float f3 : arrf) {
            if (f3 != f2) continue;
            return true;
        }
        return false;
    }

    public static int b(float[] arrf, float f2) {
        return m.c(arrf, f2, 0, arrf.length);
    }

    private static int c(float[] arrf, float f2, int n2, int n3) {
        for (int i2 = n2; i2 < n3; ++i2) {
            if (arrf[i2] != f2) continue;
            return i2;
        }
        return -1;
    }

    public static int a(float[] arrf, float[] arrf2) {
        aU.a(arrf, (Object)"array");
        aU.a(arrf2, (Object)"target");
        if (arrf2.length == 0) {
            return 0;
        }
        block0 : for (int i2 = 0; i2 < arrf.length - arrf2.length + 1; ++i2) {
            for (int i3 = 0; i3 < arrf2.length; ++i3) {
                if (arrf[i2 + i3] != arrf2[i3]) continue block0;
            }
            return i2;
        }
        return -1;
    }

    public static int c(float[] arrf, float f2) {
        return m.d(arrf, f2, 0, arrf.length);
    }

    private static int d(float[] arrf, float f2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            if (arrf[i2] != f2) continue;
            return i2;
        }
        return -1;
    }

    public static /* varargs */ float a(float ... arrf) {
        aU.a(arrf.length > 0);
        float f2 = arrf[0];
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            f2 = Math.min(f2, arrf[i2]);
        }
        return f2;
    }

    public static /* varargs */ float b(float ... arrf) {
        aU.a(arrf.length > 0);
        float f2 = arrf[0];
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            f2 = Math.max(f2, arrf[i2]);
        }
        return f2;
    }

    public static /* varargs */ float[] a(float[] ... arrf) {
        int n2 = 0;
        for (float[] arrf2 : arrf) {
            n2 += arrf2.length;
        }
        float[][] arrf3 = new float[n2];
        int n3 = 0;
        for (float[] arrf4 : arrf) {
            System.arraycopy(arrf4, 0, arrf3, n3, arrf4.length);
            n3 += arrf4.length;
        }
        return arrf3;
    }

    public static R<String, Float> a() {
        return o.a;
    }

    public static float[] a(float[] arrf, int n2, int n3) {
        aU.a(n2 >= 0, "Invalid minLength: %s", n2);
        aU.a(n3 >= 0, "Invalid padding: %s", n3);
        return arrf.length < n2 ? Arrays.copyOf(arrf, n2 + n3) : arrf;
    }

    public static /* varargs */ String a(String string, float ... arrf) {
        aU.a(string);
        if (arrf.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(arrf.length * 12);
        stringBuilder.append(arrf[0]);
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            stringBuilder.append(string).append(arrf[i2]);
        }
        return stringBuilder.toString();
    }

    public static Comparator<float[]> b() {
        return p.a;
    }

    public static float[] a(Collection<? extends Number> collection) {
        if (collection instanceof n) {
            return ((n)collection).a();
        }
        Object[] arrobject = collection.toArray();
        int n2 = arrobject.length;
        float[] arrf = new float[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrf[i2] = ((Number)aU.a(arrobject[i2])).floatValue();
        }
        return arrf;
    }

    public static /* varargs */ List<Float> c(float ... arrf) {
        if (arrf.length == 0) {
            return Collections.emptyList();
        }
        return new n(arrf);
    }

    public static Float a(String string) {
        if (i.b.matcher(string).matches()) {
            try {
                return Float.valueOf(Float.parseFloat(string));
            }
            catch (NumberFormatException var1_1) {
                // empty catch block
            }
        }
        return null;
    }

    static /* synthetic */ int a(float[] arrf, float f2, int n2, int n3) {
        return m.c(arrf, f2, n2, n3);
    }

    static /* synthetic */ int b(float[] arrf, float f2, int n2, int n3) {
        return m.d(arrf, f2, n2, n3);
    }
}

