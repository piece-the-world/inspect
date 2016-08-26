/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.o.a.ae;
import com.growingio.a.a.o.a.bU;

final class ag<I, O>
extends ae<I, O, aq<? super I, ? extends O>, O> {
    ag(bU<? extends I> bU2, aq<? super I, ? extends O> aq2) {
        super(bU2, aq2);
    }

    @Override
    O a(aq<? super I, ? extends O> aq2, I i2) {
        return aq2.f(i2);
    }

    @Override
    void a(O o2) {
        this.b(o2);
    }
}

