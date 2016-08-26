/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.agent.compile;

import com.growingio.agent.compile.E;
import com.growingio.d.a.a.o;
import com.growingio.d.a.u;

class F
implements Runnable {
    final /* synthetic */ E a;

    F(E e2) {
        this.a = e2;
    }

    @Override
    public void run() {
        this.a.d();
        this.a.a(u.b("java/lang/ProcessBuilder"), new o("command", "()Ljava/util/List;"));
    }
}

