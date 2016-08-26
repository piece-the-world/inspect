/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class gn
implements Iterator<T> {
    private int c;
    final /* synthetic */ int a;
    final /* synthetic */ Iterator b;

    gn(int n2, Iterator iterator) {
        this.a = n2;
        this.b = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.a && this.b.hasNext();
    }

    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ++this.c;
        return (T)this.b.next();
    }

    @Override
    public void remove() {
        this.b.remove();
    }
}

