/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.b.aU;
import com.growingio.a.a.d.cK;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class cp<K, V>
extends cK<V> {
    final K a;

    cp(K k2) {
        this.a = k2;
    }

    @Override
    public boolean add(V v2) {
        this.add(0, v2);
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends V> collection) {
        this.addAll(0, collection);
        return true;
    }

    @Override
    public void add(int n2, V v2) {
        aU.b(n2, 0);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
    }

    @Override
    public boolean addAll(int n2, Collection<? extends V> collection) {
        aU.a(collection);
        aU.b(n2, 0);
        throw new IllegalArgumentException("Key does not satisfy predicate: " + this.a);
    }

    @Override
    protected List<V> a() {
        return Collections.emptyList();
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

