/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.B;
import com.growingio.a.a.d.n;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

class H
extends n<K, V>
implements SortedSet<V> {
    final /* synthetic */ n g;

    H(K var1_1, SortedSet<V> k2, n<K, V> sortedSet) {
        this.g = var1_1;
        super((n)var1_1, k2, sortedSet, n2);
    }

    SortedSet<V> h() {
        return (SortedSet)this.e();
    }

    @Override
    public Comparator<? super V> comparator() {
        return this.h().comparator();
    }

    @Override
    public V first() {
        this.a();
        return this.h().first();
    }

    @Override
    public V last() {
        this.a();
        return this.h().last();
    }

    @Override
    public SortedSet<V> headSet(V v2) {
        this.a();
        return new H(this.g, this.c(), this.h().headSet(v2), (B)((Object)(this.f() == null ? this : this.f())));
    }

    @Override
    public SortedSet<V> subSet(V v2, V v3) {
        this.a();
        return new H(this.g, this.c(), this.h().subSet(v2, v3), (B)((Object)(this.f() == null ? this : this.f())));
    }

    @Override
    public SortedSet<V> tailSet(V v2) {
        this.a();
        return new H(this.g, this.c(), this.h().tailSet(v2), (B)((Object)(this.f() == null ? this : this.f())));
    }
}

