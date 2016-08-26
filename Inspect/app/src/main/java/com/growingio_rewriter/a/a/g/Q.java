/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.g;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dG;
import com.growingio.a.a.d.ei;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.g.R;
import com.growingio.a.a.g.f;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

final class Q<N, E>
extends f<N, E> {
    private transient Reference<kl<N>> b;

    private Q(Map<E, N> map) {
        super(map);
    }

    static <N, E> Q<N, E> g() {
        return new Q(ii.a(11));
    }

    static <N, E> Q<N, E> a(Map<E, N> map) {
        return new Q<N, E>(ei.b(map));
    }

    @Override
    public Set<E> d(Object object) {
        return Collections.unmodifiableSet(ii.c(this.a, new R(this, object)).keySet());
    }

    @Override
    public Set<N> a() {
        kl<N> kl2 = Q.a(this.b);
        if (kl2 == null) {
            kl2 = dG.a(this.a.values());
            this.b = new SoftReference<kl<N>>(kl2);
        }
        return Collections.unmodifiableSet(kl2.d());
    }

    @Override
    public N b(Object object) {
        return this.c(object);
    }

    @Override
    public N c(Object object) {
        kl<N> kl2;
        Object n2 = super.c(object);
        if (n2 != null && (kl2 = Q.a(this.b)) != null) {
            aU.b(kl2.remove(n2));
        }
        return n2;
    }

    @Override
    public boolean a(E e2, N n2) {
        return this.b(e2, n2);
    }

    @Override
    public boolean b(E e2, N n2) {
        if (super.b(e2, n2)) {
            kl<N> kl2 = Q.a(this.b);
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

