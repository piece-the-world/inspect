/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;

final class F
extends m {
    static final F o = new F();

    private F() {
    }

    @Override
    public boolean c(char c2) {
        return Character.isLetterOrDigit(c2);
    }

    @Override
    public String toString() {
        return "CharMatcher.javaLetterOrDigit()";
    }
}

