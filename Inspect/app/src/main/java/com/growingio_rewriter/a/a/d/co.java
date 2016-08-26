/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.N;
import com.growingio.a.a.d.cp;
import com.growingio.a.a.d.cq;
import com.growingio.a.a.d.cr;
import com.growingio.a.a.d.cu;
import com.growingio.a.a.d.cv;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.lI;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class co<K, V>
extends N<K, V>
implements cu<K, V> {
    final jr<K, V> a;
    final aV<? super K> b;

    co(jr<K, V> jr2, aV<? super K> aV2) {
        this.a = aU.a(jr2);
        this.b = aU.a(aV2);
    }

    @Override
    public jr<K, V> a() {
        return this.a;
    }

    @Override
    public aV<? super Map.Entry<K, V>> b() {
        return ii.a(this.b);
    }

    @Override
    public int l_() {
        int n2 = 0;
        for (Collection collection : this.c().values()) {
            n2 += collection.size();
        }
        return n2;
    }

    @Override
    public boolean f(Object object) {
        if (this.a.f(object)) {
            Object object2 = object;
            return this.b.a((Object)object2);
        }
        return false;
    }

    @Override
    public Collection<V> d(Object object) {
        return this.f(object) ? this.a.d(object) : this.f();
    }

    Collection<V> f() {
        if (this.a instanceof lH) {
            return fg.k();
        }
        return ea.d();
    }

    @Override
    public void h() {
        this.q().clear();
    }

    @Override
    Set<K> i() {
        return lI.a(this.a.q(), this.b);
    }

    @Override
    public Collection<V> c(K k2) {
        if (this.b.a(k2)) {
            return this.a.c(k2);
        }
        if (this.a instanceof lH) {
            return new cq(k2);
        }
        return new cp(k2);
    }

    @Override
    Iterator<Map.Entry<K, V>> m() {
        throw new AssertionError((Object)"should never be called");
    }

    @Override
    Collection<Map.Entry<K, V>> p() {
        return new cr(this);
    }

    @Override
    Collection<V> t() {
        return new cv(this);
    }

    @Override
    Map<K, Collection<V>> n() {
        return ii.a(this.a.c(), this.b);
    }

    @Override
    kl<K> s() {
        return kn.a(this.a.r(), this.b);
    }
}

