/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fv;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import com.growingio.a.a.d.lw;
import com.growingio.a.a.d.mu;
import com.growingio.a.a.m.q;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class lv<E>
extends fv<E> {
    private static final long[] c = new long[]{0};
    static final fv<Comparable> b = new lv(kO.d());
    private final transient lw<E> d;
    private final transient long[] e;
    private final transient int f;
    private final transient int g;

    lv(Comparator<? super E> comparator) {
        this.d = fz.a(comparator);
        this.e = c;
        this.f = 0;
        this.g = 0;
    }

    lv(lw<E> lw2, long[] arrl, int n2, int n3) {
        this.d = lw2;
        this.e = arrl;
        this.f = n2;
        this.g = n3;
    }

    private int b(int n2) {
        return (int)(this.e[this.f + n2 + 1] - this.e[this.f + n2]);
    }

    @Override
    km<E> a(int n2) {
        return kn.a(this.d.h().get(n2), this.b(n2));
    }

    @Override
    public km<E> i() {
        return this.isEmpty() ? null : this.a(0);
    }

    @Override
    public km<E> j() {
        return this.isEmpty() ? null : this.a(this.g - 1);
    }

    @Override
    public int a(Object object) {
        int n2 = this.d.c(object);
        return n2 >= 0 ? this.b(n2) : 0;
    }

    @Override
    public int size() {
        long l2 = this.e[this.f + this.g] - this.e[this.f];
        return q.b(l2);
    }

    @Override
    public fz<E> b() {
        return this.d;
    }

    @Override
    public fv<E> a(E e2, aD aD2) {
        return this.a(0, this.d.e(e2, aU.a(aD2) == aD.b));
    }

    @Override
    public fv<E> b(E e2, aD aD2) {
        return this.a(this.d.f(e2, aU.a(aD2) == aD.b), this.g);
    }

    @Override
    fv<E> a(int n2, int n3) {
        aU.a(n2, n3, this.g);
        if (n2 == n3) {
            return lv.a(this.comparator());
        }
        if (n2 == 0 && n3 == this.g) {
            return this;
        }
        lw<E> lw2 = this.d.a(n2, n3);
        return new lv<E>(lw2, this.e, this.f + n2, n3 - n2);
    }

    @Override
    boolean i_() {
        return this.f > 0 || this.g < this.e.length - 1;
    }

    @Override
    public /* synthetic */ mu c(Object object, aD aD2) {
        return this.b(object, aD2);
    }

    @Override
    public /* synthetic */ mu d(Object object, aD aD2) {
        return this.a(object, aD2);
    }

    @Override
    public /* synthetic */ NavigableSet e_() {
        return this.b();
    }

    @Override
    public /* synthetic */ SortedSet q() {
        return this.b();
    }

    @Override
    public /* synthetic */ Set d() {
        return this.b();
    }
}

