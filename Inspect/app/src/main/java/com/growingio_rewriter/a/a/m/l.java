/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import java.util.Comparator;

final class l
extends Enum<l>
implements Comparator<double[]> {
    public static final /* enum */ l a = new l();
    private static final /* synthetic */ l[] b;

    public static l[] a() {
        return (l[])b.clone();
    }

    public static l a(String string) {
        return (l)Enum.valueOf(l.class, string);
    }

    private l() {
        super(string, n2);
    }

    public int a(double[] arrd, double[] arrd2) {
        int n2 = Math.min(arrd.length, arrd2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = Double.compare(arrd[i2], arrd2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrd.length - arrd2.length;
    }

    public String toString() {
        return "Doubles.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((double[])object, (double[])object2);
    }

    static {
        b = new l[]{a};
    }
}

