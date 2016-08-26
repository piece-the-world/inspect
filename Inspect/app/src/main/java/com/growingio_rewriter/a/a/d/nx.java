/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.na;
import com.growingio.a.a.d.np;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class nx<K, V>
extends np<K, V>
implements lH<K, V> {
    transient Set<Map.Entry<K, V>> f;
    private static final long i = 0;

    nx(lH<K, V> lH2, Object object) {
        super(lH2, object);
    }

    lH<K, V> a() {
        return (lH)super.b();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<V> a(K k2) {
        Object object = this.h;
        synchronized (object) {
            return na.a(this.a().a(k2), this.h);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<V> b(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().b(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<V> a(K k2, Iterable<? extends V> iterable) {
        Object object = this.h;
        synchronized (object) {
            return this.a().a(k2, iterable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public Set<Map.Entry<K, V>> u() {
        Object object = this.h;
        synchronized (object) {
            if (this.f == null) {
                this.f = na.a(this.a().u(), this.h);
            }
            return this.f;
        }
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    /* synthetic */ jr b() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

