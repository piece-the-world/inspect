/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.m;
import java.util.BitSet;

final class M
extends m {
    final m o;
    final m p;

    M(m m2, m m3) {
        this.o = aU.a(m2);
        this.p = aU.a(m3);
    }

    @Override
    void a(BitSet bitSet) {
        this.o.a(bitSet);
        this.p.a(bitSet);
    }

    @Override
    public boolean c(char c2) {
        return this.o.c(c2) || this.p.c(c2);
    }

    @Override
    public String toString() {
        return "CharMatcher.or(" + this.o + ", " + this.p + ")";
    }
}

