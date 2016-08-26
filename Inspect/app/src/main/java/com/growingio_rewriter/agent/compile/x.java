/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.J;
import com.growingio.agent.compile.K;
import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.w;
import com.growingio.agent.compile.y;
import com.growingio.d.a.r;
import com.growingio.d.a.u;

class x
extends J {
    final /* synthetic */ w a;

    x(w w2, r r2, int n2, String string, String string2) {
        this.a = w2;
        super(r2, n2, string, string2);
    }

    @Override
    protected void a() {
        this.b.b().c(VdsRewriterAgent.a("com/android/ant/DexExecTask", this.c)).a(new y(this)).a(false);
        this.d();
        this.o();
        this.d(u.b("com/android/ant/DexExecTask"), "VdsAgentFile", u.a(Object.class));
    }
}

