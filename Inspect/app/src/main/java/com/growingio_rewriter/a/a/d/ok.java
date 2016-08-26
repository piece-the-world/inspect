/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.d;

import com.growingio.a.a.d.M;
import com.growingio.a.a.d.bw;
import com.growingio.a.a.d.kW;

final class ok<K extends Comparable, V>
extends M<kW<K>, V> {
    private final kW<K> a;
    private final V b;

    ok(bw<K> bw2, bw<K> bw3, V v2) {
        this(kW.a(bw2, bw3), v2);
    }

    ok(kW<K> kW2, V v2) {
        this.a = kW2;
        this.b = v2;
    }

    public kW<K> a() {
        return this.a;
    }

    @Override
    public V getValue() {
        return this.b;
    }

    public boolean a(K k2) {
        return this.a.f(k2);
    }

    bw<K> b() {
        return this.a.b;
    }

    bw<K> c() {
        return this.a.c;
    }

    @Override
    public /* synthetic */ Object getKey() {
        return this.a();
    }
}

