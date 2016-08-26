/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.O;
import com.growingio.a.a.c.aC;
import com.growingio.a.a.c.as;

final class aA<K, V>
extends aC<K, V> {
    volatile long a = Long.MAX_VALUE;
    as<K, V> b = O.q();
    as<K, V> c = O.q();

    aA(K k2, int n2, as<K, V> as2) {
        super(k2, n2, as2);
    }

    @Override
    public long e() {
        return this.a;
    }

    @Override
    public void a(long l2) {
        this.a = l2;
    }

    @Override
    public as<K, V> f() {
        return this.b;
    }

    @Override
    public void a(as<K, V> as2) {
        this.b = as2;
    }

    @Override
    public as<K, V> g() {
        return this.c;
    }

    @Override
    public void b(as<K, V> as2) {
        this.c = as2;
    }
}

