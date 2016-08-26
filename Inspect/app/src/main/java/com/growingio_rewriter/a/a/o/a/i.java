/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.e;
import java.util.concurrent.Executor;

class i
implements Executor {
    final /* synthetic */ e a;

    i(e e2) {
        this.a = e2;
    }

    @Override
    public void execute(Runnable runnable) {
        cd.a(this.a.m(), runnable).start();
    }
}

