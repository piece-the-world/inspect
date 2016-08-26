/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.kF;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.lI;
import com.growingio.a.a.d.mu;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class oR<E>
extends kF<E>
implements mu<E> {
    private transient oR<E> d;
    private static final long e = 0;

    oR(mu<E> mu2) {
        super(mu2);
    }

    protected mu<E> e() {
        return (mu)super.f();
    }

    @Override
    public Comparator<? super E> comparator() {
        return this.e().comparator();
    }

    NavigableSet<E> h() {
        return lI.a(this.e().e_());
    }

    @Override
    public NavigableSet<E> e_() {
        return (NavigableSet)super.d();
    }

    @Override
    public mu<E> o() {
        oR<E> oR2 = this.d;
        if (oR2 == null) {
            oR2 = new oR<E>(this.e().o());
            oR2.d = this;
            this.d = oR2;
            return this.d;
        }
        return oR2;
    }

    @Override
    public km<E> i() {
        return this.e().i();
    }

    @Override
    public km<E> j() {
        return this.e().j();
    }

    @Override
    public km<E> k() {
        throw new UnsupportedOperationException();
    }

    @Override
    public km<E> l() {
        throw new UnsupportedOperationException();
    }

    @Override
    public mu<E> d(E e2, aD aD2) {
        return kn.a(this.e().d(e2, aD2));
    }

    @Override
    public mu<E> a(E e2, aD aD2, E e3, aD aD3) {
        return kn.a(this.e().a(e2, aD2, e3, aD3));
    }

    @Override
    public mu<E> c(E e2, aD aD2) {
        return kn.a(this.e().c(e2, aD2));
    }

    @Override
    public /* synthetic */ Set d() {
        return this.e_();
    }

    @Override
    /* synthetic */ Set c() {
        return this.h();
    }

    @Override
    protected /* synthetic */ kl f() {
        return this.e();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.e();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.e();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.e_();
    }
}

