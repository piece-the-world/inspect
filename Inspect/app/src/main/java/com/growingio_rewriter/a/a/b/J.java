/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.m;
import java.util.BitSet;

class J
extends m {
    final m q;

    J(m m2) {
        this.q = aU.a(m2);
    }

    @Override
    public boolean c(char c2) {
        return !this.q.c(c2);
    }

    @Override
    public boolean d(CharSequence charSequence) {
        return this.q.e(charSequence);
    }

    @Override
    public boolean e(CharSequence charSequence) {
        return this.q.d(charSequence);
    }

    @Override
    public int h(CharSequence charSequence) {
        return charSequence.length() - this.q.h(charSequence);
    }

    @Override
    void a(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.q.a(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    @Override
    public m o() {
        return this.q;
    }

    @Override
    public String toString() {
        return this.q + ".negate()";
    }
}

