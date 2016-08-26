/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.A;
import com.growingio.d.a.u;

class B
implements Runnable {
    final /* synthetic */ A a;

    B(A a2) {
        this.a = a2;
    }

    @Override
    public void run() {
        this.a.d();
        this.a.c(u.b("com/android/ant/DexExecTask"), "VdsAgentFile", u.a(Object.class));
    }
}

