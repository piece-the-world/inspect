/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import java.util.AbstractSet;
import java.util.concurrent.ConcurrentMap;

abstract class R<T>
extends AbstractSet<T> {
    final ConcurrentMap<?, ?> a;
    final /* synthetic */ O b;

    R(ConcurrentMap<?, ?> var1_1) {
        this.b = var1_1;
        this.a = concurrentMap;
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public Object[] toArray() {
        return O.a(this).toArray();
    }

    @Override
    public <E> E[] toArray(E[] arrE) {
        return O.a(this).toArray(arrE);
    }
}

