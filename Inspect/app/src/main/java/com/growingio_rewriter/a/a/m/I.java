/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.G;
import java.util.Comparator;

final class I
extends Enum<I>
implements Comparator<byte[]> {
    public static final /* enum */ I a = new I();
    private static final /* synthetic */ I[] b;

    public static I[] a() {
        return (I[])b.clone();
    }

    public static I a(String string) {
        return (I)Enum.valueOf(I.class, string);
    }

    private I() {
        super(string, n2);
    }

    public int a(byte[] arrby, byte[] arrby2) {
        int n2 = Math.min(arrby.length, arrby2.length);
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = G.a(arrby[i2], arrby2[i2]);
            if (n3 == 0) continue;
            return n3;
        }
        return arrby.length - arrby2.length;
    }

    public String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byte[])object, (byte[])object2);
    }

    static {
        b = new I[]{a};
    }
}

