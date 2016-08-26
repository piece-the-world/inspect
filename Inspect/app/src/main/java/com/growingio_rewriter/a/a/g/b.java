/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.g.M;
import com.growingio.a.a.g.O;
import com.growingio.a.a.g.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class b<N, E>
extends e<N, E> {
    private static final int c = 11;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    protected final Map<N, O<N, E>> a;
    protected final Map<E, N> b;

    b(M<? super N, ? super E> m2) {
        this(m2, ii.c(m2.f.a(11)), ii.c(m2.g.a(11)));
    }

    b(M<? super N, ? super E> m2, Map<N, O<N, E>> map, Map<E, N> map2) {
        this.d = m2.a;
        this.e = m2.b;
        this.f = m2.c;
        this.a = aU.a(map);
        this.b = aU.a(map2);
    }

    @Override
    public Set<N> a() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override
    public Set<E> d() {
        return Collections.unmodifiableSet(this.b.keySet());
    }

    @Override
    public boolean b() {
        return this.d;
    }

    @Override
    public boolean e() {
        return this.e;
    }

    @Override
    public boolean c() {
        return this.f;
    }

    @Override
    public Set<E> d(Object object) {
        return this.k(object).b();
    }

    @Override
    public Set<N> e(Object object) {
        N n2 = this.l(object);
        N n3 = this.a.get(n2).a(object);
        return fg.b(n2, n3);
    }

    @Override
    public Set<N> a(Object object) {
        return this.k(object).a();
    }

    @Override
    public Set<E> f(Object object) {
        Iterator<N> iterator = this.e(object).iterator();
        Set<E> set = this.d(iterator.next());
        while (iterator.hasNext()) {
            set = lI.a(this.d(iterator.next()), set);
        }
        return lI.c(set, fg.d(object));
    }

    @Override
    public Set<E> a(Object object, Object object2) {
        O<N, E> o2 = this.k(object);
        if (!this.f && object.equals(object2)) {
            return fg.k();
        }
        aU.a(this.m(object2), "Node %s is not an element of this graph", object2);
        return o2.d(object2);
    }

    @Override
    public Set<E> a_(Object object) {
        return this.k(object).c();
    }

    @Override
    public Set<E> b_(Object object) {
        return this.k(object).d();
    }

    @Override
    public Set<N> b(Object object) {
        return this.k(object).e();
    }

    @Override
    public Set<N> c(Object object) {
        return this.k(object).f();
    }

    @Override
    public N i(Object object) {
        if (!this.d) {
            throw new UnsupportedOperationException("Cannot call source()/target() on an undirected graph. Consider using incidentNodes() (if you don't know either incident node) or Graphs.oppositeNode() (if you know one of the incident nodes).");
        }
        return this.l(object);
    }

    @Override
    public N j(Object object) {
        N n2 = this.i(object);
        return this.a.get(n2).a(object);
    }

    protected O<N, E> k(Object object) {
        aU.a(object, (Object)"node");
        O<N, E> o2 = this.a.get(object);
        aU.a(o2 != null, "Node %s is not an element of this graph", object);
        return o2;
    }

    protected N l(Object object) {
        aU.a(object, (Object)"edge");
        N n2 = this.b.get(object);
        aU.a(n2 != null, "Edge %s is not an element of this graph", object);
        return n2;
    }

    protected boolean m(Object object) {
        return this.a.containsKey(object);
    }

    protected boolean n(Object object) {
        return this.b.containsKey(object);
    }
}

