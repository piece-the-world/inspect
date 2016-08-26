/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dG;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.g.c;
import com.growingio.a.a.g.j;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

final class i<N, E>
extends c<N, E> {
    private transient Reference<kl<N>> c;
    private transient Reference<kl<N>> d;

    private i(Map<E, N> map, Map<E, N> map2) {
        super(map, map2);
    }

    static <N, E> i<N, E> g() {
        return new i(ii.a(11), ii.a(11));
    }

    static <N, E> i<N, E> a(Map<E, N> map, Map<E, N> map2) {
        return new i<N, E>(ei.b(map), ei.b(map2));
    }

    @Override
    public Set<N> e() {
        kl<N> kl2 = i.a(this.c);
        if (kl2 == null) {
            kl2 = dG.a(this.a.values());
            this.c = new SoftReference<kl<N>>(kl2);
        }
        return Collections.unmodifiableSet(kl2.d());
    }

    @Override
    public Set<N> f() {
        kl<N> kl2 = i.a(this.d);
        if (kl2 == null) {
            kl2 = dG.a(this.b.values());
            this.d = new SoftReference<kl<N>>(kl2);
        }
        return Collections.unmodifiableSet(kl2.d());
    }

    @Override
    public Set<E> d(Object object) {
        return Collections.unmodifiableSet(ii.c(this.b, new j(this, object)).keySet());
    }

    @Override
    public N b(Object object) {
        kl<N> kl2;
        Object n2 = super.b(object);
        if (n2 != null && (kl2 = i.a(this.c)) != null) {
            aU.b(kl2.remove(n2));
        }
        return n2;
    }

    @Override
    public N c(Object object) {
        kl<N> kl2;
        Object n2 = super.c(object);
        if (n2 != null && (kl2 = i.a(this.d)) != null) {
            aU.b(kl2.remove(n2));
        }
        return n2;
    }

    @Override
    public boolean a(E e2, N n2) {
        if (super.a(e2, n2)) {
            kl<N> kl2 = i.a(this.c);
            if (kl2 != null) {
                aU.b(kl2.add(n2));
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean b(E e2, N n2) {
        if (super.b(e2, n2)) {
            kl<N> kl2 = i.a(this.d);
            if (kl2 != null) {
                aU.b(kl2.add(n2));
            }
            return true;
        }
        return false;
    }

    private static <T> T a(Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }
}

