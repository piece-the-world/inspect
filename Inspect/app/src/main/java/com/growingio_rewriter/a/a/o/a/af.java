/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.o.a.ae;
import com.growingio.a.a.o.a.aq;
import com.growingio.a.a.o.a.bU;

final class af<I, O>
extends ae<I, O, aq<? super I, ? extends O>, bU<? extends O>> {
    af(bU<? extends I> bU2, aq<? super I, ? extends O> aq2) {
        super(bU2, aq2);
    }

    @Override
    bU<? extends O> a(aq<? super I, ? extends O> aq2, I i2) throws Exception {
        bU<? extends O> bU2 = aq2.a(i2);
        aU.a(bU2, (Object)"AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)?");
        return bU2;
    }

    @Override
    void a(bU<? extends O> bU2) {
        this.b(bU2);
    }
}

