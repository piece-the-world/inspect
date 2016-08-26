/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.N;
import java.util.AbstractCollection;
import java.util.Iterator;

class R
extends AbstractCollection<V> {
    final /* synthetic */ N a;

    R(N n2) {
        this.a = n2;
    }

    @Override
    public Iterator<V> iterator() {
        return this.a.k();
    }

    @Override
    public int size() {
        return this.a.l_();
    }

    @Override
    public boolean contains(Object object) {
        return this.a.g(object);
    }

    @Override
    public void clear() {
        this.a.h();
    }
}

