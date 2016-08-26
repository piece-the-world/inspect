/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.ea;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.G;
import com.growingio.a.a.n.P;

final class Q
extends P<F<?>> {
    Q() {
        super(null);
    }

    @Override
    Class<?> a(F<?> f2) {
        return f2.b();
    }

    @Override
    Iterable<? extends F<?>> b(F<?> f2) {
        return f2.e();
    }

    @Override
    F<?> c(F<?> f2) {
        return f2.d();
    }

    @Override
    /* synthetic */ Object d(Object object) {
        return this.c((F)object);
    }

    @Override
    /* synthetic */ Iterable c(Object object) {
        return this.b((F)object);
    }

    @Override
    /* synthetic */ Class b(Object object) {
        return this.a((F)object);
    }
}

