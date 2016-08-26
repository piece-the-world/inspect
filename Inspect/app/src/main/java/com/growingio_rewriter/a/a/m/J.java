/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.m;

import com.growingio.a.a.m.G;
import com.growingio.a.a.m.K;
import com.growingio.a.a.m.P;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.Comparator;
import sun.misc.Unsafe;

final class J
extends Enum<J>
implements Comparator<byte[]> {
    public static final /* enum */ J a = new J();
    static final boolean b;
    static final Unsafe c;
    static final int d;
    private static final /* synthetic */ J[] e;

    public static J[] a() {
        return (J[])e.clone();
    }

    public static J a(String string) {
        return (J)Enum.valueOf(J.class, string);
    }

    private J() {
        super(string, n2);
    }

    private static Unsafe b() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException var0) {
            try {
                return (Unsafe)AccessController.doPrivileged(new K());
            }
            catch (PrivilegedActionException var0_1) {
                throw new RuntimeException("Could not initialize intrinsics", var0_1.getCause());
            }
        }
    }

    public int a(byte[] arrby, byte[] arrby2) {
        int n2;
        int n3 = Math.min(arrby.length, arrby2.length);
        int n4 = n3 / 8;
        for (n2 = 0; n2 < n4 * 8; n2 += 8) {
            long l2;
            long l3 = c.getLong((Object)arrby, (long)d + (long)n2);
            if (l3 == (l2 = c.getLong((Object)arrby2, (long)d + (long)n2))) continue;
            if (b) {
                return P.a(l3, l2);
            }
            int n5 = Long.numberOfTrailingZeros(l3 ^ l2) & -8;
            return (int)(l3 >>> n5 & 255) - (int)(l2 >>> n5 & 255);
        }
        for (n2 = n4 * 8; n2 < n3; ++n2) {
            int n6 = G.a(arrby[n2], arrby2[n2]);
            if (n6 == 0) continue;
            return n6;
        }
        return arrby.length - arrby2.length;
    }

    public String toString() {
        return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((byte[])object, (byte[])object2);
    }

    static {
        e = new J[]{a};
        b = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
        c = J.b();
        d = c.arrayBaseOffset(byte[].class);
        if (c.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
        }
    }
}

