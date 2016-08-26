/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.m;

final class G
extends m {
    static final G o = new G();

    private G() {
    }

    @Override
    public boolean c(char c2) {
        return Character.isLowerCase(c2);
    }

    @Override
    public String toString() {
        return "CharMatcher.javaLowerCase()";
    }
}

