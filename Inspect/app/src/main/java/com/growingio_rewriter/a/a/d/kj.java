/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.ii;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.kh;
import com.growingio.a.a.d.lH;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

class kj<K, V>
extends kh<K, V>
implements lH<K, V> {
    private static final long g = 0;

    kj(lH<K, V> lH2) {
        super(lH2);
    }

    public lH<K, V> a() {
        return (lH)super.b();
    }

    @Override
    public Set<V> a(K k2) {
        return Collections.unmodifiableSet(this.a().a(k2));
    }

    @Override
    public Set<Map.Entry<K, V>> u() {
        return ii.a(this.a().u());
    }

    @Override
    public Set<V> b(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Set<V> a(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ jr b() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object g() {
        return this.a();
    }
}

