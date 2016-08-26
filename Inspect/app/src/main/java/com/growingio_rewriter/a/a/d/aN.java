/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.b.aV;
import com.growingio.a.a.b.aW;
import com.growingio.a.a.d.aL;
import com.growingio.a.a.d.fL;
import com.growingio.a.a.d.gO;
import com.growingio.a.a.d.gb;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

class aN<E>
extends AbstractCollection<E> {
    final Collection<E> a;
    final aV<? super E> b;

    aN(Collection<E> collection, aV<? super E> aV2) {
        this.a = collection;
        this.b = aV2;
    }

    aN<E> a(aV<? super E> aV2) {
        return new aN<E>(this.a, aW.a(this.b, aV2));
    }

    @Override
    public boolean add(E e2) {
        aU.a(this.b.a(e2));
        return this.a.add(e2);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        for (E e2 : collection) {
            aU.a(this.b.a(e2));
        }
        return this.a.addAll(collection);
    }

    @Override
    public void clear() {
        fL.a(this.a, this.b);
    }

    @Override
    public boolean contains(Object object) {
        if (aL.a(this.a, object)) {
            Object object2 = object;
            return this.b.a((Object)object2);
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return aL.a(this, collection);
    }

    @Override
    public boolean isEmpty() {
        return fL.d(this.a, this.b) == false;
    }

    @Override
    public Iterator<E> iterator() {
        return gb.b(this.a.iterator(), this.b);
    }

    @Override
    public boolean remove(Object object) {
        return this.contains(object) && this.a.remove(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return fL.a(this.a, aW.a(this.b, aW.a(collection)));
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return fL.a(this.a, aW.a(this.b, aW.a(aW.a(collection))));
    }

    @Override
    public int size() {
        return gb.b(this.iterator());
    }

    @Override
    public Object[] toArray() {
        return gO.a(this.iterator()).toArray();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return gO.a(this.iterator()).toArray(arrT);
    }
}

