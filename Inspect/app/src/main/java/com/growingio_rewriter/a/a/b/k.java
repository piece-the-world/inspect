/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.e;
import com.growingio.a.a.b.f;
import com.growingio.a.a.b.g;
import com.growingio.a.a.b.m;

final class k
extends f {
    k(String string2, int n3, m m2, String string3) {
        super(string, n2, (m)((Object)string2), (String)n3, null);
    }

    @Override
    String b(String string) {
        return e.b(string);
    }

    @Override
    String b(f f2, String string) {
        if (f2 == a) {
            return e.a(string.replace('_', '-'));
        }
        if (f2 == b) {
            return e.a(string);
        }
        return super.b(f2, string);
    }
}

