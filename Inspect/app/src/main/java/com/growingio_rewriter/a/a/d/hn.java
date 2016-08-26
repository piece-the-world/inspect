/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.ho;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class hn<K, V>
extends cC<Collection<V>> {
    final Collection<Collection<V>> a;
    final Set<Map.Entry<K, Collection<V>>> b;

    hn(Collection<Collection<V>> collection, Set<Map.Entry<K, Collection<V>>> set) {
        this.a = collection;
        this.b = set;
    }

    @Override
    protected Collection<Collection<V>> b() {
        return this.a;
    }

    @Override
    public Iterator<Collection<V>> iterator() {
        Iterator<Map.Entry<K, Collection<V>>> iterator = this.b.iterator();
        return new ho(this, iterator);
    }

    @Override
    public Object[] toArray() {
        return this.r();
    }

    @Override
    public <T> T[] toArray(T[] arrT) {
        return this.a(arrT);
    }

    @Override
    public boolean contains(Object object) {
        return this.b(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.a(collection);
    }

    @Override
    public boolean remove(Object object) {
        return this.c(object);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.c(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.d(collection);
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

