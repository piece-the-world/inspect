/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.E;
import com.growingio.agent.compile.q;
import com.growingio.d.a.f;
import com.growingio.d.a.r;

final class D
extends f {
    D(int n2, f f2) {
        super(n2, f2);
    }

    @Override
    public r a(int n2, String string, String string2, String string3, String[] arrstring) {
        r r2 = super.a(n2, string, string2, string3, arrstring);
        if ("start".equals(string)) {
            return new q(new E(this, r2, n2, string, string2));
        }
        return r2;
    }
}

