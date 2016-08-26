/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.cS;
import com.growingio.a.a.d.jr;
import com.growingio.a.a.d.lH;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class de<K, V>
extends cS<K, V>
implements lH<K, V> {
    protected abstract lH<K, V> a();

    @Override
    public Set<Map.Entry<K, V>> u() {
        return this.a().u();
    }

    @Override
    public Set<V> a(K k2) {
        return this.a().a(k2);
    }

    @Override
    public Set<V> b(Object object) {
        return this.a().b(object);
    }

    @Override
    public Set<V> a(K k2, Iterable<? extends V> iterable) {
        return this.a().a(k2, iterable);
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
    protected /* synthetic */ jr b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

