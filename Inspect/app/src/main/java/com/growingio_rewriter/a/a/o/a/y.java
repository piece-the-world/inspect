/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.x;
import java.util.concurrent.Executor;

class y
implements Executor {
    final /* synthetic */ x a;

    y(x x2) {
        this.a = x2;
    }

    @Override
    public void execute(Runnable runnable) {
        cd.a((String)x.a(this.a).a(), runnable).start();
    }
}

