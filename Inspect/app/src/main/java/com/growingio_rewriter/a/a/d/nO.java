/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.dm;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nD;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class nO<R, C, V>
extends dm<R, C, V>
implements Serializable {
    final nB<? extends R, ? extends C, ? extends V> a;
    private static final long b = 0;

    nO(nB<? extends R, ? extends C, ? extends V> nB2) {
        this.a = aU.a(nB2);
    }

    @Override
    protected nB<R, C, V> f() {
        return this.a;
    }

    @Override
    public Set<nC<R, C, V>> e() {
        return Collections.unmodifiableSet(super.e());
    }

    @Override
    public void d() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<R, V> d(C c2) {
        return Collections.unmodifiableMap(super.d(c2));
    }

    @Override
    public Set<C> b() {
        return Collections.unmodifiableSet(super.b());
    }

    @Override
    public Map<C, Map<R, V>> p() {
        aq aq2 = nD.a();
        return Collections.unmodifiableMap(ii.a(super.p(), aq2));
    }

    @Override
    public V a(R r2, C c2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(nB<? extends R, ? extends C, ? extends V> nB2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public V c(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<C, V> e(R r2) {
        return Collections.unmodifiableMap(super.e(r2));
    }

    @Override
    public Set<R> a() {
        return Collections.unmodifiableSet(super.a());
    }

    @Override
    public Map<R, Map<C, V>> r() {
        aq aq2 = nD.a();
        return Collections.unmodifiableMap(ii.a(super.r(), aq2));
    }

    @Override
    public Collection<V> h() {
        return Collections.unmodifiableCollection(super.h());
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.f();
    }
}

