/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.m;
import com.growingio.agent.compile.n;
import com.growingio.agent.compile.q;
import com.growingio.d.a.a.o;
import com.growingio.d.a.f;
import com.growingio.d.a.r;
import java.util.Map;

class a
extends f {
    private final m b;
    final Map<o, n> a;

    public a(m m2, f f2, Map<o, n> map) {
        super(327680, f2);
        this.a = map;
        this.b = m2;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        r r2 = super.a(n2, string, string2, string3, arrstring);
        n n3 = this.a.get(new o(string, string2));
        if (n3 != null) {
            return new q(n3.a(r2, n2, string, string2));
        }
        return r2;
    }
}

