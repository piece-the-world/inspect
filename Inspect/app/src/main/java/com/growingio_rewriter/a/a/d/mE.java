/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.bG;
import com.growingio.a.a.d.af;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.mF;
import com.growingio.a.a.d.mG;
import com.growingio.a.a.d.mH;
import com.growingio.a.a.d.mN;
import com.growingio.a.a.d.mO;
import com.growingio.a.a.d.mP;
import com.growingio.a.a.d.mT;
import com.growingio.a.a.d.mW;
import com.growingio.a.a.d.nC;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class mE<R, C, V>
extends af<R, C, V>
implements Serializable {
    final Map<R, Map<C, V>> a;
    final bG<? extends Map<C, V>> b;
    private transient Set<C> c;
    private transient Map<R, Map<C, V>> d;
    private transient mE<R, C, V> e;
    private static final long f = 0;

    mE(Map<R, Map<C, V>> map, bG<? extends Map<C, V>> bG2) {
        this.a = map;
        this.b = bG2;
    }

    @Override
    public boolean a(Object object, Object object2) {
        return object != null && object2 != null && super.a(object, object2);
    }

    @Override
    public boolean b(Object object) {
        if (object == null) {
            return false;
        }
        for (Map<C, V> map : this.a.values()) {
            if (!ii.b(map, object)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(Object object) {
        return object != null && ii.b(this.a, object);
    }

    @Override
    public boolean c(Object object) {
        return object != null && super.c(object);
    }

    @Override
    public V b(Object object, Object object2) {
        return object == null || object2 == null ? null : (V)super.b(object, object2);
    }

    @Override
    public boolean c() {
        return this.a.isEmpty();
    }

    @Override
    public int n() {
        int n2 = 0;
        for (Map<C, V> map : this.a.values()) {
            n2 += map.size();
        }
        return n2;
    }

    @Override
    public void d() {
        this.a.clear();
    }

    private Map<C, V> f(R r2) {
        Map<C, V> map = this.a.get(r2);
        if (map == null) {
            map = this.b.a();
            this.a.put(r2, map);
        }
        return map;
    }

    @Override
    public V a(R r2, C c2, V v2) {
        aU.a(r2);
        aU.a(c2);
        aU.a(v2);
        return this.f(r2).put(c2, v2);
    }

    @Override
    public V c(Object object, Object object2) {
        if (object == null || object2 == null) {
            return null;
        }
        Map<C, V> map = ii.a(this.a, object);
        if (map == null) {
            return null;
        }
        V v2 = map.remove(object2);
        if (map.isEmpty()) {
            this.a.remove(object);
        }
        return v2;
    }

    private Map<R, V> g(Object object) {
        LinkedHashMap<R, V> linkedHashMap = new LinkedHashMap<R, V>();
        Iterator<Map.Entry<R, Map<C, V>>> iterator = this.a.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<R, Map<C, V>> entry = iterator.next();
            V v2 = entry.getValue().remove(object);
            if (v2 == null) continue;
            linkedHashMap.put(entry.getKey(), v2);
            if (!entry.getValue().isEmpty()) continue;
            iterator.remove();
        }
        return linkedHashMap;
    }

    private boolean b(Object object, Object object2, Object object3) {
        return object3 != null && object3.equals(this.b(object, object2));
    }

    private boolean c(Object object, Object object2, Object object3) {
        if (this.b(object, object2, object3)) {
            this.c(object, object2);
            return true;
        }
        return false;
    }

    @Override
    public Set<nC<R, C, V>> e() {
        return super.e();
    }

    @Override
    Iterator<nC<R, C, V>> g() {
        return new mG(this, null);
    }

    @Override
    public Map<C, V> e(R r2) {
        return new mT(this, r2);
    }

    @Override
    public Map<R, V> d(C c2) {
        return new mH(this, c2);
    }

    @Override
    public Set<R> a() {
        return this.r().keySet();
    }

    @Override
    public Set<C> b() {
        Set<C> set = this.c;
        Object object = set == null ? (this.c = new mO(this, null)) : set;
        return object;
    }

    Iterator<C> m() {
        return new mN(this, null);
    }

    @Override
    public Collection<V> h() {
        return super.h();
    }

    @Override
    public Map<R, Map<C, V>> r() {
        Map<R, Map<C, Map<C, V>>> map = this.d;
        Map<R, Map<C, Map<C, V>>> map2 = map == null ? (this.d = this.l()) : map;
        return map2;
    }

    Map<R, Map<C, V>> l() {
        return new mW(this);
    }

    @Override
    public Map<C, Map<R, V>> p() {
        mE<R, C, V> mE2 = this.e;
        Object object = mE2 == null ? (this.e = new mP(this, null)) : mE2;
        return object;
    }

    static /* synthetic */ boolean a(mE mE2, Object object, Object object2, Object object3) {
        return mE2.b(object, object2, object3);
    }

    static /* synthetic */ boolean b(mE mE2, Object object, Object object2, Object object3) {
        return mE2.c(object, object2, object3);
    }

    static /* synthetic */ Map a(mE mE2, Object object) {
        return mE2.g(object);
    }
}

