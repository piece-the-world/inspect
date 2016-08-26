/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.B;
import com.growingio.a.a.d.E;
import com.growingio.a.a.d.n;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class D
extends n<K, V>
implements List<V> {
    final /* synthetic */ n g;

    D(K var1_1, List<V> k2, n<K, V> list) {
        this.g = var1_1;
        super((n)var1_1, k2, list, n2);
    }

    List<V> g() {
        return (List)this.e();
    }

    @Override
    public boolean addAll(int n2, Collection<? extends V> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int n3 = this.size();
        boolean bl2 = this.g().addAll(n2, collection);
        if (bl2) {
            int n4 = this.e().size();
            n.a(this.g, n.d(this.g) + (n4 - n3));
            if (n3 == 0) {
                this.d();
            }
        }
        return bl2;
    }

    @Override
    public V get(int n2) {
        this.a();
        return this.g().get(n2);
    }

    @Override
    public V set(int n2, V v2) {
        this.a();
        return this.g().set(n2, v2);
    }

    @Override
    public void add(int n2, V v2) {
        this.a();
        boolean bl2 = this.e().isEmpty();
        this.g().add(n2, v2);
        n.c(this.g);
        if (bl2) {
            this.d();
        }
    }

    @Override
    public V remove(int n2) {
        this.a();
        V v2 = this.g().remove(n2);
        n.b(this.g);
        this.b();
        return v2;
    }

    @Override
    public int indexOf(Object object) {
        this.a();
        return this.g().indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        this.a();
        return this.g().lastIndexOf(object);
    }

    @Override
    public ListIterator<V> listIterator() {
        this.a();
        return new E(this);
    }

    @Override
    public ListIterator<V> listIterator(int n2) {
        this.a();
        return new E(this, n2);
    }

    @Override
    public List<V> subList(int n2, int n3) {
        this.a();
        return n.a(this.g, this.c(), this.g().subList(n2, n3), (B)((Object)(this.f() == null ? this : this.f())));
    }
}

