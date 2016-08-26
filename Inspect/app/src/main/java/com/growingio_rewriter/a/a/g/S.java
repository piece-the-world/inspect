/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.g.N;
import java.util.Collections;
import java.util.Set;

final class S<N>
implements N<N> {
    private final Set<N> a;

    private S(Set<N> set) {
        this.a = aU.a(set, (Object)"adjacentNodes");
    }

    static <N> S<N> a() {
        return new S(lI.a(11));
    }

    static <N> S<N> a(Set<N> set) {
        return new S<N>(fg.a(set));
    }

    @Override
    public Set<N> b() {
        return Collections.unmodifiableSet(this.a);
    }

    @Override
    public Set<N> c() {
        return this.b();
    }

    @Override
    public Set<N> d() {
        return this.b();
    }

    @Override
    public void a(Object object) {
        this.b(object);
    }

    @Override
    public void b(Object object) {
        aU.a(object, (Object)"node");
        this.a.remove(object);
    }

    @Override
    public void c(N n2) {
        this.d(n2);
    }

    @Override
    public void d(N n2) {
        aU.a(n2, (Object)"node");
        this.a.add(n2);
    }
}

