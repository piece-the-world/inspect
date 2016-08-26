/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.J;
import com.growingio.agent.compile.K;
import com.growingio.d.a.r;

abstract class ac
extends J {
    protected ac(r r2, int n2, String string, String string2) {
        super(r2, n2, string, string2);
    }

    @Override
    protected final void a(int n2) {
        this.b.b().c("SET_INSTRUMENTATION_DISABLED_FLAG").a().c();
        super.a(n2);
    }
}

