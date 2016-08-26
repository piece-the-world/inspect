/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.bb;
import java.util.regex.Pattern;

class ba
extends bb {
    private static final long b = 0;

    ba(String string) {
        super(Pattern.compile(string));
    }

    @Override
    public String toString() {
        return "Predicates.containsPattern(" + this.a.pattern() + ")";
    }
}

