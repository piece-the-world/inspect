/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.android.sdk.snappy;

import com.growingio.android.sdk.snappy.d;
import java.nio.ByteOrder;

final class h {
    private static final d b;
    static final boolean a;

    private h() {
    }

    static boolean a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        h.a(n2, n2 + n4, arrby.length);
        h.a(n3, n3 + n4, arrby2.length);
        for (int i2 = 0; i2 < n4; ++i2) {
            if (arrby[n2 + i2] == arrby2[n3 + i2]) continue;
            return false;
        }
        return true;
    }

    static int a(byte[] arrby, int n2) {
        return b.loadInt(arrby, n2);
    }

    static void a(byte[] arrby, int n2, byte[] arrby2, int n3) {
        b.copyLong(arrby, n2, arrby2, n3);
    }

    static long b(byte[] arrby, int n2) {
        return b.loadLong(arrby, n2);
    }

    static /* varargs */ Object a(Object object, String string, Object ... arrobject) {
        if (object == null) {
            throw new NullPointerException(String.format(string, arrobject));
        }
        return object;
    }

    static void a(int n2, int n3, int n4) {
        if (n2 < 0 || n3 < n2 || n3 > n4) {
            throw new IndexOutOfBoundsException(h.b(n2, n3, n4));
        }
    }

    static String b(int n2, int n3, int n4) {
        if (n2 < 0 || n2 > n4) {
            return h.a(n2, n4, "start index");
        }
        if (n3 < 0 || n3 > n4) {
            return h.a(n3, n4, "end index");
        }
        return String.format("end index (%s) must not be less than start index (%s)", n3, n2);
    }

    static String a(int n2, int n3, String string) {
        if (n2 < 0) {
            return String.format("%s (%s) must not be negative", string, n2);
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("negative size: " + n3);
        }
        return String.format("%s (%s) must not be greater than size (%s)", string, n2, n3);
    }

    static {
        d d2;
        block8 : {
            d d3;
            Class class_;
            d2 = null;
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                try {
                    class_ = h.class.getClassLoader().loadClass("com.growingio.android.sdk.snappy.UnsafeMemory").asSubclass(d.class);
                    d3 = (d)class_.newInstance();
                    if (d3.loadInt(new byte[4], 0) == 0) {
                        d2 = d3;
                    }
                }
                catch (Throwable var1_2) {
                    // empty catch block
                }
            }
            if (d2 == null) {
                try {
                    class_ = h.class.getClassLoader().loadClass("com.growingio.android.sdk.snappy.SlowMemory").asSubclass(d.class);
                    d3 = (d)class_.newInstance();
                    if (d3.loadInt(new byte[4], 0) == 0) {
                        d2 = d3;
                        break block8;
                    }
                    throw new AssertionError((Object)"SlowMemory class is broken!");
                }
                catch (Throwable var1_3) {
                    throw new AssertionError((Object)"Could not find SlowMemory class");
                }
            }
        }
        b = d2;
        a = b.fastAccessSupported();
    }
}

