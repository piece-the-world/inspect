/*
 * Decompiled with CFR 0_115.
 */
package com.growingio.a.a.c;

import com.growingio.a.a.c.S;
import com.growingio.a.a.c.T;
import com.growingio.a.a.c.as;

class U
extends S<K, V> {
    as<K, V> a;
    as<K, V> b;
    final /* synthetic */ T c;

    U(T t2) {
        this.c = t2;
        this.a = this;
        this.b = this;
    }

    @Override
    public long e() {
        return Long.MAX_VALUE;
    }

    @Override
    public void a(long l2) {
    }

    @Override
    public as<K, V> f() {
        return this.a;
    }

    @Override
    public void a(as<K, V> as2) {
        this.a = as2;
    }

    @Override
    public as<K, V> g() {
        return this.b;
    }

    @Override
    public void b(as<K, V> as2) {
        this.b = as2;
    }
}

