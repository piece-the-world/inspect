/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.gb;
import java.util.Iterator;

final class fT
extends cx<T> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ aV b;

    fT(Iterable iterable, aV aV2) {
        this.a = iterable;
        this.b = aV2;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.b(this.a.iterator(), this.b);
    }
}

