/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aL;
import com.growingio.a.a.d.cC;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.kl;
import com.growingio.a.a.d.km;
import com.growingio.a.a.d.kn;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class cT<E>
extends cC<E>
implements kl<E> {
    protected cT() {
    }

    protected abstract kl<E> f();

    @Override
    public int a(Object object) {
        return this.f().a(object);
    }

    @Override
    public int a(E e2, int n2) {
        return this.f().a(e2, n2);
    }

    @Override
    public int b(Object object, int n2) {
        return this.f().b(object, n2);
    }

    @Override
    public Set<E> d() {
        return this.f().d();
    }

    @Override
    public Set<km<E>> a() {
        return this.f().a();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.f().equals(object);
    }

    @Override
    public int hashCode() {
        return this.f().hashCode();
    }

    @Override
    public int c(E e2, int n2) {
        return this.f().c(e2, n2);
    }

    @Override
    public boolean a(E e2, int n2, int n3) {
        return this.f().a(e2, n2, n3);
    }

    @Override
    protected boolean b(Object object) {
        return this.a(object) > 0;
    }

    @Override
    protected void m() {
        gb.i(this.a().iterator());
    }

    protected int d(Object object) {
        for (km<E> km2 : this.a()) {
            if (!aL.a(km2.a(), object)) continue;
            return km2.b();
        }
        return 0;
    }

    protected boolean e(E e2) {
        this.a(e2, 1);
        return true;
    }

    @Override
    protected boolean b(Collection<? extends E> collection) {
        return kn.a(this, collection);
    }

    @Override
    protected boolean c(Object object) {
        return this.b(object, 1) > 0;
    }

    @Override
    protected boolean c(Collection<?> collection) {
        return kn.b(this, collection);
    }

    @Override
    protected boolean d(Collection<?> collection) {
        return kn.c(this, collection);
    }

    protected int d(E e2, int n2) {
        return kn.a(this, e2, n2);
    }

    protected boolean b(E e2, int n2, int n3) {
        return kn.a(this, e2, n2, n3);
    }

    protected Iterator<E> s() {
        return kn.b(this);
    }

    protected int t() {
        return kn.c(this);
    }

    protected boolean f(Object object) {
        return kn.a(this, object);
    }

    protected int u() {
        return this.a().hashCode();
    }

    @Override
    protected String p() {
        return this.a().toString();
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

