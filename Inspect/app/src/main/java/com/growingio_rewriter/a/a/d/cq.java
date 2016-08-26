/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.dd;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

class cq<K, V>
extends dd<V> {
    final K a;

    cq(K k2) {
        this.a = k2;
    }

    @Override
    public boolean add(V v2) {
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
    }

    @Override
    public boolean addAll(Collection<? extends V> collection) {
        aU.a(collection);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
    }

    @Override
    protected Set<V> a() {
        return Collections.emptySet();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    protected /* synthetic */ Object g() {
        return this.a();
    }
}

