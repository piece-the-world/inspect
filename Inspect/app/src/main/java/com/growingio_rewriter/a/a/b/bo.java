/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.I;
import com.growingio.a.a.b.m;
import java.util.BitSet;

final class bo
extends I {
    static final int o = 1023;
    private final char[] p;
    private final boolean q;
    private final long r;
    private static final int s = -862048943;
    private static final int t = 461845907;
    private static final double u = 0.5;

    private bo(char[] arrc, long l2, boolean bl2, String string) {
        super(string);
        this.p = arrc;
        this.r = l2;
        this.q = bl2;
    }

    static int a(int n2) {
        return 461845907 * Integer.rotateLeft(n2 * -862048943, 15);
    }

    private boolean c(int n2) {
        return 1 == (1 & this.r >> n2);
    }

    static int b(int n2) {
        if (n2 == 1) {
            return 2;
        }
        int n3 = Integer.highestOneBit(n2 - 1) << 1;
        while ((double)n3 * 0.5 < (double)n2) {
            n3 <<= 1;
        }
        return n3;
    }

    static m a(BitSet bitSet, String string) {
        long l2 = 0;
        int n2 = bitSet.cardinality();
        boolean bl2 = bitSet.get(0);
        char[] arrc = new char[bo.b(n2)];
        int n3 = arrc.length - 1;
        int n4 = bitSet.nextSetBit(0);
        while (n4 != -1) {
            l2 |= 1 << n4;
            int n5 = bo.a(n4) & n3;
            do {
                if (arrc[n5] == '\u0000') break;
                n5 = n5 + 1 & n3;
            } while (true);
            arrc[n5] = (char)n4;
            n4 = bitSet.nextSetBit(n4 + 1);
        }
        return new bo(arrc, l2, bl2, string);
    }

    @Override
    public boolean c(char c2) {
        int n2;
        if (c2 == '\u0000') {
            return this.q;
        }
        if (!this.c((int)c2)) {
            return false;
        }
        int n3 = this.p.length - 1;
        int n4 = n2 = bo.a(c2) & n3;
        do {
            if (this.p[n4] == '\u0000') {
                return false;
            }
            if (this.p[n4] != c2) continue;
            return true;
        } while ((n4 = n4 + 1 & n3) != n2);
        return false;
    }

    @Override
    void a(BitSet bitSet) {
        if (this.q) {
            bitSet.set(0);
        }
        for (char c2 : this.p) {
            if (c2 == '\u0000') continue;
            bitSet.set(c2);
        }
    }
}

