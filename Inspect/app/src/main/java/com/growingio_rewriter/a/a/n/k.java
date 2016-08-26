/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.n;

import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.n.F;
import com.growingio.a.a.n.i;
import com.growingio.a.a.n.j;

public final class k<B> {
    private final ek<F<? extends B>, B> a = ei.j();

    private k() {
    }

    public <T extends B> k<B> a(Class<T> class_, T t2) {
        this.a.b(F.a(class_), t2);
        return this;
    }

    public <T extends B> k<B> a(F<T> f2, T t2) {
        this.a.b(f2.m(), t2);
        return this;
    }

    public i<B> a() {
        return new i(this.a.b(), null);
    }

    /* synthetic */ k(j j2) {
        this();
    }
}

