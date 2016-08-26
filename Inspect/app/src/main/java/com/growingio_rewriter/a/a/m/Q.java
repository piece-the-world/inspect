/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.P;
import java.util.Comparator;

final class Q
extends Enum<Q>
implements Comparator<long[]> {
    public static final /* enum */ Q a = new Q();
    private static final /* synthetic */ Q[] b;

    public static Q[] a() {
        return (Q[])b.clone();
    }

    public static Q a(String string) {
        return (Q)Enum.valueOf(Q.class, string);
    }

    private Q() {
        super(string, n2);
    }

    public int a(long[] arrl, long[] arrl2) {
        int n2 = Math.min(arrl.length, arrl2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            if (arrl[i2] == arrl2[i2]) continue;
            return P.a(arrl[i2], arrl2[i2]);
        }
        return arrl.length - arrl2.length;
    }

    public String toString() {
        return "UnsignedLongs.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((long[])object, (long[])object2);
    }

    static {
        b = new Q[]{a};
    }
}

