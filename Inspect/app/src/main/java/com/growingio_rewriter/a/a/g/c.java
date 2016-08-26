/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.g.O;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

abstract class c<N, E>
implements O<N, E> {
    protected final Map<E, N> a;
    protected final Map<E, N> b;

    protected c(Map<E, N> map, Map<E, N> map2) {
        this.a = aU.a(map, (Object)"inEdgeMap");
        this.b = aU.a(map2, (Object)"outEdgeMap");
    }

    @Override
    public Set<N> a() {
        return lI.a(this.e(), this.f());
    }

    @Override
    public Set<E> b() {
        return lI.a(this.c(), this.d());
    }

    @Override
    public Set<E> c() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override
    public Set<E> d() {
        return Collections.unmodifiableSet(this.b.keySet());
    }

    @Override
    public N a(Object object) {
        return aU.a(this.b.get(object));
    }

    @Override
    public N b(Object object) {
        aU.a(object, (Object)"edge");
        return this.a.remove(object);
    }

    @Override
    public N c(Object object) {
        aU.a(object, (Object)"edge");
        return this.b.remove(object);
    }

    @Override
    public boolean a(E e2, N n2) {
        aU.a(e2, (Object)"edge");
        aU.a(n2, (Object)"node");
        N n3 = this.a.put(e2, n2);
        if (n3 != null) {
            aU.a(n2.equals(n3));
            return false;
        }
        return true;
    }

    @Override
    public boolean b(E e2, N n2) {
        aU.a(e2, (Object)"edge");
        aU.a(n2, (Object)"node");
        N n3 = this.b.put(e2, n2);
        if (n3 != null) {
            aU.a(n2.equals(n3));
            return false;
        }
        return true;
    }
}

