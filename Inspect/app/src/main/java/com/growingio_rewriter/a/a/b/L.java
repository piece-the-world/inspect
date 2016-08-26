/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.I;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.m;

final class L
extends I {
    static final L o = new L();

    private L() {
        super("CharMatcher.none()");
    }

    @Override
    public boolean c(char c2) {
        return false;
    }

    @Override
    public int f(CharSequence charSequence) {
        aU.a(charSequence);
        return -1;
    }

    @Override
    public int a(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        aU.b(n2, n3);
        return -1;
    }

    @Override
    public int g(CharSequence charSequence) {
        aU.a(charSequence);
        return -1;
    }

    @Override
    public boolean d(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override
    public boolean e(CharSequence charSequence) {
        aU.a(charSequence);
        return true;
    }

    @Override
    public String i(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public String a(CharSequence charSequence, char c2) {
        return charSequence.toString();
    }

    @Override
    public String a(CharSequence charSequence, CharSequence charSequence2) {
        aU.a(charSequence2);
        return charSequence.toString();
    }

    @Override
    public String b(CharSequence charSequence, char c2) {
        return charSequence.toString();
    }

    @Override
    public String k(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public String l(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public String m(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public int h(CharSequence charSequence) {
        aU.a(charSequence);
        return 0;
    }

    @Override
    public m a(m m2) {
        aU.a(m2);
        return this;
    }

    @Override
    public m b(m m2) {
        return aU.a(m2);
    }

    @Override
    public m o() {
        return L.a();
    }
}

