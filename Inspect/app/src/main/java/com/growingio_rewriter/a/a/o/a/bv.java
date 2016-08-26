/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.o.a;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.o.a.bU;
import com.growingio.a.a.o.a.d;

class bv<V, X extends Exception>
extends d<V, X> {
    final aq<? super Exception, X> a;

    bv(bU<V> bU2, aq<? super Exception, X> aq2) {
        super(bU2);
        this.a = aU.a(aq2);
    }

    @Override
    protected X a(Exception exception) {
        return (X)((Exception)this.a.f(exception));
    }
}

