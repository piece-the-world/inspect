/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.m;

final class w
extends m {
    private final aV<? super Character> o;

    w(aV<? super Character> aV2) {
        this.o = aU.a(aV2);
    }

    @Override
    public boolean c(char c2) {
        return this.o.a(Character.valueOf(c2));
    }

    @Override
    public boolean a(Character c2) {
        return this.o.a(aU.a(c2));
    }

    @Override
    public String toString() {
        return "CharMatcher.forPredicate(" + this.o + ")";
    }
}

