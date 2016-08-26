/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.k;

import com.growingio.a.a.k.o;
import com.growingio.a.a.k.p;
import com.growingio.a.a.m.P;

final class r
extends p {
    r(String string2, int n3) {
        super(string, n2, null);
    }

    private long b(long l2, long l3, long l4) {
        return l2 >= l4 - l3 ? l2 + l3 - l4 : l2 + l3;
    }

    private long c(long l2, long l3) {
        int n2;
        int n3 = 32;
        do {
            n2 = Math.min(n3, Long.numberOfLeadingZeros(l2));
            l2 = P.c(l2 << n2, l3);
        } while ((n3 -= n2) > 0);
        return l2;
    }

    @Override
    long a(long l2, long l3, long l4) {
        long l5 = l2 >>> 32;
        long l6 = l3 >>> 32;
        long l7 = l2 & 0xFFFFFFFFL;
        long l8 = l3 & 0xFFFFFFFFL;
        long l9 = this.c(l5 * l6, l4);
        if ((l9 += l5 * l8) < 0) {
            l9 = P.c(l9, l4);
        }
        l9 += l7 * l6;
        l9 = this.c(l9, l4);
        return this.b(l9, P.c(l7 * l8, l4), l4);
    }

    @Override
    long b(long l2, long l3) {
        long l4 = l2 >>> 32;
        long l5 = l2 & 0xFFFFFFFFL;
        long l6 = this.c(l4 * l4, l3);
        long l7 = l4 * l5 * 2;
        if (l7 < 0) {
            l7 = P.c(l7, l3);
        }
        l6 += l7;
        l6 = this.c(l6, l3);
        return this.b(l6, P.c(l5 * l5, l3), l3);
    }
}

