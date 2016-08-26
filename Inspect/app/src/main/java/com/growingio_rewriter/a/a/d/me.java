/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fD;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.nC;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class me<R, C, V>
extends fD<R, C, V> {
    final R a;
    final C b;
    final V c;

    me(R r2, C c2, V v2) {
        this.a = aU.a(r2);
        this.b = aU.a(c2);
        this.c = aU.a(v2);
    }

    me(nC<R, C, V> nC2) {
        this(nC2.a(), nC2.b(), nC2.c());
    }

    @Override
    public ei<R, V> f(C c2) {
        aU.a(c2);
        return this.b(c2) ? ei.c(this.a, this.c) : ei.i();
    }

    @Override
    public ei<C, Map<R, V>> k() {
        return ei.c(this.b, ei.c(this.a, this.c));
    }

    @Override
    public ei<R, Map<C, V>> l() {
        return ei.c(this.a, ei.c(this.b, this.c));
    }

    @Override
    public int n() {
        return 1;
    }

    @Override
    fg<nC<R, C, V>> s() {
        return fg.d(me.c(this.a, this.b, this.c));
    }

    @Override
    dQ<V> v() {
        return fg.d(this.c);
    }

    @Override
    /* synthetic */ Collection i() {
        return this.v();
    }

    @Override
    /* synthetic */ Set f() {
        return this.s();
    }

    @Override
    public /* synthetic */ Map p() {
        return this.k();
    }

    @Override
    public /* synthetic */ Map r() {
        return this.l();
    }

    @Override
    public /* synthetic */ Map d(Object object) {
        return this.f(object);
    }
}

