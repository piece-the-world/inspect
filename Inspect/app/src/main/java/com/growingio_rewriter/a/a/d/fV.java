/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.gb;
import java.util.Iterator;

final class fV
extends cx<T> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ aq b;

    fV(Iterable iterable, aq aq2) {
        this.a = iterable;
        this.b = aq2;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.a(this.a.iterator(), this.b);
    }
}

