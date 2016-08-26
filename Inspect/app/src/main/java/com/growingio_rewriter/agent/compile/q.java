/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.l;
import com.growingio.agent.compile.p;
import com.growingio.d.a.a;
import com.growingio.d.a.r;
import com.growingio.d.a.u;

class q
extends com.growingio.d.a.q {
    public q(r r2) {
        super(r2);
    }

    @Override
    public a a(String string, boolean bl2) {
        if (!u.c(l.class).equals(string)) {
            return super.a(string, bl2);
        }
        throw new p();
    }
}

