/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.u;
import java.util.Comparator;

final class v
extends Enum<v>
implements Comparator<long[]> {
    public static final /* enum */ v a = new v();
    private static final /* synthetic */ v[] b;

    public static v[] a() {
        return (v[])b.clone();
    }

    public static v a(String string) {
        return (v)Enum.valueOf(v.class, string);
    }

    private v() {
        super(string, n2);
    }

    public int a(long[] arrl, long[] arrl2) {
        int n2 = Math.min(arrl.length, arrl2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = u.a(arrl[i2], arrl2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrl.length - arrl2.length;
    }

    public String toString() {
        return "Longs.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((long[])object, (long[])object2);
    }

    static {
        b = new v[]{a};
    }
}

