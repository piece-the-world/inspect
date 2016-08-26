/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jk;
import com.growingio.a.a.d.n;
import com.growingio.a.a.d.r;
import com.growingio.a.a.d.s;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class q
extends jk<K, Collection<V>> {
    final transient Map<K, Collection<V>> a;
    final /* synthetic */ n b;

    q(Map<K, Collection<V>> var1_1) {
        this.b = var1_1;
        this.a = map;
    }

    @Override
    protected Set<Map.Entry<K, Collection<V>>> a() {
        return new r(this);
    }

    @Override
    public boolean containsKey(Object object) {
        return ii.b(this.a, object);
    }

    public Collection<V> a(Object object) {
        Collection<V> collection = ii.a(this.a, object);
        if (collection == null) {
            return null;
        }
        Object object2 = object;
        return this.b.a(object2, collection);
    }

    @Override
    public Set<K> keySet() {
        return this.b.q();
    }

    @Override
    public int size() {
        return this.a.size();
    }

    public Collection<V> b(Object object) {
        Collection<V> collection = this.a.remove(object);
        if (collection == null) {
            return null;
        }
        Collection collection2 = this.b.d();
        collection2.addAll(collection);
        n.a(this.b, n.d(this.b) - collection.size());
        collection.clear();
        return collection2;
    }

    @Override
    public boolean equals(Object object) {
        return this == object || this.a.equals(object);
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    @Override
    public void clear() {
        if (this.a == n.a(this.b)) {
            this.b.h();
        } else {
            gb.i(new s(this));
        }
    }

    Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
        K k2 = entry.getKey();
        return ii.a(k2, this.b.a(k2, entry.getValue()));
    }

    @Override
    public /* synthetic */ Object remove(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Object get(Object object) {
        return this.a(object);
    }
}

