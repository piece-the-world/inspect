/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.d.av;
import com.growingio.a.a.d.dK;
import com.growingio.a.a.d.dr;
import com.growingio.a.a.g.P;
import com.growingio.a.a.g.f;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

final class T<N, E>
extends f<N, E> {
    protected T(Map<E, N> map) {
        super(map);
    }

    static <N, E> T<N, E> g() {
        return new T(dr.a(11));
    }

    static <N, E> T<N, E> a(Map<E, N> map) {
        return new T<N, E>(dK.a(map));
    }

    @Override
    public Set<N> a() {
        return Collections.unmodifiableSet(((av)this.a).o_());
    }

    @Override
    public Set<E> d(Object object) {
        return new P(((av)this.a).m_(), object);
    }
}

