/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;

final class gK<K, V>
extends M<K, V> {
    final K a;
    V b;
    gK<K, V> c;
    gK<K, V> d;
    gK<K, V> e;
    gK<K, V> f;

    gK(K k2, V v2) {
        this.a = k2;
        this.b = v2;
    }

    @Override
    public K getKey() {
        return this.a;
    }

    @Override
    public V getValue() {
        return this.b;
    }

    @Override
    public V setValue(V v2) {
        V v3 = this.b;
        this.b = v2;
        return v3;
    }
}

