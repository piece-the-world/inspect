/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.db;
import com.growingio.a.a.d.nB;
import com.growingio.a.a.d.nC;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class dm<R, C, V>
extends db
implements nB<R, C, V> {
    protected dm() {
    }

    protected abstract nB<R, C, V> f();

    @Override
    public Set<nC<R, C, V>> e() {
        return this.f().e();
    }

    @Override
    public void d() {
        this.f().d();
    }

    @Override
    public Map<R, V> d(C c2) {
        return this.f().d(c2);
    }

    @Override
    public Set<C> b() {
        return this.f().b();
    }

    @Override
    public Map<C, Map<R, V>> p() {
        return this.f().p();
    }

    @Override
    public boolean a(Object object, Object object2) {
        return this.f().a(object, object2);
    }

    @Override
    public boolean b(Object object) {
        return this.f().b(object);
    }

    @Override
    public boolean a(Object object) {
        return this.f().a(object);
    }

    @Override
    public boolean c(Object object) {
        return this.f().c(object);
    }

    @Override
    public V b(Object object, Object object2) {
        return this.f().b(object, object2);
    }

    @Override
    public boolean c() {
        return this.f().c();
    }

    @Override
    public V a(R r2, C c2, V v2) {
        return this.f().a(r2, c2, v2);
    }

    @Override
    public void a(nB<? extends R, ? extends C, ? extends V> nB2) {
        this.f().a(nB2);
    }

    @Override
    public V c(Object object, Object object2) {
        return this.f().c(object, object2);
    }

    @Override
    public Map<C, V> e(R r2) {
        return this.f().e(r2);
    }

    @Override
    public Set<R> a() {
        return this.f().a();
    }

    @Override
    public Map<R, Map<C, V>> r() {
        return this.f().r();
    }

    @Override
    public int n() {
        return this.f().n();
    }

    @Override
    public Collection<V> h() {
        return this.f().h();
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
    protected /* synthetic */ Object g() {
        return this.f();
    }
}

