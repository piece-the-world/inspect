/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;

final class C
extends m {
    static final C o = new C();

    private C() {
    }

    @Override
    public boolean c(char c2) {
        return Character.isDigit(c2);
    }

    @Override
    public String toString() {
        return "CharMatcher.javaDigit()";
    }
}

