/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class gj
implements Iterator<T> {
    Iterator<T> a;
    final /* synthetic */ Iterable b;

    gj(Iterable iterable) {
        this.b = iterable;
        this.a = gb.c();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext() || this.b.iterator().hasNext();
    }

    @Override
    public T next() {
        if (!this.a.hasNext()) {
            this.a = this.b.iterator();
            if (!this.a.hasNext()) {
                throw new NoSuchElementException();
            }
        }
        return this.a.next();
    }

    @Override
    public void remove() {
        this.a.remove();
    }
}

