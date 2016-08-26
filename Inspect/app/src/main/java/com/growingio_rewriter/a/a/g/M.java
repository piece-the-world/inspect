/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.g.K;
import com.growingio.a.a.g.L;
import com.growingio.a.a.g.h;
import java.util.Comparator;

public final class M<N, E> {
    final boolean a;
    boolean b = false;
    boolean c = true;
    Comparator<N> d = null;
    Comparator<E> e = null;
    aP<Integer> f = aP.f();
    aP<Integer> g = aP.f();

    private M(boolean bl2) {
        this.a = bl2;
    }

    public static M<Object, Object> a() {
        return new M<Object, Object>(true);
    }

    public static M<Object, Object> b() {
        return new M<Object, Object>(false);
    }

    public static <N, E> M<N, E> a(L<N, E> l2) {
        return new M<N, E>(l2.b()).a(l2.e()).b(l2.c());
    }

    public M<N, E> a(boolean bl2) {
        this.b = bl2;
        return this;
    }

    public M<N, E> b(boolean bl2) {
        this.c = bl2;
        return this;
    }

    public M<N, E> a(int n2) {
        aU.a(n2 >= 0, "The expected number of nodes can't be negative: %s", n2);
        this.f = aP.b(n2);
        return this;
    }

    public M<N, E> b(int n2) {
        aU.a(n2 >= 0, "The expected number of edges can't be negative: %s", n2);
        this.g = aP.b(n2);
        return this;
    }

    public <N1 extends N, E1 extends E> K<N1, E1> c() {
        return new h(this);
    }
}

