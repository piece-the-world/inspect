/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cT;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

class kF<E>
extends cT<E>
implements Serializable {
    final kl<? extends E> a;
    transient Set<E> b;
    transient Set<km<E>> c;
    private static final long d = 0;

    kF(kl<? extends E> kl2) {
        this.a = kl2;
    }

    @Override
    protected kl<E> f() {
        return this.a;
    }

    Set<E> c() {
        return Collections.unmodifiableSet(this.a.d());
    }

    @Override
    public Set<E> d() {
        Set<E> set = this.b;
        Set<E> set2 = set == null ? (this.b = this.c()) : set;
        return set2;
    }

    @Override
    public Set<km<E>> a() {
        Set<km<km<E>>> set = this.c;
        Set set2 = set == null ? (this.c = Collections.unmodifiableSet(this.a.a())) : set;
        return set2;
    }

    @Override
    public Iterator<E> iterator() {
        return gb.a(this.a.iterator());
    }

    @Override
    public boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int a(E e2, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(Object object, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int c(E e2, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a(E e2, int n2, int n3) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.f();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.f();
    }
}

