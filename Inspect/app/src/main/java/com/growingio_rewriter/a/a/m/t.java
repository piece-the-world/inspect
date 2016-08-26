/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.q;
import java.util.Comparator;

final class t
extends Enum<t>
implements Comparator<int[]> {
    public static final /* enum */ t a = new t();
    private static final /* synthetic */ t[] b;

    public static t[] a() {
        return (t[])b.clone();
    }

    public static t a(String string) {
        return (t)Enum.valueOf(t.class, string);
    }

    private t() {
        super(string, n2);
    }

    public int a(int[] arrn, int[] arrn2) {
        int n2 = Math.min(arrn.length, arrn2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = q.a(arrn[i2], arrn2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrn.length - arrn2.length;
    }

    public String toString() {
        return "Ints.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((int[])object, (int[])object2);
    }

    static {
        b = new t[]{a};
    }
}

