/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;
import com.growingio.a.a.b.v;
import java.util.BitSet;

final class B
extends v {
    private final char o;

    B(char c2) {
        this.o = c2;
    }

    @Override
    public boolean c(char c2) {
        return c2 != this.o;
    }

    @Override
    public m a(m m2) {
        return m2.c(this.o) ? super.a(m2) : m2;
    }

    @Override
    public m b(m m2) {
        return m2.c(this /* !! */ .o) ? B.a() : this /* !! */ ;
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.set(0, this.o);
        bitSet.set(this.o + '\u0001', 65536);
    }

    @Override
    public m o() {
        return B.a(this.o);
    }

    @Override
    public String toString() {
        return "CharMatcher.isNot('" + m.d(this.o) + "')";
    }
}

