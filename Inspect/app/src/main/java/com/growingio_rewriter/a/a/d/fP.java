/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gb;
import java.util.Comparator;
import java.util.Iterator;

final class fP
extends cx<T> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ Comparator b;

    fP(Iterable iterable, Comparator comparator) {
        this.a = iterable;
        this.b = comparator;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.a(fL.a(this.a, fL.a()), this.b);
    }
}

