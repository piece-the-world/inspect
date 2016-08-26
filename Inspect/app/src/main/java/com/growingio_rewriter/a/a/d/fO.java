/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.gb;
import java.util.Iterator;

final class fO
extends cx<T> {
    final /* synthetic */ Iterable a;

    fO(Iterable iterable) {
        this.a = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.g(this.a.iterator());
    }

    @Override
    public String toString() {
        return "Iterables.consumingIterable(...)";
    }
}

