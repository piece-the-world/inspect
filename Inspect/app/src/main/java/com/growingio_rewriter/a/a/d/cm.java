/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aV;
import com.growingio.a.a.d.cc;
import com.growingio.a.a.d.cw;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import com.growingio.a.a.d.lI;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class cm<K, V>
extends cc<K, V>
implements cw<K, V> {
    cm(lH<K, V> lH2, aV<? super Map.Entry<K, V>> aV2) {
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

    Set<Map.Entry<K, V>> f() {
        return lI.a(this.e().u(), this.b());
    }

    @Override
    public Set<Map.Entry<K, V>> u() {
        return (Set)super.l();
    }

    @Override
    /* synthetic */ Collection p() {
        return this.f();
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

