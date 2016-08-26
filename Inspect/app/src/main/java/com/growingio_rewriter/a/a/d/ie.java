/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.ic;
import java.util.AbstractCollection;
import java.util.Iterator;

final class ie
extends AbstractCollection<V> {
    final /* synthetic */ hG a;

    ie(hG hG2) {
        this.a = hG2;
    }

    @Override
    public Iterator<V> iterator() {
        return new ic(this.a);
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
    public boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public Object[] toArray() {
        return hG.a(this).toArray();
    }

    @Override
    public <E> E[] toArray(E[] arrE) {
        return hG.a(this).toArray(arrE);
    }
}

