/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile.a;

import com.growingio.agent.compile.a.j;
import com.growingio.d.a.r;

final class k
extends com.growingio.d.a.a.j {
    final /* synthetic */ j a;

    public k(j j2, r r2, int n2, String string, String string2) {
        this.a = j2;
        super(327680, r2, n2, string, string2);
    }

    @Override
    public void a_() {
        super.a_(4);
        super.a_(172);
        j.a(this.a).a("[VDS] Marking vds agent as instrumented");
        j.b(this.a).e();
    }
}

