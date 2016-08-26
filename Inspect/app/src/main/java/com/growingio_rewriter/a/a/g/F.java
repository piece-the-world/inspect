/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.g.G;
import com.growingio.a.a.g.H;
import com.growingio.a.a.g.I;
import com.growingio.a.a.g.L;
import com.growingio.a.a.g.M;
import com.growingio.a.a.g.O;
import com.growingio.a.a.g.Q;
import com.growingio.a.a.g.T;
import com.growingio.a.a.g.b;
import com.growingio.a.a.g.i;
import com.growingio.a.a.g.q;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class F<N, E>
extends b<N, E> {
    private F(L<N, E> l2) {
        super(M.a(l2), F.b(l2), F.c(l2));
    }

    public static <N, E> F<N, E> a(L<N, E> l2) {
        return l2 instanceof F ? (F)l2 : new F(l2);
    }

    public static <N, E> F<N, E> a(F<N, E> f2) {
        return aU.a(f2);
    }

    @Override
    public Set<E> a(Object object, Object object2) {
        return fg.a(super.a(object, object2));
    }

    private static <N, E> Map<N, O<N, E>> b(L<N, E> l2) {
        ek ek2 = ei.j();
        for (Object n2 : l2.a()) {
            ek2.b(n2, F.a(l2, n2));
        }
        return ek2.b();
    }

    private static <N, E> Map<E, N> c(L<N, E> l2) {
        ek<E, N> ek2 = ei.j();
        for (E e2 : l2.d()) {
            ek2.b(e2, l2.e(e2).iterator().next());
        }
        return ek2.b();
    }

    private static <N, E> O<N, E> a(L<N, E> l2, N n2) {
        if (l2.b()) {
            Map<E, N> map = ii.a(l2.a_(n2), F.d(l2));
            Map<E, N> map2 = ii.a(l2.b_(n2), F.e(l2));
            return l2.e() ? i.a(map, map2) : q.a(map, map2);
        }
        Map<E, N> map = ii.a(l2.d(n2), F.b(l2, n2));
        return l2.e() ? Q.a(map) : T.a(map);
    }

    private static <N, E> aq<E, N> d(L<N, E> l2) {
        return new G(l2);
    }

    private static <N, E> aq<E, N> e(L<N, E> l2) {
        return new H(l2);
    }

    private static <N, E> aq<E, N> b(L<N, E> l2, N n2) {
        return new I(l2, n2);
    }
}

