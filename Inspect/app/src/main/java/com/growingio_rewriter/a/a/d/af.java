/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ag;
import com.growingio.a.a.d.ah;
import com.growingio.a.a.d.ai;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import com.growingio.a.a.d.nD;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class af<R, C, V>
implements nB<R, C, V> {
    private transient Set<nC<R, C, V>> a;
    private transient Collection<V> b;

    af() {
    }

    @Override
    public boolean a(Object object) {
        return ii.b(this.r(), object);
    }

    @Override
    public boolean b(Object object) {
        return ii.b(this.p(), object);
    }

    @Override
    public Set<R> a() {
        return this.r().keySet();
    }

    @Override
    public Set<C> b() {
        return this.p().keySet();
    }

    @Override
    public boolean c(Object object) {
        for (Map map : this.r().values()) {
            if (!map.containsValue(object)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(Object object, Object object2) {
        Map map = ii.a(this.r(), object);
        return map != null && ii.b(map, object2);
    }

    @Override
    public V b(Object object, Object object2) {
        Map map = ii.a(this.r(), object);
        return map == null ? null : (V)ii.a(map, object2);
    }

    @Override
    public boolean c() {
        return this.n() == 0;
    }

    @Override
    public void d() {
        gb.i(this.e().iterator());
    }

    @Override
    public V c(Object object, Object object2) {
        Map map = ii.a(this.r(), object);
        return map == null ? null : (V)ii.c(map, object2);
    }

    @Override
    public V a(R r2, C c2, V v2) {
        return this.e(r2).put(c2, v2);
    }

    @Override
    public void a(nB<? extends R, ? extends C, ? extends V> nB2) {
        for (nC<R, C, V> nC2 : nB2.e()) {
            this.a(nC2.a(), nC2.b(), nC2.c());
        }
    }

    @Override
    public Set<nC<R, C, V>> e() {
        Set<nC<R, C, V>> set = this.a;
        Set<nC<R, C, V>> set2 = set == null ? (this.a = this.f()) : set;
        return set2;
    }

    Set<nC<R, C, V>> f() {
        return new ah(this);
    }

    abstract Iterator<nC<R, C, V>> g();

    @Override
    public Collection<V> h() {
        Collection<V> collection = this.b;
        Collection<V> collection2 = collection == null ? (this.b = this.i()) : collection;
        return collection2;
    }

    Collection<V> i() {
        return new ai(this);
    }

    Iterator<V> q_() {
        return new ag(this, this.e().iterator());
    }

    @Override
    public boolean equals(Object object) {
        return nD.a(this, object);
    }

    @Override
    public int hashCode() {
        return this.e().hashCode();
    }

    public String toString() {
        return this.r().toString();
    }
}

