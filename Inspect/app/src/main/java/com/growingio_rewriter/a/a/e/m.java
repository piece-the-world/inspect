/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.e;

import com.growingio.a.a.e.a;
import com.growingio.a.a.e.l;
import java.util.Map;

class m
extends a {
    private final char[] b;
    final /* synthetic */ l a;

    m(l l2, Map map, char c2, char c3) {
        this.a = l2;
        super(map, c2, c3);
        this.b = l.a(this.a) != null ? l.a(this.a).toCharArray() : null;
    }

    @Override
    protected char[] b(char c2) {
        return this.b;
    }
}

