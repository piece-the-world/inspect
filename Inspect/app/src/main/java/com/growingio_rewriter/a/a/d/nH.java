/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.af;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nI;
import com.growingio.a.a.d.nJ;
import com.growingio.a.a.d.nK;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class nH<R, C, V1, V2>
extends af<R, C, V2> {
    final nB<R, C, V1> a;
    final aq<? super V1, V2> b;

    nH(nB<R, C, V1> nB2, aq<? super V1, V2> aq2) {
        this.a = aU.a(nB2);
        this.b = aU.a(aq2);
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.a.a(object, object2);
    }

    @Override
    public V2 b(Object object, Object object2) {
        return this.a(object, object2) ? (V2)this.b.f((V1)this.a.b(object, object2)) : null;
    }

    @Override
    public int n() {
        return this.a.n();
    }

    @Override
    public void d() {
        this.a.d();
    }

    @Override
    public V2 a(R r2, C c2, V2 V2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(nB<? extends R, ? extends C, ? extends V2> nB2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V2 c(Object object, Object object2) {
        return this.a(object, object2) ? (V2)this.b.f((V1)this.a.c(object, object2)) : null;
    }

    @Override
    public Map<C, V2> e(R r2) {
        return ii.a(this.a.e(r2), this.b);
    }

    @Override
    public Map<R, V2> d(C c2) {
        return ii.a(this.a.d(c2), this.b);
    }

    aq<nC<R, C, V1>, nC<R, C, V2>> k() {
        return new nI(this);
    }

    @Override
    Iterator<nC<R, C, V2>> g() {
        return gb.a(this.a.e().iterator(), this.k());
    }

    @Override
    public Set<R> a() {
        return this.a.a();
    }

    @Override
    public Set<C> b() {
        return this.a.b();
    }

    @Override
    Collection<V2> i() {
        return aL.a(this.a.h(), this.b);
    }

    @Override
    public Map<R, Map<C, V2>> r() {
        nJ nJ2 = new nJ(this);
        return ii.a(this.a.r(), nJ2);
    }

    @Override
    public Map<C, Map<R, V2>> p() {
        nK nK2 = new nK(this);
        return ii.a(this.a.p(), nK2);
    }
}

