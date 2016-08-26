/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.g.O;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

abstract class f<N, E>
implements O<N, E> {
    protected final Map<E, N> a;

    protected f(Map<E, N> map) {
        this.a = aU.a(map, (Object)"incidentEdgeMap");
    }

    @Override
    public Set<N> e() {
        return this.a();
    }

    @Override
    public Set<N> f() {
        return this.a();
    }

    @Override
    public Set<E> b() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override
    public Set<E> c() {
        return this.b();
    }

    @Override
    public Set<E> d() {
        return this.b();
    }

    @Override
    public N a(Object object) {
        return aU.a(this.a.get(object));
    }

    @Override
    public N b(Object object) {
        return this.c(object);
    }

    @Override
    public N c(Object object) {
        aU.a(object, (Object)"edge");
        return this.a.remove(object);
    }

    @Override
    public boolean a(E e2, N n2) {
        return this.b(e2, n2);
    }

    @Override
    public boolean b(E e2, N n2) {
        aU.a(e2, (Object)"edge");
        aU.a(n2, (Object)"node");
        N n3 = this.a.put(e2, n2);
        if (n3 != null) {
            aU.a(n2.equals(n3));
            return false;
        }
        return true;
    }
}

