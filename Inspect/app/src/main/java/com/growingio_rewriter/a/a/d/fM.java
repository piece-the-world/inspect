/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.gb;
import java.util.Iterator;

final class fM
extends cx<T> {
    final /* synthetic */ Iterable a;

    fM(Iterable iterable) {
        this.a = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.a(this.a);
    }

    @Override
    public String toString() {
        return this.a.toString() + " (cycled)";
    }
}

