/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.o.a.a;
import com.growingio.a.a.o.a.bU;

final class c<V, X extends Throwable>
extends a<V, X, aq<? super X, ? extends V>, V> {
    c(bU<? extends V> bU2, Class<X> class_, aq<? super X, ? extends V> aq2) {
        super(bU2, class_, aq2);
    }

    @Override
    V a(aq<? super X, ? extends V> aq2, X x2) throws Exception {
        return aq2.f(x2);
    }

    @Override
    void a(V v2) {
        this.b(v2);
    }
}

