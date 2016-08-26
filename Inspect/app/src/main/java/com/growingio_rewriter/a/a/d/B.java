/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.C;
import com.growingio.a.a.d.n;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

class B
extends AbstractCollection<V> {
    final K b;
    Collection<V> c;
    final n<K, V> d;
    final Collection<V> e;
    final /* synthetic */ n f;

    B(K var1_1, Collection<V> k2, n<K, V> collection) {
        this.f = var1_1;
        this.b = k2;
        this.c = collection;
        this.d = n2;
        this.e = n2 == null ? null : n2.e();
    }

    void a() {
        Collection collection;
        if (this.d != null) {
            this.d.a();
            if (this.d.e() != this.e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.c.isEmpty() && (collection = (Collection)n.a(this.f).get(this.b)) != null) {
            this.c = collection;
        }
    }

    void b() {
        if (this.d != null) {
            this.d.b();
        } else if (this.c.isEmpty()) {
            n.a(this.f).remove(this.b);
        }
    }

    K c() {
        return this.b;
    }

    void d() {
        if (this.d != null) {
            this.d.d();
        } else {
            n.a(this.f).put(this.b, this.c);
        }
    }

    @Override
    public int size() {
        this.a();
        return this.c.size();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        this.a();
        return this.c.equals(object);
    }

    @Override
    public int hashCode() {
        this.a();
        return this.c.hashCode();
    }

    @Override
    public String toString() {
        this.a();
        return this.c.toString();
    }

    Collection<V> e() {
        return this.c;
    }

    @Override
    public Iterator<V> iterator() {
        this.a();
        return new C(this);
    }

    @Override
    public boolean add(V v2) {
        this.a();
        boolean bl2 = this.c.isEmpty();
        boolean bl3 = this.c.add(v2);
        if (bl3) {
            n.c(this.f);
            if (bl2) {
                this.d();
            }
        }
        return bl3;
    }

    n<K, V> f() {
        return this.d;
    }

    @Override
    public boolean addAll(Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl2 = this.c.addAll(collection);
        if (bl2) {
            int n3 = this.c.size();
            n.a(this.f, n.d(this.f) + (n3 - n2));
            if (n2 == 0) {
                this.d();
            }
        }
        return bl2;
    }

    @Override
    public boolean contains(Object object) {
        this.a();
        return this.c.contains(object);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        this.a();
        return this.c.containsAll(collection);
    }

    @Override
    public void clear() {
        int n2 = this.size();
        if (n2 == 0) {
            return;
        }
        this.c.clear();
        n.a(this.f, n.d(this.f) - n2);
        this.b();
    }

    @Override
    public boolean remove(Object object) {
        this.a();
        boolean bl2 = this.c.remove(object);
        if (bl2) {
            n.b(this.f);
            this.b();
        }
        return bl2;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n2 = this.size();
        boolean bl2 = this.c.removeAll(collection);
        if (bl2) {
            int n3 = this.c.size();
            n.a(this.f, n.d(this.f) + (n3 - n2));
            this.b();
        }
        return bl2;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        aU.a(collection);
        int n2 = this.size();
        boolean bl2 = this.c.retainAll(collection);
        if (bl2) {
            int n3 = this.c.size();
            n.a(this.f, n.d(this.f) + (n3 - n2));
            this.b();
        }
        return bl2;
    }
}

