/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dK;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.g.P;
import com.growingio.a.a.g.c;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

final class q<N, E>
extends c<N, E> {
    protected q(Map<E, N> map, Map<E, N> map2) {
        super(map, map2);
    }

    static <N, E> q<N, E> g() {
        return new q(dr.a(11), dr.a(11));
    }

    static <N, E> q<N, E> a(Map<E, N> map, Map<E, N> map2) {
        return new q<N, E>(dK.a(map), dK.a(map2));
    }

    @Override
    public Set<N> e() {
        return Collections.unmodifiableSet(((av)this.a).o_());
    }

    @Override
    public Set<N> f() {
        return Collections.unmodifiableSet(((av)this.b).o_());
    }

    @Override
    public Set<E> d(Object object) {
        return new P(((av)this.b).m_(), object);
    }
}

