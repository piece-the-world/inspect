/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.g.N;
import com.growingio.a.a.g.l;
import com.growingio.a.a.g.n;
import com.growingio.a.a.g.p;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

final class k<N>
implements N<N> {
    private final Map<N, p> a;
    private int b;
    private int c;

    private k(Map<N, p> map, int n2, int n3) {
        this.a = aU.a(map, (Object)"adjacentNodes");
        this.b = n2;
        this.c = n3;
    }

    static <N> k<N> a() {
        return new k(ii.a(11), 0, 0);
    }

    static <N> k<N> a(Map<N, p> map, int n2, int n3) {
        return new k<N>(ei.b(map), n2, n3);
    }

    @Override
    public Set<N> b() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override
    public Set<N> c() {
        return new l(this);
    }

    @Override
    public Set<N> d() {
        return new n(this);
    }

    @Override
    public void a(Object object) {
        aU.a(object, (Object)"node");
        p p2 = this.a.get(object);
        if (p2 == p.c) {
            this.a.put((Object)object, p.b);
            --this.b;
        } else if (p2 == p.a) {
            this.a.remove(object);
            --this.b;
        }
        aU.b(this.b >= 0);
    }

    @Override
    public void b(Object object) {
        aU.a(object, (Object)"node");
        p p2 = this.a.get(object);
        if (p2 == p.c) {
            this.a.put((Object)object, p.a);
            --this.c;
        } else if (p2 == p.b) {
            this.a.remove(object);
            --this.c;
        }
        aU.b(this.c >= 0);
    }

    @Override
    public void c(N n2) {
        aU.a(n2, (Object)"node");
        p p2 = this.a.get(n2);
        if (p2 == null) {
            this.a.put(n2, p.a);
            ++this.b;
        } else if (p2 == p.b) {
            this.a.put(n2, p.c);
            ++this.b;
        }
        aU.b(this.b >= 1);
    }

    @Override
    public void d(N n2) {
        aU.a(n2, (Object)"node");
        p p2 = this.a.get(n2);
        if (p2 == null) {
            this.a.put(n2, p.b);
            ++this.c;
        } else if (p2 == p.a) {
            this.a.put(n2, p.c);
            ++this.c;
        }
        aU.b(this.c >= 1);
    }

    private boolean e(Object object) {
        p p2 = this.a.get(object);
        return p2 == p.a || p2 == p.c;
    }

    private boolean f(Object object) {
        p p2 = this.a.get(object);
        return p2 == p.b || p2 == p.c;
    }

    static /* synthetic */ boolean a(k k2, Object object) {
        return k2.e(object);
    }

    static /* synthetic */ int a(k k2) {
        return k2.b;
    }

    static /* synthetic */ boolean b(k k2, Object object) {
        return k2.f(object);
    }

    static /* synthetic */ int b(k k2) {
        return k2.c;
    }
}

