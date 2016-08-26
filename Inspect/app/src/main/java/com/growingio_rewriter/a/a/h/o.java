/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.h;

import com.growingio.a.a.h.H;
import com.growingio.a.a.h.N;
import com.growingio.a.a.h.n;
import com.growingio.a.a.h.q;
import com.growingio.a.a.h.x;

final class o
extends n {
    o(String string2, int n3) {
        super(string, n2, null);
    }

    @Override
    public <T> boolean a(T t2, x<? super T> x2, int n2, q q2) {
        long l2 = q2.a();
        long l3 = N.b().a(t2, x2).c();
        int n3 = (int)l3;
        int n4 = (int)(l3 >>> 32);
        boolean bl2 = false;
        for (int i2 = 1; i2 <= n2; ++i2) {
            int n5 = n3 + i2 * n4;
            if (n5 < 0) {
                n5 ^= -1;
            }
            bl2 |= q2.a((long)n5 % l2);
        }
        return bl2;
    }

    @Override
    public <T> boolean b(T t2, x<? super T> x2, int n2, q q2) {
        long l2 = q2.a();
        long l3 = N.b().a(t2, x2).c();
        int n3 = (int)l3;
        int n4 = (int)(l3 >>> 32);
        for (int i2 = 1; i2 <= n2; ++i2) {
            int n5 = n3 + i2 * n4;
            if (n5 < 0) {
                n5 ^= -1;
            }
            if (q2.b((long)n5 % l2)) continue;
            return false;
        }
        return true;
    }
}

