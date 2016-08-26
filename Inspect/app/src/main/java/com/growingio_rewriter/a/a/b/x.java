/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.m;
import com.growingio.a.a.b.v;
import java.util.BitSet;

final class x
extends v {
    private final char o;
    private final char p;

    x(char c2, char c3) {
        aU.a(c3 >= c2);
        this.o = c2;
        this.p = c3;
    }

    @Override
    public boolean c(char c2) {
        return this.o <= c2 && c2 <= this.p;
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.set((int)this.o, this.p + '\u0001');
    }

    @Override
    public String toString() {
        return "CharMatcher.inRange('" + m.d(this.o) + "', '" + m.d(this.p) + "')";
    }
}

