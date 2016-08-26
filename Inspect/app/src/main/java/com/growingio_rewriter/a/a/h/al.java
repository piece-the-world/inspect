/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.aj;
import com.growingio.a.a.h.ak;
import com.growingio.a.a.m.u;

final class al
extends ak {
    al(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    public long a(byte[] arrby, int n2) {
        return u.a(arrby[n2 + 7], arrby[n2 + 6], arrby[n2 + 5], arrby[n2 + 4], arrby[n2 + 3], arrby[n2 + 2], arrby[n2 + 1], arrby[n2]);
    }

    @Override
    public void a(byte[] arrby, int n2, long l2) {
        long l3 = 255;
        for (int i2 = 0; i2 < 8; ++i2) {
            arrby[n2 + i2] = (byte)((l2 & l3) >> i2 * 8);
            l3 <<= 8;
        }
    }
}

