/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.A;
import com.growingio.a.a.d.B;
import com.growingio.a.a.d.D;
import com.growingio.a.a.d.G;
import com.growingio.a.a.d.H;
import com.growingio.a.a.d.N;
import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.o;
import com.growingio.a.a.d.p;
import com.growingio.a.a.d.q;
import com.growingio.a.a.d.u;
import com.growingio.a.a.d.y;
import com.growingio.a.a.d.z;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class n<K, V>
extends N<K, V>
implements Serializable {
    private transient Map<K, Collection<V>> a;
    private transient int b;
    private static final long c = 2447537837011683357L;

    protected n(Map<K, Collection<V>> map) {
        aU.a(map.isEmpty());
        this.a = map;
    }

    final void a(Map<K, Collection<V>> map) {
        this.a = map;
        this.b = 0;
        for (Collection<Collection<V>> collection : map.values()) {
            aU.a(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    Collection<V> e() {
        return this.a(this.d());
    }

    abstract Collection<V> d();

    Collection<V> e(K k2) {
        return this.d();
    }

    Map<K, Collection<V>> f() {
        return this.a;
    }

    @Override
    public int l_() {
        return this.b;
    }

    @Override
    public boolean f(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public boolean a(K k2, V v2) {
        Collection<V> collection = this.a.get(k2);
        if (collection == null) {
            collection = this.e(k2);
            if (collection.add(v2)) {
                ++this.b;
                this.a.put(k2, collection);
                return true;
            }
            throw new AssertionError((Object)"New Collection violated the Collection spec");
        }
        if (collection.add(v2)) {
            ++this.b;
            return true;
        }
        return false;
    }

    private Collection<V> j(K k2) {
        Collection<V> collection = this.a.get(k2);
        if (collection == null) {
            collection = this.e(k2);
            this.a.put(k2, collection);
        }
        return collection;
    }

    @Override
    public Collection<V> b(K k2, Iterable<? extends V> iterable) {
        Iterator<V> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            return this.d(k2);
        }
        Collection<V> collection = this.j(k2);
        Collection<V> collection2 = this.d();
        collection2.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        while (iterator.hasNext()) {
            if (!collection.add(iterator.next())) continue;
            ++this.b;
        }
        return this.a(collection2);
    }

    @Override
    public Collection<V> d(Object object) {
        Collection<V> collection = this.a.remove(object);
        if (collection == null) {
            return this.e();
        }
        Collection<V> collection2 = this.d();
        collection2.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return this.a(collection2);
    }

    Collection<V> a(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet)collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set)collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List)collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    @Override
    public void h() {
        for (Collection<V> collection : this.a.values()) {
            collection.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    @Override
    public Collection<V> c(K k2) {
        Collection<V> collection = this.a.get(k2);
        if (collection == null) {
            collection = this.e(k2);
        }
        return this.a(k2, collection);
    }

    Collection<V> a(K k2, Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return new H(this, k2, (SortedSet)collection, null);
        }
        if (collection instanceof Set) {
            return new G(this, k2, (Set)collection);
        }
        if (collection instanceof List) {
            return this.a(k2, (List)collection, null);
        }
        return new B(this, k2, collection, null);
    }

    private List<V> a(K k2, List<V> list, n<K, V> n2) {
        return list instanceof RandomAccess ? new y(this, k2, list, n2) : new D(this, k2, list, n2);
    }

    private Iterator<V> b(Collection<V> collection) {
        return collection instanceof List ? ((List)collection).listIterator() : collection.iterator();
    }

    @Override
    Set<K> i() {
        return this.a instanceof SortedMap ? new A(this, (SortedMap)this.a) : new u(this, this.a);
    }

    private void k(Object object) {
        Collection<V> collection = ii.c(this.a, object);
        if (collection != null) {
            int n2 = collection.size();
            collection.clear();
            this.b -= n2;
        }
    }

    @Override
    public Collection<V> j() {
        return super.j();
    }

    @Override
    Iterator<V> k() {
        return new o(this);
    }

    @Override
    public Collection<Map.Entry<K, V>> l() {
        return super.l();
    }

    @Override
    Iterator<Map.Entry<K, V>> m() {
        return new p(this);
    }

    @Override
    Map<K, Collection<V>> n() {
        return this.a instanceof SortedMap ? new z(this, (SortedMap)this.a) : new q(this, this.a);
    }

    static /* synthetic */ Map a(n n2) {
        return n2.a;
    }

    static /* synthetic */ Iterator a(n n2, Collection collection) {
        return n2.b(collection);
    }

    static /* synthetic */ int b(n n2) {
        return n2.b--;
    }

    static /* synthetic */ int c(n n2) {
        return n2.b++;
    }

    static /* synthetic */ int d(n n2) {
        return n2.b;
    }

    static /* synthetic */ int a(n n2, int n3) {
        n2.b = n3;
        return n2.b;
    }

    static /* synthetic */ List a(n n2, Object object, List list, B b2) {
        return n2.a(object, list, b2);
    }

    static /* synthetic */ void a(n n2, Object object) {
        n2.k(object);
    }
}

