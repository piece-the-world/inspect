/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import java.util.Iterator;

abstract class nP<F, T>
implements Iterator<T> {
    final Iterator<? extends F> c;

    nP(Iterator<? extends F> iterator) {
        this.c = aU.a(iterator);
    }

    abstract T a(F var1);

    @Override
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    @Override
    public final T next() {
        return this.a(this.c.next());
    }

    @Override
    public final void remove() {
        this.c.remove();
    }
}

