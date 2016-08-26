/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;
import com.growingio.a.a.b.v;
import java.util.BitSet;

final class A
extends v {
    private final char o;
    private final char p;

    A(char c2, char c3) {
        this.o = c2;
        this.p = c3;
    }

    @Override
    public boolean c(char c2) {
        return c2 == this.o || c2 == this.p;
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.set(this.o);
        bitSet.set(this.p);
    }

    @Override
    public String toString() {
        return "CharMatcher.anyOf(\"" + m.d(this.o) + m.d(this.p) + "\")";
    }
}

