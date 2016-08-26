/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import java.util.Iterator;

final class cy
extends cx<E> {
    final /* synthetic */ Iterable a;

    cy(Iterable iterable, Iterable iterable2) {
        this.a = iterable2;
        super(iterable);
    }

    @Override
    public Iterator<E> iterator() {
        return this.a.iterator();
    }
}

