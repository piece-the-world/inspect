/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.M;
import java.util.Comparator;

final class N
extends Enum<N>
implements Comparator<int[]> {
    public static final /* enum */ N a = new N();
    private static final /* synthetic */ N[] b;

    public static N[] a() {
        return (N[])b.clone();
    }

    public static N a(String string) {
        return (N)Enum.valueOf(N.class, string);
    }

    private N() {
        super(string, n2);
    }

    public int a(int[] arrn, int[] arrn2) {
        int n2 = Math.min(arrn.length, arrn2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrn[i2] == arrn2[i2]) continue;
            return M.a(arrn[i2], arrn2[i2]);
        }
        return arrn.length - arrn2.length;
    }

    public String toString() {
        return "UnsignedInts.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((int[])object, (int[])object2);
    }

    static {
        b = new N[]{a};
    }
}

