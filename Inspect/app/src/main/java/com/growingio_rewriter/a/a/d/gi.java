/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.oP;
import java.util.Iterator;

final class gi
extends oP<T> {
    final /* synthetic */ Iterator a;

    gi(Iterator iterator) {
        this.a = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public T next() {
        return (T)this.a.next();
    }
}

