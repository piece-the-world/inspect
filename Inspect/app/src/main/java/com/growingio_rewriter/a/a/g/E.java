/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ek;
import com.growingio.a.a.g.L;
import com.growingio.a.a.g.N;
import com.growingio.a.a.g.S;
import com.growingio.a.a.g.a;
import com.growingio.a.a.g.k;
import com.growingio.a.a.g.p;
import com.growingio.a.a.g.r;
import com.growingio.a.a.g.s;
import java.util.Map;
import java.util.Set;

public final class E<N>
extends a<N> {
    private E(r<N> r2) {
        super(s.a(r2), E.b(r2));
    }

    public static <N> E<N> a(r<N> r2) {
        aU.a(!(r2 instanceof L), (Object)"Input must not implement common.graph.Network");
        return r2 instanceof E ? (E)r2 : new E(r2);
    }

    public static <N> E<N> a(E<N> e2) {
        return aU.a(e2);
    }

    private static <N> ei<N, N<N>> b(r<N> r2) {
        ek<N, N<N>> ek2 = ei.j();
        for (N n2 : r2.a()) {
            ek2.b(n2, E.a(r2, n2));
        }
        return ek2.b();
    }

    private static <N> N<N> a(r<N> r2, N n2) {
        return r2.b() ? k.a(E.b(r2, n2), r2.b(n2).size(), r2.c(n2).size()) : S.a(r2.a(n2));
    }

    private static <N> ei<N, p> b(r<N> r2, N n2) {
        Set<N> set = r2.b(n2);
        Set<N> set2 = r2.c(n2);
        ek<N, p> ek2 = ei.j();
        for (N n3 : r2.a(n2)) {
            ek2.b(n3, E.a(set.contains(n3), set2.contains(n3)));
        }
        return ek2.b();
    }

    private static p a(boolean bl2, boolean bl3) {
        if (bl2 && bl3) {
            return p.c;
        }
        if (bl2) {
            return p.a;
        }
        if (bl3) {
            return p.b;
        }
        throw new IllegalStateException();
    }
}

