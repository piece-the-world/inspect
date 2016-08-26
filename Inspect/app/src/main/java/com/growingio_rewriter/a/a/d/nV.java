/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.iZ;
import com.growingio.a.a.d.mE;
import com.growingio.a.a.d.mT;
import com.growingio.a.a.d.nR;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class nV
extends mE<R, C, V>
implements SortedMap<C, V> {
    final C d;
    final C e;
    transient SortedMap<C, V> f;
    final /* synthetic */ nR g;

    nV(R var1_1) {
        this((nR)var1_1, r2, (Object)null, (Object)null);
    }

    nV(R var1_1, C r2, C c2) {
        this.g = var1_1;
        super((mE)var1_1, r2);
        this.d = c2;
        this.e = c3;
        aU.a(c2 == null || c3 == null || this.a(c2, c3) <= 0);
    }

    public SortedSet<C> e() {
        return new iZ(this);
    }

    @Override
    public Comparator<? super C> comparator() {
        return this.g.s();
    }

    int a(Object object, Object object2) {
        Comparator<C> comparator = this.comparator();
        return comparator.compare((Object)object, (Object)object2);
    }

    @Override
    boolean a(Object object) {
        return !(object == null || this.d != null && this.a(this.d, object) > 0 || this.e != null && this.a(this.e, object) <= 0);
    }

    @Override
    public SortedMap<C, V> subMap(C c2, C c3) {
        aU.a(this.a(aU.a(c2)) && this.a(aU.a(c3)));
        return new nV(this.g, this.a, c2, c3);
    }

    @Override
    public SortedMap<C, V> headMap(C c2) {
        aU.a(this.a(aU.a(c2)));
        return new nV(this.g, this.a, this.d, c2);
    }

    @Override
    public SortedMap<C, V> tailMap(C c2) {
        aU.a(this.a(aU.a(c2)));
        return new nV(this.g, this.a, c2, this.e);
    }

    @Override
    public C firstKey() {
        SortedMap<C, V> sortedMap = this.g();
        if (sortedMap == null) {
            throw new NoSuchElementException();
        }
        return this.g().firstKey();
    }

    @Override
    public C lastKey() {
        SortedMap<C, V> sortedMap = this.g();
        if (sortedMap == null) {
            throw new NoSuchElementException();
        }
        return this.g().lastKey();
    }

    SortedMap<C, V> f() {
        if (this.f == null || this.f.isEmpty() && this.g.a.containsKey(this.a)) {
            this.f = (SortedMap)this.g.a.get(this.a);
        }
        return this.f;
    }

    SortedMap<C, V> g() {
        return (SortedMap)super.a();
    }

    SortedMap<C, V> h() {
        SortedMap<C, V> sortedMap = this.f();
        if (sortedMap != null) {
            if (this.d != null) {
                sortedMap = sortedMap.tailMap(this.d);
            }
            if (this.e != null) {
                sortedMap = sortedMap.headMap(this.e);
            }
            return sortedMap;
        }
        return null;
    }

    @Override
    void d() {
        if (this.f() != null && this.f.isEmpty()) {
            this.g.a.remove(this.a);
            this.f = null;
            this.b = null;
        }
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a(object) && super.containsKey(object);
    }

    @Override
    public V put(C c2, V v2) {
        aU.a(this.a(aU.a(c2)));
        return super.put(c2, v2);
    }

    /* synthetic */ Map c() {
        return this.h();
    }

    /* synthetic */ Map a() {
        return this.g();
    }

    @Override
    public /* synthetic */ Set keySet() {
        return this.e();
    }
}

