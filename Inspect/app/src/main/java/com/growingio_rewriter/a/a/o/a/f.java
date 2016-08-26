/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.S;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.e;
import com.growingio.a.a.o.a.g;
import com.growingio.a.a.o.a.h;
import java.util.concurrent.Executor;

class f
extends S {
    final /* synthetic */ e a;

    f(e e2) {
        this.a = e2;
    }

    @Override
    protected final void a() {
        Executor executor = cd.a(this.a.e(), new g(this));
        executor.execute(new h(this));
    }

    @Override
    protected void b() {
        this.a.d();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

