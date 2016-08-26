/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.a.p;
import com.growingio.agent.compile.k;
import com.growingio.agent.compile.m;
import com.growingio.d.a.f;
import com.growingio.d.a.r;

public class o
extends f {
    private final k a;
    private final m b;

    public o(f f2, k k2, m m2) {
        super(327680, f2);
        this.a = k2;
        this.b = m2;
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        if (this.a.d(string, string2)) {
            this.b.d("Wrapmethodvisitor skip method " + string + string2 + string3);
            return super.a(n2, string, string2, string3, arrstring);
        }
        return new p(super.a(n2, string, string2, string3, arrstring), n2, string, string2, this.a, this.b);
    }
}

