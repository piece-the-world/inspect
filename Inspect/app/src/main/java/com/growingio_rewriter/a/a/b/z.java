/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;
import com.growingio.a.a.b.v;
import java.util.BitSet;

final class z
extends v {
    private final char o;

    z(char c2) {
        this.o = c2;
    }

    @Override
    public boolean c(char c2) {
        return c2 == this.o;
    }

    @Override
    public String a(CharSequence charSequence, char c2) {
        return charSequence.toString().replace(this.o, c2);
    }

    @Override
    public m a(m m2) {
        return m2.c(this.o) ? this : z.b();
    }

    @Override
    public m b(m m2) {
        return m2.c(this.o) ? m2 : super.b(m2);
    }

    @Override
    public m o() {
        return z.b(this.o);
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.set(this.o);
    }

    @Override
    public String toString() {
        return "CharMatcher.is('" + m.d(this.o) + "')";
    }
}

