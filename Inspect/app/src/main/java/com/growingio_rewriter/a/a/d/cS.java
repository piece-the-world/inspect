/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.db;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kl;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class cS<K, V>
extends db
implements jr<K, V> {
    protected cS() {
    }

    protected abstract jr<K, V> b();

    @Override
    public Map<K, Collection<V>> c() {
        return this.b().c();
    }

    @Override
    public void h() {
        this.b().h();
    }

    @Override
    public boolean b(Object object, Object object2) {
        return this.b().b(object, object2);
    }

    @Override
    public boolean f(Object object) {
        return this.b().f(object);
    }

    @Override
    public boolean g(Object object) {
        return this.b().g(object);
    }

    @Override
    public Collection<Map.Entry<K, V>> l() {
        return this.b().l();
    }

    @Override
    public Collection<V> c(K k2) {
        return this.b().c(k2);
    }

    @Override
    public boolean o() {
        return this.b().o();
    }

    @Override
    public kl<K> r() {
        return this.b().r();
    }

    @Override
    public Set<K> q() {
        return this.b().q();
    }

    @Override
    public boolean a(K k2, V v2) {
        return this.b().a(k2, v2);
    }

    @Override
    public boolean c(K k2, Iterable<? extends V> iterable) {
        return this.b().c(k2, iterable);
    }

    @Override
    public boolean a(jr<? extends K, ? extends V> jr2) {
        return this.b().a(jr2);
    }

    @Override
    public boolean c(Object object, Object object2) {
        return this.b().c(object, object2);
    }

    @Override
    public Collection<V> d(Object object) {
        return this.b().d(object);
    }

    @Override
    public Collection<V> b(K k2, Iterable<? extends V> iterable) {
        return this.b().b(k2, iterable);
    }

    @Override
    public int l_() {
        return this.b().l_();
    }

    @Override
    public Collection<V> j() {
        return this.b().j();
    }

    @Override
    public boolean equals(Object object) {
        return object == this || this.b().equals(object);
    }

    @Override
    public int hashCode() {
        return this.b().hashCode();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.b();
    }
}

