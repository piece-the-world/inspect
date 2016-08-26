/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.T;
import com.growingio.a.a.d.U;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class S<E>
extends AbstractCollection<E>
implements kl<E> {
    private transient Set<E> a;
    private transient Set<km<E>> b;

    S() {
    }

    @Override
    public int size() {
        return kn.c(this);
    }

    @Override
    public boolean isEmpty() {
        return this.a().isEmpty();
    }

    @Override
    public boolean contains(Object object) {
        return this.a(object) > 0;
    }

    @Override
    public Iterator<E> iterator() {
        return kn.b(this);
    }

    @Override
    public int a(Object object) {
        for (km<E> km2 : this.a()) {
            if (!aL.a(km2.a(), object)) continue;
            return km2.b();
        }
        return 0;
    }

    @Override
    public boolean add(E e2) {
        this.a(e2, 1);
        return true;
    }

    @Override
    public int a(E e2, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object object) {
        return this.b(object, 1) > 0;
    }

    @Override
    public int b(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int c(E e2, int n2) {
        return kn.a(this, e2, n2);
    }

    @Override
    public boolean a(E e2, int n2, int n3) {
        return kn.a(this, e2, n2, n3);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return kn.a(this, collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return kn.b(this, collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return kn.c(this, collection);
    }

    @Override
    public void clear() {
        gb.i(this.b());
    }

    @Override
    public Set<E> d() {
        Set<E> set = this.a;
        if (set == null) {
            this.a = set = this.e();
        }
        return set;
    }

    Set<E> e() {
        return new T(this);
    }

    abstract Iterator<km<E>> b();

    abstract int c();

    @Override
    public Set<km<E>> a() {
        Set<km<km<km<km<E>>>>> set = this.b;
        if (set == null) {
            this.b = set = this.f();
        }
        return set;
    }

    Set<km<E>> f() {
        return new U(this);
    }

    @Override
    public boolean equals(Object object) {
        return kn.a(this, object);
    }

    @Override
    public int hashCode() {
        return this.a().hashCode();
    }

    @Override
    public String toString() {
        return this.a().toString();
    }
}

