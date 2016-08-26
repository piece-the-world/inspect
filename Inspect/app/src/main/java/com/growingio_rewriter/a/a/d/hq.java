/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hr;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class hq<K, V>
extends cC<Map.Entry<K, V>> {
    final hg<? super K, ? super V> a;
    final Collection<Map.Entry<K, V>> b;

    hq(Collection<Map.Entry<K, V>> collection, hg<? super K, ? super V> hg2) {
        this.b = collection;
        this.a = hg2;
    }

    @Override
    protected Collection<Map.Entry<K, V>> b() {
        return this.b;
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return new hr(this, this.b.iterator());
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
        return ii.a(this.b(), object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.a(collection);
    }

    @Override
    public boolean remove(Object object) {
        return ii.b(this.b(), object);
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

