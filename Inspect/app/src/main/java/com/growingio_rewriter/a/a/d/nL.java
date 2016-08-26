/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.af;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nD;
import com.growingio.a.a.d.nM;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class nL<C, R, V>
extends af<C, R, V> {
    final nB<R, C, V> a;
    private static final aq<nC<?, ?, ?>, nC<?, ?, ?>> b = new nM();

    nL(nB<R, C, V> nB2) {
        this.a = aU.a(nB2);
    }

    @Override
    public void d() {
        this.a.d();
    }

    @Override
    public Map<C, V> d(R r2) {
        return this.a.e(r2);
    }

    @Override
    public Set<R> b() {
        return this.a.a();
    }

    @Override
    public Map<R, Map<C, V>> p() {
        return this.a.r();
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.a.a(object2, object);
    }

    @Override
    public boolean b(Object object) {
        return this.a.a(object);
    }

    @Override
    public boolean a(Object object) {
        return this.a.b(object);
    }

    @Override
    public boolean c(Object object) {
        return this.a.c(object);
    }

    @Override
    public V b(Object object, Object object2) {
        return this.a.b(object2, object);
    }

    @Override
    public V a(C c2, R r2, V v2) {
        return this.a.a(r2, c2, v2);
    }

    @Override
    public void a(nB<? extends C, ? extends R, ? extends V> nB2) {
        this.a.a(nD.a(nB2));
    }

    @Override
    public V c(Object object, Object object2) {
        return this.a.c(object2, object);
    }

    @Override
    public Map<R, V> e(C c2) {
        return this.a.d(c2);
    }

    @Override
    public Set<C> a() {
        return this.a.b();
    }

    @Override
    public Map<C, Map<R, V>> r() {
        return this.a.p();
    }

    @Override
    public int n() {
        return this.a.n();
    }

    @Override
    public Collection<V> h() {
        return this.a.h();
    }

    @Override
    Iterator<nC<C, R, V>> g() {
        return gb.a(this.a.e().iterator(), b);
    }
}

