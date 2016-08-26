/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.b;

import com.growingio.a.a.b.e;
import com.growingio.a.a.b.f;
import com.growingio.a.a.b.m;

final class g
extends f {
    g(String string2, int n3, m m2, String string3) {
        super(string, n2, (m)((Object)string2), (String)n3, null);
    }

    @Override
    String b(String string) {
        return e.a(string);
    }

    @Override
    String b(f f2, String string) {
        if (f2 == b) {
            return string.replace('-', '_');
        }
        if (f2 == e) {
            return e.b(string.replace('-', '_'));
        }
        return super.b(f2, string);
    }
}

