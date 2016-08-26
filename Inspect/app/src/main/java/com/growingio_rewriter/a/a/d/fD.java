/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aH;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.af;
import com.growingio.a.a.d.dQ;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.fE;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fh;
import com.growingio.a.a.d.lx;
import com.growingio.a.a.d.mA;
import com.growingio.a.a.d.me;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nD;
import com.growingio.a.a.d.oP;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class fD<R, C, V>
extends af<R, C, V> {
    public static <R, C, V> fD<R, C, V> m() {
        return mA.a;
    }

    public static <R, C, V> fD<R, C, V> b(R r2, C c2, V v2) {
        return new me<R, C, V>(r2, c2, v2);
    }

    public static <R, C, V> fD<R, C, V> b(nB<? extends R, ? extends C, ? extends V> nB2) {
        if (nB2 instanceof fD) {
            fD fD2 = (fD)nB2;
            return fD2;
        }
        int n2 = nB2.n();
        switch (n2) {
            case 0: {
                return fD.m();
            }
            case 1: {
                nC<R, C, V> nC2 = fL.d(nB2.e());
                return fD.b(nC2.a(), nC2.b(), nC2.c());
            }
        }
        fh<nC<R, C, V>> fh2 = new fh<nC<R, C, V>>(n2);
        for (nC<R, C, V> nC3 : nB2.e()) {
            fh2.c(fD.c(nC3.a(), nC3.b(), nC3.c()));
        }
        return lx.a(fh2.b());
    }

    public static <R, C, V> fE<R, C, V> o() {
        return new fE();
    }

    static <R, C, V> nC<R, C, V> c(R r2, C c2, V v2) {
        return nD.a(aU.a(r2), aU.a(c2), aU.a(v2));
    }

    fD() {
    }

    public fg<nC<R, C, V>> q() {
        return (fg)super.e();
    }

    abstract fg<nC<R, C, V>> s();

    final oP<nC<R, C, V>> t() {
        throw new AssertionError((Object)"should never be called");
    }

    public dQ<V> u() {
        return (dQ)super.h();
    }

    abstract dQ<V> v();

    @Override
    final Iterator<V> q_() {
        throw new AssertionError((Object)"should never be called");
    }

    public ei<R, V> f(C c2) {
        aU.a(c2);
        return aH.a((ei)this.k().get(c2), ei.<K, V>i());
    }

    public fg<C> w() {
        return this.k().m();
    }

    public abstract ei<C, Map<R, V>> k();

    public ei<C, V> g(R r2) {
        aU.a(r2);
        return aH.a((ei)this.l().get(r2), ei.<K, V>i());
    }

    public fg<R> x() {
        return this.l().m();
    }

    public abstract ei<R, Map<C, V>> l();

    @Override
    public boolean a(Object object, Object object2) {
        return this.b(object, object2) != null;
    }

    @Override
    public boolean c(Object object) {
        return this.u().contains(object);
    }

    @Override
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final V a(R r2, C c2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void a(nB<? extends R, ? extends C, ? extends V> nB2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final V c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    /* synthetic */ Collection i() {
        return this.v();
    }

    @Override
    public /* synthetic */ Collection h() {
        return this.u();
    }

    @Override
    /* synthetic */ Iterator g() {
        return this.t();
    }

    @Override
    /* synthetic */ Set f() {
        return this.s();
    }

    @Override
    public /* synthetic */ Set e() {
        return this.q();
    }

    @Override
    public /* synthetic */ Set b() {
        return this.w();
    }

    @Override
    public /* synthetic */ Set a() {
        return this.x();
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

    @Override
    public /* synthetic */ Map e(Object object) {
        return this.g(object);
    }
}

