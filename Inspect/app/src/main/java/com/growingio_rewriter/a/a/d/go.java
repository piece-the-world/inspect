/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.oP;
import java.util.Iterator;

final class go
extends oP<T> {
    final /* synthetic */ Iterator a;

    go(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public T next() {
        Object e2 = this.a.next();
        this.a.remove();
        return (T)e2;
    }

    public String toString() {
        return "Iterators.consumingIterator(...)";
    }
}

