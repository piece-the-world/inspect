/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;
import java.util.Arrays;
import java.util.BitSet;

final class q
extends m {
    private final char[] o;

    public q(CharSequence charSequence) {
        this.o = charSequence.toString().toCharArray();
        Arrays.sort(this.o);
    }

    @Override
    public boolean c(char c2) {
        return Arrays.binarySearch(this.o, c2) >= 0;
    }

    @Override
    void a(BitSet bitSet) {
        for (char c2 : this.o) {
            bitSet.set(c2);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c2 : this.o) {
            stringBuilder.append(m.d(c2));
        }
        stringBuilder.append("\")");
        return stringBuilder.toString();
    }
}

