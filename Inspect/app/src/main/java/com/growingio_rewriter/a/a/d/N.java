/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.O;
import com.growingio.a.a.d.P;
import com.growingio.a.a.d.Q;
import com.growingio.a.a.d.R;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.iU;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jN;
import com.growingio.a.a.d.jW;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.lH;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class N<K, V>
implements jr<K, V> {
    private transient Collection<Map.Entry<K, V>> a;
    private transient Set<K> b;
    private transient kl<K> c;
    private transient Collection<V> d;
    private transient Map<K, Collection<V>> e;

    N() {
    }

    @Override
    public boolean o() {
        return this.l_() == 0;
    }

    @Override
    public boolean g(Object object) {
        for (Collection<V> collection : this.c().values()) {
            if (!collection.contains(object)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean b(Object object, Object object2) {
        Collection<V> collection = this.c().get(object);
        return collection != null && collection.contains(object2);
    }

    @Override
    public boolean c(Object object, Object object2) {
        Collection<V> collection = this.c().get(object);
        return collection != null && collection.remove(object2);
    }

    @Override
    public boolean a(K k2, V v2) {
        return this.c(k2).add(v2);
    }

    @Override
    public boolean c(K k2, Iterable<? extends V> iterable) {
        aU.a(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection)iterable;
            return !collection.isEmpty() && this.c(k2).addAll(collection);
        }
        Iterator<V> iterator = iterable.iterator();
        return iterator.hasNext() && gb.a(this.c(k2), iterator);
    }

    @Override
    public boolean a(jr<? extends K, ? extends V> jr2) {
        boolean bl2 = false;
        for (Map.Entry<K, V> entry : jr2.l()) {
            bl2 |= this.a(entry.getKey(), entry.getValue());
        }
        return bl2;
    }

    @Override
    public Collection<V> b(K k2, Iterable<? extends V> iterable) {
        aU.a(iterable);
        Collection collection = this.d(k2);
        this.c(k2, iterable);
        return collection;
    }

    @Override
    public Collection<Map.Entry<K, V>> l() {
        Collection<Map.Entry<K, V>> collection = this.a;
        Collection<Map.Entry<K, V>> collection2 = collection == null ? (this.a = this.p()) : collection;
        return collection2;
    }

    Collection<Map.Entry<K, V>> p() {
        if (this instanceof lH) {
            return new Q(this, null);
        }
        return new P(this, null);
    }

    abstract Iterator<Map.Entry<K, V>> m();

    @Override
    public Set<K> q() {
        Set<K> set = this.b;
        Set<K> set2 = set == null ? (this.b = this.i()) : set;
        return set2;
    }

    Set<K> i() {
        return new iU<K, Collection<V>>(this.c());
    }

    @Override
    public kl<K> r() {
        kl<K> kl2 = this.c;
        kl<K> kl3 = kl2 == null ? (this.c = this.s()) : kl2;
        return kl3;
    }

    kl<K> s() {
        return new jW<K, V>(this);
    }

    @Override
    public Collection<V> j() {
        Collection<V> collection = this.d;
        Collection<V> collection2 = collection == null ? (this.d = this.t()) : collection;
        return collection2;
    }

    Collection<V> t() {
        return new R(this);
    }

    Iterator<V> k() {
        return ii.b(this.l().iterator());
    }

    @Override
    public Map<K, Collection<V>> c() {
        Map<K, Collection<Collection<V>>> map = this.e;
        Map<K, Collection<Collection<V>>> map2 = map == null ? (this.e = this.n()) : map;
        return map2;
    }

    abstract Map<K, Collection<V>> n();

    @Override
    public boolean equals(Object object) {
        return jN.a(this, object);
    }

    @Override
    public int hashCode() {
        return this.c().hashCode();
    }

    public String toString() {
        return this.c().toString();
    }
}

