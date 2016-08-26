/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.gb;
import java.util.Iterator;

final class fZ
extends cx<T> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    fZ(Iterable iterable, int n2) {
        this.a = iterable;
        this.b = n2;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.e(this.a.iterator(), this.b);
    }
}

