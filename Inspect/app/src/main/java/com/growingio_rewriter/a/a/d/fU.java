/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cx;
import com.growingio.a.a.d.gb;
import java.util.Iterator;

final class fU
extends cx<T> {
    final /* synthetic */ Iterable a;
    final /* synthetic */ Class b;

    fU(Iterable iterable, Class class_) {
        this.a = iterable;
        this.b = class_;
    }

    @Override
    public Iterator<T> iterator() {
        return gb.b(this.a.iterator(), this.b);
    }
}

