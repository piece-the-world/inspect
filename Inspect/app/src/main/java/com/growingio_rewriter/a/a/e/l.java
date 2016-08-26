/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.e.g;
import com.growingio.a.a.e.j;
import com.growingio.a.a.e.m;
import java.util.HashMap;
import java.util.Map;

public final class l {
    private final Map<Character, String> a = new HashMap<Character, String>();
    private char b = '\u0000';
    private char c = 65535;
    private String d = null;

    private l() {
    }

    public l a(char c2, char c3) {
        this.b = c2;
        this.c = c3;
        return this;
    }

    public l a(String string) {
        this.d = string;
        return this;
    }

    public l a(char c2, String string) {
        aU.a(string);
        this.a.put(Character.valueOf(c2), string);
        return this;
    }

    public g a() {
        return new m(this, this.a, this.b, this.c);
    }

    /* synthetic */ l(j j2) {
        this();
    }

    static /* synthetic */ String a(l l2) {
        return l2.d;
    }
}

