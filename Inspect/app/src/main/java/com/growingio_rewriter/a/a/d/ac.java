/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.S;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.ad;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.d.my;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

abstract class ac<E>
extends S<E>
implements mu<E> {
    final Comparator<? super E> a;
    private transient mu<E> b;

    ac() {
        this(kO.d());
    }

    ac(Comparator<? super E> comparator) {
        this.a = aU.a(comparator);
    }

    @Override
    public NavigableSet<E> e_() {
        return (NavigableSet)super.d();
    }

    NavigableSet<E> h() {
        return new my(this);
    }

    @Override
    public Comparator<? super E> comparator() {
        return this.a;
    }

    @Override
    public km<E> i() {
        Iterator iterator = this.b();
        return iterator.hasNext() ? iterator.next() : null;
    }

    @Override
    public km<E> j() {
        Iterator<km<E>> iterator = this.m();
        return iterator.hasNext() ? iterator.next() : null;
    }

    @Override
    public km<E> k() {
        Iterator iterator = this.b();
        if (iterator.hasNext()) {
            km km2 = iterator.next();
            km2 = kn.a(km2.a(), km2.b());
            iterator.remove();
            return km2;
        }
        return null;
    }

    @Override
    public km<E> l() {
        Iterator<km<E>> iterator = this.m();
        if (iterator.hasNext()) {
            km<E> km2 = iterator.next();
            km2 = kn.a(km2.a(), km2.b());
            iterator.remove();
            return km2;
        }
        return null;
    }

    @Override
    public mu<E> a(E e2, aD aD2, E e3, aD aD3) {
        aU.a(aD2);
        aU.a(aD3);
        return this.c(e2, aD2).d(e3, aD3);
    }

    abstract Iterator<km<E>> m();

    Iterator<E> n() {
        return kn.b(this.o());
    }

    @Override
    public mu<E> o() {
        mu<E> mu2 = this.b;
        mu<E> mu3 = mu2 == null ? (this.b = this.p()) : mu2;
        return mu3;
    }

    mu<E> p() {
        return new ad(this);
    }

    @Override
    /* synthetic */ Set e() {
        return this.h();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.e_();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.e_();
    }
}

