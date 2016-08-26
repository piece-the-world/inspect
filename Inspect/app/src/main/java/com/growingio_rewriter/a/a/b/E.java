/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;

final class E
extends m {
    static final E o = new E();

    private E() {
    }

    @Override
    public boolean c(char c2) {
        return Character.isLetter(c2);
    }

    @Override
    public String toString() {
        return "CharMatcher.javaLetter()";
    }
}

