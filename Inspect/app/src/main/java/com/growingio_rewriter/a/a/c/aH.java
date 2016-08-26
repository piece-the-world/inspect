/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aF;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

final class aH
extends AbstractCollection<V> {
    private final ConcurrentMap<?, ?> b;
    final /* synthetic */ O a;

    aH(ConcurrentMap<?, ?> var1_1) {
        this.a = var1_1;
        this.b = concurrentMap;
    }

    @Override
    public int size() {
        return this.b.size();
    }

    @Override
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override
    public void clear() {
        this.b.clear();
    }

    @Override
    public Iterator<V> iterator() {
        return new aF(this.a);
    }

    @Override
    public boolean contains(Object object) {
        return this.b.containsValue(object);
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

