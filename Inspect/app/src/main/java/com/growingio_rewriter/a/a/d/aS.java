/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.gb;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

class aS<F, T>
extends AbstractCollection<T> {
    final Collection<F> a;
    final aq<? super F, ? extends T> b;

    aS(Collection<F> collection, aq<? super F, ? extends T> aq2) {
        this.a = aU.a(collection);
        this.b = aU.a(aq2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return gb.a(this.a.iterator(), this.b);
    }

    @Override
    public int size() {
        return this.a.size();
    }
}

