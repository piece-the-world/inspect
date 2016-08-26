/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import java.util.Comparator;

final class p
extends Enum<p>
implements Comparator<float[]> {
    public static final /* enum */ p a = new p();
    private static final /* synthetic */ p[] b;

    public static p[] a() {
        return (p[])b.clone();
    }

    public static p a(String string) {
        return (p)Enum.valueOf(p.class, string);
    }

    private p() {
        super(string, n2);
    }

    public int a(float[] arrf, float[] arrf2) {
        int n2 = Math.min(arrf.length, arrf2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = Float.compare(arrf[i2], arrf2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrf.length - arrf2.length;
    }

    public String toString() {
        return "Floats.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((float[])object, (float[])object2);
    }

    static {
        b = new p[]{a};
    }
}

