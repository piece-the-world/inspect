/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.cT;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.mu;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public abstract class dh<E>
extends cT<E>
implements mu<E> {
    protected dh() {
    }

    protected abstract mu<E> c();

    @Override
    public NavigableSet<E> e_() {
        return (NavigableSet)super.d();
    }

    @Override
    public Comparator<? super E> comparator() {
        return this.c().comparator();
    }

    @Override
    public mu<E> o() {
        return this.c().o();
    }

    @Override
    public km<E> i() {
        return this.c().i();
    }

    protected km<E> e() {
        Iterator<km<E>> iterator = this.a().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        km<E> km2 = iterator.next();
        return kn.a(km2.a(), km2.b());
    }

    @Override
    public km<E> j() {
        return this.c().j();
    }

    protected km<E> h() {
        Iterator<km<E>> iterator = this.o().a().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        km<E> km2 = iterator.next();
        return kn.a(km2.a(), km2.b());
    }

    @Override
    public km<E> k() {
        return this.c().k();
    }

    protected km<E> v() {
        Iterator<km<E>> iterator = this.a().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        km<E> km2 = iterator.next();
        km2 = kn.a(km2.a(), km2.b());
        iterator.remove();
        return km2;
    }

    @Override
    public km<E> l() {
        return this.c().l();
    }

    protected km<E> w() {
        Iterator<km<E>> iterator = this.o().a().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        km<E> km2 = iterator.next();
        km2 = kn.a(km2.a(), km2.b());
        iterator.remove();
        return km2;
    }

    @Override
    public mu<E> d(E e2, aD aD2) {
        return this.c().d(e2, aD2);
    }

    @Override
    public mu<E> a(E e2, aD aD2, E e3, aD aD3) {
        return this.c().a(e2, aD2, e3, aD3);
    }

    protected mu<E> b(E e2, aD aD2, E e3, aD aD3) {
        return this.c(e2, aD2).d(e3, aD3);
    }

    @Override
    public mu<E> c(E e2, aD aD2) {
        return this.c().c(e2, aD2);
    }

    @Override
    public /* synthetic */ Set d() {
        return this.e_();
    }

    @Override
    protected /* synthetic */ kl f() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.c();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.c();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.e_();
    }
}

