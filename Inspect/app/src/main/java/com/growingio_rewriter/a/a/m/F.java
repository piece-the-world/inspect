/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.E;
import java.util.Comparator;

final class F
extends Enum<F>
implements Comparator<byte[]> {
    public static final /* enum */ F a = new F();
    private static final /* synthetic */ F[] b;

    public static F[] a() {
        return (F[])b.clone();
    }

    public static F a(String string) {
        return (F)Enum.valueOf(F.class, string);
    }

    private F() {
        super(string, n2);
    }

    public int a(byte[] arrby, byte[] arrby2) {
        int n2 = Math.min(arrby.length, arrby2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = E.a(arrby[i2], arrby2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrby.length - arrby2.length;
    }

    public String toString() {
        return "SignedBytes.lexicographicalComparator()";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byte[])object, (byte[])object2);
    }

    static {
        b = new F[]{a};
    }
}

