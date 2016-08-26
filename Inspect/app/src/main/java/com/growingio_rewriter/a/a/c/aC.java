/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.S;
import com.growingio.a.a.c.aG;
import com.growingio.a.a.c.as;

class aC<K, V>
extends S<K, V> {
    final K g;
    final int h;
    final as<K, V> i;
    volatile aG<K, V> j = O.p();

    aC(K k2, int n2, as<K, V> as2) {
        this.g = k2;
        this.h = n2;
        this.i = as2;
    }

    @Override
    public K d() {
        return this.g;
    }

    @Override
    public aG<K, V> a() {
        return this.j;
    }

    @Override
    public void a(aG<K, V> aG2) {
        this.j = aG2;
    }

    @Override
    public int c() {
        return this.h;
    }

    @Override
    public as<K, V> b() {
        return this.i;
    }
}

