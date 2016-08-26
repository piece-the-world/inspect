/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.a;
import java.util.Comparator;

final class c
extends Enum<c>
implements Comparator<boolean[]> {
    public static final /* enum */ c a = new c();
    private static final /* synthetic */ c[] b;

    public static c[] a() {
        return (c[])b.clone();
    }

    public static c a(String string) {
        return (c)Enum.valueOf(c.class, string);
    }

    private c() {
        super(string, n2);
    }

    public int a(boolean[] arrbl, boolean[] arrbl2) {
        int n2 = Math.min(arrbl.length, arrbl2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = a.a(arrbl[i2], arrbl2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrbl.length - arrbl2.length;
    }

    public String toString() {
        return "Booleans.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((boolean[])object, (boolean[])object2);
    }

    static {
        b = new c[]{a};
    }
}

