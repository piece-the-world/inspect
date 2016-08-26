/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.dd;
import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hm;
import com.growingio.a.a.d.ii;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class hl<K, V>
extends dd<Map.Entry<K, Collection<V>>> {
    private final hg<? super K, ? super V> a;
    private final Set<Map.Entry<K, Collection<V>>> b;

    hl(Set<Map.Entry<K, Collection<V>>> set, hg<? super K, ? super V> hg2) {
        this.b = set;
        this.a = hg2;
    }

    @Override
    protected Set<Map.Entry<K, Collection<V>>> a() {
        return this.b;
    }

    @Override
    public Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new hm(this, this.b.iterator());
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
        return ii.a(this.a(), object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.a(collection);
    }

    @Override
    public boolean equals(Object object) {
        return this.i(object);
    }

    @Override
    public int hashCode() {
        return this.j();
    }

    @Override
    public boolean remove(Object object) {
        return ii.b(this.a(), object);
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
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }

    static /* synthetic */ hg a(hl hl2) {
        return hl2.a;
    }
}

