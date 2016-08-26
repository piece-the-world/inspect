/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.ak;
import com.growingio.a.a.h.am;
import com.growingio.a.a.h.an;
import java.nio.ByteOrder;

final class ai {
    private static final am b;

    static long a(byte[] arrby, int n2) {
        assert (arrby.length >= n2 + 8);
        return b.a(arrby, n2);
    }

    static long a(byte[] arrby, int n2, int n3) {
        long l2 = 0;
        int n4 = Math.min(n3, 8);
        for (int i2 = 0; i2 < n4; ++i2) {
            l2 |= ((long)arrby[n2 + i2] & 255) << i2 * 8;
        }
        return l2;
    }

    static void a(byte[] arrby, int n2, long l2) {
        assert (n2 >= 0 && n2 + 8 <= arrby.length);
        b.a(arrby, n2, l2);
    }

    static int b(byte[] arrby, int n2) {
        return arrby[n2] & 255 | (arrby[n2 + 1] & 255) << 8 | (arrby[n2 + 2] & 255) << 16 | (arrby[n2 + 3] & 255) << 24;
    }

    static boolean a() {
        return b instanceof an;
    }

    private ai() {
    }

    static {
        Enum enum_ = ak.a;
        try {
            String string = System.getProperty("os.arch");
            if ("amd64".equals(string) || "aarch64".equals(string)) {
                enum_ = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN) ? an.a : an.b;
            }
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        b = enum_;
    }
}

