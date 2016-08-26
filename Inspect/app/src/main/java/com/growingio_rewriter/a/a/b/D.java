/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.I;

final class D
extends I {
    static final D o = new D();

    private D() {
        super("CharMatcher.javaIsoControl()");
    }

    @Override
    public boolean c(char c2) {
        return c2 <= '\u001f' || c2 >= '' && c2 <= '\u009f';
    }
}

