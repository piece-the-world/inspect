/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aP;
import com.growingio.a.a.b.aU;
import com.growingio.a.a.g.J;
import com.growingio.a.a.g.g;
import com.growingio.a.a.g.r;
import java.util.Comparator;

public final class s<N> {
    final boolean a;
    boolean b = true;
    Comparator<N> c = null;
    aP<Integer> d = aP.f();

    private s(boolean bl2) {
        this.a = bl2;
    }

    public static s<Object> a() {
        return new s<Object>(true);
    }

    public static s<Object> b() {
        return new s<Object>(false);
    }

    public static <N> s<N> a(r<N> r2) {
        return new s<N>(r2.b()).a(r2.c());
    }

    public s<N> a(boolean bl2) {
        this.b = bl2;
        return this;
    }

    public s<N> a(int n2) {
        aU.a(n2 >= 0, "The expected number of nodes can't be negative: %s", n2);
        this.d = aP.b(n2);
        return this;
    }

    public <N1 extends N> J<N1> c() {
        return new g(this);
    }
}

