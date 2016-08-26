/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.aD;
import com.growingio.a.a.d.ea;
import com.growingio.a.a.d.fg;
import com.growingio.a.a.d.fv;
import com.growingio.a.a.d.fz;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.mu;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class bK<E>
extends fv<E> {
    private final transient fv<E> b;

    bK(fv<E> fv2) {
        this.b = fv2;
    }

    @Override
    public int a(Object object) {
        return this.b.a(object);
    }

    @Override
    public km<E> i() {
        return this.b.j();
    }

    @Override
    public km<E> j() {
        return this.b.i();
    }

    @Override
    public int size() {
        return this.b.size();
    }

    @Override
    public fz<E> b() {
        return this.b.b().g_();
    }

    @Override
    km<E> a(int n2) {
        return this.b.f().h().f().get(n2);
    }

    @Override
    public fv<E> c() {
        return this.b;
    }

    @Override
    public fv<E> a(E e2, aD aD2) {
        return this.b.b(e2, aD2).c();
    }

    @Override
    public fv<E> b(E e2, aD aD2) {
        return this.b.a(e2, aD2).c();
    }

    @Override
    boolean i_() {
        return this.b.i_();
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
    public /* synthetic */ mu o() {
        return this.c();
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

