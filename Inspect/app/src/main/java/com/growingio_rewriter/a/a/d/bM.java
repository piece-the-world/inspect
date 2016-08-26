/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bN;
import com.growingio.a.a.d.cT;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.d.my;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

abstract class bM<E>
extends cT<E>
implements mu<E> {
    private transient Comparator<? super E> a;
    private transient NavigableSet<E> b;
    private transient Set<km<E>> c;

    bM() {
    }

    abstract mu<E> c();

    @Override
    public Comparator<? super E> comparator() {
        Comparator<E> comparator = this.a;
        if (comparator == null) {
            this.a = kO.a(this.c().comparator()).a();
            return this.a;
        }
        return comparator;
    }

    @Override
    public NavigableSet<E> e_() {
        NavigableSet<E> navigableSet = this.b;
        if (navigableSet == null) {
            this.b = new my<E>(this);
            return this.b;
        }
        return navigableSet;
    }

    @Override
    public km<E> k() {
        return this.c().l();
    }

    @Override
    public km<E> l() {
        return this.c().k();
    }

    @Override
    public mu<E> d(E e2, aD aD2) {
        return this.c().c(e2, aD2).o();
    }

    @Override
    public mu<E> a(E e2, aD aD2, E e3, aD aD3) {
        return this.c().a(e3, aD3, e2, aD2).o();
    }

    @Override
    public mu<E> c(E e2, aD aD2) {
        return this.c().d(e2, aD2).o();
    }

    @Override
    protected kl<E> f() {
        return this.c();
    }

    @Override
    public mu<E> o() {
        return this.c();
    }

    @Override
    public km<E> i() {
        return this.c().j();
    }

    @Override
    public km<E> j() {
        return this.c().i();
    }

    abstract Iterator<km<E>> e();

    @Override
    public Set<km<E>> a() {
        Set<km<km<E>>> set = this.c;
        Set<km<km<E>>> set2 = set == null ? (this.c = this.h()) : set;
        return set2;
    }

    Set<km<E>> h() {
        return new bN(this);
    }

    @Override
    public Iterator<E> iterator() {
        return kn.b(this);
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
    public String toString() {
        return this.a().toString();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.e_();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.f();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.f();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.e_();
    }
}

