/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.N;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iE;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kf;
import com.growingio.a.a.d.kl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class ke<K, V1, V2>
extends N<K, V2> {
    final jr<K, V1> a;
    final iE<? super K, ? super V1, V2> b;

    ke(jr<K, V1> jr2, iE<? super K, ? super V1, V2> iE2) {
        this.a = aU.a(jr2);
        this.b = aU.a(iE2);
    }

    @Override
    Collection<V2> b(K k2, Collection<V1> collection) {
        aq<? super V1, V2> aq2 = ii.a(this.b, k2);
        if (collection instanceof List) {
            return gO.a((List)collection, aq2);
        }
        return aL.a(collection, aq2);
    }

    @Override
    Map<K, Collection<V2>> n() {
        return ii.a(this.a.c(), new kf(this));
    }

    @Override
    public void h() {
        this.a.h();
    }

    @Override
    public boolean f(Object object) {
        return this.a.f(object);
    }

    @Override
    Iterator<Map.Entry<K, V2>> m() {
        return gb.a(this.a.l().iterator(), ii.b(this.b));
    }

    @Override
    public Collection<V2> c(K k2) {
        return this.b(k2, this.a.c(k2));
    }

    @Override
    public boolean o() {
        return this.a.o();
    }

    @Override
    public Set<K> q() {
        return this.a.q();
    }

    @Override
    public kl<K> r() {
        return this.a.r();
    }

    @Override
    public boolean a(K k2, V2 V2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(K k2, Iterable<? extends V2> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(jr<? extends K, ? extends V2> jr2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean c(Object object, Object object2) {
        return this.c(object).remove(object2);
    }

    @Override
    public Collection<V2> d(Object object) {
        return this.b((K)object, this.a.d(object));
    }

    @Override
    public Collection<V2> b(K k2, Iterable<? extends V2> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int l_() {
        return this.a.l_();
    }

    @Override
    Collection<V2> t() {
        return aL.a(this.a.l(), ii.a(this.b));
    }
}

