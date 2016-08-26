/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.aR;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.k.f;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

final class aQ<E>
extends AbstractCollection<List<E>> {
    final ea<E> a;

    aQ(ea<E> ea2) {
        this.a = ea2;
    }

    @Override
    public int size() {
        return f.d(this.a.size());
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<List<E>> iterator() {
        return new aR<E>(this.a);
    }

    @Override
    public boolean contains(Object object) {
        if (object instanceof List) {
            List list = (List)object;
            return aL.a(this.a, list);
        }
        return false;
    }

    @Override
    public String toString() {
        return "permutations(" + this.a + ")";
    }
}

