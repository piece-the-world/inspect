/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.A;
import java.util.Comparator;

final class B
extends Enum<B>
implements Comparator<short[]> {
    public static final /* enum */ B a = new B();
    private static final /* synthetic */ B[] b;

    public static B[] a() {
        return (B[])b.clone();
    }

    public static B a(String string) {
        return (B)Enum.valueOf(B.class, string);
    }

    private B() {
        super(string, n2);
    }

    public int a(short[] arrs, short[] arrs2) {
        int n2 = Math.min(arrs.length, arrs2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = A.a(arrs[i2], arrs2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrs.length - arrs2.length;
    }

    public String toString() {
        return "Shorts.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((short[])object, (short[])object2);
    }

    static {
        b = new B[]{a};
    }
}

