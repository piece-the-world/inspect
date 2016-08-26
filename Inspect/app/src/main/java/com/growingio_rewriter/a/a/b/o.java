/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.m;
import java.util.BitSet;

final class o
extends m {
    final m o;
    final m p;

    o(m m2, m m3) {
        this.o = aU.a(m2);
        this.p = aU.a(m3);
    }

    @Override
    public boolean c(char c2) {
        return this.o.c(c2) && this.p.c(c2);
    }

    @Override
    void a(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.o.a(bitSet2);
        BitSet bitSet3 = new BitSet();
        this.p.a(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    @Override
    public String toString() {
        return "CharMatcher.and(" + this.o + ", " + this.p + ")";
    }
}

