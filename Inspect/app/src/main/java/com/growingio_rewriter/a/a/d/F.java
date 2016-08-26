/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.B;
import com.growingio.a.a.d.C;
import com.growingio.a.a.d.H;
import com.growingio.a.a.d.gb;
import com.growingio.a.a.d.n;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

class F
extends n<K, V>
implements NavigableSet<V> {
    final /* synthetic */ n a;

    F(K var1_1, NavigableSet<V> k2, n<K, V> navigableSet) {
        this.a = var1_1;
        super((n)var1_1, k2, navigableSet, n2);
    }

    NavigableSet<V> g() {
        return (NavigableSet)super.h();
    }

    @Override
    public V lower(V v2) {
        return this.g().lower(v2);
    }

    @Override
    public V floor(V v2) {
        return this.g().floor(v2);
    }

    @Override
    public V ceiling(V v2) {
        return this.g().ceiling(v2);
    }

    @Override
    public V higher(V v2) {
        return this.g().higher(v2);
    }

    @Override
    public V pollFirst() {
        return (V)gb.h(this.iterator());
    }

    @Override
    public V pollLast() {
        return gb.h(this.descendingIterator());
    }

    @Override
    private NavigableSet<V> a(NavigableSet<V> navigableSet) {
        return new F(this.a, this.b, navigableSet, (B)((Object)(this.f() == null ? this : this.f())));
    }

    @Override
    public NavigableSet<V> descendingSet() {
        return this.a(this.g().descendingSet());
    }

    @Override
    public Iterator<V> descendingIterator() {
        return new C((B)((Object)this), this.g().descendingIterator());
    }

    @Override
    public NavigableSet<V> subSet(V v2, boolean bl2, V v3, boolean bl3) {
        return this.a(this.g().subSet(v2, bl2, v3, bl3));
    }

    @Override
    public NavigableSet<V> headSet(V v2, boolean bl2) {
        return this.a(this.g().headSet(v2, bl2));
    }

    @Override
    public NavigableSet<V> tailSet(V v2, boolean bl2) {
        return this.a(this.g().tailSet(v2, bl2));
    }

    /* synthetic */ SortedSet h() {
        return this.g();
    }
}

