/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.af;
import java.util.AbstractCollection;
import java.util.Iterator;

class ai
extends AbstractCollection<V> {
    final /* synthetic */ af a;

    ai(af af2) {
        this.a = af2;
    }

    @Override
    public Iterator<V> iterator() {
        return this.a.q_();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.c(object);
    }

    @Override
    public void clear() {
        this.a.d();
    }

    @Override
    public int size() {
        return this.a.n();
    }
}

