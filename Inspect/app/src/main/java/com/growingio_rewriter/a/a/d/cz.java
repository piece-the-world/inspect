/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gb;
import java.util.Iterator;

final class cz
extends cx<T> {
    final /* synthetic */ Iterable a;

    cz(Iterable iterable) {
        this.a = iterable;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.e(fL.a(this.a, fL.a()).iterator());
    }
}

