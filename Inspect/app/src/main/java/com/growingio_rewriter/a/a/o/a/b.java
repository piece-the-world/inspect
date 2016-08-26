/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.a;
import com.growingio.a.a.o.a.aq;
import com.growingio.a.a.o.a.bU;

final class b<V, X extends Throwable>
extends a<V, X, aq<? super X, ? extends V>, bU<? extends V>> {
    b(bU<? extends V> bU2, Class<X> class_, aq<? super X, ? extends V> aq2) {
        super(bU2, class_, aq2);
    }

    @Override
    bU<? extends V> a(aq<? super X, ? extends V> aq2, X x2) throws Exception {
        bU<? extends V> bU2 = aq2.a(x2);
        aU.a(bU2, (Object)"AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
        return bU2;
    }

    @Override
    void a(bU<? extends V> bU2) {
        this.b(bU2);
    }
}

