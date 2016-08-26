/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.bt;
import com.growingio.a.a.d.cx;
import java.util.Iterator;
import java.util.Queue;

final class fN
extends cx<T> {
    final /* synthetic */ Iterable a;

    fN(Iterable iterable) {
        this.a = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return new bt((Queue)this.a);
    }

    @Override
    public String toString() {
        return "Iterables.consumingIterable(...)";
    }
}

