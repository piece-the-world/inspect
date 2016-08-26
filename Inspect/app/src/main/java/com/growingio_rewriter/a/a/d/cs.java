/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.co;
import com.growingio.a.a.d.ct;
import com.growingio.a.a.d.cw;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class cs<K, V>
extends co<K, V>
implements cw<K, V> {
    cs(lH<K, V> lH2, aV<? super K> aV2) {
        super(lH2, aV2);
    }

    @Override
    public lH<K, V> e() {
        return (lH)this.a;
    }

    @Override
    public Set<V> a(K k2) {
        return (Set)super.c(k2);
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
    public Set<Map.Entry<K, V>> u() {
        return (Set)super.l();
    }

    Set<Map.Entry<K, V>> d() {
        return new ct(this);
    }

    @Override
    /* synthetic */ Collection p() {
        return this.d();
    }

    @Override
    public /* synthetic */ Collection c(Object object) {
        return this.a(object);
    }

    @Override
    public /* synthetic */ Collection d(Object object) {
        return this.b(object);
    }

    @Override
    public /* synthetic */ jr a() {
        return this.e();
    }

    @Override
    public /* synthetic */ Collection l() {
        return this.u();
    }

    @Override
    public /* synthetic */ Collection b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }
}

