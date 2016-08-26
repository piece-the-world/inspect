/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aq;
import com.growingio.a.a.d.he;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

class hd<F, T>
extends AbstractSequentialList<T>
implements Serializable {
    final List<F> a;
    final aq<? super F, ? extends T> b;
    private static final long c = 0;

    hd(List<F> list, aq<? super F, ? extends T> aq2) {
        this.a = aU.a(list);
        this.b = aU.a(aq2);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public ListIterator<T> listIterator(int n2) {
        return new he(this, this.a.listIterator(n2));
    }
}

