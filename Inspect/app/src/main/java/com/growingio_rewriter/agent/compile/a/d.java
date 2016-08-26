/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.VdsRewriterAgent;
import com.growingio.agent.compile.a.c;
import com.growingio.d.a.a;
import com.growingio.d.a.a.o;
import com.growingio.d.a.r;
import com.growingio.d.a.u;

class d
extends com.growingio.d.a.a.a {
    String a;
    String b;
    final /* synthetic */ c c;

    public d(c c2, r r2, int n2, String string, String string2) {
        this.c = c2;
        super(327680, r2, n2, string, string2);
        this.a = string;
        this.b = string2;
    }

    @Override
    public void b() {
        super.b();
        super.a("Lcom/growingio/android/sdk/instrumentation/Instrumented;", false);
    }

    @Override
    protected void a() {
        this.d();
        this.e();
        o o2 = new o(this.a, "(Ljava/lang/Object;" + this.b.substring(1));
        this.c(VdsRewriterAgent.CollectorClassType, o2);
        if (!this.b.endsWith("V")) {
            this.g();
        }
        c.b(this.c).d("hooked " + c.a(this.c).h() + "#" + this.a + this.b);
    }
}

