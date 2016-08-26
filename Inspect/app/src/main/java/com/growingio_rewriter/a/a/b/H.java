/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;

final class H
extends m {
    static final H o = new H();

    private H() {
    }

    @Override
    public boolean c(char c2) {
        return Character.isUpperCase(c2);
    }

    @Override
    public String toString() {
        return "CharMatcher.javaUpperCase()";
    }
}

