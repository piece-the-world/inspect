/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.o.a.A;
import com.growingio.a.a.o.a.B;
import com.growingio.a.a.o.a.S;
import com.growingio.a.a.o.a.cd;
import com.growingio.a.a.o.a.x;
import com.growingio.a.a.o.a.y;
import java.util.concurrent.Executor;

final class z
extends S {
    final /* synthetic */ x a;

    private z(x x2) {
        this.a = x2;
    }

    @Override
    protected final void a() {
        cd.a(this.a.c(), x.a(this.a)).execute(new A(this));
    }

    @Override
    protected final void b() {
        cd.a(this.a.c(), x.a(this.a)).execute(new B(this));
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    /* synthetic */ z(x x2, y y2) {
        this(x2);
    }
}

