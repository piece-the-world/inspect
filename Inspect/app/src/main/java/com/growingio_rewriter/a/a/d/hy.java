/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hg;
import com.growingio.a.a.d.hv;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

class hy<K, V>
extends hv<K, V>
implements lH<K, V> {
    hy(lH<K, V> lH2, hg<? super K, ? super V> hg2) {
        super(lH2, hg2);
    }

    @Override
    public Set<V> a(K k2) {
        return (Set)super.c(k2);
    }

    @Override
    public Set<Map.Entry<K, V>> u() {
        return (Set)super.l();
    }

    @Override
    public Set<V> b(Object object) {
        return (Set)super.d(object);
    }

    @Override
    public Set<V> a(K k2, Iterable<? extends V> iterable) {
        return (Set)super.b(k2, iterable);
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
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }
}

