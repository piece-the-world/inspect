/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.gb;
import java.util.Iterator;
import java.util.List;

final class fR
extends cx<List<T>> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    fR(Iterable iterable, int n2) {
        this.a = iterable;
        this.b = n2;
    }

    @Override
    public Iterator<List<T>> iterator() {
        return gb.a(this.a.iterator(), this.b);
    }
}

