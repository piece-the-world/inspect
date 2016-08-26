/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.g.N;
import com.growingio.a.a.g.d;
import com.growingio.a.a.g.s;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

abstract class a<N>
extends d<N> {
    private static final int b = 11;
    private final boolean c;
    private final boolean d;
    protected final Map<N, N<N>> a;

    a(s<? super N> s2) {
        this(s2, ii.c(s2.d.a(11)));
    }

    a(s<? super N> s2, Map<N, N<N>> map) {
        this.c = s2.a;
        this.d = s2.b;
        this.a = aU.a(map);
    }

    @Override
    public Set<N> a() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override
    public boolean b() {
        return this.c;
    }

    @Override
    public boolean c() {
        return this.d;
    }

    @Override
    public Set<N> a(Object object) {
        return this.d(object).b();
    }

    @Override
    public Set<N> b(Object object) {
        return this.d(object).c();
    }

    @Override
    public Set<N> c(Object object) {
        return this.d(object).d();
    }

    protected N<N> d(Object object) {
        aU.a(object, (Object)"node");
        N<N> n2 = this.a.get(object);
        aU.a(n2 != null, "Node %s is not an element of this graph", object);
        return n2;
    }

    protected boolean e(Object object) {
        return this.a.containsKey(object);
    }
}

