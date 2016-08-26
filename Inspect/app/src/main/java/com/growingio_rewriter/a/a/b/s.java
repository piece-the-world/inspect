/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.I;
import com.growingio.a.a.b.n;
import java.util.BitSet;

final class s
extends I {
    private final BitSet o;

    private s(BitSet bitSet, String string) {
        super(string);
        if (bitSet.length() + 64 < bitSet.size()) {
            bitSet = (BitSet)bitSet.clone();
        }
        this.o = bitSet;
    }

    @Override
    public boolean c(char c2) {
        return this.o.get(c2);
    }

    @Override
    void a(BitSet bitSet) {
        bitSet.or(this.o);
    }

    /* synthetic */ s(BitSet bitSet, String string, n n2) {
        this(bitSet, string);
    }
}

