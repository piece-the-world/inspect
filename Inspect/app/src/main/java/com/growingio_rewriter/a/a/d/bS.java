/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.bO;
import com.growingio.a.a.d.bT;
import com.growingio.a.a.d.bU;
import com.growingio.a.a.d.bu;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kO;
import com.growingio.a.a.d.kW;
import com.growingio.a.a.d.oP;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

final class bS<C extends Comparable>
extends bu<C> {
    bS(bO<C> bO2) {
        super(bO2);
    }

    public C f() {
        throw new NoSuchElementException();
    }

    public C g() {
        throw new NoSuchElementException();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public bu<C> a(bu<C> bu2) {
        return this;
    }

    @Override
    public kW<C> f_() {
        throw new NoSuchElementException();
    }

    @Override
    public kW<C> a(aD aD2, aD aD3) {
        throw new NoSuchElementException();
    }

    @Override
    bu<C> c(C c2, boolean bl2) {
        return this;
    }

    @Override
    bu<C> b(C c2, boolean bl2, C c3, boolean bl3) {
        return this;
    }

    @Override
    bu<C> d(C c2, boolean bl2) {
        return this;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    int c(Object object) {
        return -1;
    }

    @Override
    public oP<C> k_() {
        return gb.a();
    }

    @Override
    public oP<C> d() {
        return gb.a();
    }

    @Override
    boolean i_() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public ea<C> h() {
        return ea.d();
    }

    @Override
    public String toString() {
        return "[]";
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Set) {
            Set set = (Set)object;
            return set.isEmpty();
        }
        return false;
    }

    @Override
    boolean i() {
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    Object j_() {
        return new bU(this.a, null);
    }

    @Override
    fz<C> e() {
        return bS.a(kO.d().a());
    }

    @Override
    public /* synthetic */ Object last() {
        return this.g();
    }

    @Override
    public /* synthetic */ Object first() {
        return this.f();
    }

    @Override
    /* synthetic */ fz a(Object object, boolean bl2) {
        return this.d((Comparable)object, bl2);
    }

    @Override
    /* synthetic */ fz a(Object object, boolean bl2, Object object2, boolean bl3) {
        return this.b((Comparable)object, bl2, (Comparable)object2, bl3);
    }

    @Override
    /* synthetic */ fz b(Object object, boolean bl2) {
        return this.c((Comparable)object, bl2);
    }

    @Override
    public /* synthetic */ Iterator descendingIterator() {
        return this.d();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.k_();
    }
}

