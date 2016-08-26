/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.hG;
import com.growingio.a.a.d.hT;
import com.growingio.a.a.d.id;

class ia<K, V>
implements hT<K, V> {
    final K a;
    final int b;
    final hT<K, V> c;
    volatile id<K, V> d = hG.d();

    ia(K k2, int n2, hT<K, V> hT2) {
        this.a = k2;
        this.b = n2;
        this.c = hT2;
    }

    @Override
    public K d() {
        return this.a;
    }

    @Override
    public id<K, V> a() {
        return this.d;
    }

    @Override
    public void a(id<K, V> id2) {
        id<K, V> id3 = this.d;
        this.d = id2;
        id3.a(id2);
    }

    @Override
    public int c() {
        return this.b;
    }

    @Override
    public hT<K, V> b() {
        return this.c;
    }
}

