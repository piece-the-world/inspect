/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.J;
import com.growingio.agent.compile.K;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.t;
import com.growingio.d.a.r;

class u
extends J {
    final /* synthetic */ t a;

    u(t t2, r r2, int n2, String string, String string2) {
        this.a = t2;
        super(r2, n2, string, string2);
    }

    @Override
    protected void a() {
        this.b.b().c(VdsRewriterAgent.a("com/android/dx/command/dexer/Main", this.c)).a(this.dn).a(false);
        this.i(com.growingio.d.a.u.a(byte[].class));
        this.d(1);
    }
}

