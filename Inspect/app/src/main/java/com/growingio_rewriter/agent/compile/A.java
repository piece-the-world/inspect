/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.B;
import com.growingio.agent.compile.K;
import com.growingio.agent.compile.ac;
import com.growingio.agent.compile.z;
import com.growingio.d.a.r;

class A
extends ac {
    final /* synthetic */ z a;

    A(z z2, r r2, int n2, String string, String string2) {
        this.a = z2;
        super(r2, n2, string, string2);
    }

    @Override
    protected void a() {
        this.b.b().c("SET_INSTRUMENTATION_DISABLED_FLAG").a(new B(this)).c();
    }
}

