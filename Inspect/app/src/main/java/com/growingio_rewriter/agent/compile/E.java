/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.D;
import com.growingio.agent.compile.F;
import com.growingio.agent.compile.J;
import com.growingio.agent.compile.K;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.d.a.r;

class E
extends J {
    final /* synthetic */ D a;

    E(D d2, r r2, int n2, String string, String string2) {
        this.a = d2;
        super(r2, n2, string, string2);
    }

    @Override
    protected void a() {
        this.b.b().c(VdsRewriterAgent.a("java/lang/ProcessBuilder", this.c)).a(new F(this)).c();
    }
}

